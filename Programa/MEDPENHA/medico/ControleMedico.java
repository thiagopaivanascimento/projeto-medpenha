
package medico;

import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.*;

import paciente.PacienteAdulto;
import dao.*;
import menuprincipal.*;
public class ControleMedico implements ActionListener
  {
     private JFrame telaMedico;
   
        
     public ControleMedico(JFrame telaMedico)
   {
	  this.telaMedico=telaMedico;
   }
    public void actionPerformed (ActionEvent evt)
    {
    	 JPanel pcampo=(JPanel)telaMedico.getContentPane().getComponent(1);
         JPanel pDadosPessoais=(JPanel)pcampo.getComponent(2);
         JPanel pEspecificacoes=(JPanel)pcampo.getComponent(0);
         
         JTextField tNome=(JTextField)pDadosPessoais.getComponent(2);
         Calendario tDataNasc=(Calendario)pDadosPessoais.getComponent(15);
         JTextField tCpf=(JTextField)pDadosPessoais.getComponent(6);
         JTextField tIdent=(JTextField)pDadosPessoais.getComponent(9);
         JTextField tCelular=(JTextField)pDadosPessoais.getComponent(18);
         JTextField tEmail=(JTextField)pDadosPessoais.getComponent(4);
         JTextField tTelefone=(JTextField)pDadosPessoais.getComponent(11);
                         
         JTextField tCrm=(JTextField)pEspecificacoes.getComponent(1);
         JTextField tEspecialidade=(JTextField)pEspecificacoes.getComponent(4);
         
         Medico medico = new Medico(null, null, null, null, null,
         null, null, null, null, null, null,  null);
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoMedico dao= df.getDaoMedico();
  			
         medico.setNome(tNome.getText());
         
         tDataNasc.date();
         int dia=tDataNasc.date().getDate();
         int mes=tDataNasc.date().getMonth()+1;
         int ano=tDataNasc.date().getYear()+1900;
         String d=String.valueOf(dia);
         String m=String.valueOf(mes);
         if(d.length()==1)
         {	d="0"+d;     }
         if(m.length()==1)
         {	m="0"+m;     }
         
         String a=String.valueOf(ano);
         String data=(d+"/"+m+"/"+a);
         medico.setDataNasc(data);  
      
   	     medico.setCpf(tCpf.getText());
         medico.setRg(tIdent.getText());
         medico.setCelular(tCelular.getText());
         medico.setEmail(tEmail.getText());
         medico.setTelefone(tTelefone.getText());
         medico.setCrm(tCrm.getText());
         medico.setEspecialidade(tEspecialidade.getText());
          
         Date date =new Date() ;
      	
	      	//alterando formato
	      	DateFormat dformat;
	      	String dataatual;		      	
	      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
	      	dataatual=dformat.format(date).toString();
         
         
     	tCpf.setEnabled(true);
     	tIdent.setEnabled(true);
     	tCrm.setEnabled(true);
     
     	
         if(evt.getActionCommand().equals("Voltar"))
         {	
         	telaMedico.dispose();
         }
         
         if(evt.getActionCommand().equals("Limpar"))
      	{      	  
        	 	tNome.setText("");
        	 	tDataNasc.setSelectedItem(dataatual);
	 			tCpf.setText("");
	 			tIdent.setText("");
	 			tCelular.setText("");
	 			tEmail.setText("");
	 			tTelefone.setText("");
	 			tCrm.setText("");
	 			tEspecialidade.setText("");
	 			 
          }
         
         if(evt.getActionCommand().equals("Consultar"))
     	{ 
        	 if(tCrm.getText().equals("_________/__"))
                 {
         	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CRM!","Atenção",JOptionPane.WARNING_MESSAGE);  
                 }
        	 else{
        		 boolean aux=dao.visualizar(medico);
        		 if(aux==false)
	    			{	
	    				JOptionPane.showMessageDialog(null,"Médico não cadastrado no sistema","Atenção",JOptionPane.WARNING_MESSAGE);  
	    			}
				 else
				 {
					 	tNome.setText(medico.getNome());
					 	tDataNasc.setSelectedItem(medico.getDataNasc());
					 	tCpf.setText(medico.getCpf());
					 	tCpf.setEnabled(false);
					 	tIdent.setText(medico.getRg());
					 	tIdent.setEnabled(false);
					 	tCelular.setText(medico.getCelular());
					 	tEmail.setText(medico.getEmail());
					 	tTelefone.setText(medico.getTelefone());
					 	tCrm.setText(medico.getCrm());
					 	tCrm.setEnabled(false);
					 	tEspecialidade.setText(medico.getEspecialidade());
				 }
        	 }
         }
         
         if(evt.getActionCommand().equals("Deletar"))
     	{         	 
        	 if(tCrm.getText().equals("_________/__"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CRM!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }
        	 else{
        		 boolean aux=dao.visualizar(medico);
        		 if(aux==false)
        		 {	
    				JOptionPane.showMessageDialog(null,"Médico não cadastrado no sistema","Atenção",JOptionPane.WARNING_MESSAGE);  
        		 }
        		 else
        		 	{    		 
        			 	dao.excluir(medico);
   	             		  
    		 			tNome.setText("");
    		 			tDataNasc.setSelectedItem(medico.getDataNasc());
    		 			tCpf.setText("");
    		 			tIdent.setText("");
    		 			tCelular.setText("");
    		 			tEmail.setText("");
    		 			tTelefone.setText("");
    		 			tCrm.setText("");
    		 			tEspecialidade.setText("");
             
    		 			JOptionPane.showMessageDialog(null,"Médico deletado com sucesso!","Dados Deletados",JOptionPane.INFORMATION_MESSAGE);  
        		 	}               
    	 		}
         
     	}
         
         if(evt.getActionCommand().equals("Alterar"))
     	{ 
        	 
        	 if((tNome.getText().equals(""))||(data.equals(dataatual))||
        	 (tCpf.getText().equals("___.___.___-__"))|| (tIdent.getText().equals("__.___.___-__"))||
        	 (tTelefone.getText().equals("(__) ____ - ____"))||(tCrm.getText().equals("_________/__"))||
             (tEspecialidade.getText().equals("")) || (tCrm.getText().equals("_________/__")))
        	 
        	 {
        		 JOptionPane.showMessageDialog(null,"Você precisa Fazer uma consulta pelo CRM, para poder alterar os dados desse médico!","Atenção",JOptionPane.WARNING_MESSAGE);  
              }
        	 String maior=datanascimento();
         	if(maior=="false")
         	{
         		tCpf.setEnabled(false);
         		tIdent.setEnabled(false);
         		tCrm.setEnabled(false);
         		JOptionPane.showMessageDialog(null,"Esta Data deNascimento consta menor de idade!","Atenção",JOptionPane.WARNING_MESSAGE);
         		
         	}      
         	else{
        	 
        		 				        		   
    				  		 dao.alterar(medico);
    	              		 tNome.setText("");
    	              		 tDataNasc.setSelectedItem(medico.getDataNasc());
    	              		 tCpf.setText("");
    	              		 tIdent.setText("");
    	              		 tCelular.setText("");
    	              		 tEmail.setText("");
    	              		 tTelefone.setText("");
    	              		 tCrm.setText("");
    	              		 tEspecialidade.setText("");
    	              		 JOptionPane.showMessageDialog(null,"Dados do Médico Alterados com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);  
    	                   	
    				 
    			  
        	 }
     	}
         
         if(evt.getActionCommand().equals("Salvar"))
     	{ 
        	       	 if(tNome.getText().equals(""))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Nome!","Atenção",JOptionPane.WARNING_MESSAGE);    
        	       	 }
        	       	 else if(data.equals(dataatual))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Data de Nascimento!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	       	 }
        	       	 else if(tCpf.getText().equals("___.___.___-__"))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CPF!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	       	 }
        	       	 else if(tIdent.getText().equals("__.___.___-__"))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Identidade!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	       	 }
        	         else if(tTelefone.getText().equals("(__) ____ - ____"))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Telefone!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	       	 }
        	       	 else if(tCrm.getText().equals("_________/__"))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CRM!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	       	 }
        	       	 else if(tEspecialidade.getText().equals(""))
        	       	 {
        	       		 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Especialidade!","Atenção",JOptionPane.WARNING_MESSAGE);  
        	       	 }
        	       	 
        	       	 else{
        	       		String maior=datanascimento();
                    	if(maior=="false")
                    	{
                    		JOptionPane.showMessageDialog(null,"Esta Data deNascimento consta menor de idade!","Atenção",JOptionPane.WARNING_MESSAGE);
                    	}      
                    	else{
        	       		String validacao=dao.validarDados(medico);
        	       		if(validacao=="cpf encontrado")
                      	{
                      		JOptionPane.showMessageDialog(null,"Este CPF já foi cadastrado no sistema, Por Favor digite outro CPF!","Atenção",JOptionPane.WARNING_MESSAGE);
                      	}
                       	else if (validacao=="rg encontrado")
                      	{
                      		JOptionPane.showMessageDialog(null,"Esta Identidade já foi cadastrada no sistema, Por Favor digite outra Identidade!","Atenção",JOptionPane.WARNING_MESSAGE);  
                      	}
                      	else if (validacao=="crm encontrado")
                      	{
                      		JOptionPane.showMessageDialog(null,"Este CRM já foi cadastrada no sistema, Por Favor digite outro CRM!","Atenção",JOptionPane.WARNING_MESSAGE);  
                      	}
                      	else 
                      	  { 
                      		boolean aux=dao.verificarUsuario(medico);
                      		if(aux==false)
                      		{	
                      			JOptionPane.showMessageDialog(null,"Este cpf é inválido, Por Favor faça primeiramente o seu cadastro como usuário e utilize uma matrícula válida!","Atenção",JOptionPane.WARNING_MESSAGE);  
                      		}
                      		else
                      		{
                      			if (tCelular.getText().equals("(__) ____ - ____"))
                      			{
            	        			 medico.setCelular("");
                      			}
            	        					 
            	        	 	dao.adicionar(medico);
        	       				tNome.setText("");
        	       				tDataNasc.setSelectedItem(medico.getDataNasc());
            	        	 	tCpf.setText("");
            	        		tIdent.setText("");
            	        	    tCelular.setText("");
            	        		tEmail.setText("");
            	        		tTelefone.setText("");
            	        		tCrm.setText("");
            	        		tEspecialidade.setText("");
            	        		JOptionPane.showMessageDialog(null,"Médico Cadastrado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);  
                      		}				
            	       }
                      	
        		 	}
       		 	}
       	 	}
               	
    }
    public String datanascimento()
    { 
		 	 String maior=null;
		 	 JPanel pcampo=(JPanel)telaMedico.getContentPane().getComponent(1);
	         JPanel pDadosPessoais=(JPanel)pcampo.getComponent(2);
	         Calendario tDataNasc=(Calendario)pDadosPessoais.getComponent(15);
	 		 
	         Medico medico = new Medico(null, null, null, null, null,
	                 null, null, null, null, null, null,  null);
			
	 		 tDataNasc.date();
	         int dia=tDataNasc.date().getDate();
	         int mes=tDataNasc.date().getMonth()+1;
	         int ano=tDataNasc.date().getYear()+1900;

	   	   	        
	         Date data= new Date();
		     DateFormat dformat;
		     String dataAtual;
		    	
		     dformat=DateFormat.getDateInstance(DateFormat.DEFAULT);
		     dataAtual=dformat.format(data).toString();
		    	
		     int diahj = data.getDate();
		     int meshj = data.getMonth()+1;
		     int anohj= data.getYear()+1900;
		    	
		      if(ano+18<anohj)
		      {
		    	maior="true";
		      }
		      else if(ano+18>anohj)
		      {
		    	 maior="false";
		      }
		      else if(ano+18==anohj)
		      {    	     	  
		    	  if(mes<meshj)
		    	  {
		    		 maior="true";
		    	  }
		    	  else if(mes>meshj)
		    	  {
		    		 maior="false";
		    	  }
		    	  else if(mes==meshj)
		    	  {
		    		  if(dia<diahj)
		        	  {
		    			 maior="true";
		        	  }
		        	  else if(dia>diahj)
		        	  {
		        		 maior="false";
		        	  }
		        	  else if(dia==diahj)
		        	  {
		        		 maior="true";
		        	  }
		    		 
		    	  }
		      }
		return maior;
				
		 }
  
}


