
package prontuario;

import java.awt.Toolkit;
import javax.swing.*;

import menuprincipal.*;

public class TelaGerarProntuario  {

	private static JFrame telaGeraProntuario;
    private JButton btnOk;
    private JScrollPane jScrollPane1;
    private JLabel lAstDataNasc,lAstMat,lDataincial,lMatricula;
    private JPanel pCampo,pgerarProntuario;
    private JTextField tDataInicial,tmatricula;
    private JTextPane txtMensagem;
 
    public TelaGerarProntuario() {
      
    	telaGeraProntuario=new JFrame();
        pCampo = new JPanel();
        pgerarProntuario = new JPanel();
        lDataincial = new JLabel();
        tDataInicial = new JTextField();
        lMatricula = new JLabel();
        tmatricula = new JTextField();
        lAstMat = new JLabel();
        lAstDataNasc = new JLabel();
        jScrollPane1 = new JScrollPane();
        txtMensagem = new JTextPane();
        btnOk = new JButton();

        
        telaGeraProntuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaGeraProntuario.setTitle("Gera Prontuário");
        telaGeraProntuario.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaGeraProntuario.setResizable(false);
        telaGeraProntuario.setUndecorated(true);

        

        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        pgerarProntuario.setBackground(new java.awt.Color(213, 244, 226));
        pgerarProntuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Prontuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lDataincial.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lDataincial.setText("Data:");

        tDataInicial.setFont(new java.awt.Font("Calibri", 0, 12));

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matricula:");

        tmatricula.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstMat.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMat.setForeground(new java.awt.Color(255, 51, 51));
        lAstMat.setText("*");

        lAstDataNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataNasc.setText("*");

        txtMensagem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtMensagem.setForeground(new java.awt.Color(255, 0, 51));
        txtMensagem.setText("           GERAÇÃO DE PRONTUÁRIO MÉDICO\n");
        jScrollPane1.setViewportView(txtMensagem);

        btnOk.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon("imagens\\ok.png")); // NOI18N
        btnOk.setText("OK");

        javax.swing.GroupLayout pgerarProntuarioLayout = new javax.swing.GroupLayout(pgerarProntuario);
        pgerarProntuario.setLayout(pgerarProntuarioLayout);
        pgerarProntuarioLayout.setHorizontalGroup(
            pgerarProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgerarProntuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pgerarProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pgerarProntuarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pgerarProntuarioLayout.createSequentialGroup()
                        .addComponent(lDataincial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstDataNasc)
                        .addGap(31, 31, 31)
                        .addComponent(lMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstMat)
                        .addContainerGap(14, Short.MAX_VALUE))))
            .addGroup(pgerarProntuarioLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnOk)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        pgerarProntuarioLayout.setVerticalGroup(
            pgerarProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pgerarProntuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pgerarProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataincial)
                    .addComponent(tDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMatricula)
                    .addComponent(tmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstMat)
                    .addComponent(lAstDataNasc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgerarProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgerarProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaGeraProntuario.getContentPane());
        telaGeraProntuario.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        telaGeraProntuario.pack();
        telaGeraProntuario.setVisible(true);
        //telaGeraProntuario.setLocation(470,200);
        
        //centraliza a tela
        telaGeraProntuario.setLocationRelativeTo(null);
        
        ControleGerarProntuario gerarprontuario = new ControleGerarProntuario(telaGeraProntuario);
        btnOk.addActionListener(gerarprontuario);
        tDataInicial.addMouseListener(gerarprontuario); 
        tmatricula.addMouseListener(gerarprontuario);
        
        
    }// </editor-fold>

public JFrame getTelaGerarProntuario(){
		
		return telaGeraProntuario;
}
   
}