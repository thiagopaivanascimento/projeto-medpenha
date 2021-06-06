package webcam;

import java.awt.Toolkit;

import javax.swing.*;
import menuprincipal.*;

public class TelaCarteirinha  {

	private JFrame telaCarteirinha;
    private JButton btnBuscarPaciente,btnEmitir,btnVoltar,btnLimpar;
    private JLabel lAstDataNasc,lAstMatricula,lAstNome;
    //JButton captura;
    
    
    private JLabel lDataNasc,lInstit,lMatricula,lMsg,lNome,lNomeResp;
    private JPanel pBotao,pCampo,pDadosPaciente,pImagem,pMatricula;
    private JTextField tDataNasc,tInstit,tMatricula,tNome,tNomeResp;
	
	
    public TelaCarteirinha() {

    	telaCarteirinha=new JFrame();
        pCampo = new JPanel();
    	pBotao = new JPanel();
    	pImagem = new JPanel();
    	pMatricula = new JPanel();
    	pDadosPaciente = new JPanel();
    	
    	lMsg = new JLabel();
    	lAstMatricula = new JLabel();
    	lAstDataNasc = new JLabel();
        lAstNome = new JLabel();
    	
        btnVoltar = new JButton();
        btnLimpar = new JButton();
        btnEmitir = new JButton();
        btnBuscarPaciente = new JButton();
        //captura = new JButton();
        
        lDataNasc = new JLabel();
        lNome = new JLabel();
        lNomeResp = new JLabel();
        lMatricula = new JLabel();
        lInstit = new JLabel();
        
        tMatricula = new JTextField();
        tNomeResp = new JTextField();
        tInstit = new JTextField();
        tDataNasc = new JTextField();
        
        tNome = new javax.swing.JTextField();
        
        telaCarteirinha.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        telaCarteirinha.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaCarteirinha.setTitle("Carteirinha");
        telaCarteirinha.setResizable(false);

        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        //captura.setFont(new java.awt.Font("Calibri", 0, 12));
       // captura.setText("Capturar");

        
        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        btnEmitir.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnEmitir.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitir.setText("Emitir");

        btnBuscarPaciente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarPaciente.setText("Buscar Paciente");
        
        btnLimpar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnBuscarPaciente)
                .addGap(80, 80, 80)
                .addComponent(btnEmitir)
                .addGap(80, 80, 80)
                .addComponent(btnVoltar)
                .addGap(30, 30, 30))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnBuscarPaciente)
                    .addComponent(btnEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pImagem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        javax.swing.GroupLayout pImagemLayout = new javax.swing.GroupLayout(pImagem);
        pImagem.setLayout(pImagemLayout);
        pImagemLayout.setHorizontalGroup(
            pImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
            //.addComponent(captura)
        );
        pImagemLayout.setVerticalGroup(
            pImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            //.addComponent(captura)
        );

        pDadosPaciente.setBackground(new java.awt.Color(213, 244, 226));
        pDadosPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lNome.setFont(new java.awt.Font("Calibri", 0, 12));
        lNome.setText("Nome:");

        pMatricula.setBackground(new java.awt.Color(213, 244, 226));
        pMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matrícula:");

        tMatricula.setDocument(new MaximodeCampos(6));
        tMatricula.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstMatricula.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMatricula.setForeground(new java.awt.Color(255, 51, 51));
        lAstMatricula.setText("*");

        javax.swing.GroupLayout pMatriculaLayout = new javax.swing.GroupLayout(pMatricula);
        pMatricula.setLayout(pMatriculaLayout);
        pMatriculaLayout.setHorizontalGroup(
            pMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstMatricula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pMatriculaLayout.setVerticalGroup(
            pMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMatricula)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstMatricula))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lNomeResp.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lNomeResp.setText("Nome do Responsável:");

        tNomeResp.setDocument(new MaximodeCampos(50));
        tNomeResp.setFont(new java.awt.Font("Calibri", 0, 12));

        lInstit.setFont(new java.awt.Font("Calibri", 0, 12));
        lInstit.setText("Instituição:");

        tInstit.setDocument(new MaximodeCampos(50));
        tInstit.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        tDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));

        lDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataNasc.setText("Data de Nascimento:");

        tNome.setDocument(new MaximodeCampos(50));
        tNome.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDataNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataNasc.setText("*");

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        javax.swing.GroupLayout pDadosPacienteLayout = new javax.swing.GroupLayout(pDadosPaciente);
        pDadosPaciente.setLayout(pDadosPacienteLayout);
        pDadosPacienteLayout.setHorizontalGroup(
            pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDadosPacienteLayout.createSequentialGroup()
                        .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNomeResp)
                            .addComponent(lInstit)
                            .addComponent(lNome)
                            .addComponent(lDataNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosPacienteLayout.createSequentialGroup()
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lAstNome))
                            .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tInstit)
                                .addComponent(tNomeResp, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                .addGroup(pDadosPacienteLayout.createSequentialGroup()
                                    .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lAstDataNasc))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pDadosPacienteLayout.setVerticalGroup(
            pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNome))
                .addGap(18, 18, 18)
                .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDataNasc)
                    .addComponent(lAstDataNasc))
                .addGap(18, 18, 18)
                .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeResp)
                    .addComponent(tNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDadosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInstit)
                    .addComponent(tInstit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCampoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMsg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pCampoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(pDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCampoLayout.createSequentialGroup()
                        .addComponent(lMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pDadosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCampoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaCarteirinha.getContentPane());
        telaCarteirinha.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

       //listener's dos botões
        ControleCarteirinha carteirinha = new ControleCarteirinha(telaCarteirinha);
        btnEmitir.addActionListener(carteirinha);
        btnBuscarPaciente.addActionListener(carteirinha);
        btnVoltar.addActionListener(carteirinha);   
        btnLimpar.addActionListener(carteirinha);   
                
        //painel webcam
        CapturaFoto foto = new CapturaFoto();
        pImagem.add(foto);
        
        telaCarteirinha.pack();
        telaCarteirinha.setVisible(true);
        //telaCarteirinha.setLocation(230,100);
    
        telaCarteirinha.setLocationRelativeTo(null);
        
    }// </editor-fold>

}
   