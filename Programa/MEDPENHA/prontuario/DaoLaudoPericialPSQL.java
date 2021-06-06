package prontuario;

import java.sql.*;
import java.util.Vector;

import medico.Medico;

import paciente.Paciente;
import consulta.Consulta;

import dao.DaoFactoryPSQL;

public class DaoLaudoPericialPSQL implements DaoLaudoPericial
{
	   PreparedStatement ps=null;
	   ResultSet r=null;
	   	   
		
	public void salvarLaudo(LaudoPericial laudo,Prontuario p) 
	{
		try
		   {
			
			 ps=DaoFactoryPSQL.getConnection().prepareStatement(("INSERT into laudopericial" +
					   "(data,descricao,obs,numprontuario,hora)" +
					   " values ('"+laudo.getData()+"','"+laudo.getDescricao()+"','"+laudo.getObs()+"','"+p.getNumProntuario()+"','"+laudo.getHora()+"')"));
					   			   
			  ps.executeUpdate();
		   
	        }
		 
		catch(Exception ex)
		{
			
		}
	}
	
	
	public boolean buscarLaudo(LaudoPericial laudopericial,Paciente pac,Consulta consultabusca) 
	{
		 
		try
		   {
			   
			   ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,laudo.obs,laudo.data,pac.matricula,med.nomemed, laudo.hora from (((laudopericial laudo inner join prontuario p on p.numeroprontuario=laudo.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=laudo.data and c.hora=laudo.hora and pac.matricula='"+pac.getMatricula()+"' and laudo.hora='"+consultabusca.getHora()+"' and laudo.data='"+laudopericial.getData()+"'");
		      
		       r= ps.executeQuery();
		         if(r.next())
		         {
		           laudopericial.setDescricao((r.getString("descricao")));
		           laudopericial.setObs(r.getString("obs"));
		           
		           return true; 
		         }
		   }
		   catch (Exception e) 
		   {
			   
		   }
		   return false;	
		
	}	
	
	
	public Vector consultarTodosLaudos(Paciente pac)
	 {
		 Vector v= new Vector(); 
	    	try
			{
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,laudo.obs,laudo.data,pac.matricula,med.nomemed,med.especialidade, laudo.hora from (((laudopericial laudo inner join prontuario p on p.numeroprontuario=laudo.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=laudo.data and c.hora=laudo.hora and pac.matricula='"+pac.getMatricula()+"'");
	    		r= ps.executeQuery();
	    		     		  		
	    		while(r.next())
	    		{
	    		  LaudoPericial laudo =new LaudoPericial();
	    			    		  
	    		  laudo.setHora((r.getString("hora")));
	    		  laudo.setData((r.getString("data")));
	    		  laudo.setEspecialidade((r.getString("especialidade")));
	    		  
	    		  v.add(laudo);
	    		  
	    		}
			 }
	    	  catch (Exception Ex)
			   {
	    		 
	    		}
			  return v;
	}
	
	public Vector preencherRelatorioLaudo(LaudoPericial laudopericial,Paciente pac, Consulta consultabusca)
    { 
		Vector v= new Vector(); 
    	
    	try{ 
    		   		
    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,laudo.obs,laudo.data,pac.nome,med.nomemed, laudo.hora from (((laudopericial laudo inner join prontuario p on p.numeroprontuario=laudo.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=laudo.data and c.hora=laudo.hora and pac.matricula='"+pac.getMatricula()+"' and laudo.hora='"+consultabusca.getHora()+"' and laudo.data='"+laudopericial.getData()+"'");
    				
    		r=ps.executeQuery();
    		
    	if(r.next())
    	{
    		LaudoPericial lad = new LaudoPericial();
    		    		
    		lad.setDescricao((r.getString("descricao")));
    		lad.setObs((r.getString("obs")));
    		lad.setNomepaciente((r.getString("nome")));
    		 	    		          	
    		v.add(lad);
    		 		
    	 }
    	}
    	catch(Exception e)
		{
    	 		    	 	
		}
    	return v;
      }
	
	public boolean buscarLaudoDia(LaudoPericial laudoperi,Paciente pac)
	 {
		 
		 try
		   { 																		
			ps=DaoFactoryPSQL.getConnection().prepareStatement("select descricao,pac.nome,med.nomemed,p.numeroprontuario from (((laudopericial l inner join prontuario p on p.numeroprontuario=l.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=l.data and c.hora=l.hora and pac.matricula='"+pac.getMatricula()+"' and l.hora='"+laudoperi.getHora()+"'and l.data='"+laudoperi.getData()+"'");
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