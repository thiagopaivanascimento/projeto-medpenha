package convenio;

import dao.DaoFactoryPSQL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import paciente.Paciente;
import pagamento.Pagamento;


public class DaoConvenioPSQL implements DaoConvenio 
{
   PreparedStatement ps=null;
   ResultSet r=null;
   
    public void adicionar(Convenio c)
   {
	   try
	   {
		   
		   ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into convenio " +
		   "(cnpj,razao,instituicao,percentual,email,telefone,fax,endereco,numero,bairro,complemento,cidade,cep,uf)" +
		   " values ('"+c.getCnpj()+"','"+c.getRazao()+"','"+c.getInstituicao()+"','"+c.getPercentual()+"','"+c.getEmail()+
		   "','"+c.getTelefone()+"','"+c.getFax()+"','"+c.getEndereco()+"','"+ c.getNumero()+"','"+ c.getBairro()+"" +
		   "','"+c.getComplemento()+"','"+c.getCidade()+"','"+c.getCep()+"','"+c.getUf()+"')");
		   
		  ps.executeUpdate();
		   
	   }
	   catch (Exception e) 
	   {		 
			   
	  }
	   
   }
   
     public boolean excluir(Convenio c)
   {
    	
	   try
	   {
		   ps=DaoFactoryPSQL.getConnection().prepareStatement("DELETE FROM convenio WHERE cnpj='"+c.getCnpj()+"'");
		   ps.executeUpdate();
		   return true;
		
	   }
	   catch (Exception e)
	   {
		   
		    return false;
	   }
   }
      
       public boolean visualizar (Convenio c)
       {
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM convenio WHERE cnpj='"+c.getCnpj()+"'");
    		  
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    	  	 c.setRazao(r.getString("razao"));
	    	  	 c.setInstituicao(r.getString("instituicao"));
	    	  	 c.setPercentual(r.getInt("percentual"));
	    	  	 c.setEmail(r.getString("email"));
	    	  	 c.setTelefone(r.getString("telefone"));
	    	  	 c.setFax(r.getString("fax"));
	    	  	 c.setEndereco(r.getString("endereco"));
	    	  	 c.setNumero(r.getString("numero"));
	         	 c.setBairro(r.getString("bairro"));
	         	 c.setComplemento(r.getString("complemento"));
	             c.setCidade(r.getString("cidade"));
	             c.setCep(r.getString("cep"));
	         	 c.setUf(r.getString("uf"));
	         	 
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
    	   
       public void alterar(Convenio c)
       {
    	   try
    	   {
    		   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE convenio SET razao='"+c.getRazao()+"',instituicao='"+c.getInstituicao()+
    			   "',percentual='"+c.getPercentual()+"',email='"+c.getEmail()+"',telefone='"+c.getTelefone()+"',fax='"+c.getFax()+
    			   "',endereco='"+c.getEndereco()+"',numero='"+ c.getNumero()+"',bairro='"+ c.getBairro()+"',complemento='"+c.getComplemento()+
    			   "',cidade='"+c.getCidade()+"',cep='"+c.getCep()+"',uf='"+c.getUf()+"' WHERE cnpj='"+c.getCnpj()+"'"); 
    		   ps.executeUpdate();
    		
    	   }
    	   catch (Exception e) 
    	   {
    		
    	   }
       }
       
       
       public Vector preencherRelatorioPagConvenio(Pagamento pag)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.datapag,pac.nome,med.nomemed,conv.percentual,tipcons.valor from ((((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on med.crm=cons.codmedico)inner join convenio conv on conv.cnpj=pac.codconvenio) inner join Pagamento pag on pag.codconsulta=cons.codconsulta)inner join tipoconsulta tipcons on tipcons.codtipoconsulta=cons.codtipoconsulta  where pag.datapag='"+pag.getData()+"'");				
	    				
	    		r=ps.executeQuery();
	    		
	    	while(r.next())
	    	{
	    		Convenio con = new Convenio();
	    		    		
	    		con.setDataCons((r.getString("datapag")));
	    		con.setPac((r.getString("nome")));
	    		con.setMed((r.getString("nomemed")));
	    		con.setPercentual((r.getInt("percentual")));
	    		con.setTotal((r.getInt("valor")));
	    		 
	    		v.add(con);
	    		
	    				 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	  System.out.println("ERRo no banco"+e.getMessage());		
	    	 	
			}
	    	return v;
	      }
       
       public Vector preencherRelatorioArrecadConvenio(Pagamento pag)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		//select Sum(total) as total,pag.datapag, conv.instituicao from ((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join Pagamento pag on pag.codconsulta=cons.codconsulta)inner join convenio conv on conv.cnpj=pac.codconvenio  where pag.datapag='"+pag.getData()+"' group by pag.datapag,conv.instituicao
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select Sum(valor) as valor,pag.datapag, conv.instituicao from (((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join Pagamento pag on pag.codconsulta=cons.codconsulta)inner join convenio conv on conv.cnpj=pac.codconvenio)inner join tipoconsulta tipcons on tipcons.codtipoconsulta=cons.codtipoconsulta  where pag.datapag='"+pag.getData()+"' group by pag.datapag,conv.instituicao");
	    				
	    		r=ps.executeQuery();
	    		
	    	while(r.next())
	    	{
	    		Convenio conv = new Convenio();
	    			    		
	    		conv.setDataCons((r.getString("datapag")));
	    		conv.setInstituicao((r.getString("instituicao")));
	    		conv.setTotal((r.getInt("valor")));
	    		    		 	    		          	
	    		v.add(conv);
	    				 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	  System.out.println("ERRo no banco"+e.getMessage());		
	    	 	
			}
	    	return v;
	      }
       
       public boolean consultaDataConvenio(Pagamento pag)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select pag.datapag from (((consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on med.crm=cons.codmedico)inner join convenio conv on conv.cnpj=pac.codconvenio) inner join Pagamento pag on pag.codconsulta=cons.codconsulta  where pag.datapag='"+pag.getData()+"'");
	    				
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
       
       
       
       
    	
       public ArrayList buscarConvenio()
       {  
    	   ArrayList<String> convenios = new ArrayList<String>();
    	   try
   			{
       			ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT instituicao FROM convenio order by instituicao");
       			r =ps.executeQuery();
       		   		  		
       			while(r.next())
       			{
       				convenios.add(r.getString("instituicao"));
       			}
         	      		
   			}
    	   	catch (Exception e)
    	   	{
    	   		
       		}
    	   	return convenios;
       }	
       
       public Vector ListarTodosPacientes(Paciente p) {
    	   Vector v= new Vector(); 
		   try
		     { 	  
		    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select nome,datanasc,matricula,conv.instituicao from paciente pac inner join convenio conv on pac.codconvenio=conv.cnpj where conv.instituicao='"+p.getOperaConvenio()+"'"); 
		    	 	r = ps.executeQuery();
		    	
		    	 	while(r.next())
		    	 	{
		    	 		Paciente pac = new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
		    	 		pac.setNome((r.getString("nome")));
		    	 		pac.setDataNasc((r.getString("datanasc")));   		
		    	 		pac.setMatricula((r.getInt("matricula")));
		    	 		pac.setOperaConvenio((r.getString("instituicao")));
		    	 			    	 		
		    	 		v.add(pac);  
		    	 		
		    	 	}	     		
		    		     		 
		 	    }
		     	 catch (Exception e)
		 		   {
		     		System.out.println("Erro banco"+e.getMessage());
		     		}
		 		  return v;
    	}
       
       public Vector preencherRelatorioListaPaciente(Paciente p) {
    	   Vector v= new Vector(); 
		   try
		     { 	  
		    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select nome,datanasc,matricula,conv.instituicao from paciente pac inner join convenio conv on pac.codconvenio=conv.cnpj where conv.instituicao='"+p.getOperaConvenio()+"'"); 
		    	 	r = ps.executeQuery();
		    	
		    	 	while(r.next())
		    	 	{
		    	 		Paciente pac = new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
		    	 		pac.setNome((r.getString("nome")));
		    	 		pac.setDataNasc((r.getString("datanasc")));   		
		    	 		pac.setMatricula((r.getInt("matricula")));
		    	 		pac.setOperaConvenio((r.getString("instituicao")));
		    	 			    	 		
		    	 		v.add(pac);  
		    	 		
		    	 	}	     		
		    		     		 
		 	    }
		     	 catch (Exception e)
		 		   {
		     		System.out.println("Erro banco"+e.getMessage());
		     		}
		 		  return v;
    	}
       

       public boolean buscarPacientes(Convenio c,Paciente p)
       {
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT matricula FROM paciente WHERE cnpj='"+c.getCnpj()+"'");
    		  
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    	  	 p.setMatricula(r.getInt("matricula"));
	    	  		         	 
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
       
   public void finalize()
   {
     try
     {
       ps.close();
     }
     catch(Exception e )
     {
   	  
     }
   
   
}





  
}