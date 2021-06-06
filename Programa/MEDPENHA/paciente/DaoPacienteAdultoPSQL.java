package paciente;

import dao.DaoFactoryPSQL;
import java.sql.*;
import java.util.ArrayList;


public class DaoPacienteAdultoPSQL implements DaoPacienteAdulto {
	  
	PreparedStatement ps=null;
	   ResultSet r=null;
	   
	    public void adicionar(PacienteAdulto pa)
	   {
	    	String cnpj=null;
	    	 try
			 {
				   
	    		 ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT cnpj FROM convenio WHERE instituicao='"+pa.getOperaConvenio()+"'");
	    		 r =ps.executeQuery();
	    		   
		    	if(r.next())
		    	{
		    		 cnpj=r.getString("cnpj");
		    		
		     	}
		    	if(cnpj==null)
		    	{
		    		 ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into paciente (matricula,nome,datanasc,sexo," +
	    						"endereco,numero,bairro,complemento,cidade,cep,uf,convenio) values " +
	    						"('"+pa.getMatricula()+"','"+pa.getNome()+"','"+pa.getDataNasc()+"','"+pa.getSexo()+"','"+pa.getEndereco()+
	    						"','"+pa.getNumero()+"','"+pa.getBairro()+"','"+pa.getComplemento()+"','"+ pa.getCidade()+"','"+ pa.getCep()+
	    						"','"+pa.getUf()+"','"+pa.getConvenio()+"')");
	    						ps.executeUpdate();
	    						
	    						ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pacienteadulto (cpf,rg," +
	    						"estadocivil,telefone,celular,matpaciente) values ('"+pa.getCpf()+"','"+pa.getRg()+
	    						"','"+pa.getEstadocivil()+"','"+pa.getTelefone()+"','"+pa.getCelular()+"','"+pa.getMatricula()+"')");
	    						ps.executeUpdate();
		    	}
		    	else{
		    		 ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into paciente (matricula,nome,datanasc,sexo," +
	    						"endereco,numero,bairro,complemento,cidade,cep,uf,convenio,operaconvenio,codconvenio) values " +
	    						"('"+pa.getMatricula()+"','"+pa.getNome()+"','"+pa.getDataNasc()+"','"+pa.getSexo()+"','"+pa.getEndereco()+
	    						"','"+pa.getNumero()+"','"+pa.getBairro()+"','"+pa.getComplemento()+"','"+ pa.getCidade()+"','"+ pa.getCep()+
	    						"','"+pa.getUf()+"','"+pa.getConvenio()+"','"+pa.getOperaConvenio()+"','"+cnpj+"')");
	    						ps.executeUpdate();
	    						
	    						ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pacienteadulto (cpf,rg," +
	    						"estadocivil,telefone,celular,matpaciente) values ('"+pa.getCpf()+"','"+pa.getRg()+
	    						"','"+pa.getEstadocivil()+"','"+pa.getTelefone()+"','"+pa.getCelular()+"','"+pa.getMatricula()+"')");
	    						ps.executeUpdate();
		    	}
		    			
		    	
		    	
	    		 	
				   
			   }
			   catch (Exception e) 
			   {		 
					  
			   }
	   }
	   
	      
	       public void alterar(PacienteAdulto pa)
	       {
	    	   try
	    	   {
	    		   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE paciente SET nome='"+pa.getNome()+"',datanasc='"+pa.getDataNasc()+
	    		   "',sexo='"+pa.getSexo()+"',endereco='"+pa.getEndereco()+"',numero='"+pa.getNumero()+"',bairro='"+pa.getBairro()+
	    		   "',complemento='"+pa.getComplemento()+"',cidade='"+pa.getCidade()+"',cep='"+pa.getCep()+"',uf='"+pa.getUf()+
	    		   "',convenio='"+pa.getConvenio()+"',operaconvenio='"+pa.getOperaConvenio()+"'WHERE matricula='"+pa.getMatricula()+"'"); 
	    	       ps.executeUpdate();
	    	   
	    	      ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE pacienteadulto SET cpf='"+pa.getCpf()+"',rg='"+pa.getRg()+
		          "',estadocivil='"+pa.getEstadocivil()+"',telefone='"+pa.getTelefone()+"',celular='"+pa.getCelular()+"'WHERE matpaciente='"+pa.getMatricula()+"'"); 
		          ps.executeUpdate();
	    	  
	    	   }
	    	   catch (Exception e) 
	    	   {
	    		//System.out.println(e.getMessage());
	    		
	    	  }
	    	   
	       }
	       
	       public boolean visualizar (PacienteAdulto pa)
	       { try
   	   	   {
	    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM paciente p,pacienteadulto pa WHERE p.nome='"+pa.getNome()+"' and pa.cpf='"+pa.getCpf()+"'");
	    		  
	    		  r =ps.executeQuery();
	    		   
		    	if(r.next())
		    	{
		    		 pa.setNome(r.getString("nome"));
		    	  	 pa.setDataNasc(r.getString("datanasc"));
		    	  	 pa.setSexo(r.getString("sexo")); 
		    	  	 pa.setTelefone(r.getString("telefone"));
		    	  	 pa.setCelular(r.getString("celular"));
		    	  	 pa.setCpf(r.getString("cpf"));
		    	  	 pa.setRg(r.getString("rg"));
		    	  	 pa.setEstadocivil(r.getString("estadocivil"));
		    	  	 pa.setEndereco(r.getString("endereco"));
		    	  	 pa.setNumero(r.getString("numero"));
		         	 pa.setBairro(r.getString("bairro"));
		         	 pa.setComplemento(r.getString("complemento"));
		             pa.setCidade(r.getString("cidade"));
		             pa.setCep(r.getString("cep"));
		         	 pa.setUf(r.getString("uf"));
		         	 pa.setConvenio(r.getString("convenio"));
		         	 pa.setMatricula(r.getInt("matricula"));
		         	 pa.setOperaConvenio(r.getString("operaconvenio"));
		    	  	 
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
	       
	       public int gerarMatricula(PacienteAdulto pa)
	       {
	    	   int mat=0;
	    	   try 
	       	   {
	        	  ps=DaoFactoryPSQL.getConnection().prepareStatement("select count(*) as matricula from paciente");
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
	    		//System.out.println(e.getMessage());
	    		
	    	   }
			return mat;
		   	 
			
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
	    	   		//System.out.println(e.getMessage());
	       		}
	    	   	return convenios;
	       }	
	        
	       public boolean verificarCpf(PacienteAdulto pa)
	       {
	    	   try
       	   	   {
        		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT cpf FROM pacienteadulto where cpf='"+pa.getCpf()+"'");
        		  r =ps.executeQuery();
        		  
        		  if (r.next())
            	  {  
            		  pa.setCpf(r.getString("cpf"));
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
	       
	       public boolean verificarRg(PacienteAdulto pa)
	       {
	    	 
	    	   try
       	   	   {
        		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT rg FROM pacienteadulto where rg='"+pa.getRg()+"'");
        		  r =ps.executeQuery();
        		  
        		  if (r.next())
            	  {  
            		  pa.setRg(r.getString("rg"));
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
	       
	       
	   public void finalize()
	   {
	     try
	     {
	       ps.close();
	     }
	     catch(Exception e )
	     {
	   	  //System.out.println("" +e);
	     }
	   
	   
	}


	


	
	
}
