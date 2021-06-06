package tipoconsulta;

import java.awt.event.*;
import javax.swing.*;
import dao.*;

public class ControlePreco implements ActionListener
  {
     private JFrame telaPreco;
   
        
     public ControlePreco(JFrame telaPreco)
   {
	  this.telaPreco=telaPreco;
   }
    public void actionPerformed (ActionEvent evt)
    {
    	 JPanel pcampo=(JPanel)telaPreco.getContentPane().getComponent(0);
         JPanel ppreco=(JPanel)pcampo.getComponent(0);
         
         JComboBox cbTipoConsulta=(JComboBox)ppreco.getComponent(1);
         JTextField tValorConsulta=(JTextField)ppreco.getComponent(4);
         
         TipoConsulta tipo = new TipoConsulta();
         
         DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         DaoPreco dao= df.getDaoPreco();
        
         int index=cbTipoConsulta.getSelectedIndex();
         tipo.setTipo((String)cbTipoConsulta.getItemAt(index)); 
         
         if(tValorConsulta.getText().equals(""))
         { }
         else
         {	
      	   try{
        
      	     double valor = Double.parseDouble(tValorConsulta.getText());	
      		 tipo.setValor(valor);
      	    }
      		 catch(Exception e)
  	      	 {
      			 JOptionPane.showMessageDialog(null,"Valor da Consulta inválido!","Erro",JOptionPane.ERROR_MESSAGE);  
  	      	 }	
         }
         if(evt.getActionCommand().equals("Voltar"))
    		{ 
        	 telaPreco.dispose();
    		} 
         
          if(evt.getActionCommand().equals("Alterar"))
 	 	  {	  
     	     try{
     	    	  double valor = Double.parseDouble(tValorConsulta.getText());	
         		  tipo.setValor(valor);
 					
   				  		dao.alterar(tipo);
   		        		 
   				  	    tValorConsulta.setText("");
   		        		 	              			              		 
 	              		 JOptionPane.showMessageDialog(null,"Preço da Consulta Alterado com sucesso!","Dados Alterados",JOptionPane.INFORMATION_MESSAGE);
     		   }
 		      	 catch(Exception e)
 		      	 {
 		  		    
 		      	 }	
       	  }
         
          if(evt.getActionCommand().equals("Consultar"))
     	  { 
        		 boolean aux=dao.visualizar(tipo);
        		 if(aux==true){
        		 tValorConsulta.setText(String.valueOf(tipo.getValor()));
        		 }
        
         }
      
 	 	}
    }
    
