package prontuario;

import java.sql.*;
import java.util.Vector;

import medico.Medico;

import paciente.Paciente;
import consulta.Consulta;

import dao.DaoFactoryPSQL;

public class DaoExamePSQL implements DaoExame
{
	   PreparedStatement ps=null;
	   ResultSet r=null;
	   	   
		
	public void salvarExame(Exame exam,Prontuario p) 
	{
		try
		   {
								
			 ps=DaoFactoryPSQL.getConnection().prepareStatement(("INSERT into exame" +
					   "(data,exame,obs,numprontuario,hora)" +
					   " values ('"+exam.getData()+"','"+exam.getExame()+"','"+exam.getObs()+"','"+p.getNumProntuario()+"','"+exam.getHora()+"')"));
					   			   
			  ps.executeUpdate();
			   
		   }
		
		catch (Exception ex) 
		   {
			
		  }
		
	}
	
	//Método para buscar as informações do exame capturando hora da tabela
	public boolean buscarExame(Exame exambusca,Paciente pac,Consulta consultabusca) 
	{
		 
		try
		   {
			   
			   ps=DaoFactoryPSQL.getConnection().prepareStatement("select exame,exam.obs,exam.data,pac.matricula,med.nomemed, exam.hora from (((Exame exam inner join prontuario p on p.numeroprontuario=exam.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=exam.data and c.hora=exam.hora and pac.matricula='"+pac.getMatricula()+"' and exam.hora='"+consultabusca.getHora()+"' and exam.data='"+exambusca.getData()+"'");
		      
		       r= ps.executeQuery();
		         if(r.next())
		         {
		           exambusca.setExame((r.getString("exame")));
		           exambusca.setObs(r.getString("obs"));
		           
		           return true; 
		         }
		   }
		   catch (Exception e) 
		   {
			   
		   }
		   return false;	
		
	}
	
	 public Vector consultarTodosExames(Paciente pac)
	 {
		 Vector v= new Vector(); 
	    	try
			{
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select exame,exam.obs,exam.data,pac.matricula,med.nomemed,med.especialidade, exam.hora from (((Exame exam inner join prontuario p on p.numeroprontuario=exam.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=exam.data and c.hora=exam.hora and pac.matricula='"+pac.getMatricula()+"'");
	    		r= ps.executeQuery();
	    		     		  		
	    		while(r.next())
	    		{
	    		  Exame exam =new Exame();
	    	    		  
	    		  exam.setHora((r.getString("hora")));
	    		  exam.setData((r.getString("data")));
	    		  exam.setEspecialidade((r.getString("especialidade")));
	    		  	    		  
	    		  v.add(exam);
	    		  
	    		}
			 }
	    	  catch (Exception Ex)
			   {
	    		 
	    		}
			  return v;
	}
	
	 
	 public Vector preencherRelatorioExame(Exame exambusca,Paciente pac, Consulta consultabusca)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select exame,exam.obs,exam.data,pac.nome,med.nomemed, exam.hora from (((Exame exam inner join prontuario p on p.numeroprontuario=exam.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=exam.data and c.hora=exam.hora and pac.matricula='"+pac.getMatricula()+"' and exam.hora='"+consultabusca.getHora()+"' and exam.data='"+exambusca.getData()+"'");
	    				
	    		r=ps.executeQuery();
	    		
	    	if(r.next())
	    	{
	    		Exame exame= new Exame();
	    		    		
	    		exame.setExame((r.getString("exame")));
	    		exame.setObs((r.getString("obs")));
	    		exame.setNomepaciente((r.getString("nome")));	    		 	    		          	
	    		
	    		v.add(exame);
	    			 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	 		
	    	 	
			}
	    	return v;
	      }
	 
	 public boolean buscarExameDia(Exame exam,Paciente pac)
	 {
		 
		 try
		   { 																		
			ps=DaoFactoryPSQL.getConnection().prepareStatement("select exame,pac.nome,med.nomemed,p.numeroprontuario from (((exame e inner join prontuario p on p.numeroprontuario=e.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=e.data and c.hora=e.hora and pac.matricula='"+pac.getMatricula()+"' and e.hora='"+exam.getHora()+"'and e.data='"+exam.getData()+"'");
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