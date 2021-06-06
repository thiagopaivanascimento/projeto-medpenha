package pagamento;

import java.util.Vector;

import consulta.Consulta;
import convenio.*;
import paciente.*;
import tipoconsulta.TipoConsulta;


public interface DaoPagamento
{
	 //public abstract ArrayList buscarConvenio();
	 public abstract boolean buscarConvenio(Convenio conv,Paciente p);
     public abstract void salvarCartao(Cartao cart);
	 public abstract boolean buscaPagamento(Consulta cons, Paciente p, TipoConsulta tipo);
	 public abstract Vector preencheReciboConsulta(Paciente p, Pagamento pag);



}