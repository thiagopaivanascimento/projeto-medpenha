package relatorios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

import convenio.DaoConvenio;
import dao.DaoFactory;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import pagamento.DaoPagamento;
import pagamento.DaoPagamentoParticular;
import pagamento.Pagamento;

import menuprincipal.Calendario;

public class ControleRelaPagamentoParticular implements ActionListener 
 {
	 private JFrame tela;
     
	 public ControleRelaPagamentoParticular(JFrame tela)
      {
	   this.tela=tela;
      }
    
    public void actionPerformed(ActionEvent evt)
	{
    	JPanel pcampo=(JPanel)tela.getContentPane().getComponent(0);
    	JPanel prelatorio=(JPanel)pcampo.getComponent(0);
    	Calendario cbdata=(Calendario)prelatorio.getComponent(1);
	
    	Pagamento pag = new Pagamento(null, null, 0, null,null);
    	
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
  	  
		 pag.setData(data); 
		 
		 
		 DaoFactory df=DaoFactory.getDAOFactory(DaoFactory.POSTGRESQL);
         
    	
    	if(evt.getActionCommand().equals("Emitir"))
    	{
    		
    		DaoPagamentoParticular daoparticular= df.getDaoPagamentoParticular(); 
  		  
    		boolean aux;
    		aux=daoparticular.buscaDataPagamentoParticular(pag);
    	  
    	if(aux==true)
    	{	
    		    		
    		Vector relapagpart = new Vector();
  	 
  	  
  		  relapagpart= daoparticular.preencherRelatorioPagParticular(pag);
						
			//Classe que define o tempo de dado do relatorio
			JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)relapagpart);
			
			Map mapa = new HashMap();
			
			try
			{
				JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\relapagparticular.jasper",mapa,jrbean);
		        JasperViewer.viewReport(jasperPrint, false);
				
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Erro no relatório"+ex.getMessage());
				
			}	
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"Nesta data não houve pagamentos particular!","Atenção!",JOptionPane.WARNING_MESSAGE);
    	}
    		
    		
    	}
    	
	
	
    }

 
 }