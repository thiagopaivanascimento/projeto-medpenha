package menusecretaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import menuprincipal.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import medico.Medico;
import menuprincipal.TelaMenuPrincipal;
import ajuda.*;
import consulta.*;
import dao.DaoFactory;
import paciente.*;
import pagamento.*;
import tipoconsulta.TipoConsulta;
import webcam.TelaCarteirinha;


//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//import net.sf.jasperreports.view.JasperViewer;

public class ControleMenuSecretaria implements ActionListener
{
	
	     private JFrame telamenusec;
	   
	        
	     public ControleMenuSecretaria(JFrame telamenusec)
	   {
		  this.telamenusec=telamenusec;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	   	
	    	  if(evt.getActionCommand().equals("Crianças (0 à 17 anos)"))
	          {
	    		     TelaPacienteCrianca telaPacienteCrianca= new TelaPacienteCrianca();
	    		     JPanel pcampo=(JPanel)telaPacienteCrianca.getTelaPacienteCrianca().getContentPane().getComponent(1);
	    		     JPanel pConvenio=(JPanel)pcampo.getComponent(2);
	    		     JComboBox cbOperadoraPlano=(JComboBox)pConvenio.getComponent(7);
	    		     JTextField tMatricula=(JTextField)pConvenio.getComponent(4);
	    		     
	    		    	    		     
	    		     DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	    	         DaoPacienteCrianca dao= df.getDaoPacienteCrianca();
	    		     
	    	         PacienteCrianca pacienteCrianca = new PacienteCrianca(0, null, null, null,
	    	         null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	    	        
	    	         try{
	            		 List convenios = new ArrayList();   
	            		 convenios = (List) dao.buscarConvenio();   
	     			
	            		 for(int i = 0; (i < convenios.size()); i++) {  
	            			 cbOperadoraPlano.addItem(convenios.get(i)); 
	            			 String[] operaconvenio={ "Selecione o Convênio",(String) convenios.get(i) };
	            			 }
	            		 }
	            		 catch(Exception e)
	            		 {
	            			 JOptionPane.showMessageDialog(null,"Não há convênio cadastrado!","Erro",JOptionPane.ERROR_MESSAGE); 
	            		 }
	            		 tMatricula.setEnabled(false);		         
	                    
	    	   }
	    	     	 	
	    	  if(evt.getActionCommand().equals("Adultos (acima de 17 anos)"))
	          {
	    		     TelaPacienteAdulto telaPacienteAdulto = new TelaPacienteAdulto();
	    			 JPanel pcampo=(JPanel)telaPacienteAdulto.getTelaPacienteAdulto().getContentPane().getComponent(0);
	    			 JPanel pConvenio=(JPanel)pcampo.getComponent(2);
	    			 JComboBox cbOperadoraPlano=(JComboBox)pConvenio.getComponent(7);
	    			 JTextField tMatricula=(JTextField)pConvenio.getComponent(4);
	    			 
	    			 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	    	         DaoPacienteAdulto dao= df.getDaoPacienteAdulto();
	    	         
	    	         PacienteAdulto pacienteAdulto = new PacienteAdulto(null, null, null, null, null,
	    	         0,null, null, null, null, null, null, null, null, null, null, null, null);
	    			 
	    	         try{
	            		 List convenios = new ArrayList();   
	            		 convenios = (List) dao.buscarConvenio();   
	     			
	            		 for(int i = 0; (i < convenios.size()); i++) {  
	            			 cbOperadoraPlano.addItem(convenios.get(i)); 
	            			 String[] operaconvenio={ "Selecione o Convênio",(String) convenios.get(i) };
	            			}
	            		 }
	            		 catch(Exception e)
	            		 {
	            			 JOptionPane.showMessageDialog(null,"Não há convênio cadastrado!","Erro",JOptionPane.ERROR_MESSAGE); 
	            		 }
	            		 
	            		 tMatricula.setEnabled(false);
	           }
	    	  	    	    	  
	    	  if(evt.getActionCommand().equals("Emitir Cartirinha"))
	          {
	    		 TelaCarteirinha tela=new TelaCarteirinha();
	          }
	    	  
	    	  if(evt.getActionCommand().equals("Gerenciar Consultas"))
	          {	    		  
	    		      TelaConsulta telaConsulta= new TelaConsulta();
	    		      JPanel pcampo=(JPanel)telaConsulta.getTeConsulta().getContentPane().getComponent(1);
	    		      JPanel pmedico=(JPanel)pcampo.getComponent(2);
	    		      JPanel pConsulta=(JPanel)pcampo.getComponent(4);
	    		      JPanel ptipoConsulta=(JPanel)pcampo.getComponent(5);
	    		      JPanel pPaciente=(JPanel)pcampo.getComponent(3);
	    		      
	    		      JComboBox cbnomeMedico=(JComboBox)pmedico.getComponent(2);
	    		     JTextField tEspecialidade=(JTextField)pmedico.getComponent(4);
	    		      JComboBox cbTipoConsulta=(JComboBox)ptipoConsulta.getComponent(2);
	    		      JTextField tValorConsulta=(JTextField)ptipoConsulta.getComponent(4);
	    		      //JComboBox cbstatus=(JComboBox)pConsulta.getComponent(2);
	    		      JComboBox cbsituacao=(JComboBox)pConsulta.getComponent(8);
	    		      JTextField tNomePaciente=(JTextField)pPaciente.getComponent(5);
	    		      
	    		      DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	    		      DaoConsulta dao= df.getDaoConsulta();
	    		         
	    		      Consulta consulta = new Consulta();
	    		      Medico medico=new Medico(null, null, null, null, null, null, null, null, null, null, null, null);
	    		      Paciente paciente=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);         
	    		      TipoConsulta tipo = new TipoConsulta();
	    		      
	    		      try{
	    	         		 List medicos = new ArrayList();   
	    	         		 medicos = (List) dao.buscarMedicos(medico);   
	    	  			
	    	         		 for(int i = 0; (i < medicos.size()); i++) {  
	    	         			 cbnomeMedico.addItem(medicos.get(i)); 
	    	         			 String[] nomemedico={ "Selecione o Nome do Médico",(String) medicos.get(i) };
	    	         			}
	    	         		 }
	    	         		 catch(Exception e)
	    	         		 {
	    	         			 JOptionPane.showMessageDialog(null,"Não há médico cadastrado!","Erro",JOptionPane.ERROR_MESSAGE); 
	    	         		 }
	    	         		 
	    	         		try{
	    	             		 List tipos = new ArrayList();   
	    	             		 tipos = (List) dao.bucarTipoconsulta(tipo);   
	    	      			
	    	             		 for(int i = 0; (i < tipos.size()); i++) {  
	    	             			cbTipoConsulta.addItem(tipos.get(i)); 
	    	             			 String[] tipoconsulta={ "Selecione o tipo de consulta",(String) tipos.get(i) };
	    	             			
	    	             		 	}
	    	             		 }
	    	             		 catch(Exception e)
	    	             		 {
	    	             			 JOptionPane.showMessageDialog(null,"Não há tipos de consulta cadastrado!","Erro",JOptionPane.ERROR_MESSAGE); 
	    	             		 }
	    	             		 
	    	             		 //cbstatus.setSelectedItem("Não pago");
	    	             		 cbsituacao.setSelectedItem("Pendente");
	    	             		 
	    	             		 //cbstatus.setEnabled(false);
	    	             		 cbsituacao.setEnabled(false);
	    	             		 tNomePaciente.setEnabled(false);
	    	             		 tEspecialidade.setEnabled(false);
	    	             		  tValorConsulta.setEnabled(false);
	    	             		
	           }
	    	  
	    	  if(evt.getActionCommand().equals("Listar Consultas"))
	          {
	    		  TelaListaConsulta tela = new TelaListaConsulta();
	    		  JPanel pcampo=(JPanel)tela.getTelaListaConsulta().getContentPane().getComponent(1);
    		      JPanel pListaConsulta=(JPanel)pcampo.getComponent(0);
    		      Calendario cbdata=(Calendario)pListaConsulta.getComponent(1);
    		      JScrollPane jScrollPane1=(JScrollPane)pListaConsulta.getComponent(4);
    			  JTable jTable1 =(JTable)jScrollPane1.getViewport().getComponent(0);

    			  DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
    		      DaoConsulta dao= df.getDaoConsulta();

    		      Consulta consulta=new Consulta();  
    		      
    		      cbdata.date();
    		         int dia=cbdata.date().getDate();
    		         int mes=cbdata.date().getMonth()+1;
    		         int ano=cbdata.date().getYear()+1900;
    		         String d=String.valueOf(dia);
    		         String m=String.valueOf(mes);
    		         if(d.length()==1)
    		         {	d="0"+d;     }
    		         if(m.length()==1)
    		         {	m="0"+m;     }
    		         
    		         String a=String.valueOf(ano);
    		         String data=(d+"/"+m+"/"+a);
    		         
    		         consulta.setData(data);
    		         
    		         DefaultTableModel tc3;
    		      
    	    		 Vector v=dao.ListarTodasConsultas(consulta);
    	    		 Object [][]T= new Object [v.size()][9];
    	    	        Object [] col={"Data","Hora","Paciente","Matricula","Médico","Especialidade","Situação","Tipo","Status"};
    	    	                        
    	    	        for (int i=0; i< v.size();i++)
    	    	        {
    	    	        	
    	    	        	  	T[i][0]=((Consulta)v.get(i)).getData();
    	    	            	T[i][1]=((Consulta)v.get(i)).getHora();          
    	    	                T[i][2]=((Consulta)v.get(i)).getNome();
    	    	          		T[i][3]=((Consulta)v.get(i)).getMatricula();
    	    	          	    T[i][4]=((Consulta)v.get(i)).getNomeMedico();
  	    	          		    T[i][5]=((Consulta)v.get(i)).getEspecialidade();
    	    	          		T[i][6]=((Consulta)v.get(i)).getSituacao();
    	    	          		T[i][7]=((Consulta)v.get(i)).getTipo();
    	    	          		T[i][8]=((Consulta)v.get(i)).getStatus();
    	    	          		    	    	        
    	    	        }
    	    	        tc3 = new DefaultTableModel(T,col);   	    	                       
    	    	        jTable1= new JTable(tc3);
    	    	        jScrollPane1.setViewportView(jTable1);		       
    					      
    					
    			  
	    	   }
	    	  
	    	  if(evt.getActionCommand().equals("Abrir a Ajuda"))
	          {
	    		   new TelaAjudaSEC();
	          }
	    	   
	    	  if(evt.getActionCommand().equals("Efetuar Logoff"))
	          {
	    		  telamenusec.dispose();

	          }
	    }
}

