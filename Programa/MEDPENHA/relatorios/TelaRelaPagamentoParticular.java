package relatorios;
import java.awt.Toolkit;

import javax.swing.*;

import menuprincipal.Calendario;

public class TelaRelaPagamentoParticular {
	
    private JFrame tela;            
    private JButton btnEmitir;
    private Calendario cbdata;
    private JLabel lAstData;
    private JLabel lData;
    private JPanel pCampo;
    private JPanel prelatorio;
    
    public TelaRelaPagamentoParticular() {
      
    	tela= new JFrame();
        pCampo = new javax.swing.JPanel();
        prelatorio = new javax.swing.JPanel();
        lData = new javax.swing.JLabel();
        cbdata = new Calendario(true);
        lAstData = new javax.swing.JLabel();
        btnEmitir = new javax.swing.JButton();

        tela.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        tela.setTitle("Relatórios");
        tela.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        tela.setResizable(false);

        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        prelatorio.setBackground(new java.awt.Color(213, 244, 226));
        prelatorio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Relatório Pagamento Particular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lData.setFont(new java.awt.Font("Calibri", 0, 12));
        lData.setText("Data:");

        cbdata.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstData.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstData.setForeground(new java.awt.Color(255, 51, 51));
        lAstData.setText("*");

        btnEmitir.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEmitir.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitir.setText("Emitir");

        javax.swing.GroupLayout prelatorioLayout = new javax.swing.GroupLayout(prelatorio);
        prelatorio.setLayout(prelatorioLayout);
        prelatorioLayout.setHorizontalGroup(
            prelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbdata, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnEmitir)
                .addContainerGap())
        );
        prelatorioLayout.setVerticalGroup(
            prelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData)
                    .addComponent(cbdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstData)
                    .addComponent(btnEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(tela.getContentPane());
        tela.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tela.pack();
        tela.setVisible(true);
        tela.setLocation(450, 270);
        
        ControleRelaPagamentoParticular controle = new ControleRelaPagamentoParticular(tela);
        
        btnEmitir.addActionListener(controle); 
        
        
    }// </editor-fold>

    public JFrame getTela()
    {
    	return tela;
    	}
   

}
