package prontuario;

import java.util.Vector;

import paciente.Paciente;
import consulta.Consulta;

public interface DaoLaudoPericial 
{
		    
	 public abstract void salvarLaudo(LaudoPericial laudo,Prontuario p);
	 public abstract boolean buscarLaudoDia(LaudoPericial laudo,Paciente pac);
	 public abstract Vector consultarTodosLaudos(Paciente pac);
	 public abstract boolean buscarLaudo(LaudoPericial laudo,Paciente pac,Consulta consultabusca);
	 public abstract Vector preencherRelatorioLaudo(LaudoPericial laudo,Paciente pac,Consulta cons);
	
}
