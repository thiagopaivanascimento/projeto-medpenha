package prontuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import medico.Medico;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import consulta.Consulta;
import consulta.DaoConsulta;
import consulta.TelaAgenda;

import dao.DaoFactory;
import paciente.*;

public class ControleDiagnostico implements ActionListener{

	  private static JFrame telaProntuario;
	   
    
	     public ControleDiagnostico(JFrame telaProntuario)
	     	{
	    	 	this.telaProntuario=telaProntuario;
	     	}
	   
	     	     	     
	     public void actionPerformed (ActionEvent evt)
	    {
	    	    JPanel pcampo=(JPanel)telaProntuario.getContentPane().getComponent(1);
	    	   
	    	    JTabbedPane tpProntuario=(JTabbedPane)pcampo.getComponent(5);
	    	    JPanel pProntuario=(JPanel)pcampo.getComponent(4);
	    	    
	    	    
	    	   JPanel pdiagnostico=(JPanel)tpProntuario.getComponent(0);
	    	    JPanel pHistDiag=(JPanel)pdiagnostico.getComponent(0);
	    	    JPanel pBotaoDiag=(JPanel)pdiagnostico.getComponent(10);
	    	    
	    	    JPanel pDataCons=(JPanel)pcampo.getComponent(2);
	    	    JPanel pIdentPaciente=(JPanel)pcampo.getComponent(1);
	    	   JPanel pIdentMedico=(JPanel)pcampo.getComponent(0);
		        
	    	     JTextField tMatricula = (JTextField)pIdentPaciente.getComponent(7);
	    	     JTextField tDataCons = (JTextField)pDataCons.getComponent(1);
	    	    JTextField tNomeMedico = (JTextField)pIdentMedico.getComponent(1);
	    	     JTextField tcrm = (JTextField)pIdentMedico.getComponent(7);
	    	     JTextField tEspecialidade = (JTextField)pIdentMedico.getComponent(4);
	    	     JTextField tNome = (JTextField)pIdentPaciente.getComponent(1);
	    	    JComboBox cbSexo = (JComboBox)pIdentPaciente.getComponent(4);
	    	    JTextField tNasc = (JTextField)pIdentPaciente.getComponent(10);
	    	    JComboBox cbhora = (JComboBox)pDataCons.getComponent(4);
	    	    
	    	    //Button
	    	    JButton btnSalvarDiag =(JButton)pBotaoDiag.getComponent(0);
		        
		        //prontuário
		       JTextField tProntuario = (JTextField)pProntuario.getComponent(2);
		        JTextField tDataInicial = (JTextField)pProntuario.getComponent(4);
		       
		        		        
		     	//painel diagnóstico
		        JTextField tDiag=(JTextField)pdiagnostico.getComponent(4);
		        JScrollPane jScrollPane12=(JScrollPane)pdiagnostico.getComponent(7); 
		        JTextArea taEntrevCons =(JTextArea)jScrollPane12.getViewport().getComponent(0);
		        
		        
		        JScrollPane jScrollPane13=(JScrollPane)pdiagnostico.getComponent(5); 
		        JTextArea taObsDiag =(JTextArea)jScrollPane13.getViewport().getComponent(0);
		        
		        
		      //painel historico de diagnóstico
		        JTextField tDataHistDiag = (JTextField)pHistDiag.getComponent(3);
		        JScrollPane tbHistPresc4 = (JScrollPane)pHistDiag.getComponent(0);
		        JTable tbDiagnostico = (JTable)tbHistPresc4.getViewport().getComponent(0);
		        		        
		        Prontuario pront = new Prontuario();      
		        Diagnostico diag = new Diagnostico();
		        Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
		        Consulta consultabusca = new Consulta();
		        Consulta consultacombobox = new Consulta();
		        		        
		        diag.setDiagnostico(tDiag.getText());
			    diag.setEntrevistaConsulta(taEntrevCons.getText());   
			    diag.setObsDiagnostico(taObsDiag.getText()); 
			   //consulta do dia
			    diag.setDataDiagnostico(tDataCons.getText());
			    diag.setEspecialidade(tEspecialidade.getText());
			    diag.setCrm(tcrm.getText());
			    
			  			    
			    try
	        	 {
			    int codprontuario = Integer.parseInt(tProntuario.getText());	
	        	   pront.setNumProntuario(codprontuario);
	        	 }
	        	   catch(Exception ex)
		        	 {
		        		  
		        	 }
			    
			 
			    pront.setDataInicial(tDataInicial.getText());
			    pront.setDatacons(tDataCons.getText());
			    
			    //hora da consulta (hora do dia)
			    int index=cbhora.getSelectedIndex();
			     consultacombobox.setHora((String)cbhora.getItemAt(index)); 
			    
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
		        				     
			     //hora da consulta da busca (tabela)
			     try{
			     DefaultTableModel tc = (DefaultTableModel)tbDiagnostico.getModel();
			     consultabusca.setHora((String.valueOf(tc.getValueAt(tbDiagnostico.getSelectedRow(),1))));
			     diag.setHoraDiagnostico((String.valueOf(tc.getValueAt(tbDiagnostico.getSelectedRow(),1))));
			     
			     }
			     catch(Exception ex)
			     {
			    				    				    	 
			     }
			       
		        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
			    DaoDiagnostico dao= df.getDaoDiagnostico();
			   		         
			    Diagnostico d = new Diagnostico();
				 d.setDiagnostico("");
				 d.setEntrevistaConsulta("");
				 d.setObsDiagnostico("");
				 d.setDataHistDiag(tDataHistDiag.getText());
			    
			  		      			    
			  if(evt.getActionCommand().equals("Voltar"))
			  	{ 
				  
				  telaProntuario.dispose();  
				}
			  	   	    
			 if(evt.getActionCommand().equals("Salvar"))
				{ 	  
				 if(taEntrevCons.getText().equals(""))
		            {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo entrevista da consulta!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 
				 else if(tDiag.getText().equals(""))
				    {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo diagnóstico!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 
				 else
				 	{
					  boolean aux;
					  aux=dao.buscarDiagnosticoDia(d, pac, consultacombobox, pront);
					  
					  if(aux==true)
					  {
						  JOptionPane.showMessageDialog(null,"Você já realizou o diagnóstico com este paciente!","Atenção",JOptionPane.WARNING_MESSAGE); 
						  tDiag.setText("");
						  taEntrevCons.setText("");
						  taObsDiag.setText("");
						  
						  
					  }//fecha if
					  else
					  {
						  
						  try{ 
							  Object[] r={diag.getDataDiagnostico(),pront.getHoracons(),diag.getEspecialidade()};
							  dao.salvarDiagnostico(diag,pront,consultacombobox);
							  JOptionPane.showMessageDialog(null,"Adicionado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
							 
							  DefaultTableModel tcdiagnostico;
								 
							     Vector v= dao.consultarTodosDiagnosticos(pac);
							        Object [][]T= new Object [v.size()][3];
							        Object [] col={"Data","Hora","Especialidade"};
							        
							        for (int i=0; i < v.size(); i++)
							        {
							        	T[i][0]=((Diagnostico)v.get(i)).getDataDiagnostico();
							        	T[i][1]=((Diagnostico)v.get(i)).getHoraDiagnostico();
							        	T[i][2]=((Diagnostico)v.get(i)).getEspecialidade();
							        	
							        }
							        tcdiagnostico = new DefaultTableModel(T,col);
							                       
							        tbDiagnostico = new JTable(tcdiagnostico);
							        tbHistPresc4.setViewportView(tbDiagnostico);
							        
			       
							  TelaProntuario.tcdiagnostico.addRow(r);
							  
							  tDiag.setText("");
							  taEntrevCons.setText("");
							  taObsDiag.setText("");
				 	  			
				 	    
						  }
					  catch(Exception ex)
					  {
						 
					  }
					  }
				 	}  //fecha else  
				 }	      	 
			//	}//fecha o comando salvar
			  			   
			 if(evt.getActionCommand().equals("Limpar"))
			  	{ 
				 
				 	tDiag.setText("");
			 		taEntrevCons.setText("");
			 		taObsDiag.setText("");
			 					 		
				}
			 
			 if(evt.getActionCommand().equals("Buscar Diagnóstico"))
			 {
								 
				boolean aux;
				aux=dao.buscarDiagnostico(d, pac,consultabusca);
				
				if(aux==true)
				{
					tDiag.setText(d.getDiagnostico());
			 		taEntrevCons.setText(d.getEntrevistaConsulta());
			 		taObsDiag.setText(d.getObsDiagnostico());
			 		
			 		
			 		btnSalvarDiag.setEnabled(false);
			 		
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Este paciente não realizou consulta neste dia e horário","Atenção",JOptionPane.WARNING_MESSAGE);
				}
			 }
			 if(evt.getActionCommand().equals("Atualizar"))
			 {
				 if(tDiag.getText().equals("")&& taEntrevCons.getText().equals("")&& taObsDiag.getText().equals(""))
				 {
					 JOptionPane.showMessageDialog(null,"Você deve primeiro realizar uma busca","Atenção",JOptionPane.WARNING_MESSAGE); 
				 }
				 else
				 {
					    diag.setDiagnostico(tDiag.getText());
					    diag.setEntrevistaConsulta(taEntrevCons.getText());   
					    diag.setObsDiagnostico(taObsDiag.getText());
					    DefaultTableModel tc = (DefaultTableModel)tbDiagnostico.getModel();
					    diag.setHoraDiagnostico((String.valueOf(tc.getValueAt(tbDiagnostico.getSelectedRow(),1))));
					    diag.setDataDiagnostico(tDataHistDiag.getText());
				        dao.alterarDiagnostico(diag);
						JOptionPane.showMessageDialog(null,"Atualizado com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
						
						tDiag.setText("");
				 		taEntrevCons.setText("");
				 		taObsDiag.setText("");
						
				 }		
					
				
			 }
			 if(evt.getActionCommand().equals("Emitir Retorno"))
			 {
				 Vector autorizacao = new Vector();
				   	
		        	autorizacao= dao.preencheAutorizacaoRetorno(pac,consultacombobox,pront);
								
					//Classe que define o tempo de dado do relatorio
					JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)autorizacao);
					
					
					Map mapa = new HashMap();
					
					try
					{
						
						JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Autorizacao.jasper",mapa,jrbean);
				        JasperViewer.viewReport(jasperPrint, false);
					
					}
					catch(Exception ex)
					{}	

			 }
			 
			 }//fecha actionperformed
		
	     
	   public static Vector obtemTodosDiagnosticos()
	        {
	    			    	   
		     Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
		 	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
		 	DaoDiagnostico dao3= df.getDaoDiagnostico();	
		 	Vector v=dao3.consultarTodosDiagnosticos(pac);
		     	return v;
		  
	    	}
	    		       	    
	    }
