package consulta;

import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;

import medico.*;
import paciente.*;
import tipoconsulta.*;
import dao.*;
import menuprincipal.*;

public class ControleConsulta implements ActionListener{
	 
	private JFrame telaConsulta;
     
	 public ControleConsulta(JFrame telaConsulta)
   {
	   this.telaConsulta=telaConsulta;
   }
    
    public void actionPerformed(ActionEvent evt)
	{
    	 JPanel pcampo=(JPanel)telaConsulta.getContentPane().getComponent(1);
    	 JPanel pmedico=(JPanel)pcampo.getComponent(2);
         JPanel pPaciente=(JPanel)pcampo.getComponent(3);
         JPanel pConsulta=(JPanel)pcampo.getComponent(4);
    	 JPanel ptipoConsulta=(JPanel)pcampo.getComponent(5);
                 
    	 JComboBox cbnomeMedico=(JComboBox)pmedico.getComponent(2);
         JTextField tEspecialidade=(JTextField)pmedico.getComponent(4);
                 
         JTextField tMatricula=(JTextField)pPaciente.getComponent(2);
         JTextField tNomePaciente=(JTextField)pPaciente.getComponent(5);
         
         JComboBox cbstatus=(JComboBox)pConsulta.getComponent(2);
         JComboBox ccbhora=(JComboBox)pConsulta.getComponent(4);
         JComboBox cbsituacao=(JComboBox)pConsulta.getComponent(8);
         Calendario ccb=(Calendario)pConsulta.getComponent(10);
         JScrollPane jScrollPane2=(JScrollPane)pConsulta.getComponent(13);
	     JTextArea txtPendencias =(JTextArea)jScrollPane2.getViewport().getComponent(0);
         
         
         JTextField tValorConsulta=(JTextField)ptipoConsulta.getComponent(4);
         JComboBox cbTipoConsulta=(JComboBox)ptipoConsulta.getComponent(2);
      
                  
         Consulta consulta = new Consulta();
         Medico medico=new Medico(null, null, null, null, null, null, null, null, null, null, null, null);
         Paciente paciente=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);         
         TipoConsulta tipo = new TipoConsulta();
         //Pagamento pagamento=new Pagamento(null, null, null, null);
        
         
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoConsulta dao= df.getDaoConsulta();
  			        
         ccb.date();
         int dia=ccb.date().getDate();
         int mes=ccb.date().getMonth()+1;
         int ano=ccb.date().getYear()+1900;
         String d=String.valueOf(dia);
         String m=String.valueOf(mes);
         if(d.length()==1)
         {	d="0"+d;     }
         if(m.length()==1)
         {	m="0"+m;     }
         
         String a=String.valueOf(ano);
         String data=(d+"/"+m+"/"+a);
   	  
		 consulta.setData(data);  
  	       	     
         int index=cbsituacao.getSelectedIndex();
	     consulta.setSituacao((String)cbsituacao.getItemAt(index)); 
	     
	     int index1=ccbhora.getSelectedIndex();
	     consulta.setHora((String)ccbhora.getItemAt(index1)); 
	     
	     int index2=cbstatus.getSelectedIndex();
	     consulta.setStatus((String)cbstatus.getItemAt(index2)); 
	     
	     int index3=cbnomeMedico.getSelectedIndex();
	     medico.setNome((String)cbnomeMedico.getItemAt(index3));
	     
	     medico.setEspecialidade(tEspecialidade.getText());
    	 consulta.setPendencias(txtPendencias.getText());
	         	      	 
	     int index4=cbTipoConsulta.getSelectedIndex();
         tipo.setTipo((String)cbTipoConsulta.getItemAt(index4));         
         
         paciente.setNome(tNomePaciente.getText());
         
        if(tMatricula.getText().equals(""))
        {}
        else{
        	try{
         int mat=Integer.parseInt(tMatricula.getText());
         paciente.setMatricula(mat);
        }
		 catch(Exception e)
           {
  	      JOptionPane.showMessageDialog(null,"Matr�cula inv�lida,Por Favor digite outra matr�cula e refa�a a busca do paciente","Erro",JOptionPane.ERROR_MESSAGE);
           }
        }
        
         if(tValorConsulta.getText().equals(""))
         {}
         else{
        	 double valor = Double.parseDouble(tValorConsulta.getText());	
        	 tipo.setValor(valor);
         }
		 
                
            Date date =new Date() ;
        	
	      	//alterando formato
	      	DateFormat dformat;
	      	String dataatual;		      	
	      	dformat=DateFormat.getDateInstance(DateFormat.MEDIUM);
	      	dataatual=dformat.format(date).toString();
	      	
	      	tMatricula.setEnabled(true);
         
	     
         if(evt.getActionCommand().equals("Voltar"))
      	 {      	  
        	telaConsulta.dispose();
         }
         
         if(evt.getActionCommand().equals("Limpar"))
      	 {      	  
        	  cbnomeMedico.setSelectedItem("Selecione o Nome do M�dico");
        	  tEspecialidade.setText("");
        	  tMatricula.setText("");
        	  tMatricula.setEditable(true); 
              tNomePaciente.setText("");
		      ccbhora.setSelectedItem("Selecione a hora");
		      cbstatus.setSelectedItem("Selecione o status");
		      txtPendencias.setText("");
		      cbTipoConsulta.setSelectedItem("Selecione o tipo de consulta");
		      tValorConsulta.setText("");
		      ccb.setSelectedItem(dataatual);
          }
                   
         if(evt.getSource()==cbnomeMedico)
         {
        	medico.setNome((String)cbnomeMedico.getSelectedItem());
        	boolean aux=dao.bucarEspecialidade(medico);
        	if(aux==true)
        	{
        		tEspecialidade.setText(medico.getEspecialidade());
        	}      
        	if(cbnomeMedico.getSelectedItem().equals("Selecione o Nome do M�dico"))
        	{
        		tEspecialidade.setText("");
        	}
         }
         
         if(evt.getSource()==cbTipoConsulta)
         {
        	   	 int index5=cbstatus.getSelectedIndex();
        	 tipo.setTipo((String)cbTipoConsulta.getSelectedItem());
        	  boolean aux=dao.bucarValor(tipo);
        	 if(aux==true)
        	 {
        		 String valor=String.valueOf(tipo.getValor());
        		 tValorConsulta.setText(valor);
           		 
        		 /*if(cbTipoConsulta.getSelectedItem().equals("Consulta Retorno"))
        		 
        		 {    
        		     //index5=1;
        			 cbstatus.setSelectedIndex(1);
           			// cbstatus.setSelectedItem("Pago");
        		 }
           		 else
        		
        		 {
           			// index5=0;
           			//cbstatus.setSelectedItem(0);
           			//cbstatus.setSelectedItem("N�o pago");
           		  cbstatus.setSelectedIndex(0);
        		 }
        	 }*/
        	 }
        	 else
        	 {
        		   tValorConsulta.setText("");
        		   //cbstatus.setSelectedIndex(0);
        		
        	 }
         }       
         
         if(evt.getActionCommand().equals("Buscar Paciente"))
    		{ 	   
        	 
        	 
         	if(tMatricula.getText().equals(""))
         	{
         		JOptionPane.showMessageDialog(null,"Voc� precisa preencher o campo Matr�cula!","Aten��o",JOptionPane.WARNING_MESSAGE);
         	}
         	else
         	{
         		
         			boolean aux=dao.buscarPaciente(paciente);
         			if(aux==false)
         			{
         				JOptionPane.showMessageDialog(null,"Paciente n�o cadastrado no sistema, por favor verifique a matr�cula!","Aten��o",JOptionPane.WARNING_MESSAGE); 
         			}
         			else
         			{
         					tNomePaciente.setText(paciente.getNome());
    			 			tMatricula.setText(String.valueOf(paciente.getMatricula()));
    			 			tMatricula.setEnabled(false);
    			 			tNomePaciente.setEnabled(false);
    		     	} 
         		
             	}
         		
         	  }
    		
         
         if(evt.getActionCommand().equals("Marcar"))
 		{ 	   
        	 if(cbnomeMedico.getSelectedItem().equals("Selecione o Nome do M�dico"))
             {
        	     JOptionPane.showMessageDialog(null,"Voc� precisa selecionar para qual m�dico deseja marcar a consulta!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }       	
      	   	 else if((tMatricula.getText().equals(""))&&(tNomePaciente.getText().equals("")))
             {
        		 JOptionPane.showMessageDialog(null,"Voc� precisa buscar o paciente!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
      	   	 else if(ccbhora.getSelectedItem().equals("Selecione a hora"))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Voc� precisa selecionar a hora!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
      	   	 }
      	   	 else if(cbTipoConsulta.getSelectedItem().equals("Selecione o tipo de consulta"))
    	   	 {
    	   		 JOptionPane.showMessageDialog(null,"Voc� precisa selecionar qual o tipo de consulta deseja!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
    	  	 }
      	   	 else if(cbstatus.getSelectedItem().equals("Selecione o status"))
  	   	 	{
  	   		 JOptionPane.showMessageDialog(null,"Voc� precisa selecionar o status da consulta!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
  	   	 	}
      	   	 else if((cbTipoConsulta.getSelectedItem().equals("Consulta Normal"))&&(cbstatus.getSelectedIndex()==2))
  	   	 	{
  	   		 JOptionPane.showMessageDialog(null,"Esta consulta � normal, seu status deve ser N�o Pago!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
  	   	 	}
      	   	else if((cbTipoConsulta.getSelectedItem().equals("Consulta Retorno"))&&(cbstatus.getSelectedIndex()==1))
      	   	{
      		   JOptionPane.showMessageDialog(null,"Esta consulta � retorno, seu status deve ser Pago !","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
      	   	}
      	   	        	 
      	   	 else{
      	   	      
      	       String valido=Validadata();
      	       if(valido=="n�o")
      	       {
      	    	 JOptionPane.showMessageDialog(null,"Data inv�lida,Por Favor escolha outra data","Aten��o",JOptionPane.WARNING_MESSAGE);
      	       }
      	       else{
    	      	          
      	    	   boolean aux=dao.ValidadispPac(consulta,paciente);
      	    	   if(aux==true)
      	    	   {
      	    		 JOptionPane.showMessageDialog(null,"Este paciente j� possui uma consulta marcada neste dia e nesta hora","Aten��o",JOptionPane.WARNING_MESSAGE);
      	    	   }
      	    	   else 
      	    	   {
      	    		 boolean aux1=dao.ValidadispMed(consulta,medico);
        	    	   if(aux1==true)
        	    	   {
        	    		 JOptionPane.showMessageDialog(null,"Este m�dico j� possui uma consulta marcada neste dia e nesta hora","Aten��o",JOptionPane.WARNING_MESSAGE);
        	    	   }
        	    	           	    	   
        	    	   else 
        	    	   {
      	    		   dao.adicionar(consulta, medico,paciente,tipo);   
        	         	    	
      	    		   cbnomeMedico.setSelectedItem("Selecione o Nome do M�dico");
      	    		   tEspecialidade.setText("");
      	    		   tMatricula.setText("");
      	    		   tNomePaciente.setText("");
      	    		   ccbhora.setSelectedItem("Selecione a hora");
      	    		   txtPendencias.setText("");
      	    		  cbstatus.setSelectedItem("Selecione o status");
      	    		   cbTipoConsulta.setSelectedItem("Selecione o tipo de consulta");
      	    		   tValorConsulta.setText("");
      	    		   ccb.setSelectedItem(dataatual);
      	    		   JOptionPane.showMessageDialog(null,"Consulta Marcada com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
      	      }
      	   }
 		}
 	}
} 
        
         if(evt.getActionCommand().equals("Visualizar"))
       	{ 
        	     	     
        	 if(tMatricula.getText().equals(""))
             {
            	  JOptionPane.showMessageDialog(null,"Voc� precisa buscar o paciente!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
        	 else if(tNomePaciente.getText().equals(""))
      	   	 {
        		 JOptionPane.showMessageDialog(null,"Voc� precisa buscar o paciente!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
      	   	 }
        	 else if(ccbhora.getSelectedItem().equals("Selecione a hora"))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Voc� precisa selecionar a hora da consulta!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
      	   	     
      	   	 }
        	 
    	     else{
    		     boolean aux=dao.visualizar(consulta,paciente,medico,tipo);
    		     tMatricula.setEnabled(false); 
    		     if(aux==false)
    			 {	
    				JOptionPane.showMessageDialog(null,"Consulta n�o cadastrada no sistema","Aten��o",JOptionPane.WARNING_MESSAGE);  
    				
    			 }
			     else
			     {
			       tMatricula.setEditable(false); 
			       ccb.setSelectedItem(consulta.getData());
				   cbnomeMedico.setSelectedItem(medico.getNome());
				   tEspecialidade.setText(medico.getEspecialidade());
				  
				   ccbhora.setSelectedItem(consulta.getHora());
				   
				   if(consulta.getStatus().equals("Pago"))
				   {
					   System.out.println("Eu paguei!");
					   cbstatus.setSelectedIndex(1);
				   }
				   if(consulta.getStatus().equals("N�o pago"))
					  {
					   //cbstatus.setSelectedItem("N�o pago");
					   System.out.println("N�o paguei");
					   cbstatus.setSelectedIndex(0);
					  }
				   cbsituacao.setSelectedItem(consulta.getSituacao());
				   txtPendencias.setText(consulta.getPendencias());
				   cbTipoConsulta.setSelectedItem(tipo.getTipo());
				   cbTipoConsulta.setEnabled(false);
				   tValorConsulta.setText(String.valueOf(tipo.getValor()));
				   
								 	
			 }
    	 }
       	}
         //altera��o a partir daqui
         if(evt.getActionCommand().equals("Remarcar"))
          {
        	 if((tMatricula.getText().equals(""))&&(tNomePaciente.getText().equals("")))
             {
        		 JOptionPane.showMessageDialog(null,"Voc� precisa buscar o paciente!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }
        	 else if(ccbhora.getSelectedItem().equals("Selecione a hora"))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Voc� precisa selecionar a hora da consulta!","Aten��o",JOptionPane.WARNING_MESSAGE);  	     	   	     
      	   	 }
        	 else if(data.equals(dataatual))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Voc� precisa selecionar o dia da consulta!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
      	   	 }
        	 else if((cbnomeMedico.getSelectedItem().equals("Selecione o Nome do M�dico"))||(tEspecialidade.getText().equals(""))
        			 ||(cbTipoConsulta.getSelectedItem().equals("Selecione o tipo de consulta"))|| (tValorConsulta.getText().equals(""))
        			 ||(cbstatus.getSelectedItem().equals("Selecione o status")))
             {
        	     JOptionPane.showMessageDialog(null,"Voc� precisa consultar os dados da consulta,Precione o bot�o visualizar!","Aten��o",JOptionPane.WARNING_MESSAGE);  	 
             }       
        	 else{
        	   	      
            	       String valido=Validadata();
            	       if(valido=="n�o")
            	       {
            	    	 JOptionPane.showMessageDialog(null,"Data inv�lida,Por Favor escolha outra data","Aten��o",JOptionPane.WARNING_MESSAGE);
            	       }
            	       else{
          	      	          
            	    	   boolean aux=dao.ValidadispPac(consulta,paciente);
            	    	   if(aux==true)
            	    	   {
            	    		 JOptionPane.showMessageDialog(null,"Este paciente j� possui uma consulta marcada neste dia e nesta hora","Aten��o",JOptionPane.WARNING_MESSAGE);
            	    	   }
            	    	   else 
            	    	   {
            	    		 boolean aux1=dao.ValidadispMed(consulta,medico);
              	    	   if(aux1==true)
              	    	   {
              	    		 JOptionPane.showMessageDialog(null,"Este m�dico j� possui uma consulta marcada neste dia e nesta hora","Aten��o",JOptionPane.WARNING_MESSAGE);
              	    	   }
              	    	   else 
              	    	   {
            	    		   dao.alterar(consulta, medico,paciente,tipo);   
              	         	    	
            	    		   cbnomeMedico.setSelectedItem("Selecione o Nome do M�dico");
            	    		   tEspecialidade.setText("");
            	    		   tMatricula.setText("");
            	    		   tNomePaciente.setText("");
            	    		   ccbhora.setSelectedItem("Selecione a hora");
            	    		   txtPendencias.setText("");
            	    		   cbstatus.setSelectedItem("Selecione o status");
            	    		   cbTipoConsulta.setSelectedItem("Selecione o tipo de consulta");
            	    		   tValorConsulta.setText("");
            	    		   ccb.setSelectedItem(dataatual);
            	    		   JOptionPane.showMessageDialog(null,"Consulta Remarcada com sucesso!","Dados Salvos",JOptionPane.INFORMATION_MESSAGE);
            	      }
            	   }
       		}
       	}
        		 
        	 }
        
   
     	
	
	}
  
   

	public String Validadata()
    {
    	String valido=null;
    	 JPanel pcampo=(JPanel)telaConsulta.getContentPane().getComponent(1);
    	 JPanel pConsulta=(JPanel)pcampo.getComponent(4);
    	 Calendario ccb=(Calendario)pConsulta.getComponent(10);
    	   
    	   Date dat =new Date() ;
   	       String dataatual;
   	       DateFormat dformat;
   		   int dia=ccb.date().getDate();
   		   int mes=ccb.date().getMonth()+1;
   	       int ano=ccb.date().getYear()+1900;
    	   
   	       int diaa =dat.getDate();
    	   int mesa =dat.getMonth()+1;
    	   int anoa =dat.getYear()+1900;
   	      
           if((ano==anoa)&&((mes==mesa)||(mes==mesa+1))&&(dia>diaa))
           {
        	   valido="sim";
           }
           else if((ano>anoa)&&(ano==anoa+1)&&(mes==1)&&(mesa==12))
           {
        	valido="sim";
           }
           else{
        	   valido="n�o";
           }
           
           return valido;
    }
    
       
    
    
   // static Consulta consulta = new Consulta();
   // Medico medico=new Medico(null, null, null, null, null, null, null, null, null, null, null, null);
    //static Paciente paciente=new Paciente(0, null, null, null, null, null, null, null, null, null, null, null, null);  
    
	//public static Vector obtemTodasConsultas() {
	//	DaoConsultaPSQL c=new DaoConsultaPSQL();
     //	Vector v=c.ConsultarTodasConsultas(paciente,consulta);
     //	return v;
	}
	
	
		
	     
		
	
