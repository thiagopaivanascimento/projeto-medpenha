package tipoconsulta;
import dao.DaoFactoryPSQL;
import java.sql.*;

import medico.DaoMedico;
import medico.Medico;

public class DaoPrecoPSQL implements DaoPreco
{
   PreparedStatement ps=null;
   ResultSet r=null;
   
          
       public void alterar(TipoConsulta tp)
       {
    	   try
    	   {
    	   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE tipoconsulta SET valor='"+tp.getValor()+"'" +
    	   		"WHERE tipo='"+tp.getTipo()+"'"); 
    	   ps.executeUpdate();
    	   }
    	   catch (Exception e) 
    	   {
    		System.out.println(e.getMessage());
    	  }
    	   }
       
       public boolean visualizar(TipoConsulta tp)
       {
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT valor FROM tipoconsulta WHERE tipo='"+tp.getTipo()+"'");
    		  
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		tp.setValor(r.getDouble("valor"));
	    	  		         		         	 
	    		return true;
	    		
	    	}
	    	else
	    	{
		   		return false;
	    	}
	    	
	}
    	   catch(Exception e)
	{
	 	System.out.println("erro:" + e);
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
   	  System.out.println("" +e);
     }
}
}





