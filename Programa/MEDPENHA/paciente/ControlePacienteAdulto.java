package paciente;

import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;

import prontuario.TelaGerarProntuario;
import dao.DaoFactory;
import menuprincipal.*;

public class ControlePacienteAdulto implements ActionListener,MouseListener{

		private JFrame telaPacienteAdulto;
	 
	 public ControlePacienteAdulto(JFrame telaPacienteAdulto)
	   {
		  this.telaPacienteAdulto=telaPacienteAdulto;
	   }
	public void actionPerformed(ActionEvent evt) {
		
		 JPanel pcampo=(JPanel)telaPacienteAdulto.getContentPane().getComponent(0);
         JPanel pDadosPessoais=(JPanel)pcampo.getComponent(3);
         JPanel pLogadouro=(JPanel)pcampo.getComponent(1);
         JPanel pConvenio=(JPanel)pcampo.getComponent(2);
                 
         JTextField tNome=(JTextField)pDadosPessoais.getComponent(3);
         Calendario tDataNasc=(Calendario)pDadosPessoais.getComponent(6);
         JComboBox cbSexo=(JComboBox)pDadosPessoais.getComponent(8);
         JTextField tCpf=(JTextField)pDadosPessoais.getComponent(9);
         JTextField tTelefone=(JTextField)pDadosPessoais.getComponent(14);
         JTextField tIdent=(JTextField)pDadosPessoais.getComponent(16);
         JTextField tCelular=(JTextField)pDadosPessoais.getComponent(20);
         JComboBox cbEstadoCivil=(JComboBox)pDadosPessoais.getComponent(21);

         JTextField tEndereco=(JTextField)pLogadouro.getComponent(3);
         JTextField tNumero=(JTextField)pLogadouro.getComponent(6);
         JTextField tCidade=(JTextField)pLogadouro.getComponent(8);
         JTextField tBairro=(JTextField)pLogadouro.getComponent(9);
         JTextField tComplemento=(JTextField)pLogadouro.getComponent(14);
         JTextField tCep=(JTextField)pLogadouro.getComponent(15);
         JComboBox cbUf=(JComboBox)pLogadouro.getComponent(18);
         
         JComboBox cbConvenio=(JComboBox)pConvenio.getComponent(1);
         JTextField tMatricula=(JTextField)pConvenio.getComponent(4);
         JComboBox cbOperadoraPlano=(JComboBox)pConvenio.getComponent(7);
                 
         PacienteAdulto pacienteAdulto = new PacienteAdulto(null, null, null, null, null,
         0,null, null, null, null, null, null, null, null, null, null, null, null);
                 
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoPacienteAdulto dao= df.getDaoPacienteAdulto();
  			
         pacienteAdulto.setNome(tNome.getText());
         
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
   	  
         pacienteAdulto.setDataNasc(data);  
         
         int index=cbSexo.getSelectedIndex();
         pacienteAdulto.setSexo((String)cbSexo.getItemAt(index));  
         
         pacienteAdulto.setCpf(tCpf.getText());
         pacienteAdulto.setTelefone(tTelefone.getText());
         pacienteAdulto.setRg(tIdent.getText());
         pacienteAdulto.setCelular(tCelular.getText());
         
         int index2=cbEstadoCivil.getSelectedIndex();
         pacienteAdulto.setEstadocivil((String)cbEstadoCivil.getItemAt(index2));  
         
         pacienteAdulto.setEndereco(tEndereco.getText());
         pacienteAdulto.setNumero(tNumero.getText());
         pacienteAdulto.setCidade(tCidade.getText());
         pacienteAdulto.setBairro(tBairro.getText());
         pacienteAdulto.setComplemento(tComplemento.getText());
         pacienteAdulto.setCep(tCep.getText());
         
         int index3=cbUf.getSelectedIndex();
         pacienteAdulto.setUf((String)cbUf.getItemAt(index3));
         
         int index4=cbConvenio.getSelectedIndex();
         pacienteAdulto.setConvenio((String)cbConvenio.getItemAt(index4));
            
                  
         if(tMatricula.getText().equals(""))
         { }
         else
         {
        	 int matricula = Integer.parseInt(tMatricula.getText());	
             pacienteAdulto.setMatricula(matricula);
             
         }
                  
         int index5=cbOperadoraPlano.getSelectedIndex();
         pacienteAdulto.setOperaConvenio((String)cbOperadoraPlano.getItemAt(index5));
         
         Date date =new Date() ;
     	
	      	//alterando formato
	      	DateFormat dformat;
	      	String dataatual;		      	
	      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
	      	dataatual=dformat.format(date).toString();
                  
         tMatricula.setEnabled(false);
         tCpf.setEnabled(true);
         tIdent.setEnabled(true);
                 
		if(evt.getActionCommand().equals("Voltar"))
      	{ 	
			telaPacienteAdulto.dispose();
        }
		
		if(evt.getActionCommand().equals("Limpar"))
      	{ 			
			 	 tNome.setText("");
			     tDataNasc.setSelectedItem(dataatual);
			     cbSexo.setSelectedItem("Selecione o Sexo");
			     tCpf.setText("");
			     tTelefone.setText("");
			     tIdent.setText("");
			     tCelular.setText("");
			     cbEstadoCivil.setSelectedItem("Selecione o Estado Cívil");

			     tEndereco.setText("");
			     tNumero.setText("");
			     tCidade.setText("");
			     tBairro.setText("");
			     tComplemento.setText("");
			     tCep.setText("");
			     cbUf.setSelectedItem("Selecione o Estado");

			     cbConvenio.setSelectedItem("Selecione uma opção");
			     tMatricula.setText("");
			     cbOperadoraPlano.setSelectedItem("Selecione o Convênio");
        }
				
		if(evt.getActionCommand().equals("Consultar"))
     	 { 
			 if(tNome.getText().equals(""))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Nome!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }
        	 else if(tCpf.getText().equals("___.___.___-__"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CPF!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }
        	 else{
        		         		       		 
        			 	boolean aux1=dao.visualizar(pacienteAdulto);
        			 	if(aux1==false)
        			 	{	
        			 		JOptionPane.showMessageDialog(null,"Paciente não cadastrado no sistema","Atenção",JOptionPane.WARNING_MESSAGE);  
        			 	}
        			 	else
        			 		{		 
        			 			dao.visualizar(pacienteAdulto);
        	 
        			 			tNome.setText(pacienteAdulto.getNome());
        			 			tDataNasc.setSelectedItem(pacienteAdulto.getDataNasc());
        			 			cbSexo.setSelectedItem(pacienteAdulto.getSexo());
        			 			tCpf.setText(pacienteAdulto.getCpf());
        			 			tCpf.setEnabled(false);
        			 			tTelefone.setText(pacienteAdulto.getTelefone());
        			 			tIdent.setText(pacienteAdulto.getRg());
        			 			tIdent.setEnabled(false);
        			 			tCelular.setText(pacienteAdulto.getCelular());
        			 			cbEstadoCivil.setSelectedItem(pacienteAdulto.getEstadocivil());

        			 			tEndereco.setText(pacienteAdulto.getEndereco());
        			 			tNumero.setText(pacienteAdulto.getNumero());
        			 			tCidade.setText(pacienteAdulto.getCidade());
        			 			tBairro.setText(pacienteAdulto.getBairro());
        			 			tComplemento.setText(pacienteAdulto.getComplemento());
        			 			tCep.setText(pacienteAdulto.getCep());
        			 			cbUf.setSelectedItem(pacienteAdulto.getUf());
             
        			 			cbConvenio.setSelectedItem(pacienteAdulto.getConvenio());
        			 			tMatricula.setText(String.valueOf(pacienteAdulto.getMatricula()));
        			 			tMatricula.setEnabled(false);
        			 			cbOperadoraPlano.setSelectedItem(pacienteAdulto.getOperaConvenio());
        		 	        }
        	          }
                  }
           
         
         if(evt.getActionCommand().equals("Alterar"))
     	{ 
        	
        	 if((tNome.getText().equals(""))||(data.equals(dataatual))||(cbSexo.getSelectedItem().equals("Selecione o Sexo"))||
        	 (tTelefone.getText().equals("(__) ____ - ____"))||(tCpf.getText().equals("___.___.___-__"))||(tIdent.getText().equals("__.___.___-__"))||
        	 (cbEstadoCivil.getSelectedItem().equals("Selecione o Estado Cívil"))||(tEndereco.getText().equals(""))||(tNumero.getText().equals(""))||
        	 (tBairro.getText().equals(""))|| (tBairro.getText().equals(""))|| (tCep.getText().equals("__.___ - ___"))|| (cbUf.getSelectedItem().equals("Selecione o Estado"))||
        	 (cbConvenio.getSelectedItem().equals("Selecione uma opção"))||((cbConvenio.getSelectedItem().equals("Sim"))&&(cbOperadoraPlano.getSelectedItem().equals("Selecione o Convênio")))||
        	 (tMatricula.getText().equals("")))
        	
        	 {
        		JOptionPane.showMessageDialog(null,"Você precisa Fazer uma consulta, para poder alterar os dados desse paciente!","Atenção",JOptionPane.WARNING_MESSAGE);  
           	 }
        	 else
        	 {   
        	String maior=datanascimento();
         	if(maior=="false")
        	{
        		JOptionPane.showMessageDialog(null,"Este paciente é menor de idade!","Atenção",JOptionPane.WARNING_MESSAGE);
        		tCpf.setEnabled(false);
        		tIdent.setEnabled(false);
        		tIdent.setEnabled(false);
        	}      
        	else{ 	
        		 if (tCelular.getText().equals("(__) ____ - ____"))
		 			{
		 				pacienteAdulto.setCelular("");
		 			}
		 			if (cbOperadoraPlano.getSelectedItem().equals("Selecione o Convênio"))
		 			{
		 				pacienteAdulto.setOperaConvenio("");
		 			}
   		 				dao.alterar(pacienteAdulto);
   		 				
   		 				 tNome.setText("");
   		 				 tDataNasc.setSelectedItem(dataatual);
   		 			     cbSexo.setSelectedItem("Selecione o Sexo");
   		 			     tCpf.setText("");
   		 			     tTelefone.setText("");
   		 			     tIdent.setText("");
   		 			     tCelular.setText("");
   		 			     cbEstadoCivil.setSelectedItem("Selecione o Estado Cívil");

   		 			     tEndereco.setText("");
   		 			     tNumero.setText("");
   		 			     tCidade.setText("");
   		 			     tBairro.setText("");
   		 			     tComplemento.setText("");
   		 			     tCep.setText("");
   		 			     cbUf.setSelectedItem("Selecione o Estado");
 
   		 			     cbConvenio.setSelectedItem("Selecione uma opção");
   		 			     tMatricula.setText("");
   		 			     cbOperadoraPlano.setSelectedItem("Selecione o Convênio");
   		 			     
   		 			     JOptionPane.showMessageDialog(null,"Dados do Paciente Alterados com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
   		 	}}
     	}
     	
         
         if(evt.getActionCommand().equals("Salvar"))
     	{ 
        	    	  
        	 if(tNome.getText().equals(""))
             {
      	     JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Nome!","Atenção",JOptionPane.WARNING_MESSAGE);    
        	 }
             else if(data.equals(dataatual))
              {
      	      JOptionPane.showMessageDialog(null,"Você precisa selecionar a Data de Nascimento!","Atenção",JOptionPane.WARNING_MESSAGE);  
              }
             else if(cbSexo.getSelectedItem().equals("Selecione o Sexo"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa selecionar o Sexo!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }        	 
             else if(tTelefone.getText().equals("(__) ____ - ____"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Telefone!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }   
             else if(tCpf.getText().equals("___.___.___-__"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CPF!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }   
             else if(tIdent.getText().equals("__.___.___-__"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Identidade!","Atenção",JOptionPane.WARNING_MESSAGE);  
             } 
             else if(cbEstadoCivil.getSelectedItem().equals("Selecione o Estado Cívil"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa selecionar o Estado Cívil!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }  
             else if(tEndereco.getText().equals(""))
             {
         	 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Endereço!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tNumero.getText().equals(""))
             {
        	 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Numero!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tBairro.getText().equals(""))
             {
        	 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Bairro!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tCidade.getText().equals(""))
             {
        	 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Cidade!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tCep.getText().equals("__.___ - ___"))
             {
        	 JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Cep!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(cbUf.getSelectedItem().equals("Selecione o Estado"))
             {
       	     JOptionPane.showMessageDialog(null,"Você precisa selecionar o UF!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(cbConvenio.getSelectedItem().equals("Selecione uma opção"))
            {
       	     JOptionPane.showMessageDialog(null,"Você precisa selecionar se possui ou não um convênio!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
            }
            else if((cbConvenio.getSelectedItem().equals("Sim"))&&(cbOperadoraPlano.getSelectedItem().equals("Selecione o Convênio")))
            {
       	     JOptionPane.showMessageDialog(null,"Você precisa Buscar o Convênio e selecionar qual convênio possui!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
            }
                           	 
            else{    
            	                    
            	boolean aux=dao.verificarCpf(pacienteAdulto);
              	if(aux==true)
              	{
              		JOptionPane.showMessageDialog(null,"Este CPF já foi cadastrado no sistema, Por Favor digite outro CPF!","Atenção",JOptionPane.WARNING_MESSAGE);
              	}
              	
              	else{ 
              		boolean aux1=dao.verificarRg(pacienteAdulto);
              		if (aux1==true)
              		{
              		JOptionPane.showMessageDialog(null,"Esta Identidade já foi cadastrada no sistema, Por Favor digite outra Identidade!","Atenção",JOptionPane.WARNING_MESSAGE);  
              		}
              		else{
              			String maior=datanascimento();
              			if(maior=="false")
              			{
              				JOptionPane.showMessageDialog(null,"Este paciente é menor de idade!","Atenção",JOptionPane.WARNING_MESSAGE);
              			}      
            	              	
              			else
              				{     
              				if (tCelular.getText().equals("(__) ____ - ____"))
       		 				{
       		 					pacienteAdulto.setCelular("");
       		 				}
       		 				if (cbOperadoraPlano.getSelectedItem().equals("Selecione o Convênio"))
       		 				{
       		 					pacienteAdulto.setOperaConvenio("");
       		 				}
       		 			
       		 				dao.adicionar(pacienteAdulto);
       		 				
       		 				tNome.setText("");
       		 			    tDataNasc.setSelectedItem(dataatual);
       		 				cbSexo.setSelectedItem("Selecione o Sexo");
       		 				tCpf.setText("");
       		 				tTelefone.setText("");
       		 				tIdent.setText("");
       		 				tCelular.setText("");
       		 				cbEstadoCivil.setSelectedItem("Selecione o Estado Cívil");

       		 				tEndereco.setText("");
       		 				tNumero.setText("");
       		 				tCidade.setText("");
       		 				tBairro.setText("");
       		 				tComplemento.setText("");
       		 				tCep.setText("");
       		 				cbUf.setSelectedItem("Selecione o Estado");
    
       		 				cbConvenio.setSelectedItem("Selecione uma opção");
       		 				tMatricula.setText("");
       		 				cbOperadoraPlano.setSelectedItem("Selecione o Convênio");
      		 				   	            
       		 				JOptionPane.showMessageDialog(null,"Paciente cadastrado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);  
       		 			TelaGerarProntuario tela = new TelaGerarProntuario();
              				}  
       		 	}
       		}	
     	} 	
     	
     	}           
	}    
	 public String datanascimento()
     { 
		 	 String maior=null;
 			 JPanel pcampo=(JPanel)telaPacienteAdulto.getContentPane().getComponent(0);
 	 		 JPanel pDadosPessoais=(JPanel)pcampo.getComponent(3);
 	 		 Calendario tDataNasc=(Calendario)pDadosPessoais.getComponent(6);
 	 		 
 	 		 PacienteAdulto pacienteAdulto = new PacienteAdulto(null, null, null, null, null, 0,
 	 		 null, null, null, null, null, null, null, null, null, null, null, null);
 			
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
	public void mouseClicked(MouseEvent arg0)
	{	    
		 JPanel pcampo=(JPanel)telaPacienteAdulto.getContentPane().getComponent(0);
		 JPanel pConvenio=(JPanel)pcampo.getComponent(2);
		 JTextField tMatricula=(JTextField)pConvenio.getComponent(4);	
		
         PacienteAdulto pacienteAdulto = new PacienteAdulto(null, null, null, null, null,
   	         0,null, null, null, null, null, null, null, null, null, null, null, null);	
   	 
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoPacienteAdulto dao= df.getDaoPacienteAdulto();
        
		 tMatricula.setText(String.valueOf(pacienteAdulto.getMatricula()));
	         
		 int mat=dao.gerarMatricula(pacienteAdulto);
		         
		 String matricula=String.valueOf(mat);
		 tMatricula.setText(matricula);	
		 tMatricula.setEnabled(false);
	}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
	
	
}
