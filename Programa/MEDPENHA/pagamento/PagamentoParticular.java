package pagamento;

import pagamento.Pagamento;

public class PagamentoParticular extends Pagamento{

	private String formaPagamento;
	
	
	public PagamentoParticular(String formaPagamento,String data,
			String tipo,double total,String obs,String nome)
    {
		super(data,tipo,total,obs,nome);
		
		this.formaPagamento=formaPagamento;
		
    }
	
	public String getFormaPagamento(){
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento){
		this.formaPagamento=formaPagamento;
	}    

	 
}