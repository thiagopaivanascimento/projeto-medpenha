package convenio;

import java.util.ArrayList;
import java.util.Vector;

import paciente.Paciente;
import pagamento.Pagamento;
import prontuario.Atestado;
import consulta.Consulta;

public interface DaoConvenio
{
   public abstract void adicionar(Convenio c);
   public abstract boolean excluir(Convenio c);
   public abstract void alterar(Convenio c);
   public abstract boolean visualizar(Convenio c);
   public abstract Vector preencherRelatorioPagConvenio(Pagamento pag);
   public abstract Vector preencherRelatorioArrecadConvenio(Pagamento pag);
   public abstract ArrayList buscarConvenio();
   public abstract Vector ListarTodosPacientes(Paciente p);
   public abstract boolean buscarPacientes(Convenio c,Paciente p);
   public boolean consultaDataConvenio(Pagamento pag);
   public abstract Vector preencherRelatorioListaPaciente(Paciente p);
   
}

