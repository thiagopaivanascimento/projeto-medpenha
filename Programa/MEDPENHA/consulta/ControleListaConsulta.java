package consulta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.DaoFactory;
import paciente.Paciente;
import pagamento.*;
import prontuario.TelaProntuario;
import tipoconsulta.*;
import medico.Medico;
import menuprincipal.Calendario;

public class ControleListaConsulta implements ActionListener{
	private JFrame telaConfConsulta;
	
	
	 public ControleListaConsulta(JFrame telaConfConsulta)
	 	{
		 	this.telaConfConsulta=telaConfConsulta;
	 	}
   
   public void actionPerformed(ActionEvent evt)
	{
	   
	      JPanel pcampo=(JPanel)telaConfConsulta.getContentPane().getComponent(1);
	      JPanel pListaConsulta=(JPanel)pcampo.getComponent(0);
	      Calendario cbdata=(Calendario)pListaConsulta.getComponent(1);
	      JScrollPane jScrollPane1=(JScrollPane)pListaConsulta.getComponent(4);
		  JTable jTable1 =(JTable)jScrollPane1.getViewport().getComponent(0);
		  
		  Consulta cons = new Consulta();
		  Pagamento pag = new Pagamento(null, null, 0, null,null);
		  TipoConsulta tipo = new TipoConsulta();
		  Paciente p = new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);
		  Medico med=new Medico(null, null, null, null, null, null, null, null, null, null, null, null);
		  
		  DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
	      DaoPagamento dao= df.getDaoPagamento();
	      
	      DaoConsulta dao2= df.getDaoConsulta();
	      
	      if(evt.getActionCommand().equals("Voltar"))
	         {	
	    	  telaConfConsulta.dispose();
	         }
	      
	      if(evt.getActionCommand().equals("Efetuar Pagamento da Consulta"))
	         {	
	    	  DefaultTableModel tc = (DefaultTableModel)jTable1.getModel();
	    	 
	    	  try
	    	  {
	    		  cons.setStatus((String)tc.getValueAt(jTable1.getSelectedRow(),8));
	    		  cons.setSituacao((String)tc.getValueAt(jTable1.getSelectedRow(),6));
	    	  }
	    	  catch(Exception ex)
	    	  {
	    		  
	    	  }
	    		
	    	     	     		 
	    	  if(cons.getStatus().equals("Pago"))
	    	  {
	    		  JOptionPane.showMessageDialog(null,"Esta Consulta Consta como Pago!","Atenção",JOptionPane.WARNING_MESSAGE);
	    	  }
	    	  else if(cons.getSituacao().equals("Cancelada"))
	    	  {
	    		  
	    		  JOptionPane.showMessageDialog(null,"Esta Consulta foi cancelada!","Atenção",JOptionPane.WARNING_MESSAGE);
	    		  
	    	  }
	    	  
	    	  else
	    	  {
	    	  
	    	     telaConfConsulta.dispose();
	    	     TelaPagamento tela = new TelaPagamento();
	    	     JPanel pCampo=(JPanel)tela.getTelaPagamento().getContentPane().getComponent(1);
	    	     JPanel pParticular=(JPanel)pCampo.getComponent(0);
	        	 JPanel pDadosPagament=(JPanel)pCampo.getComponent(1);
	        	 JPanel pConsulta=(JPanel)pCampo.getComponent(2);
	        	 JPanel ptotal=(JPanel)pCampo.getComponent(3);
	        	 JPanel pConvenio=(JPanel)pCampo.getComponent(4);
	        	    	 
	        	 JTextField tValorConsulta=(JTextField)ptotal.getComponent(1);
	             JTextField tTotal=(JTextField)ptotal.getComponent(4);

	             JPanel pCheque=(JPanel)pParticular.getComponent(0);   
	             JPanel pCartao=(JPanel)pParticular.getComponent(1);
	             JComboBox cbPagamento=(JComboBox)pParticular.getComponent(3);
	             
	             JTextField tbanco=(JTextField)pCheque.getComponent(1);
	             JTextField tnumcheque=(JTextField)pCheque.getComponent(3);
	             JTextField tagencia=(JTextField)pCheque.getComponent(5);
	             JTextField tnumconta=(JTextField)pCheque.getComponent(7);
	             JTextField tnumserie=(JTextField)pCheque.getComponent(9);
	             
	             JTextField tCartao=(JTextField)pCartao.getComponent(1);
	             
	             JTextField tCnpj=(JTextField)pConvenio.getComponent(2);
	             JTextField bConvenio=(JTextField)pConvenio.getComponent(4);
	             
	             JTextField tDataCons=(JTextField)pConsulta.getComponent(3);
	             JComboBox cbhora=(JComboBox)pConsulta.getComponent(5);
	             JTextField tMatricula=(JTextField)pConsulta.getComponent(7);
	             
	             JScrollPane scrollObs=(JScrollPane)pDadosPagament.getComponent(7);
	    	     JTextArea taObs =(JTextArea)scrollObs.getViewport().getComponent(0);
	             JComboBox cbTipoPagament=(JComboBox)pDadosPagament.getComponent(4);
	             JTextField tData=(JTextField)pDadosPagament.getComponent(1);
	    	     
			 	
			 	 Date data =new Date() ;
	           	
		      	//alterando formato
		      	DateFormat dformat;
		      	String dataAtual;
		      	
		      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		      	dataAtual=dformat.format(data).toString();

		      	      	
		      	tData.setText(dataAtual);
		      	tData.setEnabled(false);
			 	cbPagamento.setEnabled(false); 
			 	tCnpj.setEnabled(false);
			 	bConvenio.setEnabled(false); 
			 	tTotal.setEnabled(false);
			 	tbanco.setEnabled(false);
	            tnumcheque.setEnabled(false);
	            tagencia.setEnabled(false);
	            tnumconta.setEnabled(false);
	            tnumserie.setEnabled(false);
	            tCartao.setEnabled(false); 
	            tDataCons.setEnabled(false); 
	            cbhora.setEnabled(false);
	            taObs.setEnabled(true);
	                                         
			 	 
	    	  try{
				     DefaultTableModel tc2 = (DefaultTableModel)jTable1.getModel();
				     cons.setHora((String)tc2.getValueAt(jTable1.getSelectedRow(),1));
				     cons.setStatus((String)tc2.getValueAt(jTable1.getSelectedRow(),8));
				     cons.setData((String)tc2.getValueAt(jTable1.getSelectedRow(),0));
				     p.setMatricula((Integer)tc2.getValueAt(jTable1.getSelectedRow(),3));
				     
				     }
				     catch(Exception ex)
				     {}	        	    	        
		        
				tDataCons.setText(cons.getData());
				cbhora.setSelectedItem(cons.getHora());
				tMatricula.setText((String.valueOf(p.getMatricula())));
				
		        boolean aux;
				aux=dao.buscaPagamento(cons,p,tipo);
				if(aux==true)
				{	
					//tMatricula.setText(String.valueOf(p.getMatricula()));
					tValorConsulta.setText(String.valueOf(tipo.getValor()));
					tMatricula.setEnabled(false);
					tValorConsulta.setEnabled(false);
				}
				
				
	         }
	    	 	         
	         }
	    	  
	      if(evt.getActionCommand().equals("Confirmar Consulta"))
          {//problema
	    	  try{
	    	  DefaultTableModel tc = (DefaultTableModel)jTable1.getModel();
	    	  cons.setData((String)tc.getValueAt(jTable1.getSelectedRow(),0));
	    	  cons.setHora((String)tc.getValueAt(jTable1.getSelectedRow(),1));
	    	  cons.setNome((String)tc.getValueAt(jTable1.getSelectedRow(),2));
	    	  cons.setNomeMedio((String)tc.getValueAt(jTable1.getSelectedRow(),4));
	    	  cons.setEspecialidade((String)tc.getValueAt(jTable1.getSelectedRow(),5));
	    	  cons.setSituacao((String)tc.getValueAt(jTable1.getSelectedRow(),6));
					      
					      
	    	  if(cons.getSituacao().equals("Confirmado"))
	    	  {
	    		  JOptionPane.showMessageDialog(null,"Esta Consulta já esta Confirmado!","Atenção",JOptionPane.WARNING_MESSAGE);
	    	  }
	    	  else if(cons.getSituacao().equals("Cancelada"))
		    	  {
		    		  JOptionPane.showMessageDialog(null,"Esta Consulta esta Cancelada!","Atenção",JOptionPane.WARNING_MESSAGE);
		    	  }
	    	  else{
	    		  dao2.confirmar(cons, med, p);
	    		  
	    		  	JOptionPane.showMessageDialog(null,"Consulta confirmada com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
	    		  
	    		  Consulta consulta=new Consulta();  
		       		
       		      cbdata.date();
		         int dia=cbdata.date().getDate();
		         int mes=cbdata.date().getMonth()+1;
		         int ano=cbdata.date().getYear()+1900;
		         String d=String.valueOf(dia);
		         String m=String.valueOf(mes);
		         if(d.length()==1)
		         {	d="0"+d;     }
		         if(m.length()==1)
		         {	m="0"+m;     }
		         
		         String a=String.valueOf(ano);
		         String data=(d+"/"+m+"/"+a);
		         
		         consulta.setData(data);

		      DefaultTableModel tc3;
		      
	    		 Vector v=dao2.ListarTodasConsultas(consulta);
	    		 Object [][]T= new Object [v.size()][9];
	    	        Object [] col={"Data","Hora","Paciente","Matricula","Médico","Especialidade","Situação","Tipo","Status"};
	    	                        
	    	        for (int i=0; i< v.size();i++)
	    	        {
	    	        	
	    	        	  	T[i][0]=((Consulta)v.get(i)).getData();
	    	            	T[i][1]=((Consulta)v.get(i)).getHora();          
	    	                T[i][2]=((Consulta)v.get(i)).getNome();
	    	          		T[i][3]=((Consulta)v.get(i)).getMatricula();
	    	          	    T[i][4]=((Consulta)v.get(i)).getNomeMedico();
	    	          		T[i][5]=((Consulta)v.get(i)).getEspecialidade();
	    	          		T[i][6]=((Consulta)v.get(i)).getSituacao();
	    	          		T[i][7]=((Consulta)v.get(i)).getTipo();
	    	          		T[i][8]=((Consulta)v.get(i)).getStatus();
	    	          		    	    	        
	    	        }
	    	        tc3 = new DefaultTableModel(T,col);
	    	                       
	    	        jTable1= new JTable(tc3);
	    	        jScrollPane1.setViewportView(jTable1);		       
					 
	    		  
	    	  }
	    	  }catch(Exception e){	JOptionPane.showMessageDialog(null,"Selecione a linha referente a consulta!","Atenção",JOptionPane.WARNING_MESSAGE);}
          }
	      
	      if(evt.getActionCommand().equals("Cancelar Consulta"))
          {
	    	  try{
	    	  DefaultTableModel tc = (DefaultTableModel)jTable1.getModel();
	    	  cons.setData((String)tc.getValueAt(jTable1.getSelectedRow(),0));
	    	  cons.setHora((String)tc.getValueAt(jTable1.getSelectedRow(),1));
	    	  cons.setNome((String)tc.getValueAt(jTable1.getSelectedRow(),2));
	    	  cons.setNomeMedio((String)tc.getValueAt(jTable1.getSelectedRow(),4));
	    	  cons.setEspecialidade((String)tc.getValueAt(jTable1.getSelectedRow(),5));
	    	  cons.setSituacao((String)tc.getValueAt(jTable1.getSelectedRow(),6));
	    	  cons.setTipo((String)tc.getValueAt(jTable1.getSelectedRow(),7));
	    	  cons.setStatus((String)tc.getValueAt(jTable1.getSelectedRow(),8));
	  
	    	   if(cons.getSituacao().equals("Cancelada"))
		    	  {
		    		  JOptionPane.showMessageDialog(null,"Esta consulta já está cancelada!","Atenção",JOptionPane.WARNING_MESSAGE);
		    	  }
	    	   else if(cons.getStatus().equals("Pago"))
		    	 {
		    		  JOptionPane.showMessageDialog(null,"Esta consulta só pode ser remarcada,pois já está paga!","Atenção",JOptionPane.WARNING_MESSAGE);
		    	}
	    	  else{
	    		
	    		  dao2.cancelar(cons, med, p);
	    		  JOptionPane.showMessageDialog(null,"Consulta cancelada com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
	    		  
	    		  Consulta consulta=new Consulta();  
		       		
       		      cbdata.date();
		         int dia=cbdata.date().getDate();
		         int mes=cbdata.date().getMonth()+1;
		         int ano=cbdata.date().getYear()+1900;
		         String d=String.valueOf(dia);
		         String m=String.valueOf(mes);
		         if(d.length()==1)
		         {	d="0"+d;     }
		         if(m.length()==1)
		         {	m="0"+m;     }
		         
		         String a=String.valueOf(ano);
		         String data=(d+"/"+m+"/"+a);
		         
		         consulta.setData(data);

		      DefaultTableModel tc3;
		      
	    		 Vector v=dao2.ListarTodasConsultas(consulta);
	    		 Object [][]T= new Object [v.size()][9];
	    	        Object [] col={"Data","Hora","Paciente","Matricula","Médico","Especialidade","Situação","Tipo","Status"};
	    	                        
	    	        for (int i=0; i< v.size();i++)
	    	        {
	    	        	
	    	        	  	T[i][0]=((Consulta)v.get(i)).getData();
	    	            	T[i][1]=((Consulta)v.get(i)).getHora();          
	    	                T[i][2]=((Consulta)v.get(i)).getNome();
	    	          		T[i][3]=((Consulta)v.get(i)).getMatricula();
	    	          	    T[i][4]=((Consulta)v.get(i)).getNomeMedico();
	    	          		T[i][5]=((Consulta)v.get(i)).getEspecialidade();
	    	          		T[i][6]=((Consulta)v.get(i)).getSituacao();
	    	          		T[i][7]=((Consulta)v.get(i)).getTipo();
	    	          		T[i][8]=((Consulta)v.get(i)).getStatus();
	    	          		    	    	        
	    	        }
	    	        tc3 = new DefaultTableModel(T,col);
	    	                       
	    	        jTable1= new JTable(tc3);
	    	        jScrollPane1.setViewportView(jTable1);		       
					      
	    		  
	    	  }
    	  
	  }catch(Exception e){	JOptionPane.showMessageDialog(null,"Selecione a linha referente a consulta!","Atenção",JOptionPane.WARNING_MESSAGE);}
          }
   
   
	    	  if(evt.getActionCommand().equals("Buscar Consultas"))
	          {
	       		      Consulta consulta=new Consulta();  
	       		
	       		      cbdata.date();
    		         int dia=cbdata.date().getDate();
    		         int mes=cbdata.date().getMonth()+1;
    		         int ano=cbdata.date().getYear()+1900;
    		         String d=String.valueOf(dia);
    		         String m=String.valueOf(mes);
    		         if(d.length()==1)
    		         {	d="0"+d;     }
    		         if(m.length()==1)
    		         {	m="0"+m;     }
    		         
    		         String a=String.valueOf(ano);
    		         String data=(d+"/"+m+"/"+a);
    		         
    		         consulta.setData(data);

    		      DefaultTableModel tc3;
    		      
    	    		 Vector v=dao2.ListarTodasConsultas(consulta);
    	    		 Object [][]T= new Object [v.size()][9];
    	    	        Object [] col={"Data","Hora","Paciente","Matricula","Médico","Especialidade","Situação","Tipo","Status"};
    	    	                        
    	    	        for (int i=0; i< v.size();i++)
    	    	        {
    	    	        	
    	    	        	  	T[i][0]=((Consulta)v.get(i)).getData();
    	    	            	T[i][1]=((Consulta)v.get(i)).getHora();          
    	    	                T[i][2]=((Consulta)v.get(i)).getNome();
    	    	          		T[i][3]=((Consulta)v.get(i)).getMatricula();
    	    	          	    T[i][4]=((Consulta)v.get(i)).getNomeMedico();
  	    	          		    T[i][5]=((Consulta)v.get(i)).getEspecialidade();
    	    	          		T[i][6]=((Consulta)v.get(i)).getSituacao();
    	    	          		T[i][7]=((Consulta)v.get(i)).getTipo();
    	    	          		T[i][8]=((Consulta)v.get(i)).getStatus();
    	    	          		    	    	        
    	    	        }
    	    	        tc3 = new DefaultTableModel(T,col);
    	    	                       
    	    	        jTable1= new JTable(tc3);
    	    	        jScrollPane1.setViewportView(jTable1);		       
    					      
    					
	    		  
	          }
	         }
	      
 public static Vector obtemTodasConsultas() {
		DaoConsultaPSQL c=new DaoConsultaPSQL();
		Consulta con =new Consulta();
   	Vector v=c.ListarTodasConsultas(con);
	return v;
 }
}
