
package medico;

import java.awt.Toolkit;
import menuprincipal.*;
import javax.swing.*;

public class TelaMedico  {

    private JFrame telaMedico;

    private JButton btnAlterar,btnConsultar,btnSalvar,btnVoltar,btnLimpar;
  
    private JLabel lAsCpf,lAstCrm,lAstDataNasc,lAstEspecialidade,lAstIdent,lAstNome,lAstTelefone;

    private JLabel lBanner,lCelular,lCpf,lCrm,lDataNasc,lEspecialidade,lIdent,lMsg,lNome,lTelefone,lemail;

    private JPanel pBanner,pBotao,pCampo,pDadosPessoais,pEspecificacoes;

    private JTextField tCelular,tCpf,tCrm,tEmail,tEspecialidade,tIdent,tNome,tTelefone;
   
    public TelaMedico() {
  
    	telaMedico=new JFrame();
        pCampo = new JPanel();
        pBotao = new JPanel();
        pEspecificacoes = new JPanel();
        pDadosPessoais = new JPanel();
        pBanner = new JPanel();
        
        lMsg = new JLabel();
        lCrm = new JLabel();
        lEspecialidade = new JLabel();
        lNome = new JLabel();
        lDataNasc = new JLabel();
        lCpf = new JLabel();
        lIdent = new JLabel();
        lTelefone = new JLabel();
        lemail = new JLabel();
        lBanner = new JLabel();
        lCelular = new JLabel();
        
        btnConsultar = new JButton();
        btnVoltar = new JButton();
        btnAlterar = new JButton();
        btnSalvar = new JButton();
        btnLimpar = new JButton();
       
        tNome = new JTextField();
        tCrm = new JTextField();
        tEspecialidade = new JTextField();
        Calendario tDataNasc = new Calendario(true);
        tCpf = new JTextField();
        tIdent = new JTextField();
        tCelular = new JTextField();
        tEmail = new JTextField();
        tTelefone = new JTextField();
               
        lAstCrm = new JLabel();
        lAstEspecialidade = new JLabel();
        lAstNome = new JLabel();
        lAstDataNasc = new JLabel();
        lAsCpf = new JLabel();
        lAstIdent = new JLabel();
        lAstTelefone = new JLabel();
     
       
        telaMedico.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaMedico.setTitle("Médico");
        telaMedico.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaMedico.setResizable(false);

       
        //máscara telefone
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("(##) #### - ####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tTelefone=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara celular
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("(##) #### - ####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCelular=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara identidade
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##.###.###-#");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tIdent=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara cpf
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("###.###.###-##");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCpf=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara crm
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("#########/UU");
            masktel.setValidCharacters("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,X,Z,W,Y,Ç,0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCrm=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnConsultar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnConsultar.setIcon(new javax.swing.ImageIcon("imagens\\consultar.png")); // NOI18N
        btnConsultar.setText("Consultar");

        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        btnAlterar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnAlterar.setIcon(new javax.swing.ImageIcon("imagens\\alterar.png")); // NOI18N
        btnAlterar.setText("Alterar");

        btnSalvar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvar.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvar.setText("Salvar");
        
        btnLimpar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnLimpar.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnSalvar)
                .addGap(30, 30, 30)
                .addComponent(btnAlterar)
                .addGap(30, 30, 30)
                .addComponent(btnConsultar)
                .addGap(30, 30, 30)
                .addComponent(btnLimpar)
                .addGap(30, 30, 30)
                .addComponent(btnVoltar)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEspecificacoes.setBackground(new java.awt.Color(213, 244, 226));
        pEspecificacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Especifiações Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lCrm.setFont(new java.awt.Font("Calibri", 0, 12));
        lCrm.setText("CRM:");

        tCrm.setFont(new java.awt.Font("Calibri", 0, 12));

        lEspecialidade.setFont(new java.awt.Font("Calibri", 0, 12));
        lEspecialidade.setText("Especialidade:");

        tEspecialidade.setDocument(new MaximodeCampos(40));
        tEspecialidade.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCrm.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCrm.setForeground(new java.awt.Color(255, 51, 51));
        lAstCrm.setText("*");

        lAstEspecialidade.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEspecialidade.setForeground(new java.awt.Color(255, 51, 51));
        lAstEspecialidade.setText("*");

        javax.swing.GroupLayout pEspecificacoesLayout = new javax.swing.GroupLayout(pEspecificacoes);
        pEspecificacoes.setLayout(pEspecificacoesLayout);
        pEspecificacoesLayout.setHorizontalGroup(
            pEspecificacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspecificacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCrm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstCrm)
                .addGap(48, 48, 48)
                .addComponent(lEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstEspecialidade)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        pEspecificacoesLayout.setVerticalGroup(
            pEspecificacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspecificacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEspecificacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCrm)
                    .addComponent(lEspecialidade)
                    .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstEspecialidade)
                    .addComponent(lCrm))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pDadosPessoais.setBackground(new java.awt.Color(213, 244, 226));
        pDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lNome.setFont(new java.awt.Font("Calibri", 0, 12));
        lNome.setText("Nome:");

        tNome.setDocument(new MaximodeCampos(50));
        tNome.setFont(new java.awt.Font("Calibri", 0, 12));
        tNome.setMaximumSize(new java.awt.Dimension(2, 2));

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        lDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataNasc.setText("Data de Nascimento:");

        tDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDataNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataNasc.setText("*");

        lCpf.setFont(new java.awt.Font("Calibri", 0, 12));
        lCpf.setText("CPF:");

        tCpf.setFont(new java.awt.Font("Calibri", 0, 12));

        lAsCpf.setFont(new java.awt.Font("Calibri", 0, 14));
        lAsCpf.setForeground(new java.awt.Color(255, 51, 51));
        lAsCpf.setText("*");

        lIdent.setFont(new java.awt.Font("Calibri", 0, 12));
        lIdent.setText("Identidade:");

        tIdent.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstIdent.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstIdent.setForeground(new java.awt.Color(255, 51, 51));
        lAstIdent.setText("*");

        lTelefone.setFont(new java.awt.Font("Calibri", 0, 12));
        lTelefone.setText("Telefone:");

        lAstTelefone.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstTelefone.setForeground(new java.awt.Color(255, 51, 51));
        lAstTelefone.setText("*");
         
        lCelular.setFont(new java.awt.Font("Calibri", 0, 12));
        lCelular.setText("Celular:");

        tCelular.setFont(new java.awt.Font("Calibri", 0, 12));

        lemail.setFont(new java.awt.Font("Calibri", 0, 12));
        lemail.setText("E-mail:");

        tEmail.setDocument(new MaximodeCampos(30));
        tEmail.setFont(new java.awt.Font("Calibri", 0, 12));

        tTelefone.setFont(new java.awt.Font("Calibri", 0, 12));

        javax.swing.GroupLayout pDadosPessoaisLayout = new javax.swing.GroupLayout(pDadosPessoais);
        pDadosPessoais.setLayout(pDadosPessoaisLayout);
        pDadosPessoaisLayout.setHorizontalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNome)
                            .addComponent(lemail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstNome))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(lTelefone))
                                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lAsCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                        .addComponent(lIdent)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(tIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lAstIdent))
                                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lAstTelefone)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addComponent(lCpf))
                .addGap(52, 52, 52)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstDataNasc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCelular))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                            
                               ))
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        pDadosPessoaisLayout.setVerticalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(lAstNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDataNasc)
                    .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDataNasc))
                .addGap(18, 18, 18)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAsCpf)
                    .addComponent(lIdent)
                    .addComponent(tIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstIdent)
                    .addComponent(lCelular)
                    .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    )
                .addGap(18, 18, 18)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lemail)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTelefone)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstTelefone))
                   
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEspecificacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lMsg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pEspecificacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerMedico.png")); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaMedico.getContentPane());
        telaMedico.getContentPane().setLayout(layout);
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
        ControleMedico medico= new ControleMedico(telaMedico);
        btnSalvar.addActionListener(medico);
        btnAlterar.addActionListener(medico);
        btnConsultar.addActionListener(medico);
        btnLimpar.addActionListener(medico);
        btnVoltar.addActionListener(medico);

        telaMedico.pack();
        telaMedico.setVisible(true);
        //telaMedico.setLocation(220,80);
        
        //Centraliza a janela
        telaMedico.setLocationRelativeTo(null);
        
        
        
    }// </editor-fold>
    public JFrame getTelaMedico(){
		
		return telaMedico;
}

}
