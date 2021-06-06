
package usuario;
import javax.swing.*;

import java.awt.*;
import menuprincipal.*;


public class TelaLogin {

     private JFrame telaLogin;
     
     private JButton btnEntar;
     private JLabel lAstLogin,lAstSenha;
     private JLabel lLogin,lSenha;
     private javax.swing.JPanel pAutenticacao,pBotao,pCampo;
     private JPasswordField pswsenha;
     private JTextField tLogin;
    

    public TelaLogin() {
      
    	telaLogin = new JFrame();
    	
        pCampo = new JPanel();
        pAutenticacao = new JPanel();
        pBotao = new JPanel();
        
        lLogin = new JLabel();
        lSenha = new JLabel();
        
        tLogin = new JTextField();
        
        pswsenha = new JPasswordField();
        
        lAstLogin = new JLabel();
        lAstSenha = new JLabel();
       
        btnEntar = new JButton();

        telaLogin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaLogin.setTitle("Efetuar Login");
        telaLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaLogin.setResizable(false);

        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        pAutenticacao.setBackground(new java.awt.Color(213, 244, 226));
        pAutenticacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Autenticação", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lLogin.setFont(new java.awt.Font("Calibri", 0, 12));
        lLogin.setText("Login:");

        lSenha.setFont(new java.awt.Font("Calibri", 0, 12));
        lSenha.setText("Senha:");

        tLogin.setDocument(new MaximodeCampos(15));
        tLogin.setFont(new java.awt.Font("Calibri", 0, 12));

        pswsenha.setDocument(new MaximodeCampos(6));
        pswsenha.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstLogin.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstLogin.setForeground(new java.awt.Color(255, 51, 51));
        lAstLogin.setText("*");

        lAstSenha.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSenha.setForeground(new java.awt.Color(255, 51, 51));
        lAstSenha.setText("*");

        javax.swing.GroupLayout pAutentiacaoLayout = new javax.swing.GroupLayout(pAutenticacao);
        pAutenticacao.setLayout(pAutentiacaoLayout);
        pAutentiacaoLayout.setHorizontalGroup(
            pAutentiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAutentiacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAutentiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAutentiacaoLayout.createSequentialGroup()
                        .addComponent(lLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAutentiacaoLayout.createSequentialGroup()
                        .addComponent(lSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAutentiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAstLogin)
                    .addComponent(lAstSenha))
                .addContainerGap())
        );
        pAutentiacaoLayout.setVerticalGroup(
            pAutentiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAutentiacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAutentiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin)
                    .addComponent(tLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstLogin))
                .addGap(18, 18, 18)
                .addGroup(pAutentiacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(pswsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnEntar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEntar.setIcon(new javax.swing.ImageIcon("imagens\\entrar.png")); // NOI18N
        btnEntar.setText("Entrar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnEntar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAutenticacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaLogin.getContentPane());
        telaLogin.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //Listener dos botões
        ControleLogin login= new ControleLogin(telaLogin);
        btnEntar.addActionListener(login);

        telaLogin.pack();
        telaLogin.setVisible(true);
        //telaLogin.setLocation(495, 200);
    
        //centraliza a tela 
        telaLogin.setLocationRelativeTo(null); 
    }// </editor-fold>
	
    
    public JFrame getTelaLogin()
    {
 	 return telaLogin;
    }
  

  

}
