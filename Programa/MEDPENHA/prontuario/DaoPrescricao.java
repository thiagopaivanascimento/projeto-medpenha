package prontuario;

import java.util.Vector;

import paciente.Paciente;
import consulta.Consulta;

public interface DaoPrescricao 
{
		public abstract boolean buscarPrescricao(Prescricao presc,Paciente pac,Consulta consultabusca);
		public abstract boolean buscarPrescricaoDia(Prescricao prescri,Paciente pac);
		public abstract void salvarPrescricao(Prescricao prescri,Prontuario p);
		public abstract Vector consultarTodasPrescricoes(Paciente pac);
		public Vector preencherRelatorioPrescricao(Prescricao prescri,Paciente pac, Consulta consultabusca);

}
