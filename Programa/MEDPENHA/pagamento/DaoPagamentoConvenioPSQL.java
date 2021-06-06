package pagamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import paciente.Paciente;
import tipoconsulta.TipoConsulta;
import consulta.Consulta;
import convenio.Convenio;

import dao.DaoFactoryPSQL;

public class DaoPagamentoConvenioPSQL implements DaoPagamentoConvenio{
	   PreparedStatement ps=null;
	   ResultSet r=null;
	   

	   public void efetuarPagamentoConv(PagamentoConvenio pc,Consulta cons,Paciente pac)
	   {
		   int codconsulta=0;
		   int codpagamento=0;
		   
	    	 try
			 {
	    	 
	    		    ps=DaoFactoryPSQL.getConnection().prepareStatement("select c.codconsulta from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	    r =ps.executeQuery();
		    	    
		    	    if (r.next())
		    	    {    		
				       codconsulta=r.getInt("codconsulta");
				 	   	   		
		    	          
		    	    }
		    		ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamento (datapag,tipo,total,obs," +
	    			"codconsulta) values " +
	    			"('"+pc.getData()+"','"+pc.getTipo()+"','"+pc.getTotal()+"','"+pc.getObs()+"','"+codconsulta+"')");
	    			ps.executeUpdate();


	    			//código pagamento
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.codpagamento from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)inner join pagamento pag on pag.codconsulta=c.codconsulta where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	    r =ps.executeQuery();
		    	    
		    	    if (r.next())
		    	    {    		
				       codpagamento=r.getInt("codpagamento");
				 	   
		    	    }
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamentoconvenio (cnpj,convenio," +
	    			"codpagamento) values ('"+pc.getCnpj()+"','"+pc.getConvenio()+"','"+codpagamento+"')");
	    			ps.executeUpdate();
	    			
	    			//Update do status
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta c set status='Pago', situacao='Confirmada' where c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");  
	    	    	ps.executeUpdate();
	    			
	    			
	    		  }	
			   
			   
			   catch (Exception e) 
			   {		 
					 System.out.print(e.getMessage()); 
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

