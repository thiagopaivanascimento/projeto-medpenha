
package paciente;

public class Paciente {
    
    private int matricula;
    private String nome;
    private String datanasc;
    private String sexo;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String convenio;
    private String operaconvenio;
    
    
    public Paciente(int matricula,String nome,String datanasc,String sexo,String endereco,String numero,
            String complemento,String bairro,String cep,String cidade,String uf,String convenio,
            String operaconvenio)
{
    this.nome=nome;
    this.matricula=matricula;
    this.datanasc=datanasc;
    this.sexo=sexo;
    this.endereco=endereco;
    this.numero=numero;
    this.complemento=complemento;
    this.bairro=bairro;
    this.cep=cep;
    this.cidade=cidade;
    this.uf=uf;
    this.convenio=convenio;
    this.operaconvenio=operaconvenio;
    
    }

public int getMatricula(){
	return matricula;
}
public void setMatricula(int matricula){
	this.matricula=matricula;
}
    
public  String getNome(){
	return nome;
}
public  void setNome(String nome){
	this.nome=nome;
}

public String getDataNasc(){
	return datanasc;
}
public void setDataNasc(String datanasc){
	this.datanasc=datanasc;
}
 
public String getSexo(){
	return sexo;
}
public void setSexo(String sexo){
	this.sexo=sexo;
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

public String getConvenio(){
	return convenio;
}
public void setConvenio(String convenio){
	this.convenio=convenio;
}


public String getOperaConvenio(){
	return operaconvenio;
}
public void setOperaConvenio(String operaconvenio){
	this.operaconvenio=operaconvenio;
}
}

