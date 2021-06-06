package dao;
import anamnese.*;
import paciente.*;
import prontuario.*;
import medico.*;
import usuario.*;
import consulta.DaoConsulta;
import convenio.*;
import pagamento.*;
import tipoconsulta.*;

public abstract class DaoFactory 
{
  public final static int POSTGRESQL=1;
  
   public abstract DaoUsuario getDaoUsuario();
   public abstract DaoConvenio getDaoConvenio();
   public abstract DaoMedico getDaoMedico();
   public abstract DaoPacienteAdulto getDaoPacienteAdulto();
   public abstract DaoPacienteCrianca getDaoPacienteCrianca();
   public abstract DaoAnamnese getDaoAnamnese();
   public abstract DaoConsulta getDaoConsulta();
   public abstract DaoAtestado getDaoAtestado();
   public abstract DaoDiagnostico getDaoDiagnostico();
   public abstract DaoProntuario getDaoProntuario();
   public abstract DaoExame getDaoExame();
   public abstract DaoLaudoPericial getDaoLaudoPericial();
   public abstract DaoPrescricao getDaoPrescricao();
   public abstract DaoPagamento getDaoPagamento();
   public abstract DaoPreco getDaoPreco();
   public abstract DaoPagamentoConvenio getDaoPagamentoConvenio();
   public abstract DaoPagamentoParticular getDaoPagamentoParticular();
   
  public static DaoFactory getDAOFactory(int i)
  {
	  switch(i)
	  {
	    case POSTGRESQL: 
	    	return  new DaoFactoryPSQL();
	    	 	
	    	default: return null;
	  }
       
  }










  
}
