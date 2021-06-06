package usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import criptografia.Criptografia;
import javax.swing.JOptionPane;

import medico.Medico;

import dao.*;

public class ControleUsuario implements ActionListener
  {
     private JFrame telaUsuario;
    
        
     public ControleUsuario(JFrame telaUsuario)
   {
	  this.telaUsuario=telaUsuario;
	 
   }
    public void actionPerformed (ActionEvent evt)
    {
        JPanel pcampo=(JPanel)telaUsuario.getContentPane().getComponent(1);
        JPanel pIdentificacao=(JPanel)pcampo.getComponent(2);
        
        JTextField tLogin=(JTextField)pIdentificacao.getComponent(4);
        JTextField pswsenha=(JTextField)pIdentificacao.getComponent(9);
        JTextField tCpf=(JTextField)pIdentificacao.getComponent(6);
        JComboBox cbtipo=(JComboBox)pIdentificacao.getComponent(8);
      
       Usuario usua = new Usuario(null, null, null, null);
       DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
       DaoUsuario dao= df.getDaoUsuario();
       Medico med =new Medico(null, null, null, null, null, null, null, null, null, null, null, null);
			
       usua.setLogin(tLogin.getText());
       usua.setSenha(Criptografia.criptografar(pswsenha.getText()));
       usua.setCpf(tCpf.getText());
       int index=cbtipo.getSelectedIndex();
	   usua.setTipo((String)cbtipo.getItemAt(index));  
	   
	    
    if(evt.getActionCommand().equals("Voltar"))
	{ 	  
    	telaUsuario.dispose();
    }
	    
    if(evt.getActionCommand().equals("Salvar"))
	 {	      		
    	  if(tLogin.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo login!","Aten��o",JOptionPane.WARNING_MESSAGE);  
            }
          else if(pswsenha.getText().equals(""))
           {
            JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo senha!","Aten��o",JOptionPane.WARNING_MESSAGE);
           }
          else if((tCpf.getText().equals("")) || (tCpf.getText().equals("___.___.___-__")))
          {
           JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo cpf!","Aten��o",JOptionPane.WARNING_MESSAGE);
          }
          else if(cbtipo.getSelectedItem().equals("Selecione o tipo de permiss�o")) 
          {
           JOptionPane.showMessageDialog(null,"Voc� precisa selecionar o tipo de usu�rio!","Aten��o",JOptionPane.WARNING_MESSAGE);
          }
          	
       else
	   {    	
    	    	 
    	 String validacao=dao.validarDados(usua);
    	 if(validacao=="login encontrado")
       	 {
    		 JOptionPane.showMessageDialog(null,"Este login j� existe, Por Favor digite outro login!","Aten��o",JOptionPane.WARNING_MESSAGE);
       	 }
       	
       	 else if (validacao=="cpf encontrado")
       	 {
       		JOptionPane.showMessageDialog(null,"Este cpf j� esta cadastrado, Por Favor digite outro cpf!","Aten��o",JOptionPane.WARNING_MESSAGE);  
         }
    	 
    	 else 
    	 {
								    		   
						dao.adicionar(usua);
						tLogin.setText("");
						pswsenha.setText("");
						tCpf.setText("");
						cbtipo.setSelectedItem("Selecione o tipo de permiss�o");
						JOptionPane.showMessageDialog(null,"Usu�rio Cadastrado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
						}
	   }     
	
}
 
    if(evt.getActionCommand().equals("Deletar"))
	  {
    	if(tCpf.getText().equals("___.___.___-__"))
        {
         JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo cpf!","Aten��o",JOptionPane.WARNING_MESSAGE);  
        }
    	   	
    	else {
    		
    		 String validacao=dao.validarDados(usua);
    		 if (validacao=="cpf encontrado")
          	 {
    			 boolean aux1=dao.buscarMedico(usua);
    			 if(aux1==true)
    			 {
    				 JOptionPane.showMessageDialog(null,"Usu�rio consta como m�dico,sendo este impedido de ser deletado!","Aten��o",JOptionPane.WARNING_MESSAGE);
    			 }
    			 else
    			 {
    				 boolean aux=dao.excluir(usua);
    				 if(aux==true)
    				 {
    					tLogin.setText("");
						pswsenha.setText("");
						tCpf.setText("");
						cbtipo.setSelectedItem("Selecione o tipo de permiss�o");
    				    JOptionPane.showMessageDialog(null,"Usu�rio deletado com sucesso!","Dados Deletados",JOptionPane.INFORMATION_MESSAGE);
    				 }
    			 }
 			 }
    		 else
 			{   
 				JOptionPane.showMessageDialog(null,"Usu�rio n�o cadastrado no sistema!","Aten��o",JOptionPane.WARNING_MESSAGE);
 			}
	     
        }
	  }
    
    if(evt.getActionCommand().equals("Alterar"))
 	{	  
    		         
    	if(tLogin.getText().equals(""))
        {
    		JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Login!","Aten��o",JOptionPane.WARNING_MESSAGE);  
        }
    	else if(pswsenha.getText().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo senha!","Aten��o",JOptionPane.WARNING_MESSAGE);
        }
    	else if (tCpf.getText().equals(""))
        {
    		JOptionPane.showMessageDialog(null,"Preencha o cpf!","Aten��o",JOptionPane.WARNING_MESSAGE);
        }
    	else if (cbtipo.getSelectedItem().equals("Selecione o tipo de permiss�o"))
        {
    		JOptionPane.showMessageDialog(null,"Preencha o tipo de permiss�o!","Aten��o",JOptionPane.WARNING_MESSAGE);
        }
      	else{
    		 String validacao=dao.validarDados(usua);
    		 if (validacao==null)
          	 {
		   	   	JOptionPane.showMessageDialog(null,"Usu�rio n�o cadastrado no sistema!","Aten��o",JOptionPane.WARNING_MESSAGE);
			}
    		else
		       {      
   			
    		         	 dao.alterar(usua);
    		         	 JOptionPane.showMessageDialog(null,"N�o � poss�vel alterar o tipo referente a este cpf!","Informa��o",JOptionPane.INFORMATION_MESSAGE);
		       	         tLogin.setText("");
		      	         pswsenha.setText("");
		      	         tCpf.setText("");
		      	         cbtipo.setSelectedItem("Selecione o tipo de permiss�o");
		      	         JOptionPane.showMessageDialog(null,"Usu�rio alterado com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
		                     		 
		      }       	
    		}
    	
    	}
  	}
 
 
   
    
     
		
}

 