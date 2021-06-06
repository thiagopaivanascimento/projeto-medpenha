package convenio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import paciente.Paciente;
import dao.DaoFactory;

public class ControleListaPaciente implements ActionListener{

	private JFrame telalista;
	
	 public ControleListaPaciente(JFrame telalista)
	   {
		   this.telalista=telalista;
	   }
	public void actionPerformed(ActionEvent evt) {
	
		   JPanel pCampo = (JPanel)telalista.getContentPane().getComponent(0);
		   JPanel plista = (JPanel)pCampo.getComponent(0);
		   		   
		   JScrollPane jScrollPane1=(JScrollPane)plista.getComponent(0);
		   JTable jTable1 =(JTable)jScrollPane1.getViewport().getComponent(0);
		   JComboBox cbConvenio =(JComboBox)plista.getComponent(2);
		  		
		   DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	       DaoConvenio dao= df.getDaoConvenio();
		   
	       if(evt.getActionCommand().equals("Voltar"))
	       {
	    	   telalista.dispose();
	       }

		   if(evt.getActionCommand().equals("Listar Pacientes"))
	          {
	       		 
			   Paciente p=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);  

			   int index5=cbConvenio.getSelectedIndex();
		       p.setOperaConvenio((String)cbConvenio.getItemAt(index5));
			   
 		         DefaultTableModel tc3;
 		      
 	    		 Vector v=dao.ListarTodosPacientes(p);
 	    		 Object [][]T= new Object [v.size()][4];
 	    	     Object [] col={"Paciente","Data de Nacimento","Matrícula","Convênio"};
 	    	                        
 	    	        for (int i=0; i< v.size();i++)
 	    	        {
 	    	        	
 	    	        	  	T[i][0]=((Paciente)v.get(i)).getNome();
 	    	            	T[i][1]=((Paciente)v.get(i)).getDataNasc();          
 	    	                T[i][2]=((Paciente)v.get(i)).getMatricula();
 	    	          		T[i][3]=((Paciente)v.get(i)).getOperaConvenio();
 	    	          		
	    	          		 	    	          		    	    	        
 	    	        }
 	    	        tc3 = new DefaultTableModel(T,col);
 	    	                       
 	    	        jTable1= new JTable(tc3);
 	    	        jScrollPane1.setViewportView(jTable1);		       
				
	    		  
	          }
		   
		   if(evt.getActionCommand().equals("Emitir"))
	          {
			   Paciente p=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
			   int index5=cbConvenio.getSelectedIndex();
		       p.setOperaConvenio((String)cbConvenio.getItemAt(index5));
			   Vector relalistapac = new Vector();
			  	 
			  	  
			   relalistapac= dao.preencherRelatorioListaPaciente(p);
								
					//Classe que define o tempo de dado do relatorio
					JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)relalistapac);
					
					Map mapa = new HashMap();
					
					try
					{
						
						JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\ListaPacientes.jasper",mapa,jrbean);
				        JasperViewer.viewReport(jasperPrint, false);					
						
					}
					catch(Exception ex)
					{
						System.out.println("Erro no relatório"+ex.getMessage());
					}
			   
	          }
		   
	}

}
