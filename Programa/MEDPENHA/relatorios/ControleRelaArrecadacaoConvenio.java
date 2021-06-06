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
import pagamento.Pagamento;

import menuprincipal.Calendario;

public class ControleRelaArrecadacaoConvenio implements ActionListener 
 {
	 private JFrame tela;
     
	 public ControleRelaArrecadacaoConvenio(JFrame tela)
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
         DaoPagamento dao= df.getDaoPagamento();
    	
    	if(evt.getActionCommand().equals("Emitir"))
    	{
    		
    		DaoConvenio daoconvenio= df.getDaoConvenio(); 
  		  	
    		boolean aux;
    		aux=daoconvenio.consultaDataConvenio(pag);
    	  
    	if(aux==true)
    	{
    		Vector relaarrecadconv = new Vector();
  	 
  	  
  		  relaarrecadconv= daoconvenio.preencherRelatorioArrecadConvenio(pag);
						
			//Classe que define o tempo de dado do relatorio
			JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource((Vector)relaarrecadconv);
			
			Map mapa = new HashMap();
			
			try
			{
				
				JasperPrint jasperPrint = JasperFillManager.fillReport("..\\MEDPENHA\\relatorios\\documentos\\relaarrecadacaoconvenio.jasper",mapa,jrbean);
		        JasperViewer.viewReport(jasperPrint, false);
		        //System.out.println(pag.getData());
			}
			catch(Exception ex)
			{
				System.out.println("Erro no relatório"+ex.getMessage());
			}	
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"Nesta data não houve pagamentos por convênio!","Atenção!",JOptionPane.WARNING_MESSAGE);
    	}
    		
    		
    	}
    	
	
	
    }

 
 }