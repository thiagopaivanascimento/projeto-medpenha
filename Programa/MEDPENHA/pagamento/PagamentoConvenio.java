package pagamento;

public class PagamentoConvenio extends Pagamento{

	private String convenio;
	private String cnpj;
	
	public PagamentoConvenio(String convenio,String cnpj,String data,
			String tipo,double total,String obs,String nome)
    {
		super(data,tipo,total,obs,nome);
		
		this.cnpj=cnpj;
		this.convenio=convenio;
    }
	
	public String getCnpj(){
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj=cnpj;
	}    

	public String getConvenio(){
		return convenio;
	}
	public void setConvenio(String convenio){
		this.convenio=convenio;
	}      
}
