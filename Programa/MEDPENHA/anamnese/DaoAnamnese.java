package anamnese;

public interface DaoAnamnese {
	
	   public  abstract void adicionar(Anamnese a);
	   public  abstract void alterar(Anamnese a);
	   public  abstract boolean visualizar(Anamnese a);
	   public  abstract boolean buscarPaciente(Anamnese a);
}
