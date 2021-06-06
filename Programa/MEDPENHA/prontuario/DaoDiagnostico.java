package prontuario;

import java.util.Vector;

import consulta.*;
import paciente.*;


public interface DaoDiagnostico 
{

	public abstract boolean buscarDiagnostico(Diagnostico d,Paciente pac,Consulta cons);
	public abstract boolean buscarDiagnosticoDia(Diagnostico d,Paciente pac,Consulta combobox,Prontuario pront);
	public abstract void salvarDiagnostico(Diagnostico d,Prontuario p,Consulta cons);
	public abstract Vector consultarTodosDiagnosticos(Paciente pac);

	public abstract void alterarDiagnostico(Diagnostico d);
	public abstract Vector preencheAutorizacaoRetorno(Paciente pac, Consulta consultacombobox,Prontuario pront);
	
	
	
}
