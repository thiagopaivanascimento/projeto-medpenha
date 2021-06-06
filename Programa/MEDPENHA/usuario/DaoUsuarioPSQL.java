package usuario;

import dao.DaoFactoryPSQL;
import java.sql.*;

import medico.Medico;


public class DaoUsuarioPSQL implements DaoUsuario
{
   PreparedStatement ps=null;
   ResultSet r=null;
   String cpf=null;
   public void adicionar(Usuario u)
   {
	   try
	   {
		   ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into usuario (login,senha,cpf,tipo)values" +
		   "('"+u.getLogin()+"','"+u.getSenha()+"','"+u.getCpf()+"','"+u.getTipo()+"')");
		   ps.executeUpdate();
       }
	   catch (Exception e) 
	   {
		System.out.println(e.getMessage());
	   }
   }
   public boolean excluir(Usuario u)
   {
	   try
	   {  
		   		  ps=DaoFactoryPSQL.getConnection().prepareStatement("DELETE FROM usuario WHERE cpf='"+u.getCpf()+"'");
    			  ps.executeQuery();
    			  return true;
    	
	   }
	   catch (Exception e)
	   {
		 		   return false;
	   }

 }
   
   public void alterar(Usuario u)
   {
	   try
	   {
		   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE usuario SET login='"+u.getLogin()+
		   "',senha='"+u.getSenha()+"' where cpf='"+u.getCpf()+"' and tipo='"+u.getTipo()+"'"); 
		   ps.executeUpdate();
		   
	   }
	   catch (Exception e) 
	   {
		System.out.println(e.getMessage());
	   }
   }
 
   public Usuario logar(Usuario u)
   {  
	   try 
   	   {
    	  ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT tipo FROM usuario WHERE login='"+ u.getLogin()+
    	  "' and senha='"+u.getSenha()+"'");
    	  r =ps.executeQuery();
   		
    	  if (r.next())
    	  {    		
    		  u.setTipo(r.getString("tipo"));
    	     	  
    		  if (r.getString("tipo").equals("Administrador"))
    		  {
    			  u.setTipo("Administrador");
    		  }
    		  else if (r.getString("tipo").equals("Médico(a)"))
    		  {
    			  u.setTipo("Médico(a)");  	    		 
    		  }
    		  else if (r.getString("tipo").equals("Enfermeiro(a)"))
    		  {
    			  u.setTipo("Enfermeiro(a)");
    		  }
    		  else if (r.getString("tipo").equals("Secretário(a)"))
    		  {
    			  u.setTipo("Secretário(a)");
    		  }
    	  }	
    	  else{
                  return null;
		      }
   	   }
	   catch (Exception e) 
	   {
		//System.out.println(e.getMessage());
		return null;
	   }
	  return u;
	} 
   
 public String validarDados(Usuario u)
   {  	  
	   String login=null,cpf=null,validacao=null;
	   try 
   	   {
    	  ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT login,cpf FROM usuario");
    	  r =ps.executeQuery();
    	    
    	  if (r.next())
    	  {  
    		  login=(r.getString("login"));
    		  cpf=r.getString("cpf");
    		     		
    		  if(u.getLogin().equals(login))
    		  {
    			  validacao="login encontrado";
    		  }
    		  if(u.getCpf().equals(cpf))
			  {
			  	  validacao="cpf encontrado";
			  }
    	  }
	  
    	}
	   catch (Exception e) 
	   {
		System.out.print(e.getMessage());
	    }
	return validacao;
	  
	} 
 
 public boolean buscarMedico(Usuario u) {
	 try{
		 
		 ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT cpf FROM medico WHERE cpf='"+u.getCpf()+"'");
		 r =ps.executeQuery();
		 if (r.next())
		 {    	
			u.setCpf(r.getString("cpf"));
		   return true;   
		 }
		 else
		 {
			 return false;
		 }
		}
		catch(Exception e){
			return false;
		} 
	 
		}

  public void finalize()
   {
     try
     {
       ps.close();
     }
     catch(Exception e )
     {
   	  //System.out.println("" +e);
     }
   }


   
}