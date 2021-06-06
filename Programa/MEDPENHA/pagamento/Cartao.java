package pagamento;

public class Cartao extends PagamentoParticular
{
  private String numcartao;
	
	
  public Cartao(String formaPagamento,String data,
			String tipo,double total,String obs,String nome)
  {
	  super(formaPagamento,data,tipo,total,obs,nome);
	  
	  this.numcartao=numcartao;
  }


public String getNumcartao() {
	return numcartao;
}
public void setNumcartao(String numcartao) {
	this.numcartao = numcartao;
}
  
  
	
	
	
}
