package prontuario;

import java.util.Vector;

import paciente.Paciente;
import consulta.Consulta;

public interface DaoAtestado 
{
	public abstract boolean buscarAtestado(Atestado atest,Paciente pac,Consulta consultabusca);
	public abstract boolean buscarAtestadoDia(Atestado atest,Paciente pac);
	public abstract void salvarAtestado(Atestado atest,Prontuario p);
	public abstract Vector consultarTodosAtestados(Paciente pac);
	public abstract Vector preencherRelatorioAtestado(Atestado atestado,Paciente pac,Consulta cons);
}
