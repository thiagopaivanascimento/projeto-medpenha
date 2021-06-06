package prontuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import paciente.Paciente;
import consulta.Consulta;

import medico.Medico;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import dao.DaoFactory;

public class ControleExame implements ActionListener{

	  private JFrame telaprontuario;
	   
    
	     public ControleExame(JFrame telaprontuario)
	     {
	    	 this.telaprontuario=telaprontuario;
	     }
	     
	    public void actionPerformed (ActionEvent evt)
	    {
	    	 JPanel pcampo=(JPanel)telaprontuario.getContentPane().getComponent(1);
	    	 JTabbedPane tpProntuario=(JTabbedPane)pcampo.getComponent(5);
	    	 JPanel pProntuario=(JPanel)pcampo.getComponent(4);
		        JPanel pDataCons=(JPanel)pcampo.getComponent(2);
		        JPanel pIdentPaciente=(JPanel)pcampo.getComponent(1);
		        JPanel pIdentMedico=(JPanel)pcampo.getComponent(0);
	    	 
	    	 
	    	 JPanel pexame=(JPanel)tpProntuario.getComponent(2);
		     JPanel pHistExame=(JPanel)pexame.getComponent(0);
		     
		    JPanel pBotaoExame=(JPanel)pexame.getComponent(1);
		    		    
		    //Button
		     JButton btnSalvarExame = (JButton)pBotaoExame.getComponent(0);
		     
		     	//painel exame
		        JScrollPane jScrollPane5=(JScrollPane)pexame.getComponent(5); 
		        JTextArea taExame =(JTextArea)jScrollPane5.getViewport().getComponent(0);
		        		        
		        JScrollPane jScrollPane6=(JScrollPane)pexame.getComponent(4); 
		        JTextArea taObsExame =(JTextArea)jScrollPane6.getViewport().getComponent(0);
		        
		        
		      //painel historico de exames
		        JScrollPane tbHistPresc1= (JScrollPane)pHistExame.getComponent(3);
		        JTable tbExame = (JTable)tbHistPresc1.getViewport().getComponent(0);
		       
		       	JTextField tDataHistExame = (JTextField)pHistExame.getComponent(1);
		       	
		       	//painel superior(prontuario)
		       	JTextField tProntuario = (JTextField)pProntuario.getComponent(2);
		        JTextField tDataCons = (JTextField)pDataCons.getComponent(1);
		        JComboBox cbhora = (JComboBox)pDataCons.getComponent(4);
		        JTextField tMatricula = (JTextField)pIdentPaciente.getComponent(7);
		        JTextField tEspecialidade = (JTextField)pIdentMedico.getComponent(4);
		       	
		       	
		        Medico med = new Medico(null,null,null,null,null,null,null,null,null,null,null,null);
		        Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
			    Prontuario pront = new Prontuario();	        
		        Consulta consultabusca = new Consulta();
		        
		        
		        try
	        	 {
			    int codprontuario = Integer.parseInt(tProntuario.getText());	
	        	   pront.setNumProntuario(codprontuario);
	        	 }
	        	   catch(Exception ex)
		        	 {
		        		  
		        	 }
	    	 
		       	Exame exam = new Exame();
		       				    
		        exam.setExame(taExame.getText());
		        exam.setObs(taObsExame.getText()); 
		        exam.setData(tDataCons.getText());
		       		        
		        med.setEspecialidade(tEspecialidade.getText());
		             
		        if(tMatricula.getText().equals(""))
		         { }
		         else
		         { 
		        	 try
		        	 {
		        	   int matricula = Integer.parseInt(tMatricula.getText());	
		        	   pac.setMatricula(matricula);
			    		        
		        	 }
		        	 catch(Exception ex)
		        	 {
		        		 JOptionPane.showMessageDialog(null,"Matrícula inválida! Por Favor digite outra matrícula!","Atenção",JOptionPane.ERROR_MESSAGE); 
		        	 }
		         }	   
		        
		        int ind=cbhora.getSelectedIndex();
			    // consultacombobox.setHora((String)cbhora.getItemAt(ind)); 
			     exam.setHora((String)cbhora.getItemAt(ind));
			    
			     //hora da consulta da busca (tabela)
			     try{
			     DefaultTableModel tc = (DefaultTableModel)tbExame.getModel();
			     consultabusca.setHora((String.valueOf(tc.getValueAt(tbExame.getSelectedRow(),1))));
			     
			     }
			     catch(Exception ex)
			     {
			    			    				    	 
			     } 
		        
		        
		        
		        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
			    DaoExame dao= df.getDaoExame();
	    	 
			    if(evt.getActionCommand().equals("Voltar"))
			  	{ 
			    	telaprontuario.dispose();
				}
			  	   	    
			 if(evt.getActionCommand().equals("Salvar"))
				{ 	  
				 if(taExame.getText().equals(""))
		            {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo exame!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 
				 else
				 	{
				 		
				 		Object[] r={exam.getData(),exam.getHora(),med.getEspecialidade()};
				 		dao.salvarExame(exam,pront);
				 		JOptionPane.showMessageDialog(null,"Adicionado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
			       
				 		  DefaultTableModel tcexame;
					        Vector vetex= dao.consultarTodosExames(pac);
					        Object [][]Tabex= new Object [vetex.size()][3];
					        Object [] colex={"Data","Hora","Especialidade"};
					        
					        for (int i=0; i < vetex.size(); i++)
					        {
					        	Tabex[i][0]=((Exame)vetex.get(i)).getData();
					        	Tabex[i][1]=((Exame)vetex.get(i)).getHora();
					        	Tabex[i][2]=((Exame)vetex.get(i)).getEspecialidade();
					        	
					        }
					        tcexame = new DefaultTableModel(Tabex,colex);
					                       
					        tbExame = new JTable(tcexame);
					               
					        tbHistPresc1.setViewportView(tbExame);
					        
				 		
				 		
				 		
				 		
				 		
				 		taExame.setText("");
				 		taObsExame.setText("");
				 		
				 		TelaProntuario.tcexame.addRow(r);
				 		
					 }	
				 	
		               	 
				}//fecha o comando salvar
			  			   
			 
			  if(evt.getActionCommand().equals("Emitir"))
			   	  {
				  if(taExame.getText().equals("")&& (taObsExame.getText().equals("")))
		            {
			   		JOptionPane.showMessageDialog(null,"Você precisa buscar o exame antes de imprimir!","Atenção",JOptionPane.WARNING_MESSAGE);
			   		 
		            }
			   	 else{     
			   		Exame exambusca = new Exame();
					 
				     exambusca.setExame("");
					 exambusca.setObs("");
			 		 exambusca.setData(tDataHistExame.getText());
			   		 
				  Vector exame = new Vector();
				   	
				  exame= dao.preencherRelatorioExame(exambusca,pac,consultabusca);
								
					//Classe que define o tempo de dado do relatorio
					JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)exame);
					
					
					Map mapa = new HashMap();
					
					try
					{
						
						JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Exame.jasper",mapa,jrbean);
				        JasperViewer.viewReport(jasperPrint, false);
					}
					catch(Exception ex)
					{System.out.println(""+ex);	}	
			    	
			   	 }
			  }//fecha if
			    
			  
			  if(evt.getActionCommand().equals("Buscar Exame"))
				 {
					   Exame exambusca = new Exame();
					 
					     exambusca.setExame("");
						 exambusca.setObs("");
				 		 exambusca.setData(tDataHistExame.getText());
								 
					boolean aux;
					aux=dao.buscarExame(exambusca, pac,consultabusca);
					
					if(aux==true)
					{
						taExame.setText(exambusca.getExame());
				 		taObsExame.setText(exambusca.getObs());
						
				 						 		
				 	}
					else
					{
						JOptionPane.showMessageDialog(null,"Este paciente não realizou consulta neste dia e horário","Atenção",JOptionPane.WARNING_MESSAGE);
					}
					
					
				 }
				 
				 if(evt.getActionCommand().equals("Limpar"))
				  	{ 
					 
					 	taExame.setText("");
				 		taObsExame.setText("");
				 		
				 		btnSalvarExame.setEnabled(true);
				 		
					} 
			  
			  
				           
	}
				       
	    
	    static Vector obtemTodosExames()
        {
    	  	 
    	 Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
    		    	 	    	 
    	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
		 DaoExame dao= df.getDaoExame();
		 pac.getMatricula();
        	Vector v=dao.consultarTodosExames(pac);
        	return v;
    	}
	    
}