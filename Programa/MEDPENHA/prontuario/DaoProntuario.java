package prontuario;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Vector;

import consulta.Consulta;

import medico.Medico;

import paciente.Paciente;
//import java.util.Vector;
import paciente.PacienteAdulto;


public interface DaoProntuario 
{  
	public abstract boolean consultarPacienteCarteirinha(Prontuario p);
	public abstract Vector preecherRelatorioCarteirinha(Prontuario p);
	public abstract void gerarProntuario(Prontuario p,Paciente pac);
	public boolean buscarProntuario(Paciente pac);
	public boolean consultarMedico (Medico m);
	public boolean buscaProntuario(Prontuario p,Paciente pac,Medico med,Consulta cons);
	public abstract int gerarMatriculaProntuario();
	
			
	
	
}
