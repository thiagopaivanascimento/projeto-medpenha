package prontuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import consulta.Consulta;
import paciente.Paciente;
import dao.DaoFactoryPSQL;

public class DaoDiagnosticoPSQL implements DaoDiagnostico
{
	   PreparedStatement ps=null; 
	   ResultSet r=null;
	   	  
		
	public void salvarDiagnostico(Diagnostico d,Prontuario p, Consulta consultacombobox) 
	{  
		try
		   {
			 			
			 ps=DaoFactoryPSQL.getConnection().prepareStatement(("INSERT into diagnostico" +
					   "(entrevistaconsulta,obs,diagnostico,numprontuario,data,hora)" +
					   " values ('"+d.getEntrevistaConsulta()+"','"+d.getObsDiagnostico()+"','"+d.getDiagnostico()+"','"+p.getNumProntuario()+"','"+p.getDatacons())+"','"+consultacombobox.getHora()+"')");
					   			   
			  ps.executeUpdate();
							    
		   }
		
		catch(Exception e)
		{
			
		}
		
	}
	
			//Método para buscar as informações do diagnóstico caputrando hora da tabela
	public boolean buscarDiagnostico(Diagnostico d,Paciente pac,Consulta consultabusca) 
	{
		 
		try
		   { 																		
			ps=DaoFactoryPSQL.getConnection().prepareStatement("select entrevistaconsulta,d.obs,diagnostico,d.data,pac.matricula,med.nomemed, d.hora from (((diagnostico d inner join prontuario p on p.numeroprontuario=d.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=d.data and c.hora=d.hora and pac.matricula='"+pac.getMatricula()+"' and d.hora='"+consultabusca.getHora()+"' and d.data='"+d.getDataHistDiag()+"'");
			 r= ps.executeQuery();
		         if(r.next())
		         {
		           
		           d.setEntrevistaConsulta((r.getString("entrevistaconsulta")));
		           d.setObsDiagnostico((r.getString("obs")));
		           d.setDiagnostico((r.getString("diagnostico")));
		          
		          
			       return true;
		         }  
			}
		   catch (Exception e) 
		   {
			   
		   }
		   return false;	
		
	}
	
		//popular tabela
	 public Vector consultarTodosDiagnosticos(Paciente pac)
	    {  
	    	Vector v= new Vector(); 
	    	try
			{	 	
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select d.entrevistaconsulta,med.especialidade,d.obs,d.diagnostico,d.data,pac.matricula,med.nomemed, d.hora from (((diagnostico d inner join prontuario p on p.numeroprontuario=d.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=d.data and c.hora=d.hora and pac.matricula='"+pac.getMatricula()+"'");
	    		r= ps.executeQuery();
	    		     		  		
	    		while(r.next())
	    		{
	    		  Diagnostico diag =new Diagnostico();

	    		  diag.setDataDiagnostico((r.getString("data")));
	    		  diag.setEspecialidade((r.getString("especialidade")));
	    		  diag.setHoraDiagnostico((r.getString("hora")));

	    		  v.add(diag);
	    		  
	    		}
			 }
	    	  catch (Exception Ex)
			   {
	    		  
	    		}
			  return v;
		  }
	 
	 
	
		
	 public void alterarDiagnostico(Diagnostico diag) 
		{
		 try
	 	   {   

			 ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE diagnostico SET " +
			 "entrevistaconsulta='"+diag.getEntrevistaConsulta()+"',obs='"+diag.getObsDiagnostico()+"',diagnostico='"+diag.getDiagnostico()+"' WHERE data='"+diag.getDataDiagnostico()+"' and hora='"+diag.getHoraDiagnostico()+"'");
			 ps.executeUpdate();
			     
	 	   }
		 catch(Exception ex)
		 {
			 
		 }
			
		}
	 
	 public Vector preencheAutorizacaoRetorno(Paciente pac, Consulta consultacombobox,Prontuario pront) 
		{
			
		 Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select c.data, c.hora,pac.matricula,pac.nome,med.nomemed,med.crm from (((diagnostico d inner join prontuario p on p.numeroprontuario=d.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=d.data and c.hora=d.hora and pac.matricula='"+pac.getMatricula()+"' and c.data='"+pront.getDatacons()+"' and c.hora='"+consultacombobox.getHora()+"'");
	    				
	    		r=ps.executeQuery();
	    		
	    	if(r.next())
	    	{
	    		Prontuario prontua= new Prontuario();
	    			    		
	    		prontua.setDatacons((r.getString("data")));
	    		prontua.setHoracons((r.getString("hora")));
	    		prontua.setMatricula((r.getString("matricula")));
	    		prontua.setNomePac((r.getString("nome")));
	    		prontua.setNomeMedico((r.getString("nomemed")));
	    		prontua.setEspecialidade((r.getString("crm")));
	    		
	    		v.add(prontua);
	    			 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	 		
	    	 	
			}
	    	return v;
		}
	 
	 public boolean buscarDiagnosticoDia(Diagnostico d,Paciente pac,Consulta consultacombobox,Prontuario pront)
	 {
		 
		 try
		   { 																		
			ps=DaoFactoryPSQL.getConnection().prepareStatement("select entrevistaconsulta,d.obs,diagnostico,d.data,pac.matricula,med.nomemed, d.hora from (((diagnostico d inner join prontuario p on p.numeroprontuario=d.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=d.data and c.hora=d.hora and pac.matricula='"+pac.getMatricula()+"' and d.hora='"+consultacombobox.getHora()+"' and d.data='"+pront.getDatacons()+"'");
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