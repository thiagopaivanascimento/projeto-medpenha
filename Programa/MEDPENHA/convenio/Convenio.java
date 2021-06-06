package convenio;


public class Convenio {

    private String cnpj;
    private String razao;
    private int percentual;
    private String instituicao;
    private String email;
    private String telefone;
    private String fax;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    
    private String pac;
    private String med;
    private String dataCons;
    private int total;
       




public Convenio()
{
}

public int getTotal() {
	return total;
}



public void setTotal(int total) {
	this.total = total;
}


public String getCnpj(){
	return cnpj;
}
public void setCnpj(String cnpj){
	this.cnpj=cnpj;
}

public String getRazao(){
	return razao;
}
public void setRazao(String razao){
	this.razao=razao;
}	
	
public int getPercentual(){
	return percentual;
}
public void setPercentual(int percentual){
	this.percentual=percentual;
}	

public String getInstituicao(){
	return instituicao;
}
public void setInstituicao(String instituicao){
	this.instituicao=instituicao;
}	

public String getEmail(){
	return email;
}
public void setEmail(String email){
	this.email=email;
}

public String getTelefone(){
	return telefone;
}
public void setTelefone(String telefone){
	this.telefone=telefone;
}	

public String getFax(){
	return fax;
}
public void setFax(String fax){
	this.fax=fax;
}	

public String getEndereco(){
	return endereco;
}
public void setEndereco(String endereco){
	this.endereco=endereco;
}

public String getNumero(){
	return numero;
}
public void setNumero(String numero){
	this.numero=numero;
}	

public String getComplemento(){
	return complemento;
}
public void setComplemento(String complemento){
	this.complemento=complemento;
}	

public String getBairro(){
	return bairro;
}
public void setBairro(String bairro){
	this.bairro=bairro;
}

public String getCep(){
	return cep;
}
public void setCep(String cep){
	this.cep=cep;
}

public String getCidade(){
	return cidade;
}
public void setCidade(String cidade){
	this.cidade=cidade;
}

public String getUf(){
	return uf;
}
public void setUf(String uf){
	this.uf=uf;
}



public String getPac() {
	return pac;
}



public void setPac(String pac) {
	this.pac = pac;
}



public String getMed() {
	return med;
}



public void setMed(String med) {
	this.med = med;
}



public String getDataCons() {
	return dataCons;
}



public void setDataCons(String dataCons) {
	this.dataCons = dataCons;
}

}
