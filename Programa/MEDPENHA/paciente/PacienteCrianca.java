

package paciente;

public class PacienteCrianca extends Paciente {

    private String nomeresp;
    private String datanascresp;
    private String telefoneresp;
    private String celularresp;
    private String cpfresp;
    private String rgresp;
    
    public PacienteCrianca(int matricula,String nome,String datanasc,String sexo,String endereco,String numero,
            String complemento,String bairro,String cep,String cidade,String uf,String convenio,String operconvenio,String nomeresp,
            String datanascresp,String telefoneresp,String celularresp,String cpfresp,String rgresp)
{
   super(matricula,nome,datanasc,sexo,endereco,numero,complemento,bairro,cep,cidade,uf,convenio,operconvenio);
    
   this.nomeresp=nomeresp;
   this.datanascresp=datanascresp;
   this.telefoneresp=telefoneresp;
   this.celularresp=celularresp;
   this.cpfresp=cpfresp;
   this.rgresp=rgresp;
            
    }

    public String getNomeResp(){
	return nomeresp;
}
public void setNomeResp(String nomeresp){
	this.nomeresp=nomeresp;
}

public String getDataNascResp(){
	return datanascresp;
}
public void setDataNascResp(String datanascresp){
	this.datanascresp=datanascresp;
}

public String getTelefoneResp(){
	return telefoneresp;
}
public void setTelefoneResp(String telefoneresp){
	this.telefoneresp=telefoneresp;
}	

public String getCelularResp(){
	return celularresp;
}
public void setCelularResp(String celularresp){
	this.celularresp=celularresp;
}	

public String getCpfResp(){
	return cpfresp;
}
public void setCpfResp(String cpfresp){
	this.cpfresp=cpfresp;
}    

public String getRgResp(){
	return rgresp;
}
public void setRgResp(String rgresp){
	this.rgresp=rgresp;
}      

}
