package pagamento;

public class Cheque extends PagamentoParticular
{
  private String agencia; 
  private String numconta;
  private String numserie;
  private String nomebanco;
  private String numcheque;
		
  
	public Cheque(String formaPagamento,String data,String tipo,double total,String obs,String nome,
			String agencia,String numconta,String numserie,String nomebanco,String numcheque)
     {
	  super(formaPagamento,data,tipo,total,obs,nome);
	  
	  this.agencia=agencia;
	  this.numconta=numconta;
	  this.numserie=numserie;
	  this.nomebanco=nomebanco;
	  this.numcheque=numcheque;
   }

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumconta() {
		return numconta;
	}

	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}

	public String getNumserie() {
		return numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	public String getNomebanco() {
		return nomebanco;
	}

	public void setNomebanco(String nomebanco) {
		this.nomebanco = nomebanco;
	}

	public String getNumcheque() {
		return numcheque;
	}

	public void setNumcheque(String numcheque) {
		this.numcheque = numcheque;
	}
	
		

}
