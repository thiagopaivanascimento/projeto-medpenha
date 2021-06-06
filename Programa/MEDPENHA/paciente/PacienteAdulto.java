
package paciente;

public class PacienteAdulto extends Paciente{
    
    private String telefone;
    private String celular;
    private String cpf;
    private String rg;
    private String estadocivil;
    
  public PacienteAdulto(String telefone,String celular,String cpf, String rg,String estadocivil,
		int matricula,String nome,String datanasc,String sexo,String numero,String endereco,
        String complemento,String bairro,String cep,String cidade,String uf,String convenio,String operaconvenio)
  {
    super(matricula,nome,datanasc,sexo,endereco,numero,complemento,bairro,cep,cidade,uf,convenio,operaconvenio);
 
  this.cpf=cpf;
  this.rg=rg;
  this.estadocivil=estadocivil;
  this.telefone=telefone;
  this.celular=celular;
  
  }
  
 public String getCpf(){
	return cpf;
}
public void setCpf(String cpf){
	this.cpf=cpf;
}    

public String getRg(){
	return rg;
}
public void setRg(String rg){
	this.rg=rg;
}      

public String getEstadocivil(){
	return estadocivil;
}
public void setEstadocivil(String estadocivil){
	this.estadocivil=estadocivil;
}   

public String getTelefone(){
	return telefone;
}
public void setTelefone(String telefone){
	 this.telefone=telefone;
}	

public String getCelular(){
	return celular;
}
public void setCelular(String celular){
	this.celular=celular;
}


}
