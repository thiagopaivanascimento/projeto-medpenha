package pagamento;
import dao.DaoFactoryPSQL;
import java.sql.*;
import java.util.Vector;
import paciente.*;
import tipoconsulta.*;
import consulta.*;
import convenio.*;


public class DaoPagamentoPSQL implements DaoPagamento
{
   PreparedStatement ps=null;
   ResultSet r=null;
   
   
  
   public boolean buscarConvenio (Convenio conv,Paciente p)
   {
	   try
	   	   {
		     			
		      ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT convenio.cnpj,convenio.instituicao,convenio.percentual" +
		  	  " FROM(convenio inner join paciente on paciente.codconvenio = convenio.cnpj)" +
		  	  "WHERE paciente.matricula='"+p.getMatricula()+"'");
		  
		      r =ps.executeQuery();
		   
    	if(r.next())
    	{
    	  	 conv.setCnpj(r.getString("cnpj"));
    	  	 conv.setInstituicao(r.getString("instituicao")); 
    	  	 conv.setPercentual(r.getInt("percentual")); 
    	  	 return true;
    	  
    	}
    	else
    	{
	   		return false;
    	}
	}
    	catch(Exception ex)
    	{
    		System.out.print(ex.getMessage());
    		return false;
    	}
}
  
   public  void salvarCartao(Cartao cart)
   {
	   
   }
   
   public boolean buscaPagamento(Consulta c,Paciente p,TipoConsulta tp)
   {
	   try{
    		
    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select p.matricula,tp.valor from (paciente p inner join consulta "+
    				"c on p.matricula = c.codpaciente) inner join tipoconsulta tp on tp.codtipoconsulta=c.codtipoconsulta where c.hora='"+c.getHora()+"'");
    		r=ps.executeQuery();
    		
    	if(r.next())
    	{
    	
    		 p.setMatricula(r.getInt("matricula"));
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
    	 	return false;
		} 
	   
   }
   
   public Vector preencheReciboConsulta(Paciente p, Pagamento pag) 
	{
		
	 Vector v= new Vector(); 
   	
   	try{ 
   		   		
   		ps=DaoFactoryPSQL.getConnection().prepareStatement("select pac.nome,pg.datapag,pg.total,c.data from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)inner join pagamento pg on c.codconsulta=pg.codconsulta where c.data='"+pag.getDataCons()+"' and c.hora='"+pag.getHora()+"' and pac.matricula='"+p.getMatricula()+"'");
   				
   		r=ps.executeQuery();
   		
   	if(r.next())
   	{
   		   		
   		pag.setNome((r.getString("nome")));
   		pag.setData((r.getString("datapag")));
   		pag.setDatacons((r.getString("data")));
   		pag.setTotal((r.getInt("total")));
   		
   		
   		v.add(pag);
   			 		
   	 }
   	}
   	catch(Exception e)
		{
   	 		System.out.println("ERRO no SQL:"+e.getMessage());
   	 	
		}
   	return v;
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