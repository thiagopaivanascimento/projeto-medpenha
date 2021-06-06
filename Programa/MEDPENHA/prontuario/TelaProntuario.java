
package prontuario;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import consulta.Consulta;

import medico.ControleMedico;
import medico.Medico;
import menuprincipal.*;


public class TelaProntuario  {



    private JFrame telaProntuario;
    private JComboBox cbTipoPrec,cbSexo,cbhora;
    
    private JButton btnBuscarAtest,btnBuscarDiag,btnAtualDiag,btnBuscarExame,btnBuscarLaudo,btnBuscarPresc,
    btnEmitirAtestado,btnEmitirExame,btnEmitirLaudo,btnEmitirPresc,btnSalvarAtestado,
    btnSalvarDiag,btnSalvarExame,btnSalvarLaudo,btnSalvarPresc,btnVisualizarAnamnese,btnVoltarAtestado,
    btnVoltarDiag,btnVoltarExame,btnVoltarLaudo,btnVoltarPresc,btnLimparAtestado,btnLimparDiag,btnLimparExame,
    btnLimparPresc,btnLimparLaudo,btnemitirDiag;
  
    private JScrollPane jScrollPane10,jScrollPane11,jScrollPane12,jScrollPane13,jScrollPane14,jScrollPane15,
    jScrollPane16,jScrollPane17,jScrollPane18,jScrollPane4,jScrollPane5,jScrollPane6,jScrollPane7,
    jScrollPane8,jScrollPane9;
   
    private JLabel lAstCrmPresc,lAstDataInicial,lAstEspecialidadePresc,lAstMatricula,lAstNasc,lAstNome,lAstNomeMedico,
    lAstProntuario,lAstSexo,lAtestado,lAstDataCons,lAstEntrevConsDiag,lAstDiag,lAsttipo,lAstMedPresc,lAstExame,
    lAstLaudo,lAstAtestado,lAstHoraCons;

    private JLabel lBanner,lDataCons,lDataHistAtest,lDataHistDiag,lDataHistExame,lDataHistLaudo,lDataHistPresc,lDataProntuario,
    lDiag,lEntrevCons,lEspecialidadePresc,lExame,lExameDiag,lLaudo,lMatricula,lMedicamentPresc,lMsg,lNasc,lNome,lNomeMedico,
    lObsAtestado,lObsDiag,lObsExame,lObsLaudo,lObsPresc,lProntuario,lSexo,lTipoPresc,lcrmPresc,lHoracons;
  
    private JPanel pAtestado,pBanner,pBotaoAtestado,pBotaoDiag,pBotaoExame,pBotaoLaudo,pBotaoPresc,pDataCons,pHistAtestado,
    pHistDiag,pHistExame,pHistLaudo,pHistPresc,pIdentMedico,pIdentPaciente,pLaudo,pProntuario,pcampo,pdiagnostico,pexame,
    ppresricao;
    
    private JTextPane ptxtMsgAtest,ptxtMsgDiag,ptxtMsgExame,ptxtMsgLaudo,ptxtMsgPresc;
    
    private JTextField tCrm,tDataCons,tDataHistAtest,tDataHistDiag,tDataHistExame,tDataHistLaudo,tDataHistPresc,tDataInicial,
    tDiag,tEspecialidade,tMatricula,tNasc,tNome,tNomeMedico,tProntuario;

    private JTextArea taAtestado,taEntrevCons,taExame,taLaudo,taMedicPresc,taObsAtestado,taObsLaudo,taObsDiag,taObsExame,taObsPresc;
  
    private JTable tbAtestado,tbDiagnostico,tbExame,tbLaudo,tbPresc;
 
    private JScrollPane tbHistPresc1;
    private javax.swing.JScrollPane tbHistPresc2;
    private javax.swing.JScrollPane tbHistPresc3;
    private javax.swing.JScrollPane tbHistPresc4;
    private javax.swing.JScrollPane tbHistPresc5;

    private JTabbedPane tpProntuario;
    
    public static DefaultTableModel tcdiagnostico,tcprescricao,tcatestado,tcexame,tclaudo;
 
	
    public TelaProntuario() 
    {
    	
    	telaProntuario=new JFrame();

        pBanner = new JPanel();
        pcampo = new JPanel();
        pIdentMedico = new JPanel();
        pIdentPaciente = new JPanel();
        pProntuario = new JPanel();
        pDataCons = new JPanel();
                
        pdiagnostico = new JPanel();
        pHistDiag = new JPanel();
        pBotaoDiag = new JPanel();
        
        ppresricao = new JPanel();
        pHistPresc = new JPanel();
        pBotaoPresc = new JPanel();
       
        pexame = new JPanel();
        pHistExame = new JPanel();
        pBotaoExame = new JPanel();
        
        pAtestado = new JPanel();
        pHistAtestado = new JPanel();
        pBotaoAtestado = new JPanel();
        
        pLaudo = new JPanel();
        pHistLaudo = new JPanel();
        pBotaoLaudo = new JPanel();
               
        lBanner = new JLabel();
        lMsg = new JLabel();
        
        lDataProntuario = new JLabel();
        lProntuario = new JLabel();
        lDataCons = new JLabel();
        lHoracons= new JLabel();
        
        lNomeMedico = new JLabel();
        lEspecialidadePresc = new JLabel();
        lcrmPresc = new JLabel();
        
        lNome = new JLabel();
        lMatricula = new JLabel();
        lSexo = new JLabel();
        lNasc = new JLabel();
        
        lDataHistDiag = new JLabel();
        lDiag = new JLabel();
        lExameDiag = new JLabel();
        lEntrevCons = new JLabel();
        lObsDiag = new JLabel();
        
        lDataHistPresc = new JLabel();
        lMedicamentPresc = new JLabel();
        lObsPresc = new JLabel();
        lTipoPresc = new JLabel();
        
        lDataHistExame = new JLabel();
        lExame = new JLabel();
        lObsExame = new JLabel();
        
        lDataHistAtest = new JLabel();
        lAtestado = new JLabel();
        lObsAtestado = new JLabel();
        
        lDataHistLaudo = new JLabel();
        lLaudo = new JLabel();
        lObsLaudo = new JLabel();
        
        lAstCrmPresc = new JLabel();
        lAstEspecialidadePresc = new JLabel();
        lAstNomeMedico = new JLabel();
        lAstNome = new JLabel();
        lAstNasc = new JLabel();
        lAstSexo = new JLabel();
        lAstMatricula = new JLabel();
        lAstProntuario = new JLabel();
        lAstDataInicial = new JLabel();
        lAstDataCons = new JLabel();
        lAstEntrevConsDiag = new JLabel();
        lAstDiag = new JLabel();
        lAsttipo = new JLabel();
        lAstMedPresc = new JLabel();
        lAstExame = new JLabel();
        lAstLaudo = new JLabel();
        lAstAtestado = new JLabel();
        lAstHoraCons= new JLabel();
                 
        tDataCons = new JTextField();
        tCrm = new JTextField();
        tEspecialidade = new JTextField();
        tNomeMedico = new JTextField();
        tNome = new JTextField();
        tNasc = new JTextField();
        tMatricula = new JTextField();
        tDataHistDiag = new JTextField();
        tDiag = new JTextField();
        tDataHistPresc = new JTextField();
        tDataHistExame = new JTextField();
        tDataHistAtest = new JTextField();
        tDataHistLaudo = new JTextField();
        tDataInicial = new JTextField();
        tProntuario = new JTextField();
               
        cbSexo = new JComboBox();
        cbTipoPrec = new JComboBox();
        cbhora = new JComboBox();
           
        tpProntuario = new JTabbedPane();
               
        tbHistPresc4 = new JScrollPane();
        tbDiagnostico = new JTable();
       
        jScrollPane11 = new JScrollPane();
        ptxtMsgDiag = new JTextPane();
        
        jScrollPane12 = new JScrollPane();
        taEntrevCons = new JTextArea();
        
        jScrollPane13 = new JScrollPane();
        taObsDiag = new JTextArea();
                   
        tbHistPresc2 = new JScrollPane();
        tbPresc = new JTable();
               
        jScrollPane7 = new JScrollPane();
        ptxtMsgPresc = new JTextPane();
        
        jScrollPane8 = new JScrollPane();
        taMedicPresc = new JTextArea();
               
        jScrollPane9 = new JScrollPane();
        taObsPresc = new JTextArea();
        
        tbHistPresc1 = new JScrollPane();
        tbExame = new JTable();
      
        jScrollPane4 = new JScrollPane();
        ptxtMsgExame = new JTextPane();
                
        jScrollPane5 = new JScrollPane();
        taExame = new JTextArea();
        
        jScrollPane6 = new JScrollPane();
        taObsExame = new JTextArea();
                  
        tbHistPresc3 = new JScrollPane();
        tbAtestado = new JTable();
        
        jScrollPane10 = new JScrollPane();
        ptxtMsgAtest = new JTextPane();
        
        jScrollPane14 = new JScrollPane();
        taAtestado = new JTextArea();
                
        jScrollPane15 = new JScrollPane();
        taObsAtestado = new JTextArea();
             
        tbHistPresc5 = new JScrollPane();
        tbLaudo = new JTable();
       
        jScrollPane16 = new JScrollPane();
        ptxtMsgLaudo = new JTextPane();
           
        jScrollPane17 = new JScrollPane();
        taLaudo = new JTextArea();
            
        jScrollPane18 = new JScrollPane();
        taObsLaudo = new JTextArea();
               
        btnVisualizarAnamnese = new JButton();
        btnBuscarDiag = new JButton();
        btnSalvarDiag = new JButton();
        btnVoltarDiag = new JButton();
        btnLimparDiag= new JButton();
        btnAtualDiag =new JButton();
        btnemitirDiag=new JButton();
        
        btnBuscarPresc = new JButton();
        btnSalvarPresc = new JButton();
        btnEmitirPresc = new JButton();
        btnVoltarPresc = new JButton();
        btnLimparPresc = new JButton();
       
        btnBuscarExame = new JButton();
        btnSalvarExame = new JButton();
        btnEmitirExame = new JButton();
        btnVoltarExame = new JButton();
        btnLimparExame = new JButton();
        
        btnBuscarAtest = new JButton();
        btnSalvarAtestado = new JButton();
        btnEmitirAtestado = new JButton();
        btnVoltarAtestado = new JButton();
        btnLimparAtestado= new JButton();
        
        btnBuscarLaudo = new JButton();
        btnSalvarLaudo = new JButton();
        btnEmitirLaudo = new JButton();
        btnVoltarLaudo = new JButton();
        btnLimparLaudo = new JButton();

        telaProntuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaProntuario.setTitle("Prontuário");
        telaProntuario.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaProntuario.setResizable(false);

        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerProntuario.png")); // NOI18N

        javax.swing.GroupLayout pBannerLayout = new javax.swing.GroupLayout(pBanner);
        pBanner.setLayout(pBannerLayout);
        pBannerLayout.setHorizontalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lBanner)
        );
        pBannerLayout.setVerticalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBannerLayout.createSequentialGroup()
                .addComponent(lBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );
        //máscara data consulta
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataCons=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data atestado
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataHistAtest=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data diagnostico
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataHistDiag=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data Exame
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataHistExame=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data prescrição
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataHistPresc=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data laudo
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataHistLaudo=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        
        //máscara data Nascimento
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tNasc=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data crm
              
//      máscara data prontuario
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tDataInicial=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        
        pcampo.setBackground(new java.awt.Color(213, 244, 226));
        pcampo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        pIdentMedico.setBackground(new java.awt.Color(213, 244, 226));
        pIdentMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Identificação do Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lcrmPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        lcrmPresc.setText("CRM:");

        lEspecialidadePresc.setFont(new java.awt.Font("Calibri", 0, 12));
        lEspecialidadePresc.setText("Especialidade:");

        lAstEspecialidadePresc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEspecialidadePresc.setForeground(new java.awt.Color(255, 51, 51));
        lAstEspecialidadePresc.setText("*");

        lNomeMedico.setFont(new java.awt.Font("Calibri", 0, 12));
        lNomeMedico.setText("Nome:");

        tCrm.setFont(new java.awt.Font("Calibri", 0, 12));

        tEspecialidade.setDocument(new MaximodeCampos(40));
        tEspecialidade.setFont(new java.awt.Font("Calibri", 0, 12));

        tNomeMedico.setDocument(new MaximodeCampos(50));
        tNomeMedico.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNomeMedico.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNomeMedico.setForeground(new java.awt.Color(255, 51, 51));
        lAstNomeMedico.setText("*");

        lAstCrmPresc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCrmPresc.setForeground(new java.awt.Color(255, 51, 51));
        lAstCrmPresc.setText("*");

        javax.swing.GroupLayout pIdentMedicoLayout = new javax.swing.GroupLayout(pIdentMedico);
        pIdentMedico.setLayout(pIdentMedicoLayout);
        pIdentMedicoLayout.setHorizontalGroup(
            pIdentMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIdentMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pIdentMedicoLayout.createSequentialGroup()
                        .addComponent(lNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNomeMedico))
                    .addGroup(pIdentMedicoLayout.createSequentialGroup()
                        .addComponent(lEspecialidadePresc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstEspecialidadePresc)))
                .addGap(59, 59, 59)
                .addComponent(lcrmPresc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstCrmPresc)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pIdentMedicoLayout.setVerticalGroup(
            pIdentMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentMedicoLayout.createSequentialGroup()
                .addGroup(pIdentMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeMedico)
                    .addComponent(lAstNomeMedico)
                    .addComponent(tNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcrmPresc)
                    .addComponent(tCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCrmPresc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pIdentMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEspecialidadePresc)
                    .addComponent(lAstEspecialidadePresc)
                    .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pIdentPaciente.setBackground(new java.awt.Color(213, 244, 226));
        pIdentPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Identificação do Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lNome.setFont(new java.awt.Font("Calibri", 0, 12));
        lNome.setText("Nome:");

        tNome.setDocument(new MaximodeCampos(50));
        tNome.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        lSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        lSexo.setText("Sexo:");

        cbSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Sexo", "Feminino", "Masculino" }));

        lAstSexo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSexo.setForeground(new java.awt.Color(255, 51, 51));
        lAstSexo.setText("*");

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matrícula:");

        tMatricula.setDocument(new MaximodeCampos(6));
        tMatricula.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstMatricula.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMatricula.setForeground(new java.awt.Color(255, 51, 51));
        lAstMatricula.setText("*");

        lNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lNasc.setText("Data de Nascimento:");

        tNasc.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstNasc.setText("*");

        btnVisualizarAnamnese.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnVisualizarAnamnese.setIcon(new javax.swing.ImageIcon("imagens\\consultar.png")); // NOI18N
        btnVisualizarAnamnese.setText("Visualizar Anamnese");

        javax.swing.GroupLayout pIdentPacienteLayout = new javax.swing.GroupLayout(pIdentPaciente);
        pIdentPaciente.setLayout(pIdentPacienteLayout);
        pIdentPacienteLayout.setHorizontalGroup(
            pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pIdentPacienteLayout.createSequentialGroup()
                        .addComponent(lNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNome))
                    .addGroup(pIdentPacienteLayout.createSequentialGroup()
                        .addComponent(lSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstSexo)
                        .addGap(54, 54, 54)
                        .addComponent(lMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstMatricula)))
                .addGap(51, 51, 51)
                .addGroup(pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pIdentPacienteLayout.createSequentialGroup()
                        .addComponent(lNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNasc))
                    .addComponent(btnVisualizarAnamnese))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pIdentPacienteLayout.setVerticalGroup(
            pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentPacienteLayout.createSequentialGroup()
                .addGroup(pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNome)
                    .addComponent(lNasc)
                    .addComponent(tNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSexo)
                    .addComponent(lAstSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstMatricula)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMatricula)
                    .addComponent(btnVisualizarAnamnese))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pProntuario.setBackground(new java.awt.Color(213, 244, 226));
        pProntuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Prontuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lDataProntuario.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataProntuario.setText("Data Inicial:");

        tDataInicial.setFont(new java.awt.Font("Calibri", 0, 12));

        tProntuario.setDocument(new MaximodeCampos(6));
        tProntuario.setFont(new java.awt.Font("Calibri", 0, 12));

        lProntuario.setFont(new java.awt.Font("Calibri", 0, 12));
        lProntuario.setText("Prontuário:");

        lAstProntuario.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstProntuario.setForeground(new java.awt.Color(255, 51, 51));
        lAstProntuario.setText("*");

        lAstDataInicial.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataInicial.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataInicial.setText("*");

        javax.swing.GroupLayout pProntuarioLayout = new javax.swing.GroupLayout(pProntuario);
        pProntuario.setLayout(pProntuarioLayout);
        pProntuarioLayout.setHorizontalGroup(
            pProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProntuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDataProntuario)
                    .addComponent(lProntuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProntuarioLayout.createSequentialGroup()
                        .addComponent(tProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstProntuario))
                    .addGroup(pProntuarioLayout.createSequentialGroup()
                        .addComponent(tDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstDataInicial)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pProntuarioLayout.setVerticalGroup(
            pProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProntuarioLayout.createSequentialGroup()
                .addGroup(pProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataProntuario)
                    .addComponent(tDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDataInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProntuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lProntuario)
                    .addComponent(lAstProntuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pDataCons.setBackground(new java.awt.Color(213, 244, 226));
        pDataCons.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data da Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lDataCons.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataCons.setText("Data:");

        tDataCons.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDataCons.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataCons.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataCons.setText("*");

        lHoracons.setFont(new java.awt.Font("Calibri", 0, 12));
        lHoracons.setText("Hora:");

        cbhora.setFont(new java.awt.Font("Calibri", 0, 12));
        cbhora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Hora", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        lAstHoraCons.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstHoraCons.setForeground(new java.awt.Color(255, 51, 51));
        lAstHoraCons.setText("*");

        javax.swing.GroupLayout pDataConsLayout = new javax.swing.GroupLayout(pDataCons);
        pDataCons.setLayout(pDataConsLayout);
        pDataConsLayout.setHorizontalGroup(
            pDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDataConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDataConsLayout.createSequentialGroup()
                        .addComponent(lDataCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstDataCons))
                    .addGroup(pDataConsLayout.createSequentialGroup()
                        .addComponent(lHoracons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstHoraCons)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pDataConsLayout.setVerticalGroup(
            pDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDataConsLayout.createSequentialGroup()
                .addGroup(pDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataCons)
                    .addComponent(tDataCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDataCons))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAstHoraCons)
                    .addComponent(lHoracons)
                    .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tpProntuario.setBackground(new java.awt.Color(122, 183, 146));
        tpProntuario.setForeground(new java.awt.Color(51, 51, 51));
        tpProntuario.setFont(new java.awt.Font("Calibri", 0, 12));

        pdiagnostico.setBackground(new java.awt.Color(122, 183, 146));
        pdiagnostico.setFont(new java.awt.Font("Calibri", 0, 12));

        pHistDiag.setBackground(new java.awt.Color(122, 183, 146));
        pHistDiag.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Histórico de Diagnósticos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lDataHistDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataHistDiag.setForeground(new java.awt.Color(255, 255, 255));
        lDataHistDiag.setText("Data:");

        tDataHistDiag.setFont(new java.awt.Font("Calibri", 0, 12));

        Vector v= ControleDiagnostico.obtemTodosDiagnosticos();
        Object [][]T= new Object [v.size()][3];
        Object [] col={"Data","Hora","Especialidade"};
        
        for (int i=0; i < v.size(); i++)
        {
        	T[i][0]=((Diagnostico)v.get(i)).getDataDiagnostico();
        	T[i][1]=((Diagnostico)v.get(i)).getHoraDiagnostico();
        	T[i][2]=((Diagnostico)v.get(i)).getEspecialidade();
        	
        }
        tcdiagnostico = new DefaultTableModel(T,col);
                       
        tbDiagnostico = new JTable(tcdiagnostico);
        tbHistPresc4.setViewportView(tbDiagnostico);
        
        btnBuscarDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        btnBuscarDiag.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarDiag.setText("Buscar Diagnóstico");

        ptxtMsgDiag.setBackground(new java.awt.Color(236, 233, 216));
        ptxtMsgDiag.setFont(new java.awt.Font("Calibri", 0, 11));
        ptxtMsgDiag.setForeground(new java.awt.Color(255, 51, 51));
        ptxtMsgDiag.setText("ATENÇÃO: digite no campo data, uma das datas visíveis\nabaixo que são referentes aos diagnósticos anteriores");
        jScrollPane11.setViewportView(ptxtMsgDiag);

        javax.swing.GroupLayout pHistDiagLayout = new javax.swing.GroupLayout(pHistDiag);
        pHistDiag.setLayout(pHistDiagLayout);
        pHistDiagLayout.setHorizontalGroup(
            pHistDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistDiagLayout.createSequentialGroup()
                .addGroup(pHistDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHistDiagLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbHistPresc4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addGroup(pHistDiagLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                    .addGroup(pHistDiagLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDataHistDiag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataHistDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarDiag)))
                .addContainerGap())
        );
        pHistDiagLayout.setVerticalGroup(
            pHistDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistDiagLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pHistDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataHistDiag)
                    .addComponent(tDataHistDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDiag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbHistPresc4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lExameDiag.setFont(new java.awt.Font("Calibri", 0, 12));

        lEntrevCons.setBackground(new java.awt.Color(255, 255, 255));
        lEntrevCons.setFont(new java.awt.Font("Calibri", 0, 12));
        lEntrevCons.setForeground(new java.awt.Color(255, 255, 255));
        lEntrevCons.setText("Entrevista da Consulta:");

        taEntrevCons.setColumns(20);
        taEntrevCons.setDocument(new MaximodeCampos(500));
        taEntrevCons.setFont(new java.awt.Font("Calibri", 0, 12));
        taEntrevCons.setRows(5);
        jScrollPane12.setViewportView(taEntrevCons);

        lObsDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        lObsDiag.setForeground(new java.awt.Color(255, 255, 255));
        lObsDiag.setText("Observações:");

        taObsDiag.setColumns(20);
        taObsDiag.setDocument(new MaximodeCampos(500));
        taObsDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        taObsDiag.setRows(5);
        jScrollPane13.setViewportView(taObsDiag);

        lDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        lDiag.setForeground(new java.awt.Color(255, 255, 255));
        lDiag.setText("Diagnóstico:");

        tDiag.setDocument(new MaximodeCampos(60));
        tDiag.setFont(new java.awt.Font("Calibri", 0, 12));

        pBotaoDiag.setBackground(new java.awt.Color(122, 183, 146));
        pBotaoDiag.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnSalvarDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvarDiag.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvarDiag.setText("Salvar");

        btnLimparDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        btnLimparDiag.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimparDiag.setText("Limpar");

        btnVoltarDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltarDiag.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltarDiag.setText("Voltar");

        btnAtualDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        btnAtualDiag.setIcon(new javax.swing.ImageIcon("imagens\\atualizar.png")); // NOI18N
        btnAtualDiag.setText("Atualizar");
        
        btnemitirDiag.setFont(new java.awt.Font("Calibri", 0, 12));
        btnemitirDiag.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnemitirDiag.setText("Emitir Retorno");
        
        javax.swing.GroupLayout pBotaoDiagLayout = new javax.swing.GroupLayout(pBotaoDiag);
        pBotaoDiag.setLayout(pBotaoDiagLayout);
        pBotaoDiagLayout.setHorizontalGroup(
            pBotaoDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoDiagLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnSalvarDiag)
                .addGap(10, 10, 10)
                .addComponent(btnAtualDiag)
                .addGap(10, 10, 10)
                .addComponent(btnLimparDiag)
                .addGap(10, 10, 10)
                .addComponent(btnemitirDiag)
                .addGap(10, 10, 10)
                .addComponent(btnVoltarDiag)
                .addGap(10, 10, 10))
        );
        pBotaoDiagLayout.setVerticalGroup(
            pBotaoDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoDiagLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarDiag)
                    .addComponent(btnSalvarDiag)
                    .addComponent(btnAtualDiag)
                    .addComponent(btnemitirDiag)
                    .addComponent(btnLimparDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lAstEntrevConsDiag.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEntrevConsDiag.setForeground(new java.awt.Color(255, 51, 51));
        lAstEntrevConsDiag.setText("*");

        lAstDiag.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDiag.setForeground(new java.awt.Color(255, 51, 51));
        lAstDiag.setText("*");

        javax.swing.GroupLayout pdiagnosticoLayout = new javax.swing.GroupLayout(pdiagnostico);
        pdiagnostico.setLayout(pdiagnosticoLayout);
        pdiagnosticoLayout.setHorizontalGroup(
            pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHistDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lExameDiag)
                .addGap(18, 18, 18)
                .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lObsDiag)
                    .addComponent(lDiag)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pdiagnosticoLayout.createSequentialGroup()
                        .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tDiag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(lEntrevCons, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAstDiag)
                            .addComponent(lAstEntrevConsDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pBotaoDiag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pdiagnosticoLayout.setVerticalGroup(
            pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pHistDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pdiagnosticoLayout.createSequentialGroup()
                        .addComponent(lEntrevCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pdiagnosticoLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lExameDiag))
                            .addGroup(pdiagnosticoLayout.createSequentialGroup()
                                .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lAstEntrevConsDiag))
                                .addGap(18, 18, 18)
                                .addComponent(lObsDiag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lDiag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pdiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lAstDiag))
                                .addGap(18, 18, 18)
                                .addComponent(pBotaoDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

   
        tpProntuario.addTab("Diagnóstico", new javax.swing.ImageIcon("imagens\\diagnostico.png"), pdiagnostico);

        ppresricao.setBackground(new java.awt.Color(122, 183, 146));
        ppresricao.setFont(new java.awt.Font("Calibri", 0, 12));

        pHistPresc.setBackground(new java.awt.Color(122, 183, 146));
        pHistPresc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Histórico de Prescrições", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        Vector vetor= ControlePrescricao.obtemTodasPrescricoes();
        Object [][]Tab= new Object [vetor.size()][3];
        Object [] colu={"Data","Hora","Especialidade"};
        
        for (int i=0; i < vetor.size(); i++)
        {
        	Tab[i][0]=((Prescricao)vetor.get(i)).getData();
        	Tab[i][1]=((Prescricao)vetor.get(i)).getHora();
        	Tab[i][2]=((Medico)vetor.get(i)).getEspecialidade();
        	
        }
        tcprescricao = new DefaultTableModel(Tab,colu);
                       
        tbPresc = new JTable(tcprescricao);
        
        tbHistPresc2.setViewportView(tbPresc);

        btnBuscarPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        btnBuscarPresc.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarPresc.setText("Buscar Prescrição");

        lDataHistPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataHistPresc.setForeground(new java.awt.Color(255, 255, 255));
        lDataHistPresc.setText("Data:");

        tDataHistPresc.setFont(new java.awt.Font("Calibri", 0, 12));

        ptxtMsgPresc.setBackground(new java.awt.Color(236, 233, 216));
        ptxtMsgPresc.setFont(new java.awt.Font("Calibri", 0, 11));
        ptxtMsgPresc.setForeground(new java.awt.Color(255, 51, 51));
        ptxtMsgPresc.setText("ATENÇÃO: digite no campo data, uma das datas visíveis\nabaixo que são referentes as prescrições anteriores");
        jScrollPane7.setViewportView(ptxtMsgPresc);

        javax.swing.GroupLayout pHistPrescLayout = new javax.swing.GroupLayout(pHistPresc);
        pHistPresc.setLayout(pHistPrescLayout);
        pHistPrescLayout.setHorizontalGroup(
            pHistPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistPrescLayout.createSequentialGroup()
                .addGroup(pHistPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHistPrescLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbHistPresc2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addGroup(pHistPrescLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDataHistPresc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataHistPresc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPresc))
                    .addGroup(pHistPrescLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHistPrescLayout.setVerticalGroup(
            pHistPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistPrescLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pHistPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataHistPresc)
                    .addComponent(tDataHistPresc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPresc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbHistPresc2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        taObsPresc.setColumns(20);
        taObsPresc.setDocument(new MaximodeCampos(500));
        taObsPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        taObsPresc.setRows(5);
        jScrollPane9.setViewportView(taObsPresc);

        lObsPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        lObsPresc.setForeground(new java.awt.Color(255, 255, 255));
        lObsPresc.setText("Observações:");

        taMedicPresc.setColumns(20);
        taMedicPresc.setDocument(new MaximodeCampos(300));
        taMedicPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        taMedicPresc.setRows(5);
        jScrollPane8.setViewportView(taMedicPresc);

        lMedicamentPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        lMedicamentPresc.setForeground(new java.awt.Color(255, 255, 255));
        lMedicamentPresc.setText("Medicamentos:");

        cbTipoPrec.setFont(new java.awt.Font("Calibri", 0, 12));
        cbTipoPrec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo de medicamento", "Farmaceutico", "Formula" }));

        lTipoPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        lTipoPresc.setForeground(new java.awt.Color(255, 255, 255));
        lTipoPresc.setText("Tipo:");

        lAsttipo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAsttipo.setForeground(new java.awt.Color(255, 51, 51));
        lAsttipo.setText("*");

        lAstMedPresc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMedPresc.setForeground(new java.awt.Color(255, 51, 51));
        lAstMedPresc.setText("*");

        pBotaoPresc.setBackground(new java.awt.Color(122, 183, 146));
        pBotaoPresc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnSalvarPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvarPresc.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvarPresc.setText("Salvar");

        btnEmitirPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEmitirPresc.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitirPresc.setText("Emitir");

        btnVoltarPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltarPresc.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltarPresc.setText("Voltar");

        btnLimparPresc.setFont(new java.awt.Font("Calibri", 0, 12));
        btnLimparPresc.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimparPresc.setText("Limpar");

        javax.swing.GroupLayout pBotaoPrescLayout = new javax.swing.GroupLayout(pBotaoPresc);
        pBotaoPresc.setLayout(pBotaoPrescLayout);
        pBotaoPrescLayout.setHorizontalGroup(
            pBotaoPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoPrescLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btnSalvarPresc)
                .addGap(36, 36, 36)
                .addComponent(btnLimparPresc)
                .addGap(36, 36, 36)
                .addComponent(btnEmitirPresc)
                .addGap(36, 36, 36)
                .addComponent(btnVoltarPresc)
                .addGap(36, 36, 36))
        );
        pBotaoPrescLayout.setVerticalGroup(
            pBotaoPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoPrescLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoPrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparPresc)
                    .addComponent(btnSalvarPresc)
                    .addComponent(btnEmitirPresc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarPresc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ppresricaoLayout = new javax.swing.GroupLayout(ppresricao);
        ppresricao.setLayout(ppresricaoLayout);
        ppresricaoLayout.setHorizontalGroup(
            ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppresricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHistPresc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTipoPresc)
                    .addGroup(ppresricaoLayout.createSequentialGroup()
                        .addComponent(cbTipoPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAsttipo))
                    .addComponent(lMedicamentPresc)
                    .addComponent(lObsPresc)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppresricaoLayout.createSequentialGroup()
                        .addGroup(ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pBotaoPresc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(lAstMedPresc)))
                .addContainerGap())
        );
        ppresricaoLayout.setVerticalGroup(
            ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppresricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppresricaoLayout.createSequentialGroup()
                        .addComponent(lTipoPresc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAsttipo))
                        .addGap(18, 18, 18)
                        .addComponent(lMedicamentPresc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(lObsPresc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pBotaoPresc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(ppresricaoLayout.createSequentialGroup()
                        .addComponent(pHistPresc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(ppresricaoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(ppresricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstMedPresc))
                .addContainerGap(210, Short.MAX_VALUE))
        );


        tpProntuario.addTab("Prescrição", new javax.swing.ImageIcon("imagens\\prescricao.png"), ppresricao);

        pexame.setBackground(new java.awt.Color(122, 183, 146));

        pHistExame.setBackground(new java.awt.Color(122, 183, 146));
        pHistExame.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Histórico de Pedidos de Exame", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lDataHistExame.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataHistExame.setForeground(new java.awt.Color(255, 255, 255));
        lDataHistExame.setText("Data:");

        tDataHistExame.setFont(new java.awt.Font("Calibri", 0, 12));

        Vector vetex= ControleExame.obtemTodosExames();
        Object [][]Tabex= new Object [vetex.size()][3];
        Object [] colex={"Data","Hora","Especialidade"};
        
        for (int i=0; i < vetex.size(); i++)
        {
        	Tabex[i][0]=((Exame)vetex.get(i)).getData();
        	Tabex[i][1]=((Exame)vetex.get(i)).getHora();
        	Tabex[i][2]=((Medico)vetex.get(i)).getEspecialidade();
        	
        }
        tcexame = new DefaultTableModel(Tabex,colex);
                       
        tbExame = new JTable(tcexame);
               
        tbHistPresc1.setViewportView(tbExame);

        btnBuscarExame.setFont(new java.awt.Font("Calibri", 0, 12));
        btnBuscarExame.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarExame.setText("Buscar Exame");

        ptxtMsgExame.setBackground(new java.awt.Color(236, 233, 216));
        ptxtMsgExame.setFont(new java.awt.Font("Calibri", 0, 11));
        ptxtMsgExame.setForeground(new java.awt.Color(255, 51, 51));
        ptxtMsgExame.setText("ATENÇÃO: digite no campo data, uma das datas visíveis abaixo que são referentes aos exames anteriores");
        jScrollPane4.setViewportView(ptxtMsgExame);

        javax.swing.GroupLayout pHistExameLayout = new javax.swing.GroupLayout(pHistExame);
        pHistExame.setLayout(pHistExameLayout);
        pHistExameLayout.setHorizontalGroup(
            pHistExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistExameLayout.createSequentialGroup()
                .addGroup(pHistExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHistExameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDataHistExame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataHistExame, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnBuscarExame))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHistExameLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbHistPresc1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addGroup(pHistExameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHistExameLayout.setVerticalGroup(
            pHistExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistExameLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pHistExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataHistExame)
                    .addComponent(tDataHistExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarExame))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(tbHistPresc1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pBotaoExame.setBackground(new java.awt.Color(122, 183, 146));
        pBotaoExame.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnSalvarExame.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvarExame.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvarExame.setText("Salvar");

        btnEmitirExame.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEmitirExame.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitirExame.setText("Emitir");

        btnVoltarExame.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltarExame.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltarExame.setText("Voltar");

        btnLimparExame.setFont(new java.awt.Font("Calibri", 0, 12));
        btnLimparExame.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimparExame.setText("Limpar");

        javax.swing.GroupLayout pBotaoExameLayout = new javax.swing.GroupLayout(pBotaoExame);
        pBotaoExame.setLayout(pBotaoExameLayout);
        pBotaoExameLayout.setHorizontalGroup(
            pBotaoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoExameLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSalvarExame)
                .addGap(40, 40, 40)
                .addComponent(btnLimparExame)
                .addGap(40, 40, 40)
                .addComponent(btnEmitirExame)
                .addGap(40, 40, 40)
                .addComponent(btnVoltarExame)
                .addGap(36, 36, 36))
        );
        pBotaoExameLayout.setVerticalGroup(
            pBotaoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoExameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoExameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarExame)
                    .addComponent(btnSalvarExame)
                    .addComponent(btnLimparExame, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmitirExame, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taObsExame.setColumns(20);
        taObsExame.setDocument(new MaximodeCampos(500));
        taObsExame.setFont(new java.awt.Font("Calibri", 0, 12));
        taObsExame.setRows(5);
        jScrollPane6.setViewportView(taObsExame);

        lExame.setFont(new java.awt.Font("Calibri", 0, 12));
        lExame.setForeground(new java.awt.Color(255, 255, 255));
        lExame.setText("Exame:");

        taExame.setColumns(20);
        taExame.setDocument(new MaximodeCampos(300));
        taExame.setFont(new java.awt.Font("Calibri", 0, 12));
        taExame.setRows(5);
        jScrollPane5.setViewportView(taExame);

        lObsExame.setFont(new java.awt.Font("Calibri", 0, 12));
        lObsExame.setForeground(new java.awt.Color(255, 255, 255));
        lObsExame.setText("Observações:");

        lAstExame.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstExame.setForeground(new java.awt.Color(255, 51, 51));
        lAstExame.setText("*");

        javax.swing.GroupLayout pexameLayout = new javax.swing.GroupLayout(pexame);
        pexame.setLayout(pexameLayout);
        pexameLayout.setHorizontalGroup(
            pexameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pexameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHistExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(pexameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pexameLayout.createSequentialGroup()
                        .addComponent(pBotaoExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(lExame, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lObsExame, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pexameLayout.createSequentialGroup()
                        .addGroup(pexameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstExame)
                        .addContainerGap())))
        );
        pexameLayout.setVerticalGroup(
            pexameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pexameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pexameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pHistExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pexameLayout.createSequentialGroup()
                        .addComponent(lExame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pexameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pexameLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lObsExame))
                            .addComponent(lAstExame))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pBotaoExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tpProntuario.addTab("Exame", new javax.swing.ImageIcon("imagens\\exame.png"), pexame); // NOI18N

        pAtestado.setBackground(new java.awt.Color(122, 183, 146));

        pHistAtestado.setBackground(new java.awt.Color(122, 183, 146));
        pHistAtestado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Histórico de Atestados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lDataHistAtest.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataHistAtest.setForeground(new java.awt.Color(255, 255, 255));
        lDataHistAtest.setText("Data:");

        tDataHistAtest.setFont(new java.awt.Font("Calibri", 0, 12));

        Vector vetatest= ControleAtestado.obtemTodosAtestados();
        Object [][]Tabatest= new Object [vetatest.size()][3];
        Object [] colatest={"Data","Hora","Especialidade"};
        
        for (int i=0; i < vetatest.size(); i++)
        {
        	Tabatest[i][0]=((Atestado)vetatest.get(i)).getData();
        	Tabatest[i][1]=((Atestado)vetatest.get(i)).getHora();
        	Tabatest[i][2]=((Medico)vetatest.get(i)).getEspecialidade();
        	
        }
        tcatestado = new DefaultTableModel(Tabatest,colatest);
                       
        tbAtestado = new JTable(tcatestado);
        
        tbHistPresc3.setViewportView(tbAtestado);

        btnBuscarAtest.setFont(new java.awt.Font("Calibri", 0, 12));
        btnBuscarAtest.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarAtest.setText("Buscar Atestado");

        ptxtMsgAtest.setBackground(new java.awt.Color(236, 233, 216));
        ptxtMsgAtest.setFont(new java.awt.Font("Calibri", 0, 11));
        ptxtMsgAtest.setForeground(new java.awt.Color(255, 51, 51));
        ptxtMsgAtest.setText("ATENÇÃO: digite no campo data, uma das datas visíveis abaixo que são referentes aos atestados anteriores");
        jScrollPane10.setViewportView(ptxtMsgAtest);

        javax.swing.GroupLayout pHistAtestadoLayout = new javax.swing.GroupLayout(pHistAtestado);
        pHistAtestado.setLayout(pHistAtestadoLayout);
        pHistAtestadoLayout.setHorizontalGroup(
            pHistAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistAtestadoLayout.createSequentialGroup()
                .addGroup(pHistAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHistAtestadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDataHistAtest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataHistAtest, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnBuscarAtest))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHistAtestadoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbHistPresc3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addGroup(pHistAtestadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHistAtestadoLayout.setVerticalGroup(
            pHistAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistAtestadoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pHistAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataHistAtest)
                    .addComponent(tDataHistAtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAtest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbHistPresc3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pBotaoAtestado.setBackground(new java.awt.Color(122, 183, 146));
        pBotaoAtestado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnSalvarAtestado.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSalvarAtestado.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvarAtestado.setText("Salvar");

        btnEmitirAtestado.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEmitirAtestado.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitirAtestado.setText("Emitir");

        btnVoltarAtestado.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltarAtestado.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltarAtestado.setText("Voltar");

        btnLimparAtestado.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnLimparAtestado.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimparAtestado.setText("Limpar");

        javax.swing.GroupLayout pBotaoAtestadoLayout = new javax.swing.GroupLayout(pBotaoAtestado);
        pBotaoAtestado.setLayout(pBotaoAtestadoLayout);
        pBotaoAtestadoLayout.setHorizontalGroup(
            pBotaoAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoAtestadoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSalvarAtestado)
                .addGap(37, 37, 37)
                .addComponent(btnLimparAtestado)
              .addGap(37, 37, 37)
                .addComponent(btnEmitirAtestado)
                .addGap(37, 37, 37)
                .addComponent(btnVoltarAtestado)
                .addGap(20, 20, 20))
        );
        pBotaoAtestadoLayout.setVerticalGroup(
            pBotaoAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoAtestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAtestado)
                    .addComponent(btnEmitirAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarAtestado)
                    .addComponent(btnLimparAtestado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lAtestado.setFont(new java.awt.Font("Calibri", 0, 12));
        lAtestado.setForeground(new java.awt.Color(255, 255, 255));
        lAtestado.setText("Atestado:");

        taAtestado.setColumns(20);
        taAtestado.setDocument(new MaximodeCampos(500));
        taAtestado.setFont(new java.awt.Font("Calibri", 0, 12));
        taAtestado.setRows(5);
        jScrollPane14.setViewportView(taAtestado);

        lAstAtestado.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstAtestado.setForeground(new java.awt.Color(255, 51, 51));
        lAstAtestado.setText("*");

        lObsAtestado.setFont(new java.awt.Font("Calibri", 0, 12));
        lObsAtestado.setForeground(new java.awt.Color(255, 255, 255));
        lObsAtestado.setText("Observações:");

        taObsAtestado.setColumns(20);
        taObsAtestado.setDocument(new MaximodeCampos(500));
        taObsAtestado.setFont(new java.awt.Font("Calibri", 0, 12));
        taObsAtestado.setRows(5);
        jScrollPane15.setViewportView(taObsAtestado);

        javax.swing.GroupLayout pAtestadoLayout = new javax.swing.GroupLayout(pAtestado);
        pAtestado.setLayout(pAtestadoLayout);
        pAtestadoLayout.setHorizontalGroup(
            pAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHistAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(pAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBotaoAtestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lAtestado)
                    .addComponent(lObsAtestado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAtestadoLayout.createSequentialGroup()
                        .addGroup(pAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstAtestado)))
                .addContainerGap())
        );
        pAtestadoLayout.setVerticalGroup(
            pAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAtestadoLayout.createSequentialGroup()
                        .addComponent(lAtestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAstAtestado)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lObsAtestado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pBotaoAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(pAtestadoLayout.createSequentialGroup()
                        .addComponent(pHistAtestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        tpProntuario.addTab("Atestado", new javax.swing.ImageIcon("imagens\\atestado.png"), pAtestado);
       
        pLaudo.setBackground(new java.awt.Color(122, 183, 146));

        pHistLaudo.setBackground(new java.awt.Color(122, 183, 146));
        pHistLaudo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Histórico de Laudos Periciais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lDataHistLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataHistLaudo.setForeground(new java.awt.Color(255, 255, 255));
        lDataHistLaudo.setText("Data:");

        tDataHistLaudo.setFont(new java.awt.Font("Calibri", 0, 12));

        btnBuscarLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        btnBuscarLaudo.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarLaudo.setText("Buscar Laudo");

        ptxtMsgLaudo.setBackground(new java.awt.Color(236, 233, 216));
        ptxtMsgLaudo.setFont(new java.awt.Font("Calibri", 0, 11));
        ptxtMsgLaudo.setForeground(new java.awt.Color(255, 51, 51));
        ptxtMsgLaudo.setText("ATENÇÃO: digite no campo data, uma das datas visíveis abaixo que são referentes aos Laudos anteriores");
        jScrollPane16.setViewportView(ptxtMsgLaudo);

        Vector vetlaudo= ControleLaudo.obtemTodosLaudos();
        Object [][]Tablaudo= new Object [vetlaudo.size()][3];
        Object [] collaudo={"Data","Hora","Especialidade"};
        
        for (int i=0; i < vetlaudo.size(); i++)
        {
        	Tablaudo[i][0]=((LaudoPericial)vetlaudo.get(i)).getData();
        	Tablaudo[i][1]=((LaudoPericial)vetlaudo.get(i)).getHora();
        	Tablaudo[i][2]=((Medico)vetlaudo.get(i)).getEspecialidade();
        	
        }
        tclaudo = new DefaultTableModel(Tablaudo,collaudo);
                       
        tbLaudo = new JTable(tclaudo);
       
        tbHistPresc5.setViewportView(tbLaudo);

        javax.swing.GroupLayout pHistLaudoLayout = new javax.swing.GroupLayout(pHistLaudo);
        pHistLaudo.setLayout(pHistLaudoLayout);
        pHistLaudoLayout.setHorizontalGroup(
            pHistLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistLaudoLayout.createSequentialGroup()
                .addGroup(pHistLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHistLaudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pHistLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addGroup(pHistLaudoLayout.createSequentialGroup()
                                .addComponent(lDataHistLaudo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tDataHistLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(btnBuscarLaudo)
                                .addGap(15, 15, 15))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHistLaudoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tbHistPresc5, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pHistLaudoLayout.setVerticalGroup(
            pHistLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistLaudoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pHistLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataHistLaudo)
                    .addComponent(tDataHistLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLaudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbHistPresc5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        lLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        lLaudo.setForeground(new java.awt.Color(255, 255, 255));
        lLaudo.setText("Descrição do Laudo Pericial:");

        lAstLaudo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstLaudo.setForeground(new java.awt.Color(255, 51, 51));
        lAstLaudo.setText("*");

        taLaudo.setColumns(20);
        taLaudo.setDocument(new MaximodeCampos(500));
        taLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        taLaudo.setRows(5);
        jScrollPane17.setViewportView(taLaudo);

        lObsLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        lObsLaudo.setForeground(new java.awt.Color(255, 255, 255));
        lObsLaudo.setText("Observações:");

        taObsLaudo.setColumns(20);
        taObsLaudo.setDocument(new MaximodeCampos(500));
        taObsLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        taObsLaudo.setRows(5);
        jScrollPane18.setViewportView(taObsLaudo);

        pBotaoLaudo.setBackground(new java.awt.Color(122, 183, 146));
        pBotaoLaudo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnSalvarLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        btnSalvarLaudo.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvarLaudo.setText("Salvar");

        btnEmitirLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEmitirLaudo.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitirLaudo.setText("Emitir");

        btnVoltarLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltarLaudo.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltarLaudo.setText("Voltar");

        btnLimparLaudo.setFont(new java.awt.Font("Calibri", 0, 12));
        btnLimparLaudo.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimparLaudo.setText("Limpar");

        javax.swing.GroupLayout pBotaoLaudoLayout = new javax.swing.GroupLayout(pBotaoLaudo);
        pBotaoLaudo.setLayout(pBotaoLaudoLayout);
        pBotaoLaudoLayout.setHorizontalGroup(
            pBotaoLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoLaudoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnSalvarLaudo)
                .addGap(36, 36, 36)
                .addComponent(btnLimparLaudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnEmitirLaudo)
                .addGap(36, 36, 36)
                .addComponent(btnVoltarLaudo)
                .addGap(36, 36, 36))
        );
        pBotaoLaudoLayout.setVerticalGroup(
            pBotaoLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLaudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotaoLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarLaudo)
                    .addComponent(btnVoltarLaudo)
                    .addComponent(btnEmitirLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparLaudo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pLaudoLayout = new javax.swing.GroupLayout(pLaudo);
        pLaudo.setLayout(pLaudoLayout);
        pLaudoLayout.setHorizontalGroup(
            pLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLaudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHistLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLaudoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lLaudo)
                        .addContainerGap())
                    .addGroup(pLaudoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(pLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pBotaoLaudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(lObsLaudo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstLaudo)
                        .addGap(15, 15, 15))))
        );
        pLaudoLayout.setVerticalGroup(
            pLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLaudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pHistLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pLaudoLayout.createSequentialGroup()
                        .addComponent(lLaudo)
                        .addGap(7, 7, 7)
                        .addGroup(pLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAstLaudo)
                            .addGroup(pLaudoLayout.createSequentialGroup()
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lObsLaudo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(pBotaoLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpProntuario.addTab("Laudo Pericial", new javax.swing.ImageIcon("imagens\\laudo.png"), pLaudo);
       
        javax.swing.GroupLayout pcampoLayout = new javax.swing.GroupLayout(pcampo);
        pcampo.setLayout(pcampoLayout);
        pcampoLayout.setHorizontalGroup(
            pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcampoLayout.createSequentialGroup()
                        .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pIdentMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pIdentPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pDataCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pcampoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lMsg))
                            .addComponent(pProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tpProntuario, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pcampoLayout.setVerticalGroup(
            pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pIdentMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pDataCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pIdentPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaProntuario.getContentPane());
        telaProntuario.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

       // Listener dos botões
       ControleProntuario prontuario= new ControleProntuario(telaProntuario);
       btnVisualizarAnamnese.addActionListener(prontuario);    
        
        ControleDiagnostico diagnostico= new ControleDiagnostico(telaProntuario);
        btnBuscarDiag.addActionListener(diagnostico); 
        btnSalvarDiag.addActionListener(diagnostico);  
        btnVoltarDiag.addActionListener(diagnostico); 
        btnLimparDiag.addActionListener(diagnostico); 
        btnAtualDiag.addActionListener(diagnostico);
        btnemitirDiag.addActionListener(diagnostico);
                
        
        ControlePrescricao prescricao= new ControlePrescricao(telaProntuario);
        btnBuscarPresc.addActionListener(prescricao);  
        btnSalvarPresc.addActionListener(prescricao); 
        btnEmitirPresc.addActionListener(prescricao); 
        btnVoltarPresc.addActionListener(prescricao); 
        btnLimparPresc.addActionListener(prescricao); 
        
        ControleExame exame= new ControleExame(telaProntuario);
        btnBuscarExame.addActionListener(exame); 
        btnSalvarExame.addActionListener(exame);  
        btnEmitirExame.addActionListener(exame);  
        btnVoltarExame.addActionListener(exame);  
        btnLimparExame.addActionListener(exame);  
        
        ControleAtestado atestado= new ControleAtestado(telaProntuario);
        btnBuscarAtest.addActionListener(atestado); 
        btnSalvarAtestado.addActionListener(atestado);  
        btnEmitirAtestado.addActionListener(atestado);  
        btnVoltarAtestado.addActionListener(atestado);  
        btnLimparAtestado.addActionListener(atestado);  
        
        ControleLaudo laudo= new ControleLaudo(telaProntuario);
        btnBuscarLaudo.addActionListener(laudo); 
        btnSalvarLaudo.addActionListener(laudo);  
        btnEmitirLaudo.addActionListener(laudo);  
        btnVoltarLaudo.addActionListener(laudo);  
        btnLimparLaudo.addActionListener(laudo);  
               
        telaProntuario.pack();
        telaProntuario.setVisible(true);
        //telaProntuario.setLocation(160,0);
    
        //centraliza a tela
        telaProntuario.setLocationRelativeTo(null);
    
    }// </editor-fold>
    
    public JFrame getTelaProntuario(){
		
		return telaProntuario;
}

}
