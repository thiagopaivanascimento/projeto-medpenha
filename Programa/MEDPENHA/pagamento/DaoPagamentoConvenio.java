package pagamento;

import paciente.Paciente;
import consulta.Consulta;

	public interface DaoPagamentoConvenio
	{
		 public abstract void efetuarPagamentoConv(PagamentoConvenio pc,Consulta cons, Paciente pac);
		
		  
	}
	 
