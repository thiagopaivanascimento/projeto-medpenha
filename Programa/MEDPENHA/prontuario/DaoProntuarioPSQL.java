package prontuario;

import java.awt.Image;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import consulta.Consulta;

import medico.Medico;
import paciente.Paciente;
import paciente.PacienteAdulto;
import dao.DaoFactoryPSQL;


public class DaoProntuarioPSQL implements DaoProntuario
{
	   PreparedStatement ps=null;
	   PreparedStatement pscodigo=null;
	   ResultSet r=null;
	   String codigo="";
	   
	  	  	      	
	  //vai para o paciente
	   public void gerarProntuario(Prontuario p,Paciente pac)
       {
    	   
    	   try 
       	   {
        	  ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into prontuario(datainicial,matpaciente) values ('"+p.getDataInicial()+"','"+pac.getMatricula()+"')");
		
        	  ps.executeUpdate();
         	  
       	   }
    	   catch (Exception e) 
    	   {
    		
    		
    	   }
		
	  } 
	   
	     
	   public boolean buscarProntuario(Paciente pac)
	   {
		   try{
	    		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select nome,datanasc,sexo,numeroprontuario,datainicial from (paciente pac inner join prontuario p on pac.matricula = p.matpaciente) where pac.matricula='"+pac.getMatricula()+"'");
	    		r=ps.executeQuery();
	    		
	    	if(r.next())
	    	{
	    		Prontuario pront = new Prontuario();
	    		
	    		 pac.setNome(r.getString("nome"));
	    		 pac.setDataNasc(r.getString("datanasc"));
	    		 pac.setSexo(r.getString("sexo"));
	    		 pront.setNumProntuario(r.getInt("numeroprontuario"));
	    		 pront.setDataInicial(r.getString("datainicial"));
	    		 	    		          	
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
	   
	   public boolean consultarMedico (Medico m)
       {
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT nomemed,especialidade FROM medico WHERE crm='"+m.getCrm()+"'");
    		  
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		 m.setNome(r.getString("nomemed"));
	    	  	 m.setEspecialidade(r.getString("especialidade"));
	         		         	 
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
	   
	  
	
	public boolean consultarPacienteCarteirinha(Prontuario p)
    { 
    	try{
    		
    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select nome,matricula,nomeresp,datanasc,instituicao from (paciente p left outer join pacientecrianca pc on pc.matpaciente=p.matricula)left outer join convenio c on c.cnpj = p.codconvenio where p.matricula='"+ p.getMatricula()+"'");
    		r=ps.executeQuery();
    		
    	if(r.next())
    	{
    		 p.setMatricula(r.getString("matricula"));
    		 p.setNomePac((r.getString("nome")));
    		 p.setTitular((r.getString("nomeresp")));
    		 p.setNasc((r.getString("datanasc")));
    		 p.setConvenio((r.getString("instituicao")));
    		          	
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
	
	public Vector preecherRelatorioCarteirinha(Prontuario pront)
    { 
		Vector v= new Vector(); 
    	
    	try{ 
    		   		
    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select nome,matricula,nomeresp,datanasc,instituicao from (paciente p left outer join pacientecrianca pc on pc.matpaciente=p.matricula)left outer join convenio c on c.cnpj = p.codconvenio where p.matricula='"+ pront.getMatricula()+"'");
    				
    		r=ps.executeQuery();
    		
    	if(r.next())
    	{
    		Prontuario p = new Prontuario();
    		 p.setMatricula(r.getString("matricula"));
    		 p.setNomePac((r.getString("nome")));
    		 p.setTitular((r.getString("nomeresp")));
    		 p.setNasc((r.getString("datanasc")));
    		 p.setConvenio((r.getString("instituicao")));
    		          	
    		v.add(p);
    	
	 		
    	 }
    	}
    	catch(Exception e)
		{
    	 		
    	 	
		}
    	return v;
      }
	
	
	public boolean buscaProntuario(Prontuario p,Paciente pac,Medico med,Consulta cons)
	{
			try{
				
    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select numeroprontuario,datainicial,pac.nome,matricula,pac.datanasc,pac.sexo,med.especialidade,med.nomemed,med.crm,c.data,c.hora from (((prontuario p inner join paciente pac on p.matpaciente=pac.matricula) INNER JOIN consulta c ON pac.matricula = c.codpaciente) INNER JOIN medico med ON c.codmedico = med.crm) where pac.matricula='"+pac.getMatricula()+"' and med.nomemed='"+med.getNome()+"' and c.hora='"+cons.getHora()+"' and c.data='"+cons.getData()+"' and med.especialidade='"+med.getEspecialidade()+"'");
    		r=ps.executeQuery();
    		
    	if(r.next())
    	{
    		
    		 pac.setMatricula(r.getInt("matricula"));
    		 pac.setNome((r.getString("nome")));
    		 pac.setDataNasc((r.getString("datanasc")));
    		 pac.setSexo((r.getString("sexo")));
    		 p.setNumProntuario((r.getInt("numeroprontuario")));
    		 p.setDataInicial((r.getString("datainicial")));
    		 med.setNome((r.getString("nomemed")));
    		 med.setEspecialidade((r.getString("especialidade")));
    		 med.setCrm((r.getString("crm")));
    		 cons.setData((r.getString("data")));
    		 cons.setHora((r.getString("hora")));
    		 
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
	
	
	public int gerarMatriculaProntuario()
    {
 	   int mat=0;
 	   try 
    	   {
     	  ps=DaoFactoryPSQL.getConnection().prepareStatement("select count(*)-1 as matricula from paciente");
     	  r =ps.executeQuery();
    		
     	  if (r.next())
     	  {    		
     		 r.getInt("matricula");
     		 mat=(r.getInt("matricula"));
     		 mat=mat+1;
     		 	        		   		
     	  }	
     	  
    	   }
 	   catch (Exception e) 
 	   {
 		
 		
 	   }
		return mat;
	   	 
		
 	} 
	
	
	public void gerarProntuario(Prontuario pront, PacienteAdulto pacadult)
  	{
  	  try
	   {
  		ps=DaoFactoryPSQL.getConnection().prepareStatement(("INSERT into prontuario" +
				   "(datainicial,matpaciente)" +
				   " values ('"+pront.getDataInicial()+"','"+pacadult.getMatricula()+"'"));
		
  		ps.executeUpdate();
	   }
  	  catch(Exception ex)
  	  {
  		  
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