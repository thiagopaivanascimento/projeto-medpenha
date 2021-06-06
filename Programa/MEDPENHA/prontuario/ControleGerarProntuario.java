package prontuario;

import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.*;

import dao.DaoFactory;

import paciente.DaoPacienteAdulto;
import paciente.Paciente;

public class ControleGerarProntuario implements ActionListener,MouseListener
{
     private static JFrame telagerarprontuario;
	   
    
    public ControleGerarProntuario(JFrame telagerarprontuario)
    	{
   	 	this.telagerarprontuario=telagerarprontuario;
    	}
  
    	     	     
    public void actionPerformed (ActionEvent evt)
     {
    	 JPanel pCampo =(JPanel)telagerarprontuario.getContentPane().getComponent(0);
    	 JPanel pgerarProntuario =(JPanel)pCampo.getComponent(0);
    	 
    	 JTextField tDataInicial=(JTextField)pgerarProntuario.getComponent(2);
    	 JTextField tmatricula=(JTextField)pgerarProntuario.getComponent(5);
    	 
    	 
    	 Prontuario pront = new Prontuario();
    	 Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
    	 
    	 pront.setDataInicial(tDataInicial.getText());
    	 pac.setMatricula(Integer.parseInt(tmatricula.getText()));
    	 
    	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
		 DaoProntuario dao= df.getDaoProntuario();
    	
		    			 			 
		 if(evt.getActionCommand().equals("OK"))
		   {
			 
			 	 
			if(tDataInicial.getText().equals(""))
			 {
				JOptionPane.showMessageDialog(null,"Por favor clique no campo Data Inicial!","Atenção",JOptionPane.WARNING_MESSAGE);
					 
	         }
			
			else
			{
							
					dao.gerarProntuario(pront,pac);
					JOptionPane.showMessageDialog(null,"Prontuário gerado com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
					telagerarprontuario.dispose();
			}
				
			}
		}	
     
    
    public void mouseClicked(MouseEvent e)
	{
    	JPanel pCampo=(JPanel)telagerarprontuario.getContentPane().getComponent(0);
    	JPanel pgerarProntuario =(JPanel)pCampo.getComponent(0);
    	JTextField tDataInicial=(JTextField)pgerarProntuario.getComponent(2);
    	JTextField tmatricula=(JTextField)pgerarProntuario.getComponent(5);
    	
	
    	Date data =new Date() ;
    	
      	//alterando formato
      	DateFormat dformat;
      	String dataAtual;
      	
      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
      	dataAtual=dformat.format(data).toString();
      	
      	Prontuario pront = new Prontuario();
      	
      	DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
 		  DaoProntuario dao= df.getDaoProntuario();
 		  
 		 Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
 		  
      	if(e.getSource()==tDataInicial)
      	{
      		tDataInicial.setText(dataAtual);
      		tDataInicial.setEnabled(false);
      		pront.setDataInicial(tDataInicial.getText());
      	}
      	
      	if(e.getSource()==tmatricula)
      	{
      		int mat=dao.gerarMatriculaProntuario();
      		
      		pac.setMatricula(mat);
      		tmatricula.setText(String.valueOf(mat));
      		tmatricula.setEnabled(false);
      		
      		 		
      	}
      	     			
	}
    
    
    
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
    
}