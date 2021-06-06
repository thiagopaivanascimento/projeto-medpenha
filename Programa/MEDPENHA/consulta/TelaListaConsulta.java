package consulta;

import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import medico.ControleMedico;
import menuprincipal.*;

public class TelaListaConsulta {

 
	private JFrame telaConfConsulta;
    private JButton CancConsulta,ConfConsulta,ConfConsulta1,btnVoltar,btnlistar;
   // private JComboBox cbdata;
    private JLabel lBanner;
    private JPanel pBotao;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel lAstData;
    private JLabel lData;
    private JLabel lMsg;
    private JPanel pBanner;
    private JPanel pCampo;
    private JPanel pListaConsulta;
    // End of variables declaration
	
	
    public TelaListaConsulta(){ 

    	telaConfConsulta=new JFrame();
        pBanner = new JPanel();
        lBanner = new JLabel();
        pCampo = new JPanel();
        pListaConsulta = new JPanel();
        lData = new JLabel();
        Calendario cbdata = new Calendario(true);
        lAstData = new JLabel();
        pBotao = new JPanel();
        ConfConsulta = new JButton();
        ConfConsulta1 = new JButton();
        btnVoltar = new JButton();
        CancConsulta = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        lMsg = new JLabel();
        btnlistar=new JButton();

        telaConfConsulta.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaConfConsulta.setTitle("Lista de Consultas");
        telaConfConsulta.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaConfConsulta.setResizable(false);
       

        pBanner.setBackground(new java.awt.Color(213, 244, 226));
        pBanner.setAutoscrolls(true);

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerListaConsulta.png")); // NOI18N

        javax.swing.GroupLayout pBannerLayout = new javax.swing.GroupLayout(pBanner);
        pBanner.setLayout(pBannerLayout);
        pBannerLayout.setHorizontalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBannerLayout.createSequentialGroup()
                .addComponent(lBanner)
                .addContainerGap(0, Short.MAX_VALUE))
        );
        pBannerLayout.setVerticalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBannerLayout.createSequentialGroup()
                .addComponent(lBanner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        pListaConsulta.setBackground(new java.awt.Color(213, 244, 226));
        pListaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listagem de Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lData.setFont(new java.awt.Font("Calibri", 0, 12));
        lData.setText("Data:");

        cbdata.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstData.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstData.setForeground(new java.awt.Color(255, 51, 51));
        lAstData.setText("*");

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ConfConsulta.setFont(new java.awt.Font("Calibri", 0, 12));
        ConfConsulta.setIcon(new javax.swing.ImageIcon("imagens\\ConfirmarConsulta.png")); // NOI18N
        ConfConsulta.setText("Confirmar Consulta");

        ConfConsulta1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ConfConsulta1.setIcon(new javax.swing.ImageIcon("imagens\\efetuarpagamento.png")); // NOI18N
        ConfConsulta1.setText("Efetuar Pagamento da Consulta");

        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        btnlistar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnlistar.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnlistar.setText("Buscar Consultas");
        
        CancConsulta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        CancConsulta.setIcon(new javax.swing.ImageIcon("imagens\\CancelarConsulta.png")); // NOI18N
        CancConsulta.setText("Cancelar Consulta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ConfConsulta)
                .addGap(60, 60, 60)
                .addComponent(CancConsulta)
                .addGap(60, 60, 60)
                .addComponent(ConfConsulta1)
                .addGap(60, 60, 60)
                .addComponent(btnVoltar)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfConsulta)
                    .addComponent(CancConsulta)
                    .addComponent(ConfConsulta1)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DefaultTableModel tc3;
	      
		 Vector v=ControleListaConsulta.obtemTodasConsultas();
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

        javax.swing.GroupLayout pListaConsultaLayout = new javax.swing.GroupLayout(pListaConsulta);
        pListaConsulta.setLayout(pListaConsultaLayout);
        pListaConsultaLayout.setHorizontalGroup(
            pListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pListaConsultaLayout.createSequentialGroup()
                        .addComponent(lData)
                        .addGap(10, 10, 10)
                        .addComponent(cbdata, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstData)
                         .addGap(10, 10, 10)
                        .addComponent(btnlistar)    
                        .addGap(547, 547, 547))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                    .addComponent(pBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pListaConsultaLayout.setVerticalGroup(
            pListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData)
                    .addComponent(cbdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstData)
                    .addComponent(btnlistar))
                .addGap(36, 36, 36)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pListaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lMsg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pListaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaConfConsulta.getContentPane());
        telaConfConsulta.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ControleListaConsulta listaonsulta= new ControleListaConsulta(telaConfConsulta);
        CancConsulta.addActionListener(listaonsulta);
        ConfConsulta.addActionListener(listaonsulta);
        ConfConsulta1.addActionListener(listaonsulta);
        btnVoltar.addActionListener(listaonsulta);
        btnlistar.addActionListener(listaonsulta);

        telaConfConsulta.pack();
        telaConfConsulta.setVisible(true);
        //telaConfConsulta.setLocation(120,0);
    
       //centraliza a tela
        telaConfConsulta.setLocationRelativeTo(null);
    
    }// </editor-fold>

public JFrame getTelaListaConsulta(){
		
		return telaConfConsulta;
}

}
