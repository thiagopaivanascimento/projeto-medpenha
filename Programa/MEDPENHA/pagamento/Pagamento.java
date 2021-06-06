package pagamento;

    public class Pagamento {

    private String data;
    private String tipo;
    private double total;
    private String obs;
    private String nome;
    private String datacons;
    private String hora;
    private String med;
    
  
   
public Pagamento(String data,String tipo,double total,String obs, String nome)
    	{
        	 this.data=data;
        	 this.tipo=tipo;
        	 this.total=total;
        	 this.obs=obs;
        	 this.nome=nome;
        }



public String getHora() {
	return hora;
}



public void setHora(String hora) {
	this.hora = hora;
}



public String getDataCons() {
	return datacons;
}



public void setDatacons(String datacons) {
	this.datacons = datacons;
}
   
  
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


public String getData(){
	return data;
}
public void setData(String data){
	this.data=data;
}

public String getTipo(){
	return tipo;
}
public void setTipo(String tipo){
	this.tipo=tipo;
}


public String getObs(){
	return obs;
}
public void setObs(String obs){
	this.obs=obs;
}

public double getTotal(){
	return total;
}
public void setTotal(double total){
	this.total=total;
}



public String getMed() {
	return med;
}



public void setMed(String med) {
	this.med = med;
}


 
    }