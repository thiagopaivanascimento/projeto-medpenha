package paciente;

import java.util.ArrayList;


public interface DaoPacienteCrianca
{
	public abstract void adicionar(PacienteCrianca pc);
	public abstract void alterar(PacienteCrianca pc);
	public abstract boolean visualizar(PacienteCrianca pc);
	public abstract int gerarMatricula(PacienteCrianca pc);
	public abstract String validarDados(PacienteCrianca pc);
	public boolean validarCpf(PacienteCrianca pc);
	public ArrayList buscarConvenio();
}
