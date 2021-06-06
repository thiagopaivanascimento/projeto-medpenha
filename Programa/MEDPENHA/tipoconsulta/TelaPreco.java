package tipoconsulta;

import java.awt.Toolkit;

import javax.swing.*;
import menuprincipal.*;

public class TelaPreco  {

    private JFrame telaPreco;
    private JButton btnAlterar,btnVoltar,btnConsultar;
    private JComboBox cbTipoConsulta;
    private JLabel lAstTipocons,lAstValor,lTipo,lValor;
    private JTextField tValorConsulta;
    private JPanel pCampo,ppreco;
 
    public TelaPreco() {
      
    	telaPreco=new JFrame();
        pCampo = new JPanel();
        ppreco = new JPanel();
        lTipo = new JLabel();
        cbTipoConsulta = new JComboBox();
        lAstTipocons = new JLabel();
        lValor = new JLabel();
        tValorConsulta = new JTextField();
        lAstValor = new JLabel();
        btnAlterar = new JButton();
        btnConsultar = new JButton();
        btnVoltar = new JButton();

        telaPreco.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaPreco.setTitle("Preço da Consulta");
        telaPreco.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaPreco.setResizable(false);

        
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        ppreco.setBackground(new java.awt.Color(213, 244, 226));
        ppreco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Preço da Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lTipo.setFont(new java.awt.Font("Calibri", 0, 12));
        lTipo.setText("Tipo:");

        cbTipoConsulta.setFont(new java.awt.Font("Calibri", 0, 12));
        cbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Consulta Normal"}));

        lAstTipocons.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstTipocons.setForeground(new java.awt.Color(255, 51, 51));
        lAstTipocons.setText("*");

        lValor.setFont(new java.awt.Font("Calibri", 0, 12));
        lValor.setText("Valor:");

        tValorConsulta.setDocument(new MaximodeCampos(3));
        tValorConsulta.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstValor.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstValor.setForeground(new java.awt.Color(255, 51, 51));
        lAstValor.setText("*");

        btnAlterar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnAlterar.setIcon(new javax.swing.ImageIcon("imagens\\alterar.png")); // NOI18N
        btnAlterar.setText("Alterar");

        btnConsultar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnConsultar.setIcon(new javax.swing.ImageIcon("imagens\\consultar.png")); // NOI18N
        btnConsultar.setText("Consultar");

        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        javax.swing.GroupLayout pprecoLayout = new javax.swing.GroupLayout(ppreco);
        ppreco.setLayout(pprecoLayout);
        pprecoLayout.setHorizontalGroup(
            pprecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pprecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pprecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pprecoLayout.createSequentialGroup()
                        .addComponent(lTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lAstTipocons))
                    .addGroup(pprecoLayout.createSequentialGroup()
                        .addComponent(lValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstValor))
                    .addGroup(pprecoLayout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pprecoLayout.setVerticalGroup(
            pprecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pprecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pprecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTipo)
                    .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstTipocons))
                .addGap(18, 18, 18)
                .addGroup(pprecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor)
                    .addComponent(tValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstValor))
                .addGap(18, 18, 18)
                .addGroup(pprecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ppreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ppreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaPreco.getContentPane());
        telaPreco.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ControlePreco preco=new ControlePreco(telaPreco); 
        btnConsultar.addActionListener(preco);
        btnAlterar.addActionListener(preco);
        btnVoltar.addActionListener(preco);
        
        telaPreco.pack();
        telaPreco.setVisible(true);
        //telaPreco.setLocation(450,230);
        telaPreco.setLocationRelativeTo(null);
    
    }// </editor-fold>
public JFrame getTelaPreco()
{
	return telaPreco;
	}
  
    



}
