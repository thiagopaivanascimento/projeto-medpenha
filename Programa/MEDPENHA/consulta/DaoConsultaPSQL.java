package consulta;

import dao.DaoFactory;
import dao.DaoFactoryPSQL;
import java.sql.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import medico.*;
import paciente.*;
import pagamento.Pagamento;
import prontuario.DaoProntuario;
import prontuario.TelaProntuario;
import tipoconsulta.*;

public class DaoConsultaPSQL implements DaoConsulta{
	
	PreparedStatement ps=null;
	ResultSet r=null;
  	   
	   public ArrayList buscarMedicos(Medico m)
       {  
    	   ArrayList<String> medicos = new ArrayList<String>();
    	   try
   			{
       			ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT nomemed FROM medico order by nomemed");
       			r =ps.executeQuery();
       		   		  		
       			while(r.next())
       			{
       				medicos.add(r.getString("nomemed"));
       			}
         	}
    	   	catch (Exception e)
    	   	{
    	   		//System.out.println(e.getMessage());
       		}
    	   	return medicos;
       }
	   public ArrayList bucarTipoconsulta(TipoConsulta tp)
	   {
		   ArrayList<String> tipos = new ArrayList<String>();
    	   try
   			{
       			ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT tipo FROM tipoconsulta");
       			r =ps.executeQuery();
       		   		  		
       			while(r.next())
       			{
       				tipos.add(r.getString("tipo"));
       			}
         	}
    	   	catch (Exception e)
    	   	{
    	   		//System.out.println(e.getMessage());
       		}
    	   	return tipos;
		}
	   
	   public boolean bucarEspecialidade(Medico m)
       {
    	   String esp=null;
    	   try 
       	   {
        	  ps=DaoFactoryPSQL.getConnection().prepareStatement("select especialidade from medico where nomemed='"+m.getNome()+"'");
        	  r =ps.executeQuery();
        	 
        	  if (r.next())
        	  {    		
        		m.setEspecialidade(r.getString("especialidade"));
        		return true;
        	   }
        	  else{
        		  return false;
        	  }
        	  
       	   }
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    		 return false;
    	   }
		  }
	   
	   public boolean bucarValor(TipoConsulta tp) 
	   {
		   try 
       	   {
        	  ps=DaoFactoryPSQL.getConnection().prepareStatement("select valor from tipoconsulta where tipo='"+tp.getTipo()+"'");
        	  r =ps.executeQuery();
        	 
        	  if (r.next())
        	  {    		
        		 tp.setValor(r.getDouble("valor"));
        		 return true;
        	   }
        	  else
        	  {
        		  return false;
        	  }
        	  
       	   }
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    		return false;
    		
    	   }
	   }
	   
	   
	   public boolean buscarPaciente(Paciente p) {
			 try
	 	   	   {
				 ps =DaoFactoryPSQL.getConnection().prepareStatement("select matricula,nome from paciente" +
						 " where matricula='"+p.getMatricula()+"'");
				 r =ps.executeQuery();
				
	  		   if (r.next())
	      	   {  
	  			   p.setMatricula(r.getInt("matricula"));
	  			   p.setNome(r.getString("nome"));
	  			 
	      		   return true;
	      	   }
	  		   else
	  		    {
	  			    return false;
	  		    }
	 	     }
	  	     catch (Exception e) 
	  	     {
	  		   //System.out.println(e.getMessage());
	   		   return false;
	    	  }
		}
	
	   public void adicionar(Consulta c,Medico m,Paciente p,TipoConsulta tp)
	   {
		   String crm = null;
		   int mat = 0;
		   int tip = 0;
		   try
		   {
			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT medico.crm from medico " +
			"where medico.nomemed='"+m.getNome()+"' and medico.especialidade='"+m.getEspecialidade()+"'");
			r = ps.executeQuery();
					 
			if (r.next())
			{  
				 crm=r.getString("crm");
			}
			
			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT tipoconsulta.codtipoconsulta from tipoconsulta" +
			" where tipoconsulta.tipo='"+tp.getTipo()+"' and tipoconsulta.valor='"+tp.getValor()+"'");
					r = ps.executeQuery();
							 
					if (r.next())
					{  
						 tip=r.getInt("codtipoconsulta");
					}
					
			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT paciente.matricula from paciente" +
			" where paciente.matricula='"+p.getMatricula()+"'");
					r = ps.executeQuery();
											 
			       if (r.next())
				   {  
						mat=r.getInt("matricula");
					}
					
			 ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into consulta" +
			 "(hora,data,status,situacao,pendencia,codmedico,codpaciente,codtipoconsulta)" +
			 " values ('"+c.getHora()+"','"+c.getData()+"','"+c.getStatus()+"','"+c.getSituacao()+"','"+c.getPendencias()+"','"+crm+"','"+mat+"','"+tip+"')");
						   			   
					 ps.executeUpdate();
		   }
		catch(Exception ex)
		{
			//System.out.println(ex);
		}
			
		}
	   
	   public void cancelar(Consulta c,Medico m,Paciente p,TipoConsulta tp)
       {
    	 	   String crm = null;
    		   int mat = 0;
    		   int tip = 0;
    		   try
    		   {
    			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT medico.crm from medico " +
    			"where medico.nomemed='"+m.getNome()+"' and medico.especialidade='"+m.getEspecialidade()+"'");
    			r = ps.executeQuery();
    					 
    			if (r.next())
    			{  
    				 crm=r.getString("crm");
    			}
    			
    			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT tipoconsulta.codtipoconsulta from tipoconsulta" +
    			" where tipoconsulta.tipo='"+tp.getTipo()+"' and tipoconsulta.valor='"+tp.getValor()+"'");
    					r = ps.executeQuery();
    							 
    			if (r.next())
    			{  
    				 tip=r.getInt("codtipoconsulta");
    			}
    					
    			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT paciente.matricula from paciente" +
    			" where paciente.matricula='"+p.getMatricula()+"'");
    					r = ps.executeQuery();
    											 
    			if (r.next())
    			{  
    				mat=r.getInt("matricula");
    			}
    		   
    		      ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta SET situacao='Cancelada' WHERE" +
    		      		" codmedico='"+crm+"' and codpaciente='"+mat+"' and codtipoconsulta='"+tip+"' and hora='"+c.getHora()+"'" +
    		      		"and data='"+c.getData()+"'"); 
    	           ps.executeUpdate();
    	   
    	   }
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    	  }
    	   
       }
	   
	   public void cancelar(Consulta cons,Medico m,Paciente p)
       {
    	 	   String crm = null;
    		   int mat = 0;
    		   try
    		   {

    			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT crm from medico where nomemed='"+cons.getNomeMedico()+"' and especialidade='"+cons.getEspecialidade()+"'");
    			r = ps.executeQuery();			 
    			if (r.next())
    			{  
    				 crm=r.getString("crm");


    	      ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT matricula from paciente where nome='"+cons.getNome()+"'");
    	      r = ps.executeQuery();			 
    	      if (r.next())
    	      {  
    	    		mat=r.getInt("matricula");
		
  			
    		   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta SET situacao='Cancelada' WHERE" +
    		   	" codmedico='"+crm+"' and codpaciente='"+mat+"' and hora='"+cons.getHora()+"'" +
    		    "and data='"+cons.getData()+"'"); 
    	         ps.executeUpdate();
    	   
    	   }}}
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    	  }
    	   
       }
	   
	   
	   public void confirmar(Consulta cons,Medico m,Paciente p)
       {
    	 	   String crm = null;
    		   int mat = 0;
    		   try
    		   {

    			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT crm from medico where nomemed='"+cons.getNomeMedico()+"' and especialidade='"+cons.getEspecialidade()+"'");
    			r = ps.executeQuery();			 
    			if (r.next())
    			{  
    				 crm=r.getString("crm");


    	      ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT matricula from paciente where nome='"+cons.getNome()+"'");
    	      r = ps.executeQuery();			 
    	      if (r.next())
    	      {  
    	    		mat=r.getInt("matricula");
		
  			
    		   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE consulta SET situacao='Confirmada' WHERE" +
    		   	" codmedico='"+crm+"' and codpaciente='"+mat+"' and hora='"+cons.getHora()+"'" +
    		    "and data='"+cons.getData()+"'"); 
    	         ps.executeUpdate();
    	   
    	   }}}
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    	  }
    	   
       }
	   
	   public void alterar(Consulta c, Medico m, Paciente p, TipoConsulta tp)
	   {
		   String crm = null;
		   int mat = 0;
		   int tip = 0;
		   try
		   {
			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT medico.crm from medico " +
			"where medico.nomemed='"+m.getNome()+"' and medico.especialidade='"+m.getEspecialidade()+"'");
			r = ps.executeQuery();
					 
			if (r.next())
			{  
				 crm=r.getString("crm");
			}
			
			ps=DaoFactoryPSQL.getConnection().prepareStatement("SELECT tipoconsulta.codtipoconsulta from tipoconsulta" +
			" where tipoconsulta.tipo='"+tp.getTipo()+"' and tipoconsulta.valor='"+tp.getValor()+"'");
					r = ps.executeQuery();
							 
					if (r.next())
					{  
						 tip=r.getInt("codtipoconsulta");
					}
					
			 ps=DaoFactoryPSQL.getConnection().prepareStatement("Update consulta set hora='"+c.getHora()+
			 "',data='"+c.getData()+"',status='"+c.getStatus()+"',situacao='"+c.getSituacao()+"',pendencia='"+c.getPendencias()+
			 "',codmedico='"+crm+"',codtipoconsulta='"+tip+"' where codpaciente='"+p.getMatricula()+"'");
					 ps.executeUpdate();

		   }
		catch(Exception ex)
		{
			//System.out.println(ex);
		}
			
		}
	   
	   public int BuscarConsulta(Consulta c,Paciente p) 

       {int codigo=0;
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("select " +
    		  "consulta.codconsulta from " +
    		  "(consulta inner join medico on medico.crm = consulta.codmedico)" +
    		  " inner join paciente on paciente.matricula = consulta.codpaciente " +
    		  " inner join tipoconsulta on tipoconsulta.codtipoconsulta = consulta.codtipoconsulta " +
    		  "where consulta.codpaciente='"+p.getMatricula()+"' and consulta.data='"+c.getData()+"' and consulta.hora='"+c.getHora()+"'");
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		codigo=r.getInt("codconsulta");		         		         	 
	    				    		
	    	}
	    			    	
	}
    	   catch(Exception e)
	{
	 	//System.out.println("erro:" + e);
	 		}

	return codigo;
		
	   }
	   
	   
	   public Vector ListarTodasConsultas(Consulta con) {
		   Vector v= new Vector(); 
		   try
		     { 	   ps=DaoFactoryPSQL.getConnection().prepareStatement("select consulta.data,consulta.hora,paciente.nome,paciente.matricula,consulta.situacao,consulta.status,tp.tipo,med.nomemed,med.especialidade from (((consulta inner join paciente on paciente.matricula = consulta.codpaciente) inner join medico med on med.crm = consulta.codmedico) inner join tipoconsulta tp on tp.codtipoconsulta = consulta.codtipoconsulta)where consulta.data='"+con.getData()+"' order by consulta.hora"); 
	    	 	r = ps.executeQuery();
		    	
	    	 	while(r.next())
	    	 	{
	    	 		Consulta c = new Consulta();	
	    	 		c.setData((r.getString("data")));
	    	 		c.setHora((r.getString("hora")));   		
	    	 		c.setNome((r.getString("nome")));
	    	 		c.setMatricula((r.getInt("matricula")));
	    	 	    c.setSituacao((r.getString("situacao")));
	    	 	    c.setStatus((r.getString("status")));
	    	 	    c.setNomeMedio((r.getString("nomemed")));
	    	 	    c.setTipo((r.getString("tipo")));
	    	 	    c.setEspecialidade(r.getString("especialidade"));
	    	 		
	    	 		v.add(c);  
		    	 		//v.addElement(p);
			
		    	 	}	     		
		    		     		 
		 	    }
		     	 catch (Exception e)
		 		   {
		     		
		     		}
		 		  return v;
		 		  
		}
	   
	   
	   public Vector ConsultarTodasConsultas(Medico m,Paciente p,Consulta con)
	   { 
	    	Vector v= new Vector(); 
	    	String crm=null;
	    	//alterando formato
	      	String dataatual;		      	
	       	dataatual=con.getData();
	       
	     try
	     { 	   
	    	 ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM medico WHERE crm='"+m.getCrm()+"'");
	     		r =ps.executeQuery();
	     		   
	  	        if(r.next())
	  	    	{    
	  	    	  m.setNome(r.getString("nomemed"));
	  	    	  m.setEspecialidade(r.getString("especialidade"));
	  	    	  crm=(r.getString("crm"));	    	
	 	 	  	    	
	    	 	ps=DaoFactoryPSQL.getConnection().prepareStatement("select consulta.data,consulta.hora,paciente.nome,paciente.matricula" +
	    	 	" from (consulta inner join paciente on paciente.matricula = consulta.codpaciente)inner join medico on medico.crm = consulta.codmedico " +
	    	 	"where consulta.status='Pago' and consulta.data='"+dataatual+"'and medico.crm='"+crm+"' order by consulta.hora"); 
	    	 	 
	  	    	}
	    	 	r = ps.executeQuery();
	    	
	    	 	while(r.next())
	    	 	{
	    	 		
	    	 		Consulta c = new Consulta();
	    	 		//Paciente pac=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
	     		
	    	 		c.setData((r.getString("data")));
	    	 		c.setHora((r.getString("hora")));   		
	     		
	    	 		c.setNome((r.getString("nome")));
	    	 		c.setMatricula((r.getInt("matricula")));
	    	 	
	    	 		v.addElement(c);  
	    	 		//v.addElement(p);
		
	    	 	}	     		
	    		     		 
	 	    }
	     	 catch (Exception e)
	 		   {
	     		
	     		}
	 		  return v;
	 	  }
	   
	
	   public boolean visualizar(Consulta consulta,Paciente p,Medico m,TipoConsulta tp) {
	       {
	    	   try
	   	   	   {
	    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("select " +
	    		  "medico.nomemed,medico.especialidade,consulta.hora,consulta.situacao,consulta.status," +
	    		  "consulta.pendencia,consulta.data,tipoconsulta.tipo,tipoconsulta.valor from " +
	    		  "(consulta inner join medico on medico.crm = consulta.codmedico)" +
	    		  " inner join paciente on paciente.matricula = consulta.codpaciente " +
	    		  " inner join tipoconsulta on tipoconsulta.codtipoconsulta = consulta.codtipoconsulta " +
	    		  "where consulta.codpaciente='"+p.getMatricula()+"' and consulta.data='"+consulta.getData()+"' and consulta.hora='"+consulta.getHora()+"'");
	    		  r =ps.executeQuery();
	    		   
		    	if(r.next())
		    	{
		    		consulta.setData(r.getString("data"));
		    		consulta.setHora(r.getString("hora"));
		    		consulta.setSituacao(r.getString("situacao"));
		    		consulta.setStatus(r.getString("status"));
		    		consulta.setPendencias(r.getString("pendencia"));
		       	  	 m.setNome(r.getString("nomemed"));
		    	  	 m.setEspecialidade(r.getString("especialidade"));
		    	  	 tp.setTipo(r.getString("tipo"));
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
		 	System.out.println("erro:" + e);
		 	return false;
		}
	       }
			
		   }
	   
	   public void altetar(Consulta c, Medico m, Paciente p, TipoConsulta tp) {
			
			
		}
		
	   
	   public boolean ValidadispPac(Consulta c,Paciente p) 
	   {
		   int cod=0;
		   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("select codpaciente from " +
    			"consulta where hora='"+c.getHora()+"' and data='"+c.getData()+"' and codpaciente='"+p.getMatricula()+"'");
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		cod=(r.getInt("codpaciente"));
	    		return true;
	    	}
	    	else
	    	{
		   		return false;
	    	}
	    	
	}
    	   catch(Exception e)
	{
	 	//System.out.println("erro:" + e);
	 	return false;
	}
	   }
    	   
    	   public boolean ValidadispMed(Consulta c,Medico m) 
    	   {
    		  
    		   try
       	   	   {
        		  ps =DaoFactoryPSQL.getConnection().prepareStatement("select medico.crm,consulta.hora,consulta.data,consulta.situacao from"+
        		  "(consulta inner join medico on medico.crm=consulta.codmedico)"+
        		  "where nomemed='"+m.getNome()+"' and especialidade='"+m.getEspecialidade()+"'"+
    			  "and consulta.hora='"+c.getHora()+"' and consulta.data='"+c.getData()+"'");
        		  r =ps.executeQuery();
        		   
    	    	if(r.next())
    	    	{
    	    		c.setData(r.getString("data"));
    	    		c.setHora(r.getString("hora"));
    	    		c.setSituacao(r.getString("situacao"));
    	    		m.setCrm(r.getString("crm"));
    	    	
    	    		//if(r.getString("situacao").equals("Cancelada"))
    	    		//{
    	    		//	return true;
    	    		//}
    	    		//else
    	    		//{
    	    		//	return false;
    	    		//}
    	    		return true;
    	    	}
    	    	else
    	    	{
    		   		return false;
    	    	}
    	    	    	    	
    	}
        	   catch(Exception e)
    	{
    	 	//System.out.println("erro:" + e);
    	 	return false;
    	}
    	   }
     public boolean buscarMedico(Medico m) 
     {
    	  try{
        	
    	   ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM medico WHERE crm='"+m.getCrm()+"'");
    		r =ps.executeQuery();
    		   
 	        if(r.next())
 	    	{    
 	    	 	  m.setCrm(r.getString("crm"));	 
  	    	return true;
  	    	}
 	        else{return false;}
  	       
       }catch(Exception e)
       {
    	   return false;
       }
	
	      
		}
     
     public Vector preencherRelaConsultaCancelada(Consulta cons)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select cons.data,cons.hora,pac.nome,med.nomemed,med.especialidade from (consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on cons.codmedico=med.crm where cons.situacao='Cancelada' and cons.data='"+cons.getData()+"'");
	    				
	    		r=ps.executeQuery();
	    		
	    	while(r.next())
	    	{
	    			    		 
	    		cons.setData((r.getString("data")));
	    		cons.setHora((r.getString("hora")));
	    		cons.setNome((r.getString("nome")));
	    		cons.setNomeMedio((r.getString("nomemed")));
	    		cons.setEspecialidade((r.getString("especialidade")));
	    			    		 	    		          	
	    		v.add(cons);
	    				 		
	    	 }
	    	}
	    	catch(Exception e)
			{
	    	 // System.out.println("ERRo no banco"+e.getMessage());		
	    	 	
			}
	    	return v;
	      }
     
     public boolean buscaDataConsultaCancelada(Consulta cons)
	    { 
			Vector v= new Vector(); 
	    	
	    	try{ 
	    		   		
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("select cons.data from (consulta cons inner join paciente pac on cons.codpaciente=pac.matricula)inner join medico med on cons.codmedico=med.crm where cons.situacao='Cancelada' and cons.data='"+cons.getData()+"'");
	    				
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
	    	//  System.out.println("ERRo no banco"+e.getMessage());
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
		   	//  System.out.println("" +e);
		     }
	   }

		
	}