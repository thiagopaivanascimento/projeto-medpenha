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

public class ControlePrescricao implements ActionListener {

	  private JFrame telaprontuario;
	   
      
	     public ControlePrescricao(JFrame telaprontuario)
	   {
		  this.telaprontuario=telaprontuario;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	   JPanel pcampo=(JPanel)telaprontuario.getContentPane().getComponent(1);
	    	   JTabbedPane tpProntuario=(JTabbedPane)pcampo.getComponent(5);
	    	   
	    	   JPanel pprescricao=(JPanel)tpProntuario.getComponent(1);
		        JPanel pHistPresc=(JPanel)pprescricao.getComponent(0);
		        JPanel pProntuario=(JPanel)pcampo.getComponent(4);
		        JPanel pDataCons=(JPanel)pcampo.getComponent(2);
		        JPanel pIdentPaciente=(JPanel)pcampo.getComponent(1);
		        JPanel pIdentMedico=(JPanel)pcampo.getComponent(0);
		     
		        
		        JPanel pBotaoPresc=(JPanel)pprescricao.getComponent(6);
		        
		        //Button
		        JButton btnSalvarPresc=(JButton)pBotaoPresc.getComponent(0);
		        
		     	//painel prescricao
		       JComboBox cbTipoPrec=(JComboBox)pprescricao.getComponent(2);
		        
		        JScrollPane jScrollPane8=(JScrollPane)pprescricao.getComponent(8); 
		        JTextArea taMedicPresc =(JTextArea)jScrollPane8.getViewport().getComponent(0);
		        		        
		        JScrollPane jScrollPane9=(JScrollPane)pprescricao.getComponent(7); 
		        JTextArea taObsPresc =(JTextArea)jScrollPane9.getViewport().getComponent(0);
		        
		        
		      //painel historico de prescricoes
		        JScrollPane tbHistPresc2= (JScrollPane)pHistPresc.getComponent(0);
		        JTable tbPresc = (JTable)tbHistPresc2.getViewport().getComponent(0);
		        		                
		        JTextField tDataHistPresc = (JTextField)pHistPresc.getComponent(2);
		        JTextField tProntuario = (JTextField)pProntuario.getComponent(2);
		        JTextField tDataCons = (JTextField)pDataCons.getComponent(1);
		        JComboBox cbhora = (JComboBox)pDataCons.getComponent(4);
		        JTextField tMatricula = (JTextField)pIdentPaciente.getComponent(7);
		        JTextField tEspecialidade = (JTextField)pIdentMedico.getComponent(4);
		        
		        Prescricao presc = new Prescricao();
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
		        
		        
		        int index=cbTipoPrec.getSelectedIndex();
		        presc.setTipo((String)cbTipoPrec.getItemAt(index));
		        presc.setMedicamento(taMedicPresc.getText());   
		        presc.setObs(taObsPresc.getText()); 
		        presc.setData(tDataCons.getText());
		        med.setEspecialidade(tEspecialidade.getText());
		        
		         //hora da prescrição setando valor da hora da consulta
			    int ind=cbhora.getSelectedIndex();
			    // consultacombobox.setHora((String)cbhora.getItemAt(ind)); 
			     presc.setHora((String)cbhora.getItemAt(ind));
			    
			     //hora da consulta da busca (tabela)
			     try{
			     DefaultTableModel tc = (DefaultTableModel)tbPresc.getModel();
			     consultabusca.setHora((String.valueOf(tc.getValueAt(tbPresc.getSelectedRow(),1))));
			     
			     }
			     catch(Exception ex)
			     {
			   			    				    	 
			     } 
			     
		        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
			    DaoPrescricao dao= df.getDaoPrescricao();
			    
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
			    
			    		    
			      			    
			  if(evt.getActionCommand().equals("Voltar"))
			  	{ 
				  telaprontuario.dispose(); 
				}
			  	   	    
			 if(evt.getActionCommand().equals("Salvar"))
				{ 	  
				 if(taMedicPresc.getText().equals(""))
		            {
		             JOptionPane.showMessageDialog(null,"Você precisa preencher o campo medicamento!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 		 		 
				  else if(cbTipoPrec.getSelectedItem().equals("Selecione o tipo de medicamento"))
				    {
		             JOptionPane.showMessageDialog(null,"Você precisa selecionar o tipo de medicamento!","Atenção",JOptionPane.WARNING_MESSAGE);
				 	}
				 	else
				 	{
				 		boolean aux;
						  aux=dao.buscarPrescricaoDia(presc, pac);
						  
						  if(aux==true)
						  {
							  JOptionPane.showMessageDialog(null,"Você já realizou prescrição para este paciente!","Atenção",JOptionPane.WARNING_MESSAGE);
						  }
						  else
						  {
							  	try{ 
								  	Object[] r={presc.getData(),presc.getHora(),med.getEspecialidade()};
								  	dao.salvarPrescricao(presc, pront);
								  	JOptionPane.showMessageDialog(null,"Adicionado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
				       
								  	DefaultTableModel tcprescricao;
								  	
								  	Vector vetor= dao.consultarTodasPrescricoes(pac);
							        Object [][]Tab= new Object [vetor.size()][3];
							        Object [] colu={"Data","Hora","Especialidade"};
							        
							        for (int i=0; i < vetor.size(); i++)
							        {
							        	Tab[i][0]=((Prescricao)vetor.get(i)).getData();
							        	Tab[i][1]=((Prescricao)vetor.get(i)).getHora();
							        	Tab[i][2]=((Prescricao)vetor.get(i)).getEspecialidade();
							        	
							        }
							        tcprescricao = new DefaultTableModel(Tab,colu);
							                       
							        tbPresc = new JTable(tcprescricao);
							        
							        tbHistPresc2.setViewportView(tbPresc);
								  	
								  	
								  	
								  	
								  	cbTipoPrec.setSelectedItem("Selecione o tipo de medicamento");
								  	taMedicPresc.setText("");
								  	taObsPresc.setText("");
					 	  			
								  	TelaProntuario.tcprescricao.addRow(r);
								
						           }
						  catch(Exception ex)
						  {
							 
						  }
				 	   }
				 		
				 	} 
		               	 
				}//fecha o comando salvar
			
			 if(evt.getActionCommand().equals("Buscar Prescrição"))
			 {
				 Prescricao prescri = new Prescricao();
				 prescri.setTipo("");
				 prescri.setMedicamento("");
				 prescri.setObs("");
				 prescri.setData(tDataHistPresc.getText());
							 
				boolean aux;
				aux=dao.buscarPrescricao(prescri, pac,consultabusca);
				
				if(aux==true)
				{
					cbTipoPrec.setSelectedItem(prescri.getTipo());
					taMedicPresc.setText(prescri.getMedicamento());
					taObsPresc.setText(prescri.getObs());
			 		
			 		
			 	}
				else
				{
					JOptionPane.showMessageDialog(null,"Este paciente não realizou consulta neste dia e horário","Atenção",JOptionPane.WARNING_MESSAGE);
				}
				
				
			 }
			 
			 if(evt.getActionCommand().equals("Limpar"))
			  	{ 
				 
				    cbTipoPrec.setSelectedItem("Selecione o tipo de medicamento");
			 		taMedicPresc.setText("");
			 		taObsPresc.setText("");
			 		
			 		btnSalvarPresc.setEnabled(true);
			 		
				} 
			 
			 
			  if(evt.getActionCommand().equals("Emitir"))
			   	{
				  if(taMedicPresc.getText().equals("")&& (taObsPresc.getText().equals("")))
		            {
			   		JOptionPane.showMessageDialog(null,"Você precisa buscar a prescrição antes de imprimir!","Atenção",JOptionPane.WARNING_MESSAGE);
			   		 
		            }
			   	 else{   
			   		Prescricao prescri = new Prescricao();
					 prescri.setTipo("");
					 prescri.setMedicamento("");
					 prescri.setObs("");
					 prescri.setData(tDataHistPresc.getText());
			   		 
			   		 
					Vector prescricao = new Vector();
				   	
					prescricao= dao.preencherRelatorioPrescricao(prescri,pac,consultabusca);
								
					//Classe que define o tempo de dado do relatorio
					JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)prescricao);
					
					
					Map mapa = new HashMap();
					
					try
					{
						
						JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Prescricao.jasper",mapa,jrbean);
				        JasperViewer.viewReport(jasperPrint, false);
					}
					catch(Exception ex)
					{System.out.println(""+ex);}	
			    	
			   	 } 
				           
			  }//fecha if
	    }
	    
	    static Vector obtemTodasPrescricoes()
        {
    	  	 
    	 Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
    		    	 	    	 
    	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
		 DaoPrescricao dao= df.getDaoPrescricao();
		 pac.getMatricula();
        	Vector v=dao.consultarTodasPrescricoes(pac);
        	return v;
    	}
	    
	    
}
