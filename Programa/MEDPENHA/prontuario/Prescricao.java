package prontuario;

public class Prescricao 
{
	private String data;
	private String hora;
	private String tipo;
	private String medicamento;
	private String obs;
	private String nomepaciente;
	private String especialidade;
	
	public String getNomepaciente() {
		return nomepaciente;
	}

	public void setNomepaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	public String getData() {
		return data;
	}
	
	public void setData(String dataPrescricao) {
		this.data = dataPrescricao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipoPrescricao) {
		this.tipo = tipoPrescricao;
	}
	
	public String getMedicamento() {
		return medicamento;
	}
	
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obsPrescricao) {
		this.obs = obsPrescricao;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
