package convenio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import paciente.Paciente;
import dao.*;

public class ControleConvenio implements ActionListener {

     private JFrame telaConvenio;
     public ControleConvenio(JFrame telaConvenio)
   {
	   this.telaConvenio=telaConvenio;
   }
    
    public void actionPerformed(ActionEvent evt)
	{
        
       JPanel pCampo=(JPanel)telaConvenio.getContentPane().getComponent(1);
       JPanel pDadosConvenio=(JPanel)pCampo.getComponent(3);
       JPanel pLogadouro=(JPanel)pCampo.getComponent(2);
                   
       JTextField tCnpj=(JTextField)pDadosConvenio.getComponent(20);
       JTextField trazao=(JTextField)pDadosConvenio.getComponent(4);
       JTextField tInstit=(JTextField)pDadosConvenio.getComponent(3);
       JTextField tpercentual=(JTextField)pDadosConvenio.getComponent(16);
       JTextField tEmail=(JTextField)pDadosConvenio.getComponent(7);
       JTextField tTelefone=(JTextField)pDadosConvenio.getComponent(10);
       JTextField tFax=(JTextField)pDadosConvenio.getComponent(13);
        
       JTextField tEndereco=(JTextField)pLogadouro.getComponent(3);
       JTextField tNumero=(JTextField)pLogadouro.getComponent(6);
       JTextField tBairro=(JTextField)pLogadouro.getComponent(9);
       JTextField tComplemento=(JTextField)pLogadouro.getComponent(14);
       JTextField tCidade=(JTextField)pLogadouro.getComponent(8);
       JTextField tCep=(JTextField)pLogadouro.getComponent(15);
       JComboBox cbUf=(JComboBox)pLogadouro.getComponent(18);
    
       Convenio convenio = new Convenio();
       Paciente p = new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
       DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
       DaoConvenio dao= df.getDaoConvenio();
              
       convenio.setCnpj(tCnpj.getText());
       convenio.setRazao(trazao.getText());
       convenio.setInstituicao(tInstit.getText());
       
       if(tpercentual.getText().equals(""))
       { }
       else
       {	
    	   try{
      
    	     int percentual = Integer.parseInt(tpercentual.getText());	
    		 convenio.setPercentual(percentual);
    	    }
    		 catch(Exception e)
	      	 {
    			 JOptionPane.showMessageDialog(null,"Percentual inv�lido!","Erro",JOptionPane.ERROR_MESSAGE);  
	      	 }	
       }
     
       convenio.setEmail(tEmail.getText());
       convenio.setTelefone(tTelefone.getText());
       convenio.setFax(tFax.getText()); 
       convenio.setEndereco(tEndereco.getText());
       convenio.setNumero(tNumero.getText());
       convenio.setBairro(tBairro.getText());
       convenio.setComplemento(tComplemento.getText());
       convenio.setCidade(tCidade.getText());
       convenio.setCep(tCep.getText()); 
       int index=cbUf.getSelectedIndex();
       convenio.setUf((String)cbUf.getItemAt(index));  
	   
       tCnpj.setEnabled(true);          
       
       if(evt.getActionCommand().equals("Voltar"))
   		{ 
   	       	telaConvenio.dispose();
   		}   
       
       if(evt.getActionCommand().equals("Limpar"))
  		{ 
    	    tCnpj.setText("");
			trazao.setText("");
			tInstit.setText("");
			tpercentual.setText("");
			tEmail.setText("");
			tTelefone.setText("");
			tFax.setText("");
			tEndereco.setText("");
			tNumero.setText("");
			tBairro.setText("");
			tComplemento.setText("");
			tCidade.setText("");
			tCep.setText("");
			cbUf.setSelectedItem("Selecione o Estado");
  		}   
             
       if(evt.getActionCommand().equals("Salvar"))
  	 	{	  
    	   
      	 
      	if(trazao.getText().equals(""))
        {
 	     JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Raz�o Social!","Aten��o",JOptionPane.WARNING_MESSAGE);  
        }
        else if(tCnpj.getText().equals("__.___.___/____-__"))
         {
 	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo CNPJ!","Aten��o",JOptionPane.WARNING_MESSAGE);
         }
        else if(tInstit.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Institui��o!","Aten��o",JOptionPane.WARNING_MESSAGE);	 
         }
        else if(tpercentual.getText().equals(""))
         {
         JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Percentual!","Aten��o",JOptionPane.WARNING_MESSAGE);	 
         }
        else if(tEmail.getText().equals(""))
         {
       	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo E-mail!","Aten��o",JOptionPane.WARNING_MESSAGE);	 
         }
        else if(tTelefone.getText().equals("(__) ____ - ____"))
         {
      	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Telefone!","Aten��o",JOptionPane.WARNING_MESSAGE);	 
         }
        else if(tFax.getText().equals("(__) ____ - ____"))
         {
     	 JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Fax!","Aten��o",JOptionPane.WARNING_MESSAGE);	 
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
   	     JOptionPane.showMessageDialog(null,"Voc� precisa selecionar o UF!","Aten��o",JOptionPane.WARNING_MESSAGE);	 
         }
     else{    	
    	 
    	boolean aux=dao.visualizar(convenio);
			if(aux==true)
			{	
				JOptionPane.showMessageDialog(null,"Este Cnpj j� foi cadastrado no sistema, Por Favor digite outro Cnpj!","Aten��o",JOptionPane.WARNING_MESSAGE);
			}
			else{
				try{
		    		 int percentual = Integer.parseInt(tpercentual.getText());	
		    		 convenio.setPercentual(percentual);
		    	 				
						dao.adicionar(convenio);
			  		 
						tCnpj.setText("");
						trazao.setText("");
						tInstit.setText("");
						tpercentual.setText("");
						tEmail.setText("");
						tTelefone.setText("");
						tFax.setText("");
						tEndereco.setText("");
						tNumero.setText("");
						tBairro.setText("");
						tComplemento.setText("");
						tCidade.setText("");
						tCep.setText("");
						cbUf.setSelectedItem("Selecione o Estado");
	        
						JOptionPane.showMessageDialog(null,"Conv�nio Cadastrado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
				}
		      	 catch(Exception e)
		      	 {
		  		    
		      	 }					
					
			  }       
     	  }
      }
      	 
     
       if(evt.getActionCommand().equals("Deletar"))
 	 	{	  
    	   if(tCnpj.getText().equals("__.___.___/____-__"))
           {
    		   JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo CNPJ!","Aten��o",JOptionPane.WARNING_MESSAGE);
           }
    	   else
    	   {
    		   	boolean aux=dao.visualizar(convenio);
    		   	if(aux==false)
    		   	{	
  				JOptionPane.showMessageDialog(null,"Conv�nio n�o cadastrado no sistema","Aten��o",JOptionPane.WARNING_MESSAGE);
    		   	}
    		   	else
    		   	{    	
    		   		boolean aux1=dao.buscarPacientes(convenio,p);
        		   	if(aux1==false)
        		   	{	
        		   		JOptionPane.showMessageDialog(null,"Este conv�nio n�o pode ser deletado,pois ainda existem pacientes que o utilizam","Aten��o",JOptionPane.WARNING_MESSAGE);
        		   		tCnpj.setEnabled(false);
        		   	}
        		   	else
        		   	{    	
        		   		dao.excluir(convenio);
       	         
        		   		tCnpj.setText("");
        		   		trazao.setText("");
        		   		tInstit.setText("");
        		   		tpercentual.setText("");
        		   		tEmail.setText("");
        		   		tTelefone.setText("");
        		   		tFax.setText("");
        		   		tEndereco.setText("");
        		   		tNumero.setText("");
        		   		tBairro.setText("");
        		   		tComplemento.setText("");
        		   		tCidade.setText("");
        		   		tCep.setText("");
        		   		cbUf.setSelectedItem("Selecione o Estado");
    		   		
        		   		JOptionPane.showMessageDialog(null,"Conv�nio deletado com sucesso!","Dados Deletados",JOptionPane.INFORMATION_MESSAGE);
    		   	}
    	   }
    	}
       
 	 	}
       if(evt.getActionCommand().equals("Alterar"))
	 	{	  
    	   if((trazao.getText().equals(""))||(tInstit.getText().equals(""))||(tpercentual.getText().equals(""))
    	   ||(tTelefone.getText().equals("(__) ____ - ____"))||(tFax.getText().equals("(__) ____ - ____"))
    	   ||(tEndereco.getText().equals(""))||(tNumero.getText().equals(""))||(tBairro.getText().equals(""))
           ||(tCidade.getText().equals(""))||(tCep.getText().equals("__.___ - ___"))||(cbUf.getSelectedItem().equals("Selecione o Estado"))
           ||(tCnpj.getText().equals("__.___.___/____-__")))

    	   {
      	      JOptionPane.showMessageDialog(null,"Voc� precisa Fazer uma consulta pelo CNPJ, para poder alterar os dados desse conv�nio!","Aten��o",JOptionPane.WARNING_MESSAGE);
            }
                  
    	   else
      	   	  {	 
    		   try{
		    		 int percentual = Integer.parseInt(tpercentual.getText());	
		    		 convenio.setPercentual(percentual);
					
  				  		dao.alterar(convenio);
  		        		 
  		        		trazao.setText("");
  		        		tCnpj.setText("");
  		        		tInstit.setText("");
  		        		tpercentual.setText("");
  		        		tEmail.setText("");
	              		tTelefone.setText("");
	              		tFax.setText("");
	              		tEndereco.setText("");
	              		tNumero.setText("");
	              		tBairro.setText("");
	              		tComplemento.setText("");
	              		tCidade.setText("");
	              		tCep.setText("");
	              		cbUf.setSelectedItem("Selecione o Estado");
	              			              		 
	              		 JOptionPane.showMessageDialog(null,"Dados do Conv�nio Alterados com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
    		   }
		      	 catch(Exception e)
		      	 {
		  		    
		      	 }	
      	      }
     
	 	}
       
       if(evt.getActionCommand().equals("Consultar"))
    	{ 
       	 if(tCnpj.getText().equals("__.___.___/____-__"))
                {
        	      JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo CNPJ!","Aten��o",JOptionPane.WARNING_MESSAGE);
                }
       	 else{
       		 boolean aux=dao.visualizar(convenio);
       		 if(aux==false)
	    			{	
	    				JOptionPane.showMessageDialog(null,"Conv�nio n�o cadastrado no sistema","Aten��o",JOptionPane.WARNING_MESSAGE);
	    			}
				 else
				 {
					    trazao.setText(convenio.getRazao());
		        		tCnpj.setText(convenio.getCnpj());
		        		tCnpj.setEnabled(false);
		        		tInstit.setText(convenio.getInstituicao());
		        		tpercentual.setText(String.valueOf(convenio.getPercentual()));
		        		tEmail.setText(convenio.getEmail());
	              		tTelefone.setText(convenio.getTelefone());
	              		tFax.setText(convenio.getFax());
	              		tEndereco.setText(convenio.getEndereco());
	              		tNumero.setText(convenio.getNumero());
	              		tBairro.setText(convenio.getBairro());
	              		tComplemento.setText(convenio.getComplemento());
	              		tCidade.setText(convenio.getCidade());
	              		tCep.setText(convenio.getCep());
	              		cbUf.setSelectedItem(convenio.getUf());
				}
       	    }
        }
	}
}

