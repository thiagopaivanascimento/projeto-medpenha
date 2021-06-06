package prontuario;

import java.sql.*;
import java.util.Vector;

import medico.Medico;

import paciente.Paciente;

import consulta.Consulta;

import dao.DaoFactoryPSQL;

public class DaoPrescricaoPSQL implements DaoPrescricao
{
	   PreparedStatement ps=null;
	   ResultSet r=null;
	   
	   
		
	public void salvarPrescricao(Prescricao presc,Prontuario p) 
	{
		try
		   { 
			 ps=DaoFactoryPSQL.getConnection().prepareStatement(("INSERT into prescricao" +
						   "(data,tipo,medicamentos,obs,numprontuario,hora)" +
						   " values ('"+presc.getData()+"','"+presc.getTipo()+"','"+presc.getMedicamento()+"','"+presc.getObs()+"','"+p.getNumProntuario()+"','"+presc.getHora()+"')"));
						   			   
				  ps.executeUpdate();
			   
		      
		   }
		catch (Exception e) 
		   {
			
		  }
		
	}
	
	//Método para buscar as informações da prescrição capturando hora da tabela
	public boolean buscarPrescricao(Prescricao prescri,Paciente pac,Consulta consultabusca) 
	{
		 
		try
		   {
			   
			   ps=DaoFactoryPSQL.getConnection().prepareStatement("select tipo,presc.medicamentos, presc.obs,presc.data,pac.matricula,med.nomemed, presc.hora from (((Prescricao presc inner join prontuario p on p.numeroprontuario=presc.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=presc.data and c.hora=presc.hora and pac.matricula='"+pac.getMatricula()+"' and presc.hora='"+consultabusca.getHora()+"' and presc.data='"+prescri.getData()+"'");
		      
		       r= ps.executeQuery();
		         if(r.next())
		         {
		          
		           prescri.setTipo(r.getString("tipo"));
		           prescri.setMedicamento(r.getString("medicamentos"));
		           prescri.setObs(r.getString("obs"));
		           
		           return true; 
		         }
		   }
		   catch (Exception e) 
		   {
			   
		   }
		   return false;	
		
	}
	
	
	//popular tabela
	 public Vector consultarTodasPrescricoes(Paciente pac)
	 {
		 Vector v= new Vector(); 
	    	try
			{
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select tipo,presc.medicamentos, presc.obs,presc.data,pac.matricula,med.nomemed, presc.hora,med.especialidade from (((Prescricao presc inner join prontuario p on p.numeroprontuario=presc.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=presc.data and c.hora=presc.hora and pac.matricula='"+pac.getMatricula()+"'");
	    		r= ps.executeQuery();
	    		     		  		
	    		while(r.next())
	    		{
	    		  Prescricao presc =new Prescricao();
	    		 	    		  
	    		  presc.setHora((r.getString("hora")));
	    		  presc.setData((r.getString("data")));
	    		  presc.setEspecialidade((r.getString("especialidade")));
	    		  	    		  
	    		  v.add(presc);
	    		  
	    		}
			 }
	    	  catch (Exception Ex)
			   {
	    		 
	    		}
			  return v;
	}
	 
	 
	 public Vector preencherRelatorioPrescricao(Prescricao prescri,Paciente pac, Consulta consultabusca)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select tipo,presc.medicamentos, presc.obs,presc.data,pac.nome,med.nomemed, presc.hora from (((Prescricao presc inner join prontuario p on p.numeroprontuario=presc.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=presc.data and c.hora=presc.hora and pac.matricula='"+pac.getMatricula()+"' and presc.hora='"+consultabusca.getHora()+"' and presc.data='"+prescri.getData()+"'");
	    				
	    		r=ps.executeQuery();
	    		
	    	if(r.next())
	    	{
	    		Prescricao presc = new  Prescricao();
	    			    		
	    		presc.setTipo((r.getString("tipo")));
	    		presc.setMedicamento((r.getString("medicamentos")));
	    		presc.setObs((r.getString("obs")));
	    		presc.setNomepaciente((r.getString("nome")));	    		          	
	    		
	    		v.add(presc);
	    			 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	 		
	    	 	
			}
	    	return v;
	      }
	 
	 public boolean buscarPrescricaoDia(Prescricao presc,Paciente pac)
	 {
		 
		 try
		   { 																		
			ps=DaoFactoryPSQL.getConnection().prepareStatement("select presc.medicamentos,pac.nome,med.nomemed,p.numeroprontuario from (((prescricao presc inner join prontuario p on p.numeroprontuario=presc.numprontuario)inner join paciente pac on pac.matricula=p.matpaciente)inner join consulta c on c.codpaciente=pac.matricula) inner join medico med on med.crm=c.codmedico where c.data=presc.data and c.hora=presc.hora and pac.matricula='"+pac.getMatricula()+"' and presc.hora='"+presc.getHora()+"'and presc.data='"+presc.getData()+"'");
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