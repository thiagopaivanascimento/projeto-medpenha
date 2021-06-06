package medico;


public interface DaoMedico
{
   public  abstract void adicionar(Medico m);
   public  abstract boolean excluir(Medico m);
   public  abstract void alterar(Medico m);
   public  abstract boolean visualizar(Medico m);
   public  abstract String validarDados(Medico m);
   public abstract boolean verificarUsuario(Medico m);

}