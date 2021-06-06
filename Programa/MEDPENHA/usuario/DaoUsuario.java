package usuario;

import medico.Medico;



public interface DaoUsuario
{
   public abstract void adicionar(Usuario u);
   public abstract boolean excluir(Usuario u);
   public abstract void alterar(Usuario u);
   public abstract Usuario logar(Usuario u);
   public abstract String validarDados(Usuario u);
   public abstract boolean buscarMedico(Usuario u);
   
}