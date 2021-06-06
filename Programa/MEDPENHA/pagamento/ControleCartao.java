package pagamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ControleCartao implements ActionListener
{	
	     private JFrame telaCartao;
	     private String numartao;
	        
	     public ControleCartao(JFrame telaCartao)
	   {
		  this.telaCartao=telaCartao;
	   }
	    public void actionPerformed (ActionEvent evt)
	    {
	    	 JPanel pcampo=(JPanel)telaCartao.getContentPane().getComponent(0);
	    	 JPanel pCartao=(JPanel)pcampo.getComponent(1);
	    	 JTextField tCartao=(JTextField)pCartao.getComponent(1);
	    	 
	    	 Cartao cartao=new Cartao(null, null, null, 0, null,null);
	    	 cartao.setNumcartao(tCartao.getText());
	    	 
	    	 if(evt.getActionCommand().equals("Salvar"))
	          {
	    		 if(tCartao.getText().equals(""))
	    		 {
	    			 JOptionPane.showMessageDialog(null,"Por favor,preencha o numero do cartão!","Atenção",JOptionPane.WARNING_MESSAGE);
	    		 }
	    		 else{
	    		 numartao=cartao.getNumcartao();       	  
	        	             }
	          }
	    	 
	    }
	    
	    
}
