package pagamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.*;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import paciente.*;
import consulta.Consulta;
import consulta.DaoConsulta;
import convenio.*;
import dao.DaoFactory;

public class ControlePagamento implements ActionListener
{
	private JFrame telaPagamento;
	 
    
    public ControlePagamento(JFrame telaPagamento)
  {
	  this.telaPagamento=telaPagamento;
  }
	public void actionPerformed(ActionEvent evt) {
	
		 JPanel pCampo=(JPanel)telaPagamento.getContentPane().getComponent(1);
    	 JPanel pParticular=(JPanel)pCampo.getComponent(0);
    	 JPanel pDadosPagament=(JPanel)pCampo.getComponent(1);
    	 JPanel pConsulta=(JPanel)pCampo.getComponent(2);
    	 JPanel ptotal=(JPanel)pCampo.getComponent(3);
    	 JPanel pConvenio=(JPanel)pCampo.getComponent(4);
    	    	 
    	 JTextField tValorConsulta=(JTextField)ptotal.getComponent(1);
         JTextField tTotal=(JTextField)ptotal.getComponent(4);

         JPanel pCheque=(JPanel)pParticular.getComponent(0);   
         JPanel pCartao=(JPanel)pParticular.getComponent(1);
         JComboBox cbPagamento=(JComboBox)pParticular.getComponent(3);
         
         JTextField tbanco=(JTextField)pCheque.getComponent(1);
         JTextField tnumcheque=(JTextField)pCheque.getComponent(3);
         JTextField tagencia=(JTextField)pCheque.getComponent(5);
         JTextField tnumconta=(JTextField)pCheque.getComponent(7);
         JTextField tnumserie=(JTextField)pCheque.getComponent(9);
         
         JTextField tCartao=(JTextField)pCartao.getComponent(1);
         
         JTextField tCnpj=(JTextField)pConvenio.getComponent(2);
         JTextField tConvenio=(JTextField)pConvenio.getComponent(4);
         
         JTextField tDataCons=(JTextField)pConsulta.getComponent(3);
         JComboBox cbhora=(JComboBox)pConsulta.getComponent(5);
         JTextField tMatricula=(JTextField)pConsulta.getComponent(7);
         
         JScrollPane jScrollPane1=(JScrollPane)pDadosPagament.getComponent(7);
	     JTextArea taObs =(JTextArea)jScrollPane1.getViewport().getComponent(0);
         JComboBox cbTipoPagament=(JComboBox)pDadosPagament.getComponent(4);
         JTextField tData=(JTextField)pDadosPagament.getComponent(1);
       
         PagamentoParticular pp = new PagamentoParticular(null, null, null, 0, null,null); 
         PagamentoConvenio pagconvenio = new PagamentoConvenio(null, null, null, null, 0, null,null); 
         Pagamento pag = new Pagamento(null, null, 0, null,null); 
         Paciente p = new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
         Convenio conv = new Convenio();
         Consulta cons = new Consulta();
         Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
         
         Cartao cart =new Cartao(null, null, null,0, null, null);
         Cheque cheq = new Cheque(null,null,null,0,null,null,
        		 null,null,null,null,null);
         
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoPagamento dao= df.getDaoPagamento();  
        // DaoConsulta dao2= df.getDaoConsulta();  
         DaoPagamentoConvenio dao3= df.getDaoPagamentoConvenio();  
         DaoPagamentoParticular dao4=df.getDaoPagamentoParticular();
                   
         pagconvenio.setData(tData.getText());
         pagconvenio.setCnpj(tCnpj.getText());
         pagconvenio.setObs(taObs.getText());
         pagconvenio.setConvenio(tConvenio.getText());
         
         pp.setData(tData.getText());
         pp.setObs(taObs.getText());
                 
         cons.setData(tDataCons.getText());
         cons.setHora((String)cbhora.getSelectedItem());
         
         pac.setMatricula((Integer.parseInt(tMatricula.getText())));
         
         pag.setData(tData.getText());
         pag.setDatacons(tDataCons.getText());
         pag.setHora((String)cbhora.getSelectedItem());
         
         
         //cheque
         cheq.setNomebanco(tbanco.getText());
		 cheq.setNumcheque(tnumcheque.getText());
	     cheq.setAgencia(tagencia.getText());
	     cheq.setNumconta(tnumconta.getText());
	     cheq.setNumserie(tnumserie.getText());
	    //cartão
	     cart.setNumcartao(tCartao.getText()); 
                      
        
         try
         {
           p.setMatricula(Integer.parseInt(tMatricula.getText()));
         }
         catch(Exception ex)
         {
        	 
         }
         
         int index=cbTipoPagament.getSelectedIndex();
         pagconvenio.setTipo((String)cbTipoPagament.getItemAt(index));  
         pp.setTipo((String)cbTipoPagament.getItemAt(index));
         
         if(tTotal.getText().equals(""))
         { }
         else
         {
        	 double total = Double.parseDouble(tTotal.getText());	
        	 pagconvenio.setTotal(total);
        	 pp.setTotal(total);
        	              
         }
         
         
          if(evt.getActionCommand().equals("Voltar"))
          {
        	  telaPagamento.dispose();
          }
          
          if(evt.getActionCommand().equals("Limpar"))
          {
        	  
        	  tConvenio.setText("");
        	  cbTipoPagament.setSelectedItem("Selecione o tipo de pagamento");
    		  tCnpj.setText("");  
    		  taObs.setText("");
    		  tCartao.setText("");
    		  tnumserie.setText("");
    		  tnumconta.setText("");
    		  tagencia.setText("");
    		  tnumcheque.setText("");
    		  tbanco.setText("");
    		  tTotal.setText("");
    		  
    		  cbPagamento.setSelectedItem("Selecione a forma de pagamento");
          }
         
                    
          if(evt.getActionCommand().equals("Calcular"))
          { 
        	  if (cbTipoPagament.getSelectedItem().equals("Selecione o tipo de pagamento"))
        	  {
        		  JOptionPane.showMessageDialog(null,"Por favor,selecione o tipo de pagamento!","Atenção",JOptionPane.WARNING_MESSAGE);
        	  }
        	  else if (cbTipoPagament.getSelectedItem().equals("Convênio"))
        	  {
        	  boolean aux=dao.buscarConvenio(conv, p);
				if(aux==true)
				{	
				   		     
				 try{	
					double perc=conv.getPercentual();
					String consulta= tValorConsulta.getText();
					double valor=Double.parseDouble(consulta);
					
					double totalperc=valor*perc/100;
					double total=valor-totalperc;
									
					tTotal.setText(String.valueOf(total));
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				}
				else
				{
					String consulta= tValorConsulta.getText();
					tTotal.setText(consulta);
					
				}//fecha else
        	  }//fecha primeiro else if
        	  else if(cbTipoPagament.getSelectedItem().equals("Particular"))
        	  {
        		  String consulta= tValorConsulta.getText();
				  tTotal.setText(consulta);
				  pp.setTotal(Double.parseDouble(tTotal.getText()));
				            
	        	 				
        	  }//segundo else if
        	    
          }//fecha calcular
                
          
         //AQUI FICAVA O EFETUAR PAGAMENTO
          
          
         
          if(evt.getActionCommand().equals("Emitir Recibo"))
          {
        	 
             if(cbTipoPagament.getSelectedItem().equals("Convênio"))
        	  {
        		  JOptionPane.showMessageDialog(null,"Não há recibo para pagamento do tipo convênio!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	  }
        	  
        	  else
        	   {
        		  DaoPagamento daorecibo= df.getDaoPagamento(); 
        		  Vector recibo = new Vector();
        	 
        	  
	        	recibo= daorecibo.preencheReciboConsulta(p,pag);
							
				//Classe que define o tempo de dado do relatorio
				JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)recibo);
				
				Map mapa = new HashMap();
				
				try
				{
					
					JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Recibo.jasper",mapa,jrbean);
			        JasperViewer.viewReport(jasperPrint, false);
				}
				catch(Exception ex)
				{
					System.out.println("Erro no relatório"+ex.getMessage());
				}	
        	}
          }
          
          if(evt.getSource()==cbTipoPagament)
          {
        	  int index2=cbTipoPagament.getSelectedIndex();
              
        	  if(index2==0)
        	  {
        		  
        		  tConvenio.setText("");
            	  tCnpj.setText("");  
        		  tTotal.setText("");
        		  cbPagamento.setSelectedItem("Selecione a forma de pagamento");
        		  tConvenio.setEnabled(false);
        		  cbPagamento.setEnabled(false);
        		  tCnpj.setEnabled(false);
        		  
        		  cbPagamento.setSelectedIndex(0);
        	  }
        	  
        	  if(index2==1)
        	  {
        		  //tTotal.setText("");
        		  cbPagamento.setSelectedItem("Selecione a forma de pagamento");
        		  cbPagamento.setEnabled(false);
        		  //tConvenio.setEnabled(false);
        		  tCnpj.setEnabled(false);
        		 
        		  	 boolean aux=dao.buscarConvenio(conv, p);
    				if(aux==true)
    				{	
    				   tCnpj.setText(conv.getCnpj());
    				   tConvenio.setText(conv.getInstituicao());
    				    				  
    				}
    				  else 
    				  {
    					  JOptionPane.showMessageDialog(null,"Este paciente,não possui convênio!","Atenção",JOptionPane.WARNING_MESSAGE);					
    				   }
            	  }
        		  
        		  
        	 
        	  if(index2==2)
        	  {
        		  tConvenio.setText("");
            	  tCnpj.setText(""); 
            	  //tTotal.setText("");
            	  cbPagamento.setEnabled(true);
        		  tConvenio.setEnabled(false);
        		  tCnpj.setEnabled(false);
        	  }
        		  
        		  
          }
          
          if(evt.getSource()==cbPagamento)
          {
        	  int index2=cbPagamento.getSelectedIndex();
        	 
        	  if(index2==0)
        	  {
        		  tbanco.setEnabled(false);
        		  tnumcheque.setEnabled(false);
        	      tagencia.setEnabled(false);
        	      tnumconta.setEnabled(false);
        	      tnumserie.setEnabled(false);
        	      tCartao.setEnabled(false); 
        	  }
        	  
        	  if(index2==1)
        	  {
        		  //dinheiro
        		  tbanco.setEnabled(false);
        		  tnumcheque.setEnabled(false);
        	      tagencia.setEnabled(false);
        	      tnumconta.setEnabled(false);
        	      tnumserie.setEnabled(false);
        	      tCartao.setEnabled(false); 
        	              		  
        	  }
        	  
        	  if(index2==2)
        	  {
        	    //cheque
        		  tbanco.setEnabled(true);
        		  tnumcheque.setEnabled(true);
        	      tagencia.setEnabled(true);
        	      tnumconta.setEnabled(true);
        	      tnumserie.setEnabled(true);
        	      
        	      tCartao.setEnabled(false);
        		  
        		  
        		  
        	  }
        	  
        	  if(index2==3)
        	  {
        	   //cartão
        		  tCartao.setEnabled(true);
        		  tbanco.setEnabled(false);
        		  tnumcheque.setEnabled(false);
        	      tagencia.setEnabled(false);
        	      tnumconta.setEnabled(false);
        	      tnumserie.setEnabled(false);
        	 
        	  }
        	  
          }
          
          
          if(evt.getActionCommand().equals("Efetuar Pagamento"))
          {
        	  if (cbTipoPagament.getSelectedItem().equals("Selecione o tipo de pagamento"))
        	  {
        		  JOptionPane.showMessageDialog(null,"Por favor,selecione o tipo de pagamento!","Atenção",JOptionPane.WARNING_MESSAGE);
        	  }
        	  else if((cbTipoPagament.getSelectedItem().equals("Particular"))&&(cbPagamento.getSelectedItem().equals("Selecione a forma de pagamento")))
        	  {
        		  JOptionPane.showMessageDialog(null,"Por favor,selecione a forma de pagamento!","Atenção",JOptionPane.WARNING_MESSAGE);
        	  }
        	  else if(tTotal.getText().equals(""))
        	  {
        	  JOptionPane.showMessageDialog(null,"Por favor,precione o botão calcular, para calcular o pagamento!","Atenção",JOptionPane.WARNING_MESSAGE);
        	  }
        	  else if(cbTipoPagament.getSelectedItem().equals("Convênio"))
        	  {
        		  dao3.efetuarPagamentoConv(pagconvenio,cons,pac);
        		  JOptionPane.showMessageDialog(null,"Pagamento efetuado com sucesso!");
        		 // tConvenio.setText("");
            	  cbTipoPagament.setSelectedItem("Selecione o tipo de pagamento");
        		  tCnpj.setText("");  
        		 // tTotal.setText("");
        		  cbPagamento.setSelectedItem("Selecione a forma de pagamento");
        		  telaPagamento.dispose();
        	  }
        	  
        	  else if(cbTipoPagament.getSelectedItem().equals("Particular"))
        	  {
        		  
        		  if(cbPagamento.getSelectedItem().equals("Dinheiro"))
        		   {
        			dao4.efetuarPagamentoParticularDinh(pp,pac,cons); 
        			JOptionPane.showMessageDialog(null,"Pagamento efetuado com sucesso!");
        		   }
        		  
        		  if(cbPagamento.getSelectedItem().equals("Cheque"))
        		   {
        			  dao4.efetuarPagamentoParticularCheque(pp,pac,cons,cheq); 
        			  tnumserie.setText("");
            		  tnumconta.setText("");
            		  tagencia.setText("");
            		  tnumcheque.setText("");
            		  tbanco.setText("");
            		              		  
        			  JOptionPane.showMessageDialog(null,"Pagamento efetuado com sucesso!");
        		   }
        		  
        		  if(cbPagamento.getSelectedItem().equals("Cartão"))
        		  {
        			  dao4.efetuarPagamentoParticularCartao(pp,pac,cons,cart);  
        			  tCartao.setText("");
        			  JOptionPane.showMessageDialog(null,"Pagamento efetuado com sucesso!");
        			  
       		      }
        		  }
        		       		  
        	  }
        	  		
          }
                 
          
	}
	
		

