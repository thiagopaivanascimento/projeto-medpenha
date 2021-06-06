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
  	      JOptionPane.showMessageDialog(null,"Matrícula inválida,Por Favor digite outra matrícula e refaça a busca do paciente","Erro",JOptionPane.ERROR_MESSAGE);
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
        	  cbnomeMedico.setSelectedItem("Selecione o Nome do Médico");
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
        	if(cbnomeMedico.getSelectedItem().equals("Selecione o Nome do Médico"))
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
           			//cbstatus.setSelectedItem("Não pago");
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
         		JOptionPane.showMessageDialog(null,"Você precisa preencher o campo Matrícula!","Atenção",JOptionPane.WARNING_MESSAGE);
         	}
         	else
         	{
         		
         			boolean aux=dao.buscarPaciente(paciente);
         			if(aux==false)
         			{
         				JOptionPane.showMessageDialog(null,"Paciente não cadastrado no sistema, por favor verifique a matrícula!","Atenção",JOptionPane.WARNING_MESSAGE); 
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
        	 if(cbnomeMedico.getSelectedItem().equals("Selecione o Nome do Médico"))
             {
        	     JOptionPane.showMessageDialog(null,"Você precisa selecionar para qual médico deseja marcar a consulta!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }       	
      	   	 else if((tMatricula.getText().equals(""))&&(tNomePaciente.getText().equals("")))
             {
        		 JOptionPane.showMessageDialog(null,"Você precisa buscar o paciente!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
      	   	 else if(ccbhora.getSelectedItem().equals("Selecione a hora"))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Você precisa selecionar a hora!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
      	   	 }
      	   	 else if(cbTipoConsulta.getSelectedItem().equals("Selecione o tipo de consulta"))
    	   	 {
    	   		 JOptionPane.showMessageDialog(null,"Você precisa selecionar qual o tipo de consulta deseja!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
    	  	 }
      	   	 else if(cbstatus.getSelectedItem().equals("Selecione o status"))
  	   	 	{
  	   		 JOptionPane.showMessageDialog(null,"Você precisa selecionar o status da consulta!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
  	   	 	}
      	   	 else if((cbTipoConsulta.getSelectedItem().equals("Consulta Normal"))&&(cbstatus.getSelectedIndex()==2))
  	   	 	{
  	   		 JOptionPane.showMessageDialog(null,"Esta consulta é normal, seu status deve ser Não Pago!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
  	   	 	}
      	   	else if((cbTipoConsulta.getSelectedItem().equals("Consulta Retorno"))&&(cbstatus.getSelectedIndex()==1))
      	   	{
      		   JOptionPane.showMessageDialog(null,"Esta consulta é retorno, seu status deve ser Pago !","Atenção",JOptionPane.WARNING_MESSAGE);  	 
      	   	}
      	   	        	 
      	   	 else{
      	   	      
      	       String valido=Validadata();
      	       if(valido=="não")
      	       {
      	    	 JOptionPane.showMessageDialog(null,"Data inválida,Por Favor escolha outra data","Atenção",JOptionPane.WARNING_MESSAGE);
      	       }
      	       else{
    	      	          
      	    	   boolean aux=dao.ValidadispPac(consulta,paciente);
      	    	   if(aux==true)
      	    	   {
      	    		 JOptionPane.showMessageDialog(null,"Este paciente já possui uma consulta marcada neste dia e nesta hora","Atenção",JOptionPane.WARNING_MESSAGE);
      	    	   }
      	    	   else 
      	    	   {
      	    		 boolean aux1=dao.ValidadispMed(consulta,medico);
        	    	   if(aux1==true)
        	    	   {
        	    		 JOptionPane.showMessageDialog(null,"Este médico já possui uma consulta marcada neste dia e nesta hora","Atenção",JOptionPane.WARNING_MESSAGE);
        	    	   }
        	    	           	    	   
        	    	   else 
        	    	   {
      	    		   dao.adicionar(consulta, medico,paciente,tipo);   
        	         	    	
      	    		   cbnomeMedico.setSelectedItem("Selecione o Nome do Médico");
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
            	  JOptionPane.showMessageDialog(null,"Você precisa buscar o paciente!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
        	 else if(tNomePaciente.getText().equals(""))
      	   	 {
        		 JOptionPane.showMessageDialog(null,"Você precisa buscar o paciente!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
      	   	 }
        	 else if(ccbhora.getSelectedItem().equals("Selecione a hora"))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Você precisa selecionar a hora da consulta!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
      	   	     
      	   	 }
        	 
    	     else{
    		     boolean aux=dao.visualizar(consulta,paciente,medico,tipo);
    		     tMatricula.setEnabled(false); 
    		     if(aux==false)
    			 {	
    				JOptionPane.showMessageDialog(null,"Consulta não cadastrada no sistema","Atenção",JOptionPane.WARNING_MESSAGE);  
    				
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
				   if(consulta.getStatus().equals("Não pago"))
					  {
					   //cbstatus.setSelectedItem("Não pago");
					   System.out.println("Não paguei");
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
         //alteração a partir daqui
         if(evt.getActionCommand().equals("Remarcar"))
          {
        	 if((tMatricula.getText().equals(""))&&(tNomePaciente.getText().equals("")))
             {
        		 JOptionPane.showMessageDialog(null,"Você precisa buscar o paciente!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }
        	 else if(ccbhora.getSelectedItem().equals("Selecione a hora"))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Você precisa selecionar a hora da consulta!","Atenção",JOptionPane.WARNING_MESSAGE);  	     	   	     
      	   	 }
        	 else if(data.equals(dataatual))
      	   	 {
      	   		 JOptionPane.showMessageDialog(null,"Você precisa selecionar o dia da consulta!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
      	   	 }
        	 else if((cbnomeMedico.getSelectedItem().equals("Selecione o Nome do Médico"))||(tEspecialidade.getText().equals(""))
        			 ||(cbTipoConsulta.getSelectedItem().equals("Selecione o tipo de consulta"))|| (tValorConsulta.getText().equals(""))
        			 ||(cbstatus.getSelectedItem().equals("Selecione o status")))
             {
        	     JOptionPane.showMessageDialog(null,"Você precisa consultar os dados da consulta,Precione o botão visualizar!","Atenção",JOptionPane.WARNING_MESSAGE);  	 
             }       
        	 else{
        	   	      
            	       String valido=Validadata();
            	       if(valido=="não")
            	       {
            	    	 JOptionPane.showMessageDialog(null,"Data inválida,Por Favor escolha outra data","Atenção",JOptionPane.WARNING_MESSAGE);
            	       }
            	       else{
          	      	          
            	    	   boolean aux=dao.ValidadispPac(consulta,paciente);
            	    	   if(aux==true)
            	    	   {
            	    		 JOptionPane.showMessageDialog(null,"Este paciente já possui uma consulta marcada neste dia e nesta hora","Atenção",JOptionPane.WARNING_MESSAGE);
            	    	   }
            	    	   else 
            	    	   {
            	    		 boolean aux1=dao.ValidadispMed(consulta,medico);
              	    	   if(aux1==true)
              	    	   {
              	    		 JOptionPane.showMessageDialog(null,"Este médico já possui uma consulta marcada neste dia e nesta hora","Atenção",JOptionPane.WARNING_MESSAGE);
              	    	   }
              	    	   else 
              	    	   {
            	    		   dao.alterar(consulta, medico,paciente,tipo);   
              	         	    	
            	    		   cbnomeMedico.setSelectedItem("Selecione o Nome do Médico");
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
        	   valido="não";
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
	
	
		
	     
		
	
