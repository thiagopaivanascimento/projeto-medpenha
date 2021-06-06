package paciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.*;

import prontuario.TelaGerarProntuario;

import dao.DaoFactory;
import menuprincipal.*;
public class ControlePacienteCrianca implements ActionListener,MouseListener{
 
	private JFrame telaPacienteCrianca;
	 
	 public ControlePacienteCrianca(JFrame telaPacienteCrianca)
	   {
		  this.telaPacienteCrianca=telaPacienteCrianca;
	   }
	public void actionPerformed(ActionEvent evt) {
		
		 JPanel pcampo=(JPanel)telaPacienteCrianca.getContentPane().getComponent(1);
         JPanel pDadosPessoais=(JPanel)pcampo.getComponent(4);
         JPanel pDadosResponsavel=(JPanel)pcampo.getComponent(5);
         JPanel pLogadouro=(JPanel)pcampo.getComponent(3);
         JPanel pConvenio=(JPanel)pcampo.getComponent(2);
                         
         JTextField tNome=(JTextField)pDadosPessoais.getComponent(2);
         Calendario tDataNasc=(Calendario)pDadosPessoais.getComponent(5);
         JComboBox cbSexo=(JComboBox)pDadosPessoais.getComponent(7);
        
         JTextField tNomeResp=(JTextField)pDadosResponsavel.getComponent(1);
         JTextField tCpf=(JTextField)pDadosResponsavel.getComponent(5);
         JTextField tIdent=(JTextField)pDadosResponsavel.getComponent(8);
         JTextField tTelefone=(JTextField)pDadosResponsavel.getComponent(11);
         Calendario tDataNascResp=(Calendario)pDadosResponsavel.getComponent(13);
         JTextField tCelular=(JTextField)pDadosResponsavel.getComponent(16); 
         
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
         
         
         PacienteCrianca pacienteCrianca = new PacienteCrianca(0, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                 
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoPacienteCrianca dao= df.getDaoPacienteCrianca();
  			
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
         pacienteCrianca.setDataNasc(data);
        
         pacienteCrianca.setNome(tNome.getText());
         int index=cbSexo.getSelectedIndex();
         pacienteCrianca.setSexo((String)cbSexo.getItemAt(index));  
         
         pacienteCrianca.setNomeResp(tNomeResp.getText());
         pacienteCrianca.setCpfResp(tCpf.getText());
         pacienteCrianca.setRgResp(tIdent.getText());
         pacienteCrianca.setTelefoneResp(tTelefone.getText());
         pacienteCrianca.setCelularResp(tCelular.getText());
         
         tDataNascResp.date();
         int diaadulto=tDataNasc.date().getDate();
         int mesadulto=tDataNasc.date().getMonth()+1;
         int anoadulto=tDataNasc.date().getYear()+1900;
         String dadulto=String.valueOf(dia);
         String madulto=String.valueOf(mes);
         if(dadulto.length()==1)
         {	dadulto="0"+dadulto;     }
         if(madulto.length()==1)
         {	madulto="0"+madulto;     }
         
         String aadulto=String.valueOf(ano);
         String dataadulto=(dadulto+"/"+madulto+"/"+aadulto);
         pacienteCrianca.setDataNascResp(dataadulto);

                         
         pacienteCrianca.setEndereco(tEndereco.getText());
         pacienteCrianca.setNumero(tNumero.getText());
         pacienteCrianca.setCidade(tCidade.getText());
         pacienteCrianca.setBairro(tBairro.getText());
         pacienteCrianca.setComplemento(tComplemento.getText());
         pacienteCrianca.setCep(tCep.getText());
         
         int index3=cbUf.getSelectedIndex();
         pacienteCrianca.setUf((String)cbUf.getItemAt(index3));
         
         int index4=cbConvenio.getSelectedIndex();
         pacienteCrianca.setConvenio((String)cbConvenio.getItemAt(index4));
                 
         if(tMatricula.getText().equals(""))
         { }
         else
         {
        	 int matricula = Integer.parseInt(tMatricula.getText());	
             pacienteCrianca.setMatricula(matricula);
         }
         
         Date date =new Date() ;
      	
	      	//alterando formato
	      	DateFormat dformat;
	      	String dataatual;		      	
	      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
	      	dataatual=dformat.format(date).toString();
         
         int index5=cbOperadoraPlano.getSelectedIndex();
         pacienteCrianca.setOperaConvenio((String)cbOperadoraPlano.getItemAt(index5));
		
         tCpf.setEnabled(true);
         tIdent.setEnabled(true);
                        
         if(evt.getActionCommand().equals("Voltar"))
     	 { 
        	 telaPacienteCrianca.dispose();
         }
         
         if(evt.getActionCommand().equals("Limpar"))
      	 { 
        	
        	 tNome.setText("");
        	 tDataNasc.setSelectedItem(dataatual);
             cbSexo.setSelectedItem("Selecione o Sexo");
         
             tNomeResp.setText("");
             tCpf.setText("");
             tIdent.setText("");
             tTelefone.setText("");
             tDataNascResp.setSelectedItem(dataatual);
             tCelular.setText("");
            
             tEndereco.setText("");
             tNumero.setText("");
             tCidade.setText("");
             tBairro.setText("");
             tComplemento.setText("");
             tCep.setText("");
             cbUf.setSelectedItem("Selecione o Estado");
             
             cbConvenio.setSelectedItem("Selecione uma op��o");
             tMatricula.setText("");
             cbOperadoraPlano.setSelectedItem("Selecione o Conv�nio");
         }
                 
         if(evt.getActionCommand().equals("Consultar"))
     		{ 
        	 
        	 if(tNome.getText().equals(""))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Nome!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }
        	 else if(tCpf.getText().equals("___.___.___-__"))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo CPF do Respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }
        	 else{
        		
        			  boolean aux1=dao.visualizar(pacienteCrianca);
     			 	  if(aux1==false)
     			 	  {	
     			 		JOptionPane.showMessageDialog(null,"Paciente n�o cadastrado no sistema","Aten��o",JOptionPane.WARNING_MESSAGE);  ;
     			 	  }
     			 	  else
     			 		  {		 
        		 	        		 
     			 		  		dao.visualizar(pacienteCrianca);
        	 
     			 		  		tNome.setText(pacienteCrianca.getNome());
     			 		  	    tDataNasc.setSelectedItem(pacienteCrianca.getDataNasc());
     			 		  		cbSexo.setSelectedItem(pacienteCrianca.getSexo());
            
     			 		  		tNomeResp.setText(pacienteCrianca.getNomeResp());
     			 		  		tCpf.setText(pacienteCrianca.getCpfResp());
     			 		  		tCpf.setEnabled(false);
     			 		  		tIdent.setText(pacienteCrianca.getRgResp());
     			 		  		tIdent.setEnabled(false);
     			 		  		tTelefone.setText(pacienteCrianca.getTelefoneResp());
     			 		     	tDataNascResp.setSelectedItem(pacienteCrianca.getDataNascResp());
     			 		  		tCelular.setText(pacienteCrianca.getCelularResp());
             
     			 		  		tEndereco.setText(pacienteCrianca.getEndereco());
     			 		  		tNumero.setText(pacienteCrianca.getNumero());
     			 		  		tCidade.setText(pacienteCrianca.getCidade());
     			 		  		tBairro.setText(pacienteCrianca.getBairro());
     			 		  		tComplemento.setText(pacienteCrianca.getComplemento());
     			 		  		tCep.setText(pacienteCrianca.getCep());
     			 		  		cbUf.setSelectedItem(pacienteCrianca.getUf());
             
     			 		  		cbConvenio.setSelectedItem(pacienteCrianca.getConvenio());
     			 		  	    tMatricula.setText(String.valueOf(pacienteCrianca.getMatricula()));
     			 		  	    tMatricula.setEnabled(false);
    			 				cbOperadoraPlano.setSelectedItem(pacienteCrianca.getOperaConvenio());
     			 		  
           	          }
                 }
           }
         
                  
         if(evt.getActionCommand().equals("Alterar"))
     	{ 
        	
        	 if((tNome.getText().equals(""))||(data.equals(dataatual))||(cbSexo.getSelectedItem().equals("Selecione o Sexo"))
        	 ||(tNomeResp.getText().equals(""))||(dataadulto.equals(dataatual))||(tCpf.getText().equals("___.___.___-__"))
     	     ||(tIdent.getText().equals("__.___.___-__"))||(tTelefone.getText().equals("(__) ____ - ____"))||(tEndereco.getText().equals(""))
        	 ||(tNumero.getText().equals(""))||(tBairro.getText().equals(""))||(tCidade.getText().equals(""))
        	 ||(tCep.getText().equals("__.___ - ___"))||(cbUf.getSelectedItem().equals("Selecione o Estado"))||(cbConvenio.getSelectedItem().equals("Selecione uma op��o"))
        	 ||((cbConvenio.getSelectedItem().equals("Sim"))&&(cbOperadoraPlano.getSelectedItem().equals("Selecione o Conv�nio")))||(tMatricula.getText().equals("")))
        	 
        	 
        	 {
        	      JOptionPane.showMessageDialog(null,"Voc� precisa Fazer uma consulta, para poder alterar os dados desse paciente!","Aten��o",JOptionPane.WARNING_MESSAGE);  
        	 }
        	 
        	 else
        	 {
        		 String maior=datanascimento();
             	if(maior=="true")
             	{
             		JOptionPane.showMessageDialog(null,"Este paciente � maior de idade!","Aten��o",JOptionPane.WARNING_MESSAGE);
             		tCpf.setEnabled(false);
             		tIdent.setEnabled(false);
             		tMatricula.setEnabled(false);
             	}      
             	else{
             		String maior2=datanascimento2();
                	if(maior2=="false")
                	{
                		JOptionPane.showMessageDialog(null,"Este Respons�vel � menor de idade!","Aten��o",JOptionPane.WARNING_MESSAGE);
                		tCpf.setEnabled(false);
                		tIdent.setEnabled(false);
                		tMatricula.setEnabled(false);
                	
                	}  
                	else{
        		 if (tCelular.getText().equals("(__) ____ - ____"))
	 				{
	 					pacienteCrianca.setCelularResp("");
	 				}	
	 				if (cbOperadoraPlano.getSelectedItem().equals("Selecione o Conv�nio"))
	 				{	
	 					pacienteCrianca.setOperaConvenio("");
	 				}
 		 				dao.alterar(pacienteCrianca);
        	 			
 		 				tNome.setText("");
 		 				tDataNasc.setSelectedItem(dataatual);
   		 				cbSexo.setSelectedItem("Selecione o Sexo");
        
   		 				tNomeResp.setText("");
   		 				tCpf.setText("");
   		 				tIdent.setText("");
   		 				tTelefone.setText("");
   		 			    tDataNascResp.setSelectedItem(dataatual);
   		 				tCelular.setText("");
           
   		 				tEndereco.setText("");
   		 				tNumero.setText("");
   		 				tCidade.setText("");
   		 				tBairro.setText("");
   		 				tComplemento.setText("");
   		 				tCep.setText("");
   		 				cbUf.setSelectedItem("Selecione o Estado");
            
   		 				cbConvenio.setSelectedItem("Selecione uma op��o");
   		 				tMatricula.setText("");
   		 				cbOperadoraPlano.setSelectedItem("Selecione o Conv�nio");
   		 				
   		 			 JOptionPane.showMessageDialog(null,"Dados do Paciente Alterados com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
      	   }}
     	}}
                 
         if(evt.getActionCommand().equals("Salvar"))
     	{ 
        	 if(tNome.getText().equals(""))
             {
      	     JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Nome!","Aten��o",JOptionPane.WARNING_MESSAGE);    
             }
             else if(data.equals(dataatual))
              {
      	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Data de Nascimento!","Aten��o",JOptionPane.WARNING_MESSAGE);  
              }
             else if(cbSexo.getSelectedItem().equals("Selecione o Sexo"))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa selecionar o Sexo!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }      
             else if(tNomeResp.getText().equals(""))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Nome do Item Dados do Respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }
             else if(dataadulto.equals(dataatual))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Data de Nascimento do Item Dados do Respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }
             else if(tCpf.getText().equals("___.___.___-__"))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo CPF do Item Dados do Respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }   
             else if(tIdent.getText().equals("__.___.___-__"))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Identidade do Item Dados do Respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             } 
             else if(tTelefone.getText().equals("(__) ____ - ____"))
             {
     	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Telefone do Item Dados do Respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
             }   
             else if(tEndereco.getText().equals(""))
             {
         	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Endere�o!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tNumero.getText().equals(""))
             {
        	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Numero!","Aten��o",JOptionPane.WARNING_MESSAGE);   
             }
            else if(tBairro.getText().equals(""))
             {
        	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Bairro!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tCidade.getText().equals(""))
             {
        	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Cidade!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(tCep.getText().equals("__.___ - ___"))
             {
        	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Cep!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
            else if(cbUf.getSelectedItem().equals("Selecione o Estado"))
             {
       	     JOptionPane.showMessageDialog(null,"Voc� precisa selecionar o UF!","Aten��o",JOptionPane.WARNING_MESSAGE);  ;	 
             }
            else if(cbConvenio.getSelectedItem().equals("Selecione uma op��o"))
            {
       	     JOptionPane.showMessageDialog(null,"Voc� precisa selecionar se possui ou n�o um conv�nio!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
            }
            else if((cbConvenio.getSelectedItem().equals("Sim"))&&(cbOperadoraPlano.getSelectedItem().equals("Selecione o Conv�nio")))
            {
       	     JOptionPane.showMessageDialog(null,"Voc� precisa Buscar o Conv�nio e selecionar qual conv�nio possui!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
            }
            else if(tMatricula.getText().equals(""))
            {
       	     JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Matricula!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
            }
        	 
            else{   
            	
            	String maior=datanascimento();
            	if(maior=="true")
            	{
            		JOptionPane.showMessageDialog(null,"Este paciente � maior de idade!","Aten��o",JOptionPane.WARNING_MESSAGE);
            	}      
            	else{
              	 
            		String maior2=datanascimento2();
                	if(maior2=="false")
                	{
                		JOptionPane.showMessageDialog(null,"Este Respons�vel � menor de idade!","Aten��o",JOptionPane.WARNING_MESSAGE);
                	}  
                	else{
                		
                boolean aux=dao.validarCpf(pacienteCrianca);
              	if(aux==true)
              	{
              		JOptionPane.showMessageDialog(null,"Este CPF j� foi cadastrado para este paciente, Por Favor verifique os dados!","Aten��o",JOptionPane.WARNING_MESSAGE);
              	}
              	else{
              		String validacao=dao.validarDados(pacienteCrianca);
              		if (validacao=="rg n�o bate com cpf")
              		{
              			JOptionPane.showMessageDialog(null,"Esta Identidade n�o se equivale a este CPF, Por Favor verifique os dados!","Aten��o",JOptionPane.WARNING_MESSAGE);  
              		}
              		else if (validacao=="maximo ja alcan�ado")
              		{
              			JOptionPane.showMessageDialog(null,"Este respons�vel ja possui tr�s denpendentes, Por Favor cadastre outro respons�vel!","Aten��o",JOptionPane.WARNING_MESSAGE);  
              		}
              	
              		else
       		 			{    	 
       		 				if (tCelular.getText().equals("(__) ____ - ____"))
       		 				{
       		 					pacienteCrianca.setCelularResp("");
       		 				}	
       		 				if (cbOperadoraPlano.getSelectedItem().equals("Selecione o Conv�nio"))
       		 				{	
       		 					pacienteCrianca.setOperaConvenio("");
       		 				}
       		 			    
       		 				dao.adicionar(pacienteCrianca);
           	 
       		 				tNome.setText("");
       		 			    tDataNasc.setSelectedItem(dataatual);
       		 				cbSexo.setSelectedItem("Selecione o Sexo");
            
       		 				tNomeResp.setText("");
       		 				tCpf.setText("");
       		 				tIdent.setText("");
       		 				tTelefone.setText("");
       		 			    tDataNascResp.setSelectedItem(dataatual);
       		 				
       		 				tCelular.setText("");
               
       		 				tEndereco.setText("");
       		 				tNumero.setText("");
       		 				tCidade.setText("");
       		 				tBairro.setText("");
       		 				tComplemento.setText("");
       		 				tCep.setText("");
       		 				cbUf.setSelectedItem("Selecione o Estado");
                
       		 				cbConvenio.setSelectedItem("Selecione uma op��o");
       		 				tMatricula.setText("");
       		 				cbOperadoraPlano.setSelectedItem("Selecione o Conv�nio");
       		 				
       		 				JOptionPane.showMessageDialog(null,"Paciente cadastrado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
       		 			TelaGerarProntuario tela = new TelaGerarProntuario();
       		 			}
       		 			}
   		 				}  
   		 			}
   		 		}}	
   		 	}
	
	 public String datanascimento()
     { 
		 	 String maior=null;
             String respmaior=null;
			 JPanel pcampo=(JPanel)telaPacienteCrianca.getContentPane().getComponent(1);
	         JPanel pDadosPessoais=(JPanel)pcampo.getComponent(4);
	        
	         Calendario tDataNasc=(Calendario)pDadosPessoais.getComponent(5);
	        	         
 	 		 PacienteCrianca pacienteCrianca = new PacienteCrianca(0, null, null, null, null, 
 	 			 null, null, null, null, null, null, null, null, null, null, null, null, null, null);
 			
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
	
		
	 public String datanascimento2()
     { 
		 	 String maior=null;
             JPanel pcampo=(JPanel)telaPacienteCrianca.getContentPane().getComponent(1);
	      
	         JPanel pDadosResponsavel=(JPanel)pcampo.getComponent(5);

	
	         Calendario tDataNascResp=(Calendario)pDadosResponsavel.getComponent(13);
	         
 	 		 PacienteCrianca pacienteCrianca = new PacienteCrianca(0, null, null, null, null, 
 	 			 null, null, null, null, null, null, null, null, null, null, null, null, null, null);
 			
 	 		tDataNascResp.date();
 	         int dia=tDataNascResp.date().getDate();
 	         int mes=tDataNascResp.date().getMonth()+1;
 	         int ano=tDataNascResp.date().getYear()+1900;
 	         
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
		 JPanel pcampo=(JPanel)telaPacienteCrianca.getContentPane().getComponent(1);
	     JPanel pConvenio=(JPanel)pcampo.getComponent(2);
	     JTextField tMatricula=(JTextField)pConvenio.getComponent(4);
	    	     
         PacienteCrianca pacienteCrianca = new PacienteCrianca(0, null, null, null,
         null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                  
	     DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoPacienteCrianca dao= df.getDaoPacienteCrianca();
         
         tMatricula.setText(String.valueOf(pacienteCrianca.getMatricula()));
         
		 int mat=dao.gerarMatricula(pacienteCrianca);
		         
		 String matricula=String.valueOf(mat);
		 tMatricula.setText(matricula);	
		 tMatricula.setEnabled(false);
	
	}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
	
}
