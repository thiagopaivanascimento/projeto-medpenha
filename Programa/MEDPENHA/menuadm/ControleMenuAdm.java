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
	    	   	
	    	  if(evt.getActionCommand().equals("   Usu�rio   "))
	          {
	    		 new TelaUsuario();
	          }
	    	  	    	    	  
	    	  if(evt.getActionCommand().equals("   M�dico   "))
	          {
	    		  new TelaMedico();
	          }
	    	  
	    	  if(evt.getActionCommand().equals("   Conv�nio   "))
	          {
	    		  new TelaConvenio();
	          }
	    	  
	    	  if(evt.getActionCommand().equals( "Lista de Pacientes por Conv�nio"))
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
	            			 String[] operaconvenio={ "Selecione o Conv�nio",(String) convenios.get(i) };
	            			 }
	            		 }
	            		 catch(Exception e)
	            		 {
	            			 JOptionPane.showMessageDialog(null,"N�o h� conv�nio cadastrado!","Erro",JOptionPane.ERROR_MESSAGE); 
	            		 }
	            		 	    		  
	          }
 
	    	  if(evt.getActionCommand().equals("Estat�stico por pagamento conv�nio"))
	          {
	    			    		  
	    		  new TelaRelaPagamentoConvenio();
			   	  }	
			   	  
			   	    	  
	    	  if(evt.getActionCommand().equals("Estat�stico por pagamento particular"))
	          {
	    		 		  new TelaRelaPagamentoParticular();
			   	  }	
	          
	    	  
	    	  if(evt.getActionCommand().equals("Arrecada��o por empresa conveniada"))
	          {
	    		  new TelaRelaArrecadacaoConvenio(); 	 
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Estat�stico por consulta cancelada"))
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
	    	  if(evt.getActionCommand().equals("Pre�o da Consulta"))
	          {
	    		  new TelaPreco();
	          }
	    	     
	         
	    }
}

