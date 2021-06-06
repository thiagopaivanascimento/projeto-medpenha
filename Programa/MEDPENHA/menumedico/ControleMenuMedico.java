package menumedico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import consulta.DaoConsulta;
import consulta.TelaAgenda;
import dao.DaoFactory;
import medico.Medico;
import menuprincipal.TelaMenuPrincipal;
import ajuda.*;

public class ControleMenuMedico implements ActionListener
{
		  private JFrame telamenumedico;
	   	      
	     public ControleMenuMedico(JFrame telamenumedico)
	   {
		  this.telamenumedico=telamenumedico;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	   	
	    	  if(evt.getActionCommand().equals("Visualisar Agenda"))
	          {
	    		TelaAgenda telaAgenda= new TelaAgenda();
	              
	    		JPanel pCampo=(JPanel)telaAgenda.getTelaAgenda().getContentPane().getComponent(1);
	        	JPanel pagenda = (JPanel)pCampo.getComponent(1);
	        	  	    
	    	    JTextField tdata =(JTextField)pagenda.getComponent(6);
	    	    JTextField tNome =(JTextField)pagenda.getComponent(12);
	    	    JTextField tEspecialidade =(JTextField)pagenda.getComponent(3);
	    	    	    
	    	    DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
  		        DaoConsulta dao= df.getDaoConsulta();
	    	  	   	         			    	    
	    	    
	    	    Date data =new Date() ;
	           		    
		      	//alterando formato
		      	DateFormat dformat;
		      	String dataAtual;
		      	
		      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		      	dataAtual=dformat.format(data).toString();
		      	      	
		      	tdata.setText(dataAtual);
		      	tdata.setEnabled(false);
		      	tNome.setEnabled(false);
		      	tEspecialidade.setEnabled(false);    
	         }
	         
	    	  	  
	    	  if(evt.getActionCommand().equals("Abrir a Ajuda"))
	          {
	    		   new TelaAjudaMED();
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Efetuar Logoff"))
	          {
	    		  telamenumedico.dispose();

	          }
	    	  
	    	      	  
	    }
	}

