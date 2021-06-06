package prontuario;

public class LaudoPericial 
{
   private String data;
   private String hora;   
   private String descricao;
   private String obs;
   private String nomepaciente;
   
   
	private String especialidade;
   public LaudoPericial()
   {
	   
   }
   
   
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

   public void setData(String dataLaudo) {
	this.data = dataLaudo;
   }

   public String getDescricao() {
	return descricao;
  }

   public void setDescricao(String descricaoLaudo) {
	this.descricao = descricaoLaudo;
  }

   public String getObs() {
	return obs;
   }

   public void setObs(String obsLaudo) {
	this.obs = obsLaudo;
   }
	
   public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
