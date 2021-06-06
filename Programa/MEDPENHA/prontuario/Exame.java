package prontuario;

public class Exame
{
	private String data;
	private String obs;
	private String exame;
	private String hora;
	private String nomepaciente;
	
	private String especialidade;
	public String getNomepaciente() {
		return nomepaciente;
	}


	public void setNomepaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}


	public Exame()
	{
		
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
	
	public void setData(String dataExame) {
		this.data = dataExame;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obsExame) {
		this.obs = obsExame;
	}
	
	public String getExame() {
		return exame;
	}
	
	public void setExame(String exame) {
		this.exame = exame;
	}
	
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
