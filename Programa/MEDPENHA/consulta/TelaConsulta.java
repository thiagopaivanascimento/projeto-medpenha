package consulta;

import menuprincipal.*;
import javax.swing.*;

import java.awt.*;
import java.util.Calendar;

import menuprincipal.*;

public class TelaConsulta  {
    
    private JFrame telaConsulta;
    
    private JButton btnMarcarConsulta,btnRemarcarConsulta,btnVisualizarConsulta,btnVoltar,
    btnLimpar,btnbuscarPaciente;
    private JComboBox cbTipoConsulta,cbsituacao,cbstatus,cbnomeMedico,ccbhora;
    //private Calendar ccb;
    private JLabel lBanner,lNomeMedico,lMatricula,lNomePaciente,lPendencia,lStatus,lTipo,lValor,
    lespecialidade,lhora,lsituacao,lMsg,lData;
    private JLabel lAstData,lAstEspecMed,lAstNomeMed,lAstNomePac,lAstHora,lAstSituacao,lAstMatricula,lAstStatus,
    lAstTipocons,lAstValor;
    private JScrollPane jScrollPane2;
    private JPanel pBotao,pCampo,pPaciente,pbanner,pConsulta,pmedico,ptipoConsulta;
    private JTextArea txtPendencias;
    private JTextField tMatricula,tEspecialidade,tNomePaciente,tValorConsulta;
       
    private String[] nomemedico={ "Selecione o Nome do Médico" };
    private String[] tipoconsulta={ "Selecione o tipo de consulta" };
   
   
    public TelaConsulta() {
     
    	telaConsulta=new JFrame();
        pCampo = new JPanel();
        pConsulta = new JPanel();
        pmedico = new JPanel();
        ptipoConsulta = new JPanel();
        pBotao = new JPanel();
        pPaciente = new JPanel();
        pbanner = new JPanel();
        
        Calendario ccb = new Calendario(true);
        cbTipoConsulta = new JComboBox(tipoconsulta);
        cbsituacao = new JComboBox();
        ccbhora = new JComboBox();
        cbstatus = new JComboBox();
        cbnomeMedico = new JComboBox(nomemedico);
        
        jScrollPane2 = new JScrollPane();
        
        lData= new JLabel();      
        lespecialidade = new JLabel();
        lNomeMedico = new JLabel();
        lMsg = new JLabel();
        
        lAstData = new JLabel();
        lAstEspecMed = new JLabel();
        lAstNomeMed = new JLabel();
        lAstNomePac = new JLabel();
        lAstHora = new JLabel();
        lAstSituacao = new JLabel();
        lAstMatricula = new JLabel();
        lAstStatus = new JLabel();
        lAstTipocons = new JLabel();
        lAstValor = new JLabel();
        
        txtPendencias = new JTextArea();
        tEspecialidade = new JTextField();
        tValorConsulta = new JTextField();
        tNomePaciente = new JTextField();
        tMatricula = new JTextField();
        
        btnMarcarConsulta = new JButton();
        btnRemarcarConsulta = new JButton();
        btnVoltar = new JButton();
        btnVisualizarConsulta = new JButton();
        btnLimpar=new JButton();
        btnbuscarPaciente=new JButton();
                       
        lTipo = new JLabel();
        lValor = new JLabel();
        lNomePaciente = new JLabel();
        lMatricula = new JLabel();
        lsituacao = new JLabel();
        lPendencia = new JLabel();
        lStatus = new JLabel();
        lhora = new JLabel();
        lBanner = new JLabel();
        
        telaConsulta.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaConsulta.setTitle("Consulta");
        telaConsulta.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaConsulta.setResizable(false);


        pbanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerConsulta.png")); // NOI18N

        javax.swing.GroupLayout pbannerLayout = new javax.swing.GroupLayout(pbanner);
        pbanner.setLayout(pbannerLayout);
        pbannerLayout.setHorizontalGroup(
            pbannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        pbannerLayout.setVerticalGroup(
            pbannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbannerLayout.createSequentialGroup()
                .addComponent(lBanner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pmedico.setBackground(new java.awt.Color(213, 244, 226));
        pmedico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lNomeMedico.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lNomeMedico.setText("Nome:");

        lespecialidade.setFont(new java.awt.Font("Calibri", 0, 12));
        lespecialidade.setText("Especialidade:");

        lAstEspecMed.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEspecMed.setForeground(new java.awt.Color(255, 51, 51));
        lAstEspecMed.setText("*");

        cbnomeMedico.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        
        tEspecialidade.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lAstNomeMed.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lAstNomeMed.setForeground(new java.awt.Color(255, 51, 51));
        lAstNomeMed.setText("*");

       
        javax.swing.GroupLayout pmedicoLayout = new javax.swing.GroupLayout(pmedico);
        pmedico.setLayout(pmedicoLayout);
        pmedicoLayout.setHorizontalGroup(
            pmedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pmedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pmedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNomeMedico)
                    .addComponent(lespecialidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pmedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pmedicoLayout.createSequentialGroup()
                        .addComponent(cbnomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNomeMed)
                        .addGap(51, 51, 51))
                     .addGroup(pmedicoLayout.createSequentialGroup()
                        .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstEspecMed)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pmedicoLayout.setVerticalGroup(
            pmedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pmedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pmedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeMedico)
                    .addComponent(cbnomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNomeMed))
         
                .addGap(18, 18, 18)
                .addGroup(pmedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lespecialidade)
                    .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstEspecMed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pPaciente.setBackground(new java.awt.Color(213, 244, 226));
        pPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N
        pPaciente.setFont(new java.awt.Font("Calibri", 0, 12));

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matrícula:");

        tMatricula.setDocument(new MaximodeCampos(6));
        tMatricula.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lAstMatricula.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMatricula.setForeground(new java.awt.Color(255, 51, 51));
        lAstMatricula.setText("*");

        lNomePaciente.setFont(new java.awt.Font("Calibri", 0, 12));
        lNomePaciente.setText("Nome:");

        tNomePaciente.setDocument(new MaximodeCampos(50));
        tNomePaciente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lAstNomePac.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNomePac.setForeground(new java.awt.Color(255, 51, 51));
        lAstNomePac.setText("*");

        btnbuscarPaciente.setFont(new java.awt.Font("Calibri", 0, 12));
        btnbuscarPaciente.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnbuscarPaciente.setText("Buscar Paciente");

        javax.swing.GroupLayout pPacienteLayout = new javax.swing.GroupLayout(pPaciente);
        pPaciente.setLayout(pPacienteLayout);
        pPacienteLayout.setHorizontalGroup(
            pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMatricula)
                    .addComponent(lNomePaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPacienteLayout.createSequentialGroup()
                        .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstMatricula)
                        .addGap(56, 56, 56)
                        .addComponent(btnbuscarPaciente))
                    .addGroup(pPacienteLayout.createSequentialGroup()
                        .addComponent(tNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNomePac)))
                .addGap(343, 343, 343))
        );
        pPacienteLayout.setVerticalGroup(
            pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMatricula)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstMatricula)
                    .addComponent(btnbuscarPaciente))
                .addGap(18, 18, 18)
                .addGroup(pPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomePaciente)
                    .addComponent(tNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNomePac))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMarcarConsulta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnMarcarConsulta.setIcon(new javax.swing.ImageIcon("imagens\\MarcarConsulta.png")); // NOI18N
        btnMarcarConsulta.setText("Marcar");
        btnMarcarConsulta.setActionCommand("Marcar");

        btnRemarcarConsulta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnRemarcarConsulta.setIcon(new javax.swing.ImageIcon("imagens\\RemarcarConsulta.png")); // NOI18N
        btnRemarcarConsulta.setText("Remarcar");
       
        btnVisualizarConsulta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnVisualizarConsulta.setIcon(new javax.swing.ImageIcon("imagens\\VisualizarConsulta.png")); // NOI18N
        btnVisualizarConsulta.setText("Visualizar");

        btnLimpar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimpar.setText("Limpar");
        
        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnMarcarConsulta)
                .addGap(40, 40, 40)
                .addComponent(btnRemarcarConsulta)
                .addGap(40, 40, 40)
                .addComponent(btnVisualizarConsulta)
                .addGap(40, 40, 40)
                .addComponent(btnLimpar)
                .addGap(40, 40, 40)
                .addComponent(btnVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMarcarConsulta)
                    .addComponent(btnRemarcarConsulta)
                    .addComponent(btnVoltar)
                    .addComponent(btnVisualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        pConsulta.setBackground(new java.awt.Color(213, 244, 226));
        pConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados da Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N


        lStatus.setFont(new java.awt.Font("Calibri", 0, 12));
        lStatus.setText("Status:");
               
        cbstatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Selecione o status","Não pago","Pago"}));

        lhora.setFont(new java.awt.Font("Calibri", 0, 12));
        lhora.setText("Hora:");

        ccbhora.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ccbhora.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Selecione a hora","8:00","8:30","9:00","9:30","10:00","10:30","11:00","11:30","13:00","13:30","14:00","14:30","15:00","15:30","15:30","16:30"}));
                
        lAstHora.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lAstHora.setForeground(new java.awt.Color(255, 51, 51));
        lAstHora.setText("*");

        lsituacao.setFont(new java.awt.Font("Calibri", 0, 12));
        lsituacao.setText("Situação:");

        cbsituacao.setFont(new java.awt.Font("Calibri", 0, 12));
        cbsituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Pendente", "Confirmada", "Cancelada" ,"Atendido" }));

        lAstStatus.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstStatus.setForeground(new java.awt.Color(255, 51, 51));
        lAstStatus.setText("*");

        lPendencia.setFont(new java.awt.Font("Calibri", 0, 12));
        lPendencia.setText("Pendências:");

        txtPendencias.setColumns(20);
        txtPendencias.setRows(5);
        jScrollPane2.setViewportView(txtPendencias);

        ccb.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstSituacao.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSituacao.setForeground(new java.awt.Color(255, 51, 51));
        lAstSituacao.setText("*");

        lData.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lData.setText("Data:");

        lAstData.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstData.setForeground(new java.awt.Color(255, 51, 51));
        lAstData.setText("*");

        javax.swing.GroupLayout pConsultaLayout = new javax.swing.GroupLayout(pConsulta);
        pConsulta.setLayout(pConsultaLayout);
        pConsultaLayout.setHorizontalGroup(
            pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pConsultaLayout.createSequentialGroup()
                        .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lStatus)
                            .addComponent(lhora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pConsultaLayout.createSequentialGroup()
                                .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstStatus))
                            .addGroup(pConsultaLayout.createSequentialGroup()
                                .addComponent(ccbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstHora)))
                        .addGap(18, 18, 18)
                        .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lsituacao)
                            .addComponent(lData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pConsultaLayout.createSequentialGroup()
                                .addComponent(cbsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstSituacao))
                            .addGroup(pConsultaLayout.createSequentialGroup()
                                .addComponent(ccb, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstData))))
                    .addGroup(pConsultaLayout.createSequentialGroup()
                        .addComponent(lPendencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pConsultaLayout.setVerticalGroup(
            pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lhora)
                    .addComponent(lAstHora)
                    .addComponent(ccb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lData)
                    .addComponent(lAstData))
                .addGap(18, 18, 18)
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStatus)
                    .addComponent(lAstStatus)
                    .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsituacao)
                    .addComponent(cbsituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstSituacao))
                .addGap(18, 18, 18)
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPendencia)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        ptipoConsulta.setBackground(new java.awt.Color(213, 244, 226));
        ptipoConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo de Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        cbTipoConsulta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
       
        lValor.setFont(new java.awt.Font("Calibri", 0, 12));
        lValor.setText("Valor:");

        tValorConsulta.setDocument(new MaximodeCampos(6));
        tValorConsulta.setFont(new java.awt.Font("Calibri", 0, 12));

        lTipo.setFont(new java.awt.Font("Calibri", 0, 12));
        lTipo.setText("Tipo:");

        lAstTipocons.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstTipocons.setForeground(new java.awt.Color(255, 51, 51));
        lAstTipocons.setText("*");

        lAstValor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lAstValor.setForeground(new java.awt.Color(255, 51, 51));
        lAstValor.setText("*");
        
       
        javax.swing.GroupLayout ptipoConsultaLayout = new javax.swing.GroupLayout(ptipoConsulta);
        ptipoConsulta.setLayout(ptipoConsultaLayout);
        ptipoConsultaLayout.setHorizontalGroup(
            ptipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptipoConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lValor)
                    .addComponent(lTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ptipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ptipoConsultaLayout.createSequentialGroup()
                        .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstTipocons))
                    .addGroup(ptipoConsultaLayout.createSequentialGroup()
                        .addComponent(tValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     ))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        ptipoConsultaLayout.setVerticalGroup(
            ptipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptipoConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTipo)
                    .addComponent(lAstTipocons))
                .addGap(18, 18, 18)
                .addGroup(ptipoConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor)
                    .addComponent(tValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstValor)
                     )
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lMsg)
                        .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pmedico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pPaciente, javax.swing.GroupLayout.Alignment.LEADING, 0, 764, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCampoLayout.createSequentialGroup()
                                .addComponent(pConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ptipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(0, Short.MAX_VALUE))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaConsulta.getContentPane());
        telaConsulta.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pbanner, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ControleConsulta consulta= new ControleConsulta(telaConsulta);
        btnMarcarConsulta.addActionListener(consulta);
        btnRemarcarConsulta.addActionListener(consulta);
        btnVisualizarConsulta.addActionListener(consulta);
        btnVoltar.addActionListener(consulta);
        btnLimpar.addActionListener(consulta);
        btnbuscarPaciente.addActionListener(consulta);
        
        cbnomeMedico.addActionListener(consulta);
        cbTipoConsulta.addActionListener(consulta);  
        
        telaConsulta.pack();
        telaConsulta.setVisible(true);
        //telaConsulta.setLocation(230,0);
    
    //centraliza a tela
        telaConsulta.setLocationRelativeTo(null);
    
    
    }// </editor-fold>
   

    public JFrame getTeConsulta()
    {
 	 return telaConsulta;
    }


}
