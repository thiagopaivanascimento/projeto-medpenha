package medico;
import dao.DaoFactoryPSQL;
import java.sql.*;

public class DaoMedicoPSQL implements DaoMedico
{
   PreparedStatement ps=null;
   ResultSet r=null;
   
    public void adicionar(Medico m)
   {
	   try
	   {		   
		   ps=DaoFactoryPSQL.getConnection().prepareStatement("insert into medico" +
		   	"(nomemed,datanasc,cpf,rg,telefone,celular,email,crm,especialidade)"+
			" values ('"+m.getNome()+"','"+m.getDataNasc()+"','"+m.getCpf()+"','"+m.getRg()+
			"','"+m.getTelefone()+"','"+m.getCelular()+"','"+m.getEmail()+
			"','"+m.getCrm()+"','"+m.getEspecialidade()+"')" );
		            
           ps.executeUpdate();
		   
	   }
	   catch (Exception e) 
	   {		
		  // System.out.println(e.getMessage());
	   }
   }
   
     public boolean excluir(Medico m)
    {
      try
      {
    	ps=DaoFactoryPSQL.getConnection().prepareStatement("DELETE FROM medico m " +
    	" WHERE m.crm='"+m.getCrm()+"'");
    	ps.executeUpdate();
    	
    	ps=DaoFactoryPSQL.getConnection().prepareStatement("DELETE FROM usuario m " +
    	" WHERE cpf='"+m.getCpf()+"'");
    	    	ps.executeUpdate();
    	 return true;
      }
    	catch (Exception e)
    	{
    	  //System.out.println(e.getMessage());
    	  return false;
    	}
 }
    
       public void alterar(Medico m)
       {
    	   try
    	   {
    	   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE medico SET nomemed='"+m.getNome()+
    			   "',datanasc='"+m.getDataNasc()+"',cpf='"+m.getCpf()+"',rg='"+m.getRg()+
    			   "',telefone='"+m.getTelefone()+"',celular='"+m.getCelular()+"',email='"+m.getEmail()+
    			   "',especialidade='"+m.getEspecialidade()+"' WHERE crm='"+m.getCrm()+"'"); 
    	   ps.executeUpdate();
    	   }
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    	  }
    	   }
       
       public boolean visualizar (Medico m)
       {
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM medico WHERE crm='"+m.getCrm()+"'");
    		  
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		 m.setNome(r.getString("nomemed"));
	    	  	 m.setDataNasc(r.getString("datanasc"));
	    	  	 m.setCpf(r.getString("cpf"));
	    	  	 m.setRg(r.getString("rg"));
	    	  	 m.setTelefone(r.getString("telefone"));
	    	  	 m.setCelular(r.getString("celular"));
	    	  	 m.setEmail(r.getString("email"));
	    	  	 m.setEspecialidade(r.getString("especialidade"));
	         		         	 
	    		return true;
	    		
	    	}
	    	else
	    	{
		   		return false;
	    	}
	    	
	}
    	   catch(Exception e)
	{
	 	//System.out.println("erro:" + e);
	 	return false;
	}
		
	   }
       
       public String validarDados(Medico m)
       {
    	   String cpf = null,rg = null,validacao=null,crm=null;
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT cpf,rg,crm FROM medico");
    		  r =ps.executeQuery();
    		  
    		  if (r.next())
        	  {  
        		  cpf=r.getString("cpf");
        		  rg=r.getString("rg");
        		  crm=r.getString("crm");
        		 
        		  if(m.getCpf().equals(cpf))
        		  {
        			  validacao="cpf encontrado";
        		  }
        		  else
        		  {
        			  if(m.getRg().equals(rg))
  			  		  {
  			  			validacao="rg encontrado";
  			  		  }
        			  else
        			  {
        				  if(m.getCrm().equals(crm))
      			  		  {
      			  			validacao="crm encontrado";
      			  		  }
        			  }
        		  }
        	  }
        	    	 
    		}
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
     	   }
		return validacao;
    		
    	}

     
     public boolean verificarUsuario(Medico m)
     {    
  	      	   
  	   try
 	   	   {
  		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT cpf,tipo FROM usuario " +
  		  " where cpf='"+m.getCpf()+"'");
  		  r =ps.executeQuery();
  		  
  		  if (r.next())
      	  {  
      		  m.setCpf(r.getString("cpf"));
      		  m.setTipo(r.getString("tipo"));
      		
      		if (r.getString("tipo").equals("Médico(a)"))
      		{
   			  m.setTipo("Médico(a)");
   			  return true;
      		}
      		else
      		{
      			return false;
      		}
      		  
      	  }
  		  else
  		  {
  			  return false;
  		  }
  		
 	    }
  	   catch (Exception e) 
  	   {
  		//System.out.println(e.getMessage());
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