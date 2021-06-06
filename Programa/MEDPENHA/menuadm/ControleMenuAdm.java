package menuadm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.*;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import pagamento.DaoPagamento;
import relatorios.TelaRelaArrecadacaoConvenio;
import relatorios.TelaRelaConsultaCancelada;
import relatorios.TelaRelaPagamentoConvenio;
import relatorios.TelaRelaPagamentoParticular;
import ajuda.*;
import medico.*;
import menuprincipal.TelaMenuPrincipal;
import tipoconsulta.TelaPreco;
import usuario.*;
import convenio.*;
import dao.DaoFactory;


public class ControleMenuAdm implements ActionListener
{
	
	     private JFrame telamenuadm;
	   
	        
	     public ControleMenuAdm(JFrame telamenuadm)
	   {
		  this.telamenuadm=telamenuadm;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	   	
	    	  if(evt.getActionCommand().equals("   Usuário   "))
	          {
	    		 new TelaUsuario();
	          }
	    	  	    	    	  
	    	  if(evt.getActionCommand().equals("   Médico   "))
	          {
	    		  new TelaMedico();
	          }
	    	  
	    	  if(evt.getActionCommand().equals("   Convênio   "))
	          {
	    		  new TelaConvenio();
	          }
	    	  
	    	  if(evt.getActionCommand().equals( "Lista de Pacientes por Convênio"))
	          {
	    		   TelaListaPaciente tel=new TelaListaPaciente();
	    		   JPanel pCampo = (JPanel) tel.getTelaListaPaciente().getContentPane().getComponent(0);
	    		   JPanel plista = (JPanel)pCampo.getComponent(0);
	    		   
	    		   JScrollPane jScrollPane1=(JScrollPane)plista.getComponent(0);
	    		   JTable jTable1 =(JTable)jScrollPane1.getViewport().getComponent(0);
	    		   JComboBox cbConvenio =(JComboBox)plista.getComponent(2);
	    		   
	    		     DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	    	         DaoConvenio dao= df.getDaoConvenio();
	    		     
	    	         Convenio c= new Convenio();
	    	        
	    	         try{
	            		 List convenios = new ArrayList();   
	            		 convenios = (List) dao.buscarConvenio();   
	     			
	            		 for(int i = 0; (i < convenios.size()); i++) {  
	            			 cbConvenio.addItem(convenios.get(i)); 
	            			 String[] operaconvenio={ "Selecione o Convênio",(String) convenios.get(i) };
	            			 }
	            		 }
	            		 catch(Exception e)
	            		 {
	            			 JOptionPane.showMessageDialog(null,"Não há convênio cadastrado!","Erro",JOptionPane.ERROR_MESSAGE); 
	            		 }
	            		 	    		  
	          }
 
	    	  if(evt.getActionCommand().equals("Estatístico por pagamento convênio"))
	          {
	    			    		  
	    		  new TelaRelaPagamentoConvenio();
			   	  }	
			   	  
			   	    	  
	    	  if(evt.getActionCommand().equals("Estatístico por pagamento particular"))
	          {
	    		 		  new TelaRelaPagamentoParticular();
			   	  }	
	          
	    	  
	    	  if(evt.getActionCommand().equals("Arrecadação por empresa conveniada"))
	          {
	    		  new TelaRelaArrecadacaoConvenio(); 	 
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Estatístico por consulta cancelada"))
	          {
	    		  new TelaRelaConsultaCancelada();
	          }
	    	  	    	   	  
	    	  	    	  
	    	  if(evt.getActionCommand().equals("Abrir a Ajuda"))
	          {
	    		  new TelaAjudaADM();
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Efetuar Logoff"))
	          {
	    		  telamenuadm.dispose();
	          }
	    	  if(evt.getActionCommand().equals("Preço da Consulta"))
	          {
	    		  new TelaPreco();
	          }
	    	     
	         
	    }
}

