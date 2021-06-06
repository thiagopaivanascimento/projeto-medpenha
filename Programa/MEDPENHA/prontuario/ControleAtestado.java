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

public class ControleAtestado implements ActionListener{

	  private JFrame telaProntuario;
	   
    
	     public ControleAtestado(JFrame telaProntuario)
	   {
		  this.telaProntuario=telaProntuario;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	 JPanel pcampo=(JPanel)telaProntuario.getContentPane().getComponent(1);
	    	 JTabbedPane tpProntuario=(JTabbedPane)pcampo.getComponent(5);
	     
	    	 JPanel pAtestado=(JPanel)tpProntuario.getComponent(3);
		     JPanel pHistAtestado=(JPanel)pAtestado.getComponent(0);
		     JPanel pDataCons=(JPanel)pcampo.getComponent(2);
		     
		     JPanel pIdentPaciente=(JPanel)pcampo.getComponent(1);
		     JPanel pIdentMedico=(JPanel)pcampo.getComponent(0);
		     JPanel pProntuario=(JPanel)pcampo.getComponent(4);
		     
		     JPanel pBotaoAtestado=(JPanel)pAtestado.getComponent(1);
	    	 
		     
		     //patestado
		     JScrollPane jScrollPane15=(JScrollPane)pAtestado.getComponent(4); 
		     JTextArea taObsAtestado =(JTextArea)jScrollPane15.getViewport().getComponent(0);
		     
		     JScrollPane jScrollPane14=(JScrollPane)pAtestado.getComponent(5);
		     JTextArea taAtestado =(JTextArea)jScrollPane14.getViewport().getComponent(0);
		     
		     //button
		     JButton btnSalvarAtestado =(JButton)pBotaoAtestado.getComponent(0);
		     
		     
		     //pHistAtestado
		     		     
		     JTextField  tDataHistAtest=(JTextField)pHistAtestado.getComponent(1);
		     	     
		     JScrollPane tbHistPresc3=(JScrollPane)pHistAtestado.getComponent(3);
		     JTable tbAtestado =(JTable)tbHistPresc3.getViewport().getComponent(0);
		     
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
		        Consulta consultacombobox = new Consulta();
		        
		        
		        try
	        	 {
			    int codprontuario = Integer.parseInt(tProntuario.getText());	
	        	   pront.setNumProntuario(codprontuario);
	        	 }
	        	   catch(Exception ex)
		        	 {
		        		  
		        	 }
		     
		     
		     
		      	Atestado atest = new Atestado();
			    
		      	atest.setDescricao(taAtestado.getText());   
		      	atest.setObs(taObsAtestado.getText());       
		        atest.setData(tDataCons.getText());
		        
		        med.setEspecialidade(tEspecialidade.getText());
		        
		        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
			    DaoAtestado dao= df.getDaoAtestado();
		     
		     
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
			     atest.setHora((String)cbhora.getItemAt(ind));
			    
			   //hora da consulta (hora do dia)
				  int index=cbhora.getSelectedIndex();
				  consultacombobox.setHora((String)cbhora.getItemAt(index)); 
			     
			    
			   //hora da consulta da busca (tabela)
			     try{
			     DefaultTableModel tc = (DefaultTableModel)tbAtestado.getModel();
			     consultabusca.setHora((String.valueOf(tc.getValueAt(tbAtestado.getSelectedRow(),1))));
			     
			     }
			     catch(Exception ex)
			     {
			    
			    				    	 
			     } 
			    
			    if(evt.getActionCommand().equals("Voltar"))
			  	{ 
			    	telaProntuario.dispose();
			    	
			    }
			  	   	    
			 if(evt.getActionCommand().equals("Salvar"))
				{ 	  
				 if(taAtestado.getText().equals(""))
		            {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo atestado!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 
				 else if(taObsAtestado.getText().equals(""))
				    {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo observação!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 	else
				 	{
				 		boolean aux;
						  aux=dao.buscarAtestadoDia(atest, pac);
						  
						  if(aux==true)
						  {
							  JOptionPane.showMessageDialog(null,"Você já realizou o atestado para este paciente!","Atenção",JOptionPane.WARNING_MESSAGE);
							  taAtestado.setText("");
							  taObsAtestado.setText("");
						  }
						  else {
							  Object[] r={atest.getData(),atest.getHora(),med.getEspecialidade()};
				 		
							  dao.salvarAtestado(atest,pront);
				 		
							  JOptionPane.showMessageDialog(null,"Adicionado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
							  
							  DefaultTableModel tcatestado;
							  
							  Vector vetatest=dao.consultarTodosAtestados(pac);
						        Object [][]Tabatest= new Object [vetatest.size()][3];
						        Object [] colatest={"Data","Hora","Especialidade"};
						        
						        for (int i=0; i < vetatest.size(); i++)
						        {
						        	Tabatest[i][0]=((Atestado)vetatest.get(i)).getData();
						        	Tabatest[i][1]=((Atestado)vetatest.get(i)).getHora();
						        	Tabatest[i][2]=((Atestado)vetatest.get(i)).getEspecialidade();
						        	
						        }
						        tcatestado = new DefaultTableModel(Tabatest,colatest);
						                       
						        tbAtestado = new JTable(tcatestado);
						        
						        tbHistPresc3.setViewportView(tbAtestado);
						        TelaProntuario.tcatestado.addRow(r);
						        taAtestado.setText("");
						 		taObsAtestado.setText("");

						  } 
		               	 
				}//fecha o else
				} 
	    	    if(evt.getActionCommand().equals("Emitir"))
			   	  {
	    	    	if(taAtestado.getText().equals("")&& (taObsAtestado.getText().equals("")))
		            {
			   		JOptionPane.showMessageDialog(null,"Você precisa buscar o atestado antes de imprimir!","Atenção",JOptionPane.WARNING_MESSAGE);
			   		 
		            }
			   	 else
			   	  {  Atestado atestado2 = new Atestado();
				    atestado2.setDescricao("");
				    atestado2.setObs("");
			 		atestado2.setData(tDataHistAtest.getText());
			   		 
	    	    	Vector atestado = new Vector();
				   	
		        	atestado= dao.preencherRelatorioAtestado(atestado2,pac,consultabusca);
								
					//Classe que define o tempo de dado do relatorio
					JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)atestado);
					
					
					Map mapa = new HashMap();
					
					try
					{
						JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Atestado.jasper",mapa,jrbean);
				        JasperViewer.viewReport(jasperPrint, false);
					}
					catch(Exception ex)
					{System.out.println(""+ex);}	
			   	  }	
			   	  
			   	}//fecha if
				 
	    	    
	    	    if(evt.getActionCommand().equals("Buscar Atestado"))
				 {
					 System.out.println("hora"+consultabusca.getHora());
					 
					   Atestado atestado = new Atestado();
					    atestado.setDescricao("");
					    atestado.setObs("");
				 		atestado.setData(tDataHistAtest.getText());
				 		
					boolean aux;
					aux=dao.buscarAtestado(atestado, pac,consultabusca);
					
					if(aux==true)
					{
						taAtestado.setText(atestado.getDescricao());
				 		taObsAtestado.setText(atestado.getObs());
						
				 		System.out.println(atestado.getDescricao()+atestado.getObs());
				 		
				 		btnSalvarAtestado.setEnabled(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Este paciente não realizou consulta neste dia e horário","Atenção",JOptionPane.WARNING_MESSAGE);
					}
					
					
				 }
				 
				 if(evt.getActionCommand().equals("Limpar"))
				  	{ 
					    taAtestado.setText("");
				 		taObsAtestado.setText("");
				 		
				 		btnSalvarAtestado.setEnabled(true);
					} 
	    
	    
	    
	     }
	    
	    static Vector obtemTodosAtestados()
        {
    	  	 
    	 Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
    		    	 	    	 
    	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
		 DaoAtestado dao= df.getDaoAtestado();
		 pac.getMatricula();
        	Vector v=dao.consultarTodosAtestados(pac);
        	return v;
    	}
	         
	   			           
	 }
	 
