package consulta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import menuprincipal.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import medico.*;
import dao.DaoFactory;
import paciente.Paciente;
import prontuario.*;

public class ControleAgenda implements ActionListener{
	 
	private JFrame telaAgenda;
	
	
	 public ControleAgenda(JFrame telaAgenda)
	 	{
		 	this.telaAgenda=telaAgenda;
	 	}
    
    public void actionPerformed(ActionEvent evt)
	{
    	JPanel pCampo=(JPanel)telaAgenda.getContentPane().getComponent(1);
    	JPanel pagenda = (JPanel)pCampo.getComponent(1);
    	
    	JScrollPane jScrollPane1=(JScrollPane)pagenda.getComponent(14);
	    JTable jTable1 =(JTable)jScrollPane1.getViewport().getComponent(0);
	    
	    Calendario tData=(Calendario)pagenda.getComponent(6);
	    JTextField tEspecialidade =(JTextField)pagenda.getComponent(3);
	    JTextField tnomemedico = (JTextField)pagenda.getComponent(12);
	    JTextField tcrm = (JTextField)pagenda.getComponent(9);
	    	   
	    Medico medico=new Medico(null, null, null, null, null, null, null, null, null, null, null, null);
	    Consulta cons = new Consulta();
	    Paciente pa=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
	    
	    DaoFactory df2=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
        DaoConsulta dao2= df2.getDaoConsulta();	    
        
        tData.date();
        int dia=tData.date().getDate();
        int mes=tData.date().getMonth()+1;
        int ano=tData.date().getYear()+1900;
        String d=String.valueOf(dia);
        String m=String.valueOf(mes);
        if(d.length()==1)
        {	d="0"+d;     }
        if(m.length()==1)
        {	m="0"+m;     }
        
        String a=String.valueOf(ano);
        String data=(d+"/"+m+"/"+a);
  	  
		cons.setData(data);
        
        medico.setNome(tnomemedico.getText());
        medico.setEspecialidade(tEspecialidade.getText());
        medico.setCrm(tcrm.getText());
               
    
        
        
        
        if (evt.getActionCommand().equals("Buscar Pacientes"))
        {
        	 if(tcrm.getText().equals("_________/__"))
             {
     	      JOptionPane.showMessageDialog(null,"Você precisa preencher o campo CRM!","Atenção",JOptionPane.WARNING_MESSAGE);  
             }
    	 else{
    		boolean aux=dao2.buscarMedico(medico);
    		 if(aux==false)
    			{	
    				JOptionPane.showMessageDialog(null,"Médico não cadastrado no sistema","Atenção",JOptionPane.WARNING_MESSAGE);  
    			}
			 else
			 {
				           				
					
    		 DefaultTableModel tc;
    		 Vector v=dao2.ConsultarTodasConsultas(medico,pa,cons);
    		 //VERIFICAR A MENSAGEM
    		 if(v==null)
    		 {
    			 JOptionPane.showMessageDialog(null,"Este médico não possui pacientes marcados para hoje!","Atenção",JOptionPane.WARNING_MESSAGE);
    		 }
    		 else
    		 {
    		 
    		 Object [][]T= new Object [v.size()][4];
    	        Object [] col={"Data","Hora","Paciente","Matricula"};
    	                        
    	        for (int i=0; i< v.size();i++)
    	        {
    	        	
    	        	  Object obj = v.get(i);
    	              if(obj instanceof Consulta)
    	              {
    	            	T[i][0]=((Consulta)v.get(i)).getData();
    	            	T[i][1]=((Consulta)v.get(i)).getHora();          
    	              //}             
    	              //else  if(obj instanceof Paciente)
    	              //{   
    	            	 //int j=i-1;
    	          		 T[i][2]=((Consulta)v.get(i)).getNome();
    	          		 T[i][3]=((Consulta)v.get(i)).getMatricula();	
    	              }
    	        
    	        }
    	        tc = new DefaultTableModel(T,col);
    	                       
    	        jTable1= new JTable(tc);
    	        jScrollPane1.setViewportView(jTable1);		       
				      
    	        tnomemedico.setText(medico.getNome());
				tEspecialidade.setText(medico.getEspecialidade());		 	
			 
    	 }
        	
    	 }
        }
      }//fecha if  
        
               
	    if(evt.getActionCommand().equals("Buscar Prontuário"))
	    {
	    	
	    	TelaProntuario tela = new TelaProntuario();
		 	JPanel pcampo=(JPanel)tela.getTelaProntuario().getContentPane().getComponent(1);	
		 	JPanel pProntuario=(JPanel)pcampo.getComponent(4);
		 	JPanel pIdentPaciente=(JPanel)pcampo.getComponent(1);
		 	JPanel pIdentMedico=(JPanel)pcampo.getComponent(0);
		 	JPanel pDataCons=(JPanel)pcampo.getComponent(2);
		 	 
		 	 JTextField tProntuario = (JTextField)pProntuario.getComponent(2);
		 	 JTextField tDataInicial= (JTextField)pProntuario.getComponent(4);
		 	 JTextField tDataCons = (JTextField)pDataCons.getComponent(1);
		 	JComboBox cbhora=(JComboBox)pDataCons.getComponent(4);
		 	 
		 	JTextField tNome = (JTextField)pIdentPaciente.getComponent(1);
	        JComboBox cbSexo = (JComboBox)pIdentPaciente.getComponent(4);
	        JTextField tMatricula = (JTextField)pIdentPaciente.getComponent(7);
	        JTextField tNasc = (JTextField)pIdentPaciente.getComponent(10);
	        
	        JTextField tNomeMedico = (JTextField)pIdentMedico.getComponent(1);
	        JTextField tCrm = (JTextField)pIdentMedico.getComponent(7);
	        JTextField tespecialidade = (JTextField)pIdentMedico.getComponent(4);
	        
	        JTabbedPane tpProntuario=(JTabbedPane)pcampo.getComponent(5);
	        JPanel pdiagnostico=(JPanel)tpProntuario.getComponent(0);
    	    JPanel pHistDiag=(JPanel)pdiagnostico.getComponent(0);
	        JScrollPane tbHistPresc4 = (JScrollPane)pHistDiag.getComponent(0);
	        JTable tbDiagnostico = (JTable)tbHistPresc4.getViewport().getComponent(0);
	        
	        JPanel pprescricao=(JPanel)tpProntuario.getComponent(1);
	        JPanel pHistPresc=(JPanel)pprescricao.getComponent(0);
	        JScrollPane tbHistPresc2= (JScrollPane)pHistPresc.getComponent(0);
	        JTable tbPresc = (JTable)tbHistPresc2.getViewport().getComponent(0);
	        
	        JPanel pexame=(JPanel)tpProntuario.getComponent(2);
		    JPanel pHistExame=(JPanel)pexame.getComponent(0);
		    JScrollPane tbHistPresc1= (JScrollPane)pHistExame.getComponent(3);
		    JTable tbExame = (JTable)tbHistPresc1.getViewport().getComponent(0);
		        
		   JPanel pAtestado=(JPanel)tpProntuario.getComponent(3);
		   JPanel pHistAtestado=(JPanel)pAtestado.getComponent(0);
		   JScrollPane tbHistPresc3=(JScrollPane)pHistAtestado.getComponent(3);
		   JTable tbAtestado =(JTable)tbHistPresc3.getViewport().getComponent(0);
	        
		   JPanel pLaudo=(JPanel)tpProntuario.getComponent(4);
		   JPanel pHistLaudo=(JPanel)pLaudo.getComponent(0);  
		   JScrollPane tbHistPresc5=(JScrollPane)pHistLaudo.getComponent(4);
		   JTable tbLaudo =(JTable)tbHistPresc5.getViewport().getComponent(0);   
		    	    
	        DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	        DaoProntuario dao= df.getDaoProntuario();
	        DaoDiagnostico dao3= df.getDaoDiagnostico();	
	        DaoPrescricao dao4= df.getDaoPrescricao();	
	        DaoExame dao5= df.getDaoExame();
	        DaoAtestado dao6= df.getDaoAtestado();
	        DaoLaudoPericial dao7= df.getDaoLaudoPericial();
	        
	        Prontuario p = new Prontuario();
	        Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
	        Medico med = new Medico(null,null,null,null,null,null,null,null,null,null,null,null);
	       	        
	       	       
	                  
	        
	        try{
			     DefaultTableModel tc = (DefaultTableModel)jTable1.getModel();
			     cons.setData(String.valueOf(tc.getValueAt(jTable1.getSelectedRow(),0)));
			     cons.setHora(String.valueOf(tc.getValueAt(jTable1.getSelectedRow(),1)));
			     pac.setMatricula((Integer)tc.getValueAt(jTable1.getSelectedRow(),3));
			     
			    		    	     
			     med.setNome(tnomemedico.getText());
			     med.setEspecialidade(tEspecialidade.getText());
			     med.setCrm(tcrm.getText());
			     }
			     catch(Exception ex)
			     {
			    	 tela.getTelaProntuario().dispose();
			    	JOptionPane.showMessageDialog(null,"Por favor, selecione na tabela a linha correspondente ao paciente","Atenção",JOptionPane.WARNING_MESSAGE);
			    				    				    	 
			     }	        	    	        
	      
			    		     
			     
	        boolean aux;
			aux=dao.buscaProntuario(p,pac,med,cons);
		 
			if(aux==true)
			{							
			  tMatricula.setText(String.valueOf(pac.getMatricula()));
			  tMatricula.setEnabled(false);
	          tNome.setText(pac.getNome());
	          tNome.setEnabled(false);
	          tNasc.setText(pac.getDataNasc());
	          tNasc.setEnabled(false);
	          cbSexo.setSelectedItem(pac.getSexo());
	          cbSexo.setEnabled(false);
	          tProntuario.setText(String.valueOf(p.getNumProntuario()));
	          tProntuario.setEnabled(false);
	          tDataInicial.setText(p.getDataInicial());
	          tDataInicial.setEnabled(false);
	          tNomeMedico.setText(med.getNome());
	          tNomeMedico.setEnabled(false);
	          tCrm.setText(med.getCrm());
	          tCrm.setEnabled(false);
	          tespecialidade.setText(med.getEspecialidade());
	          tespecialidade.setEnabled(false);
	          tDataCons.setText(cons.getData());
	          tDataCons.setEnabled(false);
	          cbhora.setSelectedItem(cons.getHora());
	          cbhora.setEnabled(false);
	          
		     
	         		
	     DefaultTableModel tcdiagnostico;
		 
	     Vector v= dao3.consultarTodosDiagnosticos(pac);
	        Object [][]T= new Object [v.size()][3];
	        Object [] col={"Data","Hora","Especialidade"};
	        
	        for (int i=0; i < v.size(); i++)
	        {
	        	T[i][0]=((Diagnostico)v.get(i)).getDataDiagnostico();
	        	T[i][1]=((Diagnostico)v.get(i)).getHoraDiagnostico();
	        	T[i][2]=((Diagnostico)v.get(i)).getEspecialidade();
	        	
	        }
	        tcdiagnostico = new DefaultTableModel(T,col);
	                       
	        tbDiagnostico = new JTable(tcdiagnostico);
	        tbHistPresc4.setViewportView(tbDiagnostico);
	        
	        
	        DefaultTableModel tcprescricao;
		  	
		  	Vector vetor= dao4.consultarTodasPrescricoes(pac);
	        Object [][]Tab= new Object [vetor.size()][3];
	        Object [] colu={"Data","Hora","Especialidade"};
	        
	        for (int i=0; i < vetor.size(); i++)
	        {
	        	Tab[i][0]=((Prescricao)vetor.get(i)).getData();
	        	Tab[i][1]=((Prescricao)vetor.get(i)).getHora();
	        	Tab[i][2]=((Prescricao)vetor.get(i)).getEspecialidade();
	        	
	        }
	        tcprescricao = new DefaultTableModel(Tab,colu);                   
	        tbPresc = new JTable(tcprescricao);	        
	        tbHistPresc2.setViewportView(tbPresc);
	        
	        DefaultTableModel tcexame;
	        Vector vetex= dao5.consultarTodosExames(pac);
	        Object [][]Tabex= new Object [vetex.size()][3];
	        Object [] colex={"Data","Hora","Especialidade"};
	        
	        for (int i=0; i < vetex.size(); i++)
	        {
	        	Tabex[i][0]=((Exame)vetex.get(i)).getData();
	        	Tabex[i][1]=((Exame)vetex.get(i)).getHora();
	        	Tabex[i][2]=((Exame)vetex.get(i)).getEspecialidade();
	        	
	        }
	        tcexame = new DefaultTableModel(Tabex,colex);
	                       
	        tbExame = new JTable(tcexame);
	               
	        tbHistPresc1.setViewportView(tbExame);
	        
	        DefaultTableModel tcatestado;
			  
			  Vector vetatest=dao6.consultarTodosAtestados(pac);
		        Object [][]Tabatest= new Object [vetatest.size()][3];
		        Object [] colatest={"Data","Hora","Especialidade"};
		        
		        for (int i=0; i < vetatest.size(); i++)
		        {
		        	Tabatest[i][0]=((Atestado)vetatest.get(i)).getData();
		        	Tabatest[i][1]=((Atestado)vetatest.get(i)).getHora();
		        	Tabatest[i][2]=((Atestado)vetatest.get(i)).getEspecialidade();
		        	
		        }
		        tcatestado = new DefaultTableModel(Tabatest,colatest);
		                       
		        tbAtestado = new JTable(tcatestado);
		        
		        tbHistPresc3.setViewportView(tbAtestado);

		        
		        DefaultTableModel tclaudo;
				  Vector vetlaudo= dao7.consultarTodosLaudos(pac);
			        Object [][]Tablaudo= new Object [vetlaudo.size()][3];
			        Object [] collaudo={"Data","Hora","Especialidade"};
			        
			        for (int i=0; i < vetlaudo.size(); i++)
			        {
			        	Tablaudo[i][0]=((LaudoPericial)vetlaudo.get(i)).getData();
			        	Tablaudo[i][1]=((LaudoPericial)vetlaudo.get(i)).getHora();
			        	Tablaudo[i][2]=((LaudoPericial)vetlaudo.get(i)).getEspecialidade();
			        	
			        }
			        tclaudo = new DefaultTableModel(Tablaudo,collaudo);
			                       
			        tbLaudo = new JTable(tclaudo);
			       
			        tbHistPresc5.setViewportView(tbLaudo);
			} 		  
			//telaAgenda.dispose();
		}//fecha o comando buscar prontuario
	     	
	     
	    }//fecha o actionPerformed
    
    static Vector obtemTodosPacientesLiberados()
    {	
    	
     Medico m = new Medico(null,null,null,null,null,null,null,null,null,null,null,null); 
     Paciente pac = new Paciente(0,null,null,null,null,null,null,null,null,null,null,null,null);
     Consulta c=new Consulta();
 	 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
 	 DaoConsulta dao= df.getDaoConsulta();
 	// pac.getMatricula();
     	Vector v=dao.ConsultarTodasConsultas(m,pac,c);
     	return v;
	   
     
	}
     	  
}//controleagenda