package webcam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.*;

import prontuario.ControleAtestado;
import prontuario.DaoProntuario;
import prontuario.Prontuario;
import prontuario.TelaProntuario;
import dao.DaoFactory;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;


public class ControleCarteirinha implements ActionListener {

	private JFrame telaCarteirinha;
				
    public ControleCarteirinha(JFrame telaCarteirinha)
     {
	    this.telaCarteirinha=telaCarteirinha;
	    
	  }
	
	 public void actionPerformed (ActionEvent evt)
	 {
		 	JPanel pcampo=(JPanel)telaCarteirinha.getContentPane().getComponent(0);
	      	JPanel pDadosPaciente=(JPanel)pcampo.getComponent(3);
	    	JPanel pMatricula=(JPanel)pDadosPaciente.getComponent(0); 
	    	//contentPane
	    	
	    	JTextField tInstit=(JTextField)pDadosPaciente.getComponent(7);
	    	JTextField tNome=(JTextField)pDadosPaciente.getComponent(5);
	    	JTextField tNomeResp=(JTextField)pDadosPaciente.getComponent(8);
	    	JTextField tDataNasc=(JTextField)pDadosPaciente.getComponent(9);
	    	JTextField tMatricula=(JTextField)pMatricula.getComponent(1);
	    	
	    	Prontuario pront = new Prontuario();
	        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	        DaoProntuario dao= df.getDaoProntuario();
	 			
	        pront.setNomePac(tNome.getText());
	        pront.setMatricula(tMatricula.getText());
	        pront.setNasc(tDataNasc.getText());
	        pront.setTitular(tNomeResp.getText());
	        pront.setConvenio(tInstit.getText());
	        
	        
		 	 
		 if(evt.getActionCommand().equals("Emitir"))
		 {  
			 
    	    boolean aux;
	         	aux = dao.consultarPacienteCarteirinha(pront);
	      if(aux == true)
	     	{ 
	    	  Vector carteirinha = new Vector();   	     
    	     
	    	  carteirinha=dao.preecherRelatorioCarteirinha(pront);
	    	  
    	     JRBeanCollectionDataSource jrbean= new JRBeanCollectionDataSource((Vector)carteirinha);
    	     
    	     Map mapa = new HashMap();
    	     
    	     try{
    	    	 
    	        JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\Carteirinha.jasper",mapa,jrbean);
		        JasperViewer.viewReport(jasperPrint, false);
              }  
    	     catch(Exception e)
    	     {
    	    	 JOptionPane.showMessageDialog(null,"Atenção verifique se os dados estão corretamente preenchidos!","Atenção!",JOptionPane.WARNING_MESSAGE);
    	     }	
		    	
		   } else {JOptionPane.showMessageDialog(null,"Atenção verifique se os dados estão corretamente preenchidos!","Atenção!",JOptionPane.WARNING_MESSAGE);}
		 } 
		 
		 if(evt.getActionCommand().equals("Buscar Paciente"))
		 {
			 
			 boolean aux;
	         	aux = dao.consultarPacienteCarteirinha(pront);
	         	if(aux == true)
	         	{ 
		     
	         		tNome.setText(pront.getNomePac());
	         		tNomeResp.setText(pront.getTitular());
	         		tDataNasc.setText(pront.getNasc());
	         		tInstit.setText(pront.getConvenio());
	         		
	         	}
	         	else
	         	{
	         		JOptionPane.showMessageDialog(null,"Este paciente não está cadastrado!");
	         		tMatricula.setText("");
	         		tNome.setText("");
	         		tNomeResp.setText("");
	         		tDataNasc.setText("");
	         		tInstit.setText("");
	         	}
			 
		  
	    }//fecha o consultar
		 
		 if(evt.getActionCommand().equals("Limpar"))
		 {
			 tMatricula.setText("");
      		tNome.setText("");
      		tNomeResp.setText("");
      		tDataNasc.setText("");
      		tInstit.setText("");
      		
      	}
		 
		 if(evt.getActionCommand().equals("Voltar"))
		 {
			 telaCarteirinha.dispose();
			 			 	 
		 }
		 	 
  }
	 
	 
}