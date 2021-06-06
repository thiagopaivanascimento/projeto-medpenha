package prontuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import anamnese.TelaAnamnese;
import dao.DaoFactory;



public class ControleProntuario implements ActionListener{
	  private JFrame telaProntuario;
	  
	    
	     public ControleProntuario(JFrame telaprontuario)
	      {
		    this.telaProntuario=telaprontuario;
		  }
	     
	     
	    public void actionPerformed (ActionEvent evt)
	    {	    	
	    	JPanel pCampo=(JPanel)telaProntuario.getContentPane().getComponent(1);
	    	JPanel pIdentMedicop=(JPanel)pCampo.getComponent(0);
	    	JPanel pProntuariop=(JPanel)pCampo.getComponent(4);
	    	JPanel pIdentPacientep=(JPanel)pCampo.getComponent(1);
	    	JPanel pDataConsp=(JPanel)pCampo.getComponent(2);
	    	
	    	 JTabbedPane tpProntuario=(JTabbedPane)pCampo.getComponent(5);
	    	 
	    	 JPanel pdiagnostico=(JPanel)tpProntuario.getComponent(0);
		     JPanel pHistDiag=(JPanel)pdiagnostico.getComponent(0);
		     
		    	    		    	        
	        //painel identificação do médico
	        JTextField tNomeMedico = (JTextField)pIdentMedicop.getComponent(1);
	        JTextField tcrm = (JTextField)pIdentMedicop.getComponent(4);
	        JTextField tespecialidade = (JTextField)pIdentMedicop.getComponent(7);
	        
	        //painel identificação do paciente
	        JTextField tNome = (JTextField)pIdentPacientep.getComponent(1);
	        JComboBox cbSexop = (JComboBox)pIdentPacientep.getComponent(4);
	        JTextField tMatricula = (JTextField)pIdentPacientep.getComponent(7);
	        JTextField tNascp = (JTextField)pIdentPacientep.getComponent(10);
	        
	        //painel da data da consulta
	        JTextField tDataCons = (JTextField)pDataConsp.getComponent(1);
	        
	        //painel dos dados do prontuario
	        JTextField tProntuario = (JTextField)pProntuariop.getComponent(2);
	        JTextField tDataInicial = (JTextField)pProntuariop.getComponent(4);
	        
	      	         
	        
	        Prontuario pront = new Prontuario();
	        	       	            
	        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	        DaoProntuario dao= df.getDaoProntuario();
				
	        pront.setDataInicial(tProntuario.getText());
	       
	        try{
	        pront.setNumProntuario(Integer.parseInt(tProntuario.getText()));
	        }
	        catch(Exception ex)
	        {
	        	
	        }
	       	       
	       if(evt.getActionCommand().equals("Visualizar Anamnese"))
	   	    { 
	   	       TelaAnamnese tela = new TelaAnamnese();
	   	       
	   	    JPanel pcampo=(JPanel)tela.getTelaAnamnese().getContentPane().getComponent(1);
	    	JPanel pimc=(JPanel)pcampo.getComponent(0);
	    	JPanel psangue=(JPanel)pcampo.getComponent(1);
	    	JPanel pVicios=(JPanel)pcampo.getComponent(3);
	    	JPanel pdoenca=(JPanel)pcampo.getComponent(4);
	    	JPanel pdados=(JPanel)pcampo.getComponent(5);
	    	JPanel pIdentPaciente=(JPanel)pcampo.getComponent(6);
	    	
	    	JTextField tReligiao=(JTextField)pdados.getComponent(3);
	    	JTextField tProfissao=(JTextField)pdados.getComponent(4);
	    	JComboBox cbSexo=(JComboBox)pdados.getComponent(8);
	    	JTextField tRaca=(JTextField)pdados.getComponent(11);
	    	JTextField tNasc=(JTextField)pdados.getComponent(14);
	    	JTextField tPraticaEsporte=(JTextField)pdados.getComponent(16);
	    	
	    	JTextField tAlergia=(JTextField)pdoenca.getComponent(4);
	    	JTextField tDoenca=(JTextField)pdoenca.getComponent(5);
	    	JTextField tMedicamento=(JTextField)pdoenca.getComponent(6);
	    	JTextField tDoencaFamilia=(JTextField)pdoenca.getComponent(7);
	    	
	    	JTextField tPeso=(JTextField)pimc.getComponent(1);
	    	JTextField tAltura=(JTextField)pimc.getComponent(5);
	    	JTextField tImc=(JTextField)pimc.getComponent(8);
	   	       
	    	JTextField tnome=(JTextField)pIdentPaciente.getComponent(1);
	    	JTextField tmatricula=(JTextField)pIdentPaciente.getComponent(4);
	    	JTextField tDataAnamnese=(JTextField)pIdentPaciente.getComponent(7);
	    	
	    	JTextField tQtdEtilista=(JTextField)pVicios.getComponent(4);
	    	JComboBox cbEtilista=(JComboBox)pVicios.getComponent(1);
	    	JTextField tQtdTabagista=(JTextField)pVicios.getComponent(9);
	    	JComboBox cbTabagista=(JComboBox)pVicios.getComponent(6);
	    	
	    	JTextField tTipoSang=(JTextField)psangue.getComponent(1);
	    	JTextField tPressao=(JTextField)psangue.getComponent(4);
	    	JTextField tFreqCardiaca=(JTextField)psangue.getComponent(8);  
	   	       
	   	      
	    	   
	       }
	   	    
	       
	     }
	    	
	    	
	    	
	    	
	    	
	    }