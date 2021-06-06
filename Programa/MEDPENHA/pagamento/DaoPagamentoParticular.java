package pagamento;

import java.util.Vector;

import consulta.Consulta;
import paciente.Paciente;

public interface DaoPagamentoParticular 
{
	public abstract void efetuarPagamentoParticularDinh(PagamentoParticular pp,Paciente pac,Consulta cons);
	public abstract void efetuarPagamentoParticularCartao(PagamentoParticular pp,Paciente pac,Consulta cons,Cartao c);
	public abstract void efetuarPagamentoParticularCheque(PagamentoParticular pp,Paciente pac,Consulta cons,Cheque ch);
	public abstract Vector preencherRelatorioPagParticular(Pagamento pag);
	public abstract boolean buscaDataPagamentoParticular(Pagamento pag);
	
}
