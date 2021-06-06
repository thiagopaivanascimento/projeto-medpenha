package prontuario;

public class Diagnostico 
{
	private String dataHistDiag;
	private String dataDiagnostico;
	private String horaDiagnostico;
	private String entrevistaconsulta;
	private String obs;
	private String diagnostico;
	private String numprontuario;
	private int codDiag;
	private int codconsulta;
	private int codprontuario;
	private String especialidade;
	private String crm;
	
	
	
	public String getDataHistDiag() {
		return dataHistDiag;
	}

	public void setDataHistDiag(String dataHistDiag) {
		this.dataHistDiag= dataHistDiag;
	}
	
	public String getHoraDiagnostico() {
		return horaDiagnostico;
	}

	public void setHoraDiagnostico(String horaDiagnostico) {
		this.horaDiagnostico = horaDiagnostico;
	}
		
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public int getCodconsulta() {
		return codconsulta;
	}

	public void setCodconsulta(int codconsulta) {
		this.codconsulta = codconsulta;
	}

	public int getCodprontuario() {
		return codprontuario;
	}

	public void setCodprontuario(int codprontuario) {
		this.codprontuario = codprontuario;
	}

	public int getCodDiag() {
		return codDiag;
	}

	public void setCodDiag(int codDiag) {
		this.codDiag = codDiag;
	}

	public String getDataDiagnostico() {
		return dataDiagnostico;
	}
	
	public void setDataDiagnostico(String dataDiagnostico) {
		this.dataDiagnostico = dataDiagnostico;
	}
	
	public String getEntrevistaConsulta() {
		return entrevistaconsulta;
	}
	
	public void setEntrevistaConsulta(String entrevistaconsulta) {
		this.entrevistaconsulta = entrevistaconsulta;
	}
	
	public String getObsDiagnostico() {
		return obs;
	}
	
	public void setObsDiagnostico(String obs) {
		this.obs = obs;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
	public String getNumProntuario()
	{
		return numprontuario;
	}
	
	public void setNumProntuario(String numprontuario)
	{
		this.numprontuario=numprontuario;
	}
	
	
}
