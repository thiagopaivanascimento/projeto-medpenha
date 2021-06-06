package pagamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import paciente.Paciente;

import consulta.Consulta;
import convenio.Convenio;

import dao.DaoFactoryPSQL;

public class DaoPagamentoParticularPSQL implements DaoPagamentoParticular
{
	   PreparedStatement ps=null;
	   ResultSet r=null;
	   

	   public void efetuarPagamentoParticularDinh(PagamentoParticular pp,Paciente pac, Consulta cons)
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
	    			"codconsulta) values('"+pp.getData()+"','"+pp.getTipo()+"','"+pp.getTotal()+"','"+pp.getObs()+"','"+codconsulta+"')");
	    			ps.executeUpdate();


	    			//código pagamento
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.codpagamento from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)inner join pagamento pag on pag.codconsulta=c.codconsulta where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	   r =ps.executeQuery();
		    	    
		    	   if (r.next())
		    	    {    		
				       codpagamento=r.getInt("codpagamento");
				 	   
		    	    }
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamentoparticular (formapagamento,codpagamento) values ('"+pp.getTipo()+"','"+codpagamento+"')");
	    			ps.executeUpdate();
	    				    				    			
		    	    //Update do status
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta c set status='Pago',situacao='Confirmada' where c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");  
	    	    	ps.executeUpdate();
	    			
	    			
	    		  }	
			   
			   
			   catch (Exception e) 
			   {		 
					 System.out.print(e.getMessage()); 
			   }
		 
		   
	
	
	
   }
	   
	   public void efetuarPagamentoParticularCartao(PagamentoParticular pp,Paciente pac, Consulta cons,Cartao c)
	   {
		   int codconsulta=0;
		   int codpagamento=0;
		   int codpagparticular=0;
		   
		   
	    	 try
			 {
	    	 
	    		    ps=DaoFactoryPSQL.getConnection().prepareStatement("select c.codconsulta from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	    r =ps.executeQuery();
		    	    
		    	    if (r.next())
		    	    {    		
				       codconsulta=r.getInt("codconsulta");
				 	   	   		
		    	          
		    	    }
		    		ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamento (datapag,tipo,total,obs," +
	    			"codconsulta) values('"+pp.getData()+"','"+pp.getTipo()+"','"+pp.getTotal()+"','"+pp.getObs()+"','"+codconsulta+"')");
	    			ps.executeUpdate();


	    			//código pagamento
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.codpagamento from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)inner join pagamento pag on pag.codconsulta=c.codconsulta where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	   r =ps.executeQuery();
		    	    
		    	   if (r.next())
		    	    {    		
				       codpagamento=r.getInt("codpagamento");
				 	   
		    	    }
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamentoparticular (formapagamento,codpagamento) values ('"+pp.getTipo()+"','"+codpagamento+"')");
	    			ps.executeUpdate();
	    			
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("select pagpart.codpagamentoparticular from (pagamento pag inner join pagamentoparticular pagpart on pag.codpagamento=pagpart.codpagamento) where pag.codpagamento='"+codpagamento+"'");
		    	    r =ps.executeQuery();
		    	    
		    	    if (r.next())
		    	    {    		
				       codpagparticular=r.getInt("codpagamentoparticular");
				 	   
		    	   }
	    			
		    	    
		    	    ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into cartao (numcartao,codpagamentoparticular) values ('"+c.getNumcartao()+"','"+codpagparticular+"')");
	    			ps.executeUpdate();
	    			
		    	    
		    	    //Update do status
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta c set status='Pago',situacao='Confirmada' where c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");  
	    	    	ps.executeUpdate();
	    			
	    			
	    		  }	
			   
			   
			   catch (Exception e) 
			   {		 
					 System.out.print(e.getMessage()); 
			   }

   }
	   
	   
	   public void efetuarPagamentoParticularCheque(PagamentoParticular pp,Paciente pac, Consulta cons,Cheque ch)
	   {
		   int codconsulta=0;
		   int codpagamento=0;
		   int codpagparticular=0;
		   
		   
	    	 try
			 {
	    	 
	    		    ps=DaoFactoryPSQL.getConnection().prepareStatement("select c.codconsulta from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	    r =ps.executeQuery();
		    	    
		    	    if (r.next())
		    	    {    		
				       codconsulta=r.getInt("codconsulta");
				 	   	   		
		    	          
		    	    }
		    		ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamento (datapag,tipo,total,obs," +
	    			"codconsulta) values('"+pp.getData()+"','"+pp.getTipo()+"','"+pp.getTotal()+"','"+pp.getObs()+"','"+codconsulta+"')");
	    			ps.executeUpdate();


	    			//código pagamento
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.codpagamento from (consulta c inner join paciente pac on c.codpaciente=pac.matricula)inner join pagamento pag on pag.codconsulta=c.codconsulta where pac.matricula='"+pac.getMatricula()+"' and c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");
		    	   r =ps.executeQuery();
		    	    
		    	   if (r.next())
		    	    {    		
				       codpagamento=r.getInt("codpagamento");
				 	   
		    	    }
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pagamentoparticular (formapagamento,codpagamento) values ('"+pp.getTipo()+"','"+codpagamento+"')");
	    			ps.executeUpdate();
	    			
	    			
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("select pagpart.codpagamentoparticular from (pagamento pag inner join pagamentoparticular pagpart on pag.codpagamento=pagpart.codpagamento) where pag.codpagamento='"+codpagamento+"'");
		    	    r =ps.executeQuery();
		    	    
		    	    if (r.next())
		    	    {    		
				       codpagparticular=r.getInt("codpagamentoparticular");
				 	   
		    	   }
	    			
		    	    
		    	    ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into cheque (agencia,numconta,numserie,nomebanco,numcheque,codpagamentoparticular) values ('"+ch.getAgencia()+"','"+ch.getNumconta()+"','"+ch.getNumserie()+"','"+ch.getNomebanco()+"','"+ch.getNumcheque()+"','"+codpagparticular+"')");
	    			ps.executeUpdate();
	    			
		    	    
		    	    //Update do status
	    			ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta c set status='Pago',situacao='Confirmada' where c.data='"+cons.getData()+"' and c.hora='"+cons.getHora()+"'");  
	    	    	ps.executeUpdate();
	    			
	    			
	    		  }	
			   
			   
			   catch (Exception e) 
			   {		 
					 System.out.print(e.getMessage()); 
			   }

   }
	   
	   public Vector preencherRelatorioPagParticular(Pagamento pag)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		//"select pag.datapag,pac.nome,med.nomemed,pag.total from ((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on med.crm=cons.codmedico)inner join Pagamento pag on pag.codconsulta=cons.codconsulta  where pag.datapag='"+pag.getData()+"' and pag.tipo='Particular'");
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.datapag,pac.nome,med.nomemed,pag.total,cons.data from ((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on med.crm=cons.codmedico)inner join Pagamento pag on pag.codconsulta=cons.codconsulta  where pag.datapag='"+pag.getData()+"' and pag.tipo='Particular'");
	    				
	    				
	    		r=ps.executeQuery();
	    		
	    	while(r.next())
	    	{
	    		Pagamento p = new Pagamento(null, null, 0, null,null);
	    		
	    		p.setData((r.getString("datapag")));
	    		p.setDatacons((r.getString("data")));
	    		p.setNome((r.getString("nome")));
	    		p.setMed((r.getString("nomemed")));
	    		p.setTotal((r.getInt("total")));
	    		 	    		          	
	    		v.add(p);
	    		
	    				 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	  System.out.println("ERRo no banco"+e.getMessage());		
	    	 	
			}
	    	return v;
	      }
	   
	   
	   public boolean buscaDataPagamentoParticular(Pagamento pag)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.datapag from((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on med.crm=cons.codmedico)inner join Pagamento pag on pag.codconsulta=cons.codconsulta  where pag.datapag='"+pag.getData()+"' and pag.tipo='Particular'");
	    				
	    		r=ps.executeQuery();
	    		
	    	if(r.next())
	    	{   		    			    		
	    	  return true;    				 		
	    	 }
	    	else
	    	{
	    		return false;
	    	}
	    	
	    	}
	    	catch(Exception e)
			{
	    	  System.out.println("ERRo no banco"+e.getMessage());	
	    	  return false;
	    	 	
			}
	    	
	      }
}