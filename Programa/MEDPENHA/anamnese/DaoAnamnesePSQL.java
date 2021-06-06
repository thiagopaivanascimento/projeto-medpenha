package anamnese;

import dao.DaoFactoryPSQL;
import java.sql.*;

public class DaoAnamnesePSQL implements DaoAnamnese
{
	PreparedStatement ps=null;
	ResultSet r=null;
	
	
	public void alterar(Anamnese a)
	{
		try
 	   {
 	   ps=DaoFactoryPSQL.getConnection().prepareStatement("UPDATE anamnese SET nome='"+a.getNome()+"',data='"+a.getData()+
 			   "',profissao='"+a.getProfissao()+"',sexo='"+a.getSexo()+"',raca='"+a.getRaca()+"',religiao='"+a.getReligiao()+
 			   "',datanasc='"+a.getDataNasc()+"',pratesporte='"+a.getPratEsporte()+"',doencas='"+a.getDoencas()+
 			   "',medicamentos='"+a.getMedicamentos()+"',doencafamilia='"+a.getDoencaFamilia()+"',alergia='"+a.getAlergia()+
 			   "',etilista='"+a.getEtilista()+"',qtdetilismo='"+a.getQtdEtilismo()+"',tabagista='"+a.getTabagista()+
 			   "',qtdcigarros='"+a.getQtdCigarros()+"',peso='"+a.getPeso()+"',altura='"+a.getAltura()+"',imc='"+a.getImc()+
 			   "',tiposanguineo='"+a.getTipoSanguineo()+"',pressao='"+a.getPressao()+"',freqcardiaca='"+a.getfreqCardiaca()+
 			   "' WHERE matricula='"+a.getMatricula()+"'");
 	  
 	   ps.executeUpdate();
 	   
 	   }
 	   catch (Exception e) 
 	   {
 		//System.out.println(e.getMessage());
 	   }
		
	}
	public boolean visualizar(Anamnese a)
	{
		try
	   	   {
 		  ps =DaoFactoryPSQL.getConnection().prepareStatement("SELECT * FROM anamnese WHERE matricula='"+a.getMatricula()+"'");
 		  
 		  r =ps.executeQuery();
 		   
	    	if(r.next())
	    	{
	    		 a.setNome(r.getString("nome"));
	    		 a.setMatricula(r.getInt("matricula"));
	    		 a.setData(r.getString("data"));
	    		 a.setProfissao(r.getString("profissao"));
	    		 a.setSexo(r.getString("sexo"));
	    		 a.setRaca(r.getString("raca"));
	    		 a.setReligiao(r.getString("religiao"));
	    		 a.setDataNasc(r.getString("datanasc"));
	    		 a.setPratEsporte(r.getString("pratesporte"));
	    		 a.setDoencas(r.getString("doencas"));
	    		 a.setMedicamentos(r.getString("medicamentos"));
	    		 a.setDoencaFamilia(r.getString("doencafamilia"));
	    		 a.setAlergia(r.getString("alergia"));
	    		 a.setEtilista(r.getString("etilista"));
	    		 a.setQtdEtilismo(r.getString("qtdetilismo"));
	    		 a.setTabagista(r.getString("tabagista"));
	    		 a.setQtdCigarros(r.getInt("qtdcigarros"));
	    		 a.setPeso(r.getDouble("peso"));
	    		 a.setAltura(r.getDouble("altura"));
	    		 a.setImc(r.getDouble("imc"));
	    		 a.setTipoSanguineo(r.getString("tiposanguineo"));
	    		 a.setPressao(r.getString("pressao"));
	    		 a.setfreqCardiaca(r.getInt("freqcardiaca"));
	    		       		         	 
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
	
		public void adicionar(Anamnese a) {
		 try
		   {		   
			   ps=DaoFactoryPSQL.getConnection().prepareStatement("insert into anamnese" +
			   	"(nome,matricula,data,profissao,sexo,raca,religiao,datanasc,pratesporte,doencas,medicamentos,doencafamilia," +
			   	"alergia,etilista,qtdetilismo,tabagista,qtdcigarros,peso,altura,imc,tiposanguineo,pressao,freqcardiaca)"+
				" values ('"+a.getNome()+"','"+a.getMatricula()+"','"+a.getData()+"','"+a.getProfissao()+
				"','"+a.getSexo()+"','"+a.getRaca()+"','"+a.getReligiao()+"','"+a.getDataNasc()+"','"+a.getPratEsporte()+
				"','"+a.getDoencas()+"','"+a.getMedicamentos()+"','"+a.getDoencaFamilia()+"','"+a.getAlergia()+"','"+a.getEtilista()+
				"','"+a.getQtdEtilismo()+"','"+a.getTabagista()+"','"+a.getQtdCigarros()+"','"+a.getPeso()+"','"+a.getAltura()+
				"','"+a.getImc()+"','"+a.getTipoSanguineo()+"','"+a.getPressao()+"','"+a.getfreqCardiaca()+"')" );
			            
	           ps.executeUpdate();
			   
		   }
		   catch (Exception e) 
		   {		
			 //  System.out.println(e.getMessage());
		   }
		
	}
	public boolean buscarPaciente(Anamnese a) {
		 try
 	   	   {
			 ps =DaoFactoryPSQL.getConnection().prepareStatement("select matricula,nome,datanasc,sexo from paciente" +
					 " where matricula='"+a.getMatricula()+"'");
			 r =ps.executeQuery();
			
  		   if (r.next())
      	   {  
  			   a.setMatricula(r.getInt("matricula"));
  			   a.setNome(r.getString("nome"));
  			   a.setDataNasc(r.getString("datanasc"));
  			   a.setSexo(r.getString("sexo"));
  			
      		   return true;
      	   }
  		   else
  		    {
  			    return false;
  		    }
 	     }
  	     catch (Exception e) 
  	     {
  		 //  System.out.println(e.getMessage());
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
	   //	  System.out.println("" +e);
	     }
	   
	   
	}

}
