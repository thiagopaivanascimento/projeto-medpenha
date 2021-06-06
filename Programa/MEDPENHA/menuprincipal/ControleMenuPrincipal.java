package menuprincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ajuda.*;


//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import net.sf.jasperreports.view.JasperViewer;


import usuario.*;


public class ControleMenuPrincipal implements ActionListener
{
	
	     private JFrame telaMenuPrin;
	   
	        
	     public ControleMenuPrincipal(JFrame telaMenuPrin)
	   {
		  this.telaMenuPrin=telaMenuPrin;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	   	
	    	  if(evt.getActionCommand().equals("Efetuar Login"))
	          {
	    		  new TelaLogin();
	    	  }
	    	  
	    	  if(evt.getActionCommand().equals("Sair do MEDPENHA"))
	          {
	    		  System.exit(0);
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Abrir a Ajuda"))
	          {
	    		   new TelaAjudaPrincipal();
	          }
	    	  
	      }
}

