package dao;

import usuario.*;
import medico.*;
import convenio.*;
import paciente.*;
import prontuario.*;
import anamnese.*;
import consulta.*;
import pagamento.*;
import tipoconsulta.*;
import java.sql.*;

public class DaoFactoryPSQL extends DaoFactory
{
    public static final String URL="jdbc:postgresql:MEDPENHA";
    public static final String usuario="postgres";
    public static final String senha="post";
    public static final String Driver="org.postgresql.Driver";
    
    public static Connection getConnection()
    {
    	try
    	{
    		Class.forName(Driver);
    		return DriverManager.getConnection(URL,usuario, senha);
    	}
    	catch (Exception e) 
    	{
			System.out.println(e.getMessage());
			return null;
		}
    }
    public DaoUsuario getDaoUsuario()
    {
    	return new DaoUsuarioPSQL();
    }
    public DaoConvenio getDaoConvenio()
    {
    	return new DaoConvenioPSQL();
    }
    public DaoMedico getDaoMedico()
    {
    	return new DaoMedicoPSQL();
    }
	public DaoPacienteAdulto getDaoPacienteAdulto() 
	{
    	return new DaoPacienteAdultoPSQL();
    }	
	public DaoPacienteCrianca getDaoPacienteCrianca() 
	{
    	return new DaoPacienteCriancaPSQL();
    }	
	public DaoAnamnese getDaoAnamnese() 
	{
    	return new DaoAnamnesePSQL();
    }
	public DaoConsulta getDaoConsulta() 
	{
    	return new DaoConsultaPSQL();
    }
	public DaoAtestado getDaoAtestado()
	{
		return new DaoAtestadoPSQL();
	}
	public DaoDiagnostico getDaoDiagnostico()
	{
		return new DaoDiagnosticoPSQL();
	}
	public DaoExame getDaoExame() 
	{
		return new DaoExamePSQL();
	}
	public DaoLaudoPericial getDaoLaudoPericial()
   {
		return new DaoLaudoPericialPSQL();
	}
	public DaoPrescricao getDaoPrescricao()
	{
		return  new DaoPrescricaoPSQL();
	}
	public DaoProntuario getDaoProntuario()
	{
		return new DaoProntuarioPSQL();
	}
	public DaoPagamento getDaoPagamento()
	{
		return new DaoPagamentoPSQL();
	}
	public DaoPreco getDaoPreco()
	{
		return new DaoPrecoPSQL();
	}
	
	public DaoPagamentoConvenio getDaoPagamentoConvenio()
	{
		return new DaoPagamentoConvenioPSQL();
	}
	
	public DaoPagamentoParticular getDaoPagamentoParticular()
	{
		return new DaoPagamentoParticularPSQL();
	}
    
 }