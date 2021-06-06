package menuenfermeira;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import menuprincipal.TelaMenuPrincipal;
import ajuda.*;
import anamnese.*;

public class ControleMenuEnfermeira implements ActionListener
{
	
	     private JFrame telamenuenf;
	   
	        
	     public ControleMenuEnfermeira(JFrame telamenuenf)
	   {
		  this.telamenuenf=telamenuenf;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	   	
	    	  if(evt.getActionCommand().equals("  Anamnese  "))
	          {
	    		new TelaAnamnese();
	    	
	          }
	    	  	    	    	  
	    	  if(evt.getActionCommand().equals("Abrir a Ajuda"))
	          {
	    		   new TelaAjudaENF();
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Efetuar Logoff"))
	          {
	    		  telamenuenf.dispose();
	    		
	          }
	    }
}

