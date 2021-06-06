package medico;
import usuario.*;

public class Medico extends Usuario{

    private String nome;
    private String datanasc;
    private String rg;
    private String telefone;
    private String celular;
    private String email;
    private String crm;
    private String especialidade;
    
public Medico(String nome,String datanasc,String rg,
		      String telefone,String celular,String email,String crm,
		      String especialidade,String login,String senha,String cpf,String tipo)
{
	 super(login,senha,cpf,tipo);
	 
	 this.nome=nome;
	 this.datanasc=datanasc;
	 this.rg= rg;
	 this.telefone=telefone;
	 this.celular=celular;
	 this.email=email;
	 this.crm=crm;
	 this.especialidade=especialidade;
}

public String getNome(){
	return nome;
}
public void setNome(String nome){
	this.nome=nome;
}

public String getDataNasc(){
	return datanasc;
}
public void setDataNasc(String datanasc){
	this.datanasc=datanasc;
}        

public String getRg(){
	return rg;
}
public void setRg(String rg){
	this.rg=rg;
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

public String getEmail(){
	return email;
}
public void setEmail(String email){
	this.email=email;
}

public String getCrm(){
	return crm;
}
public void setCrm(String crm){
	this.crm=crm;
}

public String getEspecialidade(){
	return especialidade;
}
public void setEspecialidade(String especialidade){
	this.especialidade=especialidade;
}

}	