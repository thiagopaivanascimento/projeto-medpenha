
package usuario;
import menuprincipal.*;
import javax.swing.*;

import java.awt.*;

public class TelaUsuario  {

     private JFrame telaUsuario;
     private JButton btnAlterar,btnDeletar,btnSalvar,btnVoltar;
     private JComboBox cbtipo;
     private JLabel lAstLogin,lAstMat,lAstSenha,lAsttipo,lMsg;
     private JLabel lBanner,lLogin,lCpf,lSenha,ltipo;
     private JPanel pBanner,pBotao,pCampo,pIdentificacao;
     private JPasswordField pswsenha;
     private JTextField tLogin,tCpf;
     private String[] tipo={ "Selecione o tipo de permissão", "Administrador", "Secretário(a)", "Enfermeiro(a)", "Médico(a)" };
     
     
      public TelaUsuario() {
       
    	telaUsuario = new JFrame();
    	
        pCampo = new JPanel();
        pIdentificacao = new JPanel();
        pBanner = new JPanel();
        pBotao = new JPanel();
        
        lMsg = new JLabel();
        lAstLogin = new JLabel();
        lAstSenha = new JLabel();
        lAstMat = new JLabel();
        lAsttipo = new JLabel();
        
        lLogin = new JLabel();
        lSenha = new JLabel();
        ltipo = new JLabel();
        lCpf = new JLabel();
        
        tLogin = new JTextField();
        tCpf = new JTextField(); 
        
        pswsenha = new JPasswordField();
        
        cbtipo = new JComboBox(tipo);
             
        btnDeletar = new JButton();
        btnVoltar = new JButton();
        btnSalvar = new JButton();
        btnAlterar = new JButton();
       
        lBanner = new javax.swing.JLabel();

        telaUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaUsuario.setTitle("Usuário");
        telaUsuario.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaUsuario.setResizable(false);

        //máscara matricula
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("###.###.###-##");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCpf=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pIdentificacao.setBackground(new java.awt.Color(213, 244, 226));
        pIdentificacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Identificação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lLogin.setFont(new java.awt.Font("Calibri", 0, 12));
        lLogin.setText("Login:");

        lSenha.setFont(new java.awt.Font("Calibri", 0, 12));
        lSenha.setText("Senha:");

        tLogin.setDocument(new MaximodeCampos(15));
        tLogin.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstLogin.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstLogin.setForeground(new java.awt.Color(255, 51, 51));
        lAstLogin.setText("*");

        lAstSenha.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSenha.setForeground(new java.awt.Color(255, 51, 51));
        lAstSenha.setText("*");

        lCpf.setFont(new java.awt.Font("Calibri", 0, 12));
        lCpf.setText("CPF:");

        lAstMat.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMat.setForeground(new java.awt.Color(255, 51, 51));
        lAstMat.setText("*");

        pswsenha.setDocument(new MaximodeCampos(6));
        pswsenha.setFont(new java.awt.Font("Calibri", 0, 12));

        ltipo.setFont(new java.awt.Font("Calibri", 0, 12));
        ltipo.setText("Tipo:");
       
        lAsttipo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAsttipo.setForeground(new java.awt.Color(255, 51, 51));
        lAsttipo.setText("*");

        tCpf.setFont(new java.awt.Font("Calibri", 0, 12));

        javax.swing.GroupLayout pIdentificacaoLayout = new javax.swing.GroupLayout(pIdentificacao);
        pIdentificacao.setLayout(pIdentificacaoLayout);
        pIdentificacaoLayout.setHorizontalGroup(
            pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCpf)
                    .addComponent(ltipo)
                    .addComponent(lSenha)
                    .addComponent(lLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pIdentificacaoLayout.createSequentialGroup()
                        .addComponent(tLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstLogin))
                    .addGroup(pIdentificacaoLayout.createSequentialGroup()
                        .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstMat))
                    .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbtipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pIdentificacaoLayout.createSequentialGroup()
                            .addComponent(pswsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lAstSenha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAsttipo)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        pIdentificacaoLayout.setVerticalGroup(
            pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin)
                    .addComponent(tLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstLogin))
                .addGap(18, 18, 18)
                .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSenha)
                    .addComponent(lAstSenha))
                .addGap(18, 18, 18)
                .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(lAstMat)
                    .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ltipo)
                    .addComponent(lAsttipo)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnDeletar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnDeletar.setIcon(new javax.swing.ImageIcon("imagens\\deletar.png")); // NOI18N
        btnDeletar.setText("Deletar");

        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        btnSalvar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvar.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvar.setText("Salvar");

        btnAlterar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnAlterar.setIcon(new javax.swing.ImageIcon("imagens\\alterar.png")); // NOI18N
        btnAlterar.setText("Alterar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addGap(18, 18, 18))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMsg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pBotao, javax.swing.GroupLayout.Alignment.LEADING, 0, 429, Short.MAX_VALUE)
                        .addComponent(pIdentificacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerUsuario.png")); // NOI18N

        javax.swing.GroupLayout pBannerLayout = new javax.swing.GroupLayout(pBanner);
        pBanner.setLayout(pBannerLayout);
        pBannerLayout.setHorizontalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lBanner)
        );
        pBannerLayout.setVerticalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lBanner)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaUsuario.getContentPane());
        telaUsuario.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //Listener dos botões
        ControleUsuario usuario= new ControleUsuario(telaUsuario);
        btnSalvar.addActionListener(usuario);
        btnDeletar.addActionListener(usuario);
        btnVoltar.addActionListener(usuario);
        btnAlterar.addActionListener(usuario);

        telaUsuario.pack();
        telaUsuario.setVisible(true);
        //telaUsuario.setLocation(370, 100);
    
      //centraliza a tela
      telaUsuario.setLocationRelativeTo(null);
      }// </editor-fold>

   public JFrame getTelaUsuario()
   {
	 return telaUsuario;
   }
 

}
