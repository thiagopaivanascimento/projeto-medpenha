package prontuario;


public class Prontuario 
{ 
	//dados do prontuário
	private String dataInicial;
	private int numProntuario;
	private String datacons;
	private String nomeMedico;
	private String especialidade;
	private String horacons;
	private String nomePac;
	private String matricula;
		
	//carteirinha
	private String nasc;
	private String titular;
	private String convenio;
	
	
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public int getNumProntuario() {
		return numProntuario;
	}
	public void setNumProntuario(int numProntuario) {
		this.numProntuario = numProntuario;
	}
	
	public String getNasc(){
		return nasc;
	}
	public void setNasc (String nasc){
		this.nasc=nasc;
	}
	
	public String getTitular(){
		return titular;
	}
	public void setTitular (String titular){
		this.titular=titular;
	}
	
	public String getConvenio(){
		return convenio;
	}
	public void setConvenio (String convenio){
		this.convenio=convenio;
	}
	public String getDatacons() {
		return datacons;
	}
	
	public void setDatacons(String datacons) {
		this.datacons = datacons;
	}
	
	public String getNomePac() {
		return nomePac;
	}
	public void setNomePac(String nomePac) {
		this.nomePac = nomePac;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getHoracons() {
		return horacons;
	}
	public void setHoracons(String horacons) {
		this.horacons = horacons;
	}
	
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}