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

public class ControleLaudo implements ActionListener{

	  private JFrame telaprontuario;
	   
    
	     public ControleLaudo(JFrame telaprontuario)
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
	    	    
	    	 JPanel pLaudo=(JPanel)tpProntuario.getComponent(4);
		     JPanel pHistLaudo=(JPanel)pLaudo.getComponent(0);  
		     
		     JPanel pBotaoLaudo =(JPanel)pLaudo.getComponent(2);
		     
	    	 //Button
		     JButton btnSalvarLaudo=(JButton)pBotaoLaudo.getComponent(0);	     
		     
		     
		   //patestado
		     JScrollPane jScrollPane18=(JScrollPane)pLaudo.getComponent(3); 
		     JTextArea taObsLaudo =(JTextArea)jScrollPane18.getViewport().getComponent(0);
		     
		     JScrollPane jScrollPane17=(JScrollPane)pLaudo.getComponent(4);
		     JTextArea taLaudo =(JTextArea)jScrollPane17.getViewport().getComponent(0);
		     
		     
		     //pHistAtestado
		     		     
		     JTextField  tDataHistLaudo=(JTextField)pHistLaudo.getComponent(2);
		     	     
		     JScrollPane tbHistPresc5=(JScrollPane)pHistLaudo.getComponent(4);
		     JTable tbLaudo =(JTable)tbHistPresc5.getViewport().getComponent(0);   
	    	    
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
		     
		     
		     
		     LaudoPericial laudoperi = new LaudoPericial();
			    
		     	laudoperi.setDescricao(taLaudo.getText());   
		     	laudoperi.setObs(taObsLaudo.getText());       
		     	laudoperi.setData(tDataCons.getText());
		        
		        med.setEspecialidade(tEspecialidade.getText());
		        
		        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
			    DaoLaudoPericial dao= df.getDaoLaudoPericial();
		         
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
			    laudoperi.setHora((String)cbhora.getItemAt(ind));
			    
			     //hora da consulta da busca (tabela)
			     try{
			     DefaultTableModel tc = (DefaultTableModel)tbLaudo.getModel();
			     consultabusca.setHora((String.valueOf(tc.getValueAt(tbLaudo.getSelectedRow(),1))));
			     
			     }
			     catch(Exception ex)
			     {
			    			    				    	 
			     } 
			    		    
			      			    
			  if(evt.getActionCommand().equals("Voltar"))
			  	{ 
				  telaprontuario.dispose();
				}
			  	   	    
			 if(evt.getActionCommand().equals("Salvar"))
				{ 	  
				 if(taLaudo.getText().equals(""))
		            {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo laudo!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 
				 else if(taObsLaudo.getText().equals(""))
				    {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo observação!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 	else
				 	{
				 	  		  Object[] r={laudoperi.getData(),laudoperi.getHora(),med.getEspecialidade()};
							  dao.salvarLaudo(laudoperi,pront);
							  JOptionPane.showMessageDialog(null,"Adicionado com sucesso!","Ddaos Salvos",JOptionPane.INFORMATION_MESSAGE);
							  
							  
							  DefaultTableModel tclaudo;
							  Vector vetlaudo= dao.consultarTodosLaudos(pac);
						        Object [][]Tablaudo= new Object [vetlaudo.size()][3];
						        Object [] collaudo={"Data","Hora","Especialidade"};
						        
						        for (int i=0; i < vetlaudo.size(); i++)
						        {
						        	Tablaudo[i][0]=((LaudoPericial)vetlaudo.get(i)).getData();
						        	Tablaudo[i][1]=((LaudoPericial)vetlaudo.get(i)).getHora();
						        	Tablaudo[i][2]=((LaudoPericial)vetlaudo.get(i)).getEspecialidade();
						        	
						        }
						        tclaudo = new DefaultTableModel(Tablaudo,collaudo);
						                       
						        tbLaudo = new JTable(tclaudo);
						       
						        tbHistPresc5.setViewportView(tbLaudo);
						        TelaProntuario.tclaudo.addRow(r);
							  taLaudo.setText("");
							  taObsLaudo.setText("");

						  } 
				 	 	 
				}//fecha o comando salvar
	    	    
			 if(evt.getActionCommand().equals("Emitir"))
		   	  {
			   	 if(taLaudo.getText().equals("")&& (taObsLaudo.getText().equals("")))
		            {
			   		JOptionPane.showMessageDialog(null,"Você precisa buscar o laudo antes de imprimir!","Atenção",JOptionPane.WARNING_MESSAGE);
			   		 
		            }
			   	 else{
			   		 
			   		LaudoPericial laudopericial = new LaudoPericial();
					 laudopericial.setDescricao("");
					 laudopericial.setObs("");
					 laudopericial.setData(tDataHistLaudo.getText());
			   		 
			   		 	Vector laudo = new Vector();
			   	
			   		 	laudo= dao.preencherRelatorioLaudo(laudopericial,pac,consultabusca);
							
			   		 	//Classe que define o tempo de dado do relatorio
			   		 	JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)laudo);
				
				
			   		 	Map mapa = new HashMap();
				
			   		 	try
			   		 	{
					
			   		 	   JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Laudo.jasper",mapa,jrbean);
				           JasperViewer.viewReport(jasperPrint, false);
			   		 	}
			   		 	catch(Exception ex)
			   	   		 	{System.out.println(""+ex);}
			   	 }
		    }//fecha if   
	    	    
			
			 if(evt.getActionCommand().equals("Buscar Laudo"))
			 {
				 System.out.println("hora"+consultabusca.getHora());
				 
				 LaudoPericial laudopericial = new LaudoPericial();
				 laudopericial.setDescricao("");
				 laudopericial.setObs("");
				 laudopericial.setData(tDataHistLaudo.getText());
							 
				boolean aux;
				aux=dao.buscarLaudo(laudopericial, pac,consultabusca);
				
				if(aux==true)
				{
					taLaudo.setText(laudopericial.getDescricao());
			 		taObsLaudo.setText(laudopericial.getObs());
						 			 		
			 		btnSalvarLaudo.setEnabled(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Este paciente não realizou consulta neste dia e horário","Atenção",JOptionPane.WARNING_MESSAGE);
				}
				
				
			 }
			 
			 if(evt.getActionCommand().equals("Limpar"))
			  	{ 
				 
				 	taLaudo.setText("");
			 		taObsLaudo.setText("");
			 		
			 		btnSalvarLaudo.setEnabled(true);
				}     
	    }
	    
	    static Vector obtemTodosLaudos()
        {
    	  	 
    	 Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
    		    	 	    	 
    	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
		 DaoLaudoPericial dao= df.getDaoLaudoPericial();
		 pac.getMatricula();
        	Vector v=dao.consultarTodosLaudos(pac);
        	return v;
    	}

}
