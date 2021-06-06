package pagamento;

import java.awt.*;
import javax.swing.*;



public class TelaCartao  {

	private JFrame telaCartao;                
    private JButton btnSalvar;
    private JLabel lAstCartao,lCaminho;
  
    private JPanel pBotao,pCampo,pCartao;
  
    private JTextField tCartao;  
	
    public TelaCartao() {

    	telaCartao = new JFrame();
        pCampo = new JPanel();
        pCartao = new JPanel();
        lCaminho = new JLabel();
        tCartao = new JTextField();
        lAstCartao = new JLabel();
        pBotao = new JPanel();
        btnSalvar = new JButton();

        telaCartao.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaCartao.setTitle("Cartão");
        telaCartao.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaCartao.setResizable(false);
   
       
      
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("######## - #");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
           // tCartao=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        pCartao.setBackground(new java.awt.Color(213, 244, 226));
        pCartao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cartão", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lCaminho.setFont(new java.awt.Font("Calibri", 0, 12));
        lCaminho.setText("Número do Cartão:");

        tCartao.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lAstCartao.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCartao.setForeground(new java.awt.Color(255, 51, 51));
        lAstCartao.setText("*");

        javax.swing.GroupLayout pCartaoLayout = new javax.swing.GroupLayout(pCartao);
        pCartao.setLayout(pCartaoLayout);
        pCartaoLayout.setHorizontalGroup(
            pCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCaminho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstCartao)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pCartaoLayout.setVerticalGroup(
            pCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCaminho)
                    .addComponent(tCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCartao))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnSalvar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvar.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvar.setText("Salvar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
            .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBotaoLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(btnSalvar)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBotaoLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(btnSalvar)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCartao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaCartao.getContentPane());
        telaCartao.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ControleCartao pagPartCartao= new ControleCartao(telaCartao);
        btnSalvar.addActionListener(pagPartCartao);
              
        telaCartao.pack();
        telaCartao.setVisible(true);
        telaCartao.setLocation(350, 200);
    }// </editor-fold>                        
    public JFrame getTelaCartao()
    {
 	 return telaCartao;
    }
}
