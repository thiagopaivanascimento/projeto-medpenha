package paciente;


import java.util.ArrayList;

public interface DaoPacienteAdulto
{
	public abstract void adicionar(PacienteAdulto pa);
	public abstract void alterar(PacienteAdulto pa);
	public abstract boolean visualizar(PacienteAdulto pa);
	public abstract int gerarMatricula(PacienteAdulto pa);
	public abstract boolean verificarCpf(PacienteAdulto pa);
	public abstract boolean verificarRg(PacienteAdulto pa);
	public ArrayList buscarConvenio();
	
		
}
