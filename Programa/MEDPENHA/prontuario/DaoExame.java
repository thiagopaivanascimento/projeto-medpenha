package prontuario;

import java.util.Vector;

import paciente.Paciente;
import consulta.Consulta;

public interface DaoExame
{
	 public abstract void salvarExame(Exame exam,Prontuario p);
	 public abstract boolean buscarExameDia(Exame exam,Paciente pac);
	 public abstract Vector consultarTodosExames(Paciente pac);
	 public abstract boolean buscarExame(Exame exam,Paciente pac,Consulta consultabusca);
	 public Vector preencherRelatorioExame(Exame exam,Paciente pac, Consulta consultabusca);
     
}
