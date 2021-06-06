package prontuario;

import java.sql.*;
import java.util.Vector;

import medico.Medico;

import paciente.Paciente;
import consulta.Consulta;

import dao.DaoFactoryPSQL;

public class DaoAtestadoPSQL implements DaoAtestado
{
	   PreparedStatement ps=null;
	   ResultSet r=null;
	  	   
		
	public void salvarAtestado(Atestado atest,Prontuario p) 
	{
		try
		   {
			 ps=DaoFactoryPSQL.getConnection().prepareStatement(("INSERT into atestado" +
					   "(data,descricao,obs,numprontuario,hora)" +
					   " values ('"+atest.getData()+"','"+atest.getDescricao()+"','"+atest.getObs()+"','"+p.getNumProntuario()+"','"+atest.getHora()+"')"));
					   			   
			  ps.executeUpdate();
		   
	        }
			   
		  
		catch (Exception e) 
		   {
			
		  }
		
	}
	
	
	public boolean buscarAtestado(Atestado atestado,Paciente pac,Consulta consultabusca) 
	{
		 
		try
		   {
			   
			   ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,atest.obs,atest.data,pac.matricula,med.nomemed,atest.hora from (((Atestado atest inner join prontuario p on p.numeroprontuario=atest.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=atest.data and c.hora=atest.hora and pac.matricula='"+pac.getMatricula()+"' and atest.hora='"+consultabusca.getHora()+"' and atest.data='"+atestado.getData()+"'");
		      
		       r= ps.executeQuery();
		         if(r.next())
		         {
		           atestado.setDescricao(r.getString("descricao"));
		           atestado.setObs(r.getString("obs"));
		           
		           return true; 
		         }
		   }
		   catch (Exception e) 
		   {
			   
		   }
		   return false;	
		
	}
	
	 public Vector consultarTodosAtestados(Paciente pac)
	 {
		 Vector v= new Vector(); 
	    	try
			{
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,atest.obs,atest.data,pac.matricula,med.nomemed,med.especialidade,atest.hora from (((Atestado atest inner join prontuario p on p.numeroprontuario=atest.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=atest.data and c.hora=atest.hora and pac.matricula='"+pac.getMatricula()+"'");
	    		r= ps.executeQuery();
	    		     		  		
	    		while(r.next())
	    		{
	    		  Atestado atest =new Atestado();
	    		  
	    		  atest.setHora((r.getString("hora")));
	    		  atest.setData((r.getString("data")));
	    		  atest.setEspecialidade((r.getString("especialidade")));
	    		  
	    		  
	    		  
	    		  v.add(atest);
	    		  
	    		}
			 }
	    	  catch (Exception Ex)
			   {
	    		 
	    		}
			  return v;
	}
	
	 
	 public Vector preencherRelatorioAtestado(Atestado atestado2,Paciente pac, Consulta consultabusca)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,atest.obs,atest.data,pac.nome,med.nomemed,atest.hora from (((Atestado atest inner join prontuario p on p.numeroprontuario=atest.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=atest.data and c.hora=atest.hora and pac.matricula='"+pac.getMatricula()+"' and atest.hora='"+consultabusca.getHora()+"' and atest.data='"+atestado2.getData()+"'");
	    				
	    		r=ps.executeQuery();
	    		
	    	if(r.next())
	    	{
	    		Atestado atest = new Atestado();
	    			    		
	    		atest.setDescricao((r.getString("descricao")));
	    		atest.setObs((r.getString("obs")));
	    		atest.setNomepaciente((r.getString("nome")));
	    		 	    		          	
	    		v.add(atest);
	    			 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	 		
	    	 	
			}
	    	return v;
	      }
	 
	 public boolean buscarAtestadoDia(Atestado atestado,Paciente pac)
	 {
		 
		 try
		   { 																		
			ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,pac.nome,med.nomemed,p.numeroprontuario from (((atestado a inner join prontuario p on p.numeroprontuario=a.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=a.data and c.hora=a.hora and pac.matricula='"+pac.getMatricula()+"' and a.hora='"+atestado.getHora()+"'and a.data='"+atestado.getData()+"'");
			 r= ps.executeQuery();
		         if(r.next())
		         {
		              return true;
		         }  
			}
		   catch (Exception e) 
		   {
			   
		   }
		   return false;
		
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