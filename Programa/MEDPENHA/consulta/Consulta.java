package consulta;



public class Consulta {
	
    private String data;
    
    private String hora;
    
    private String situacao;
    
    private String status;
    
    private String pendencias;
    
    private String nome;
	
    private int matricula;
	
	private String nomemed;
	
	private String especialidade;
	
	private String tipo;
	
		 

public Consulta(){}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getData(){
	return data;
}
public void setData(String data){
	this.data=data;
}

public String getHora(){
	return hora;
}
public void setHora(String hora){
	this.hora=hora;
}

public String getSituacao(){
	return situacao;
}
public void setSituacao(String situacao){
	this.situacao=situacao;
}

public String getStatus(){
	return status;
}
public void setStatus(String status){
	this.status=status;
}

public String getPendencias(){
	return pendencias;
}
public void setPendencias(String pendencias){
	this.pendencias=pendencias;
}

public String getNome(){
	return nome;
}
public void setNome(String nome){
	this.nome=nome;
}

public int getMatricula(){
	return matricula;
}
public void setMatricula(int matricula){
	this.matricula=matricula;
}

public String getNomeMedico(){
	return nomemed;
}
public void setNomeMedio(String nomemed){
	this.nomemed=nomemed;
}

public String getEspecialidade(){
	return especialidade;
}
public void setEspecialidade(String especialidade){
	this.especialidade=especialidade;
}

}