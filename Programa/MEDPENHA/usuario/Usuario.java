package usuario;

public class Usuario {
    
    private String login;
    private String senha;
    private String cpf;
    private String tipo;
    
public Usuario(String login,String senha,String cpf,String tipo)
{
this.login=login;
this.senha=senha;
this.cpf=cpf;
this.tipo=tipo;
}

public String getLogin(){
	return login;
}
public void setLogin(String login){
	this.login=login;
}

public String getSenha(){
	return senha;
}
public void setSenha(String senha){
	this.senha=senha;
}
 
public String getCpf(){
	return cpf;
}
public void setCpf(String cpf){
	this.cpf=cpf;
}

public String getTipo(){
	return tipo;
}
public void setTipo(String tipo){
	this.tipo=tipo;
}
    
    
}
