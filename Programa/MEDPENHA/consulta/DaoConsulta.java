package consulta;

import java.util.ArrayList;
import java.util.Vector;
import paciente.*;
import pagamento.Pagamento;
import tipoconsulta.*;
import medico.*;

public interface DaoConsulta 
{	
	public ArrayList buscarMedicos(Medico m);
	public abstract boolean bucarEspecialidade(Medico m);
	public abstract boolean buscarMedico(Medico m);
	
	public abstract boolean buscarPaciente(Paciente p);
	public ArrayList bucarTipoconsulta(TipoConsulta tp);
	public abstract boolean bucarValor(TipoConsulta tp);

	
	public abstract void adicionar(Consulta c,Medico m,Paciente p,TipoConsulta tp);
	public abstract void cancelar (Consulta c,Medico m,Paciente p,TipoConsulta tp);
	public abstract void altetar (Consulta c,Medico m,Paciente p,TipoConsulta tp);
	public boolean visualizar(Consulta c,Paciente p,Medico m,TipoConsulta tp);
	public Vector ConsultarTodasConsultas(Medico m,Paciente p, Consulta c);
	
	public boolean ValidadispPac(Consulta c,Paciente p);
	public boolean ValidadispMed(Consulta c,Medico m);
	
	//	
	public abstract void cancelar (Consulta c,Medico m,Paciente p);
	public abstract void confirmar (Consulta c,Medico m,Paciente p);
	public abstract void alterar (Consulta c,Medico m,Paciente p,TipoConsulta tp);
	public int BuscarConsulta(Consulta c,Paciente p);
	
	public Vector ListarTodasConsultas(Consulta con);
	
	public abstract Vector preencherRelaConsultaCancelada(Consulta cons);
	
	public abstract boolean buscaDataConsultaCancelada(Consulta cons);
	
		
	

}



