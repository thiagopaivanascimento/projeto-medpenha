package prontuario;

public class Atestado 
{
	
	private String data;
	private String hora;
	private String nomepaciente;
	
	private String especialidade;
	public String getNomepaciente() {
		return nomepaciente;
	}


	public void setNomepaciente(String nomepaciente) {
		this.nomepaciente = nomepaciente;
	}


	public Atestado()
	{
		
	}
	
	
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	private String descricao;
	private String obs;
	
	
	public String getData() {
		return data;
	}
	
	public void setData(String dataAtestado) {
		this.data = dataAtestado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obsAtestado) {
		this.obs = obsAtestado;
	}
	
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
