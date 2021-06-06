package paciente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dao.DaoFactoryPSQL;

public class DaoPacienteCriancaPSQL implements DaoPacienteCrianca{
	
	PreparedStatement ps=null;
	   ResultSet r=null;
	   
	   public void adicionar(PacienteCrianca pc)
	   {
		   String cnpj=null;
		 try
		 {
			 
			 ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT cnpj FROM convenio WHERE instituicao='"+pc.getOperaConvenio()+"'");
    		 r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		 cnpj=r.getString("cnpj");
	    	}
			   
	    	if(cnpj==null)
	    	{
			ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into paciente (matricula,nome,datanasc,sexo," +
			"endereco,numero,bairro,complemento,cidade,cep,uf,convenio) values " +
			"('"+pc.getMatricula()+"','"+pc.getNome()+"','"+pc.getDataNasc()+"','"+pc.getSexo()+"','"+pc.getEndereco()+
			"','"+pc.getNumero()+"','"+pc.getBairro()+"','"+pc.getComplemento()+"','"+ pc.getCidade()+"','"+ pc.getCep()+"" +
			"','"+pc.getUf()+"','"+pc.getConvenio()+"')");
			ps.executeUpdate();
			
			ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pacientecrianca (nomeresp,datanascresp," +
			"telefoneresp,celularresp,cpfresp,rgresp,matpaciente) values " +
			"('"+pc.getNomeResp()+"','"+pc.getDataNascResp()+"','"+pc.getTelefoneResp()+"','"+pc.getCelularResp()+
			"','"+pc.getCpfResp()+"','"+pc.getRgResp()+"','"+pc.getMatricula()+"')");			
			ps.executeUpdate();
			
	    	}
	    	else
	    	{
	    		ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into paciente (matricula,nome,datanasc,sexo," +
	    				"endereco,numero,bairro,complemento,cidade,cep,uf,convenio,operaconvenio,codconvenio) values " +
	    				"('"+pc.getMatricula()+"','"+pc.getNome()+"','"+pc.getDataNasc()+"','"+pc.getSexo()+"','"+pc.getEndereco()+
	    				"','"+pc.getNumero()+"','"+pc.getBairro()+"','"+pc.getComplemento()+"','"+ pc.getCidade()+"','"+ pc.getCep()+"" +
	    				"','"+pc.getUf()+"','"+pc.getConvenio()+"','"+pc.getOperaConvenio()+"','"+cnpj+"')");
	    				ps.executeUpdate();
	    				
	    				ps=DaoFactoryPSQL.getConnection().prepareStatement("INSERT into pacientecrianca (nomeresp,datanascresp," +
	    				"telefoneresp,celularresp,cpfresp,rgresp,matpaciente) values " +
	    				"('"+pc.getNomeResp()+"','"+pc.getDataNascResp()+"','"+pc.getTelefoneResp()+"','"+pc.getCelularResp()+
	    				"','"+pc.getCpfResp()+"','"+pc.getRgResp()+"','"+pc.getMatricula()+"')");			
	    				ps.executeUpdate();
	    	}
			   
		   }
		   catch (Exception e) 
		   {		 
				
		   }
	   }
	   
	   public void alterar(PacienteCrianca pc)
       {
    	   try
    	   {
    		   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE paciente SET nome='"+pc.getNome()+"',datanasc='"+pc.getDataNasc()+
    		   "',sexo='"+pc.getSexo()+"',endereco='"+pc.getEndereco()+"',numero='"+pc.getNumero()+"',bairro='"+pc.getBairro()+
    		   "',complemento='"+pc.getComplemento()+"',cidade='"+pc.getCidade()+"',cep='"+pc.getCep()+"',uf='"+pc.getUf()+
    		   "',convenio='"+pc.getConvenio()+"',operaconvenio='"+pc.getOperaConvenio()+"'WHERE matricula='"+pc.getMatricula()+"'"); 
    	       ps.executeUpdate();
    	   
    	      ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE pacientecrianca SET cpfresp='"+pc.getCpfResp()+"',nomeresp='"+pc.getNomeResp()+"',rgresp='"+pc.getRgResp()+
	          "',datanascresp='"+pc.getDataNascResp()+"',telefoneresp='"+pc.getTelefoneResp()+"',celularresp='"+pc.getCelularResp()+"'WHERE matpaciente='"+pc.getMatricula()+"'"); 
	          ps.executeUpdate();
    	  
    	   }
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
    		
    	  }
    	   
       }
	       
	   public boolean visualizar (PacienteCrianca pc)
       { try
	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM paciente p,pacientecrianca pc WHERE nome='"+pc.getNome()+"' and cpfresp='"+pc.getCpfResp()+"'");
    		  
    		  r =ps.executeQuery();
    		   
	    	if(r.next())
	    	{
	    		 pc.setNome(r.getString("nome"));
	    	  	 pc.setDataNasc(r.getString("datanasc"));
	    	  	 pc.setSexo(r.getString("sexo")); 
	    	  	 pc.setTelefoneResp(r.getString("telefoneresp"));
	    	  	 pc.setCelularResp(r.getString("celularresp"));
	    	  	 pc.setCpfResp(r.getString("cpfresp"));
	    	  	 pc.setRgResp(r.getString("rgresp"));
	    	  	 pc.setNomeResp(r.getString("nomeresp"));
	    	  	 pc.setDataNascResp(r.getString("datanascresp"));
	    	  	 pc.setEndereco(r.getString("endereco"));
	    	  	 pc.setNumero(r.getString("numero"));
	         	 pc.setBairro(r.getString("bairro"));
	         	 pc.setComplemento(r.getString("complemento"));
	             pc.setCidade(r.getString("cidade"));
	             pc.setCep(r.getString("cep"));
	         	 pc.setUf(r.getString("uf"));
	         	 pc.setConvenio(r.getString("convenio"));
	         	 pc.setMatricula(r.getInt("matricula"));
	         	 pc.setOperaConvenio(r.getString("operaconvenio"));
	    	  	 
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
       
	       
	   public int gerarMatricula(PacienteCrianca pc)
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

	public String validarDados(PacienteCrianca pc)
       {
    	   String cpf = null,rg = null,validacao=null,nome=null,codigo=null;
    	   try
   	   	   {
    		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT pc.cpfresp,p.nome,pc.rgresp FROM pacientecrianca pc,paciente p where pc.cpfresp='"+pc.getCpfResp()+"' or pc.rgresp='"+pc.getRgResp()+"'");
    		  r =ps.executeQuery();
    		  
    		  if (r.next())
        	  {  
        		  cpf=r.getString("cpfresp");
        		  nome=r.getString("nome");
        		  rg=r.getString("rgresp");
        		  
        		  if((pc.getCpfResp().equals(cpf))&&(pc.getNome().equals(nome)))
        		  {
        			  validacao="cpf encontrado";
        		  }
        		  else if((pc.getCpfResp().equals(cpf))&&(pc.getRgResp().equals(rg)))
        		  {
        				  validacao="rg e cpf ok";
        				  try{
        					  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT count(*)as cpfresp FROM pacientecrianca where cpfresp='"+pc.getCpfResp()+"'");
                		      r =ps.executeQuery();
                		      if (r.next())
                    	      {  
                			     codigo=r.getString("cpfresp");
                			     int cod=Integer.parseInt(codigo);
                			     if(cod>=3)
                			     {
                			    	 validacao="maximo ja alcançado";
                			     }
                    	      }
        				  }
        				  catch(Exception e)
        				  {
        					  System.out.println(e.getMessage());
        				  }
        	      }
        		  else
        		  {
        			  validacao="rg não bate com cpf";
        		  }
        		  
        		  
        	  }
		 
    	   }
    	   catch (Exception e) 
    	   {
    		//System.out.println(e.getMessage());
     	   }
		return validacao;
     }
      
	public boolean validarCpf(PacienteCrianca pc)
    {
 	     try
	   	   {
 		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT pc.cpfresp,p.nome,pc.rgresp FROM pacientecrianca pc,paciente p where pc.cpfresp='"+pc.getCpfResp()+"' and pc.rgresp='"+pc.getRgResp()+"'and p.nome='"+pc.getNome()+"'");
 		  r =ps.executeQuery();
 		  
 		  if (r.next())
     	  {  
     		  pc.setRgResp(r.getString("cpfresp"));
     		  pc.setNome(r.getString("nome"));
     		  pc.setRgResp(r.getString("rgresp"));
     		  
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



