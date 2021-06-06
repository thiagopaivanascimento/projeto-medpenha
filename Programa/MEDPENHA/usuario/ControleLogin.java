package usuario;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import criptografia.Criptografia;
import javax.swing.JOptionPane;

import medico.Medico;
import menuadm.*;
import menuenfermeira.*;
import menumedico.*;
import menusecretaria.*;
import menuprincipal.*;
import dao.*;

public class ControleLogin implements ActionListener
  {
     private JFrame telaLogin;

         
     public ControleLogin(JFrame telaLogin)
   {
	  this.telaLogin=telaLogin;

   }
    public void actionPerformed (ActionEvent evt)
    {
        JPanel pcampo=(JPanel)telaLogin.getContentPane().getComponent(0);
        JPanel pAutenticacao=(JPanel)pcampo.getComponent(1);
             
       JTextField tLogin=(JTextField)pAutenticacao.getComponent(1);
       JTextField pswsenha=(JTextField)pAutenticacao.getComponent(3);
       
       Usuario usua = new Usuario(null, null, null, null);
       DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
       DaoUsuario dao= df.getDaoUsuario();
			
       usua.setLogin(tLogin.getText());
       usua.setSenha(Criptografia.criptografar(pswsenha.getText()));
       
      
    if(evt.getActionCommand().equals("Entrar"))
	{ 
    	
    	 if(tLogin.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null,"Você precisa preencher o campo login!","Atenção",JOptionPane.WARNING_MESSAGE); 
         }
         else if(pswsenha.getText().equals(""))
         {
         JOptionPane.showMessageDialog(null,"Você precisa preencher o campo senha!","Atenção",JOptionPane.WARNING_MESSAGE);
         }
         else
	      {    	
    	   Usuario u=dao.logar(usua);
    	 
			if(u==null)
			{	
				JOptionPane.showMessageDialog(null,"Login ou Senha inválidos!","Atenção",JOptionPane.WARNING_MESSAGE);
			}
			else if(u.getTipo().equals("Administrador"))
			{	
				new TelaMenuAdm();
				telaLogin.dispose();
												
			}
			else if(u.getTipo().equals("Médico(a)"))
			{
				TelaMenuMedico tela=new TelaMenuMedico();				
				telaLogin.dispose();
			}
			else if(u.getTipo().equals("Enfermeiro(a)"))
			{	
				new TelaMenuEnfermeira();
				 telaLogin.dispose();
			}
			else if(u.getTipo().equals("Secretário(a)"))
			{	
				new TelaMenuSecretaria();
				 telaLogin.dispose();
			}	 
	
          }
    }
  }
    
    
    
	
}
 
 