package paciente;

import java.awt.Toolkit;
import menuprincipal.*;

import javax.swing.*;


public class TelaPacienteAdulto  {

   
	private JFrame telaPacienteAdulto;
               
    private JButton btnAlterar,btnConsultar,btnSalvar,btnVoltar,btnLimpar;
    private JComboBox cbEstadoCivil,cbOperadoraPlano,cbSexo,cbUf,cbConvenio;

    private JLabel lAsCpf,lAstBairro,lAstCep,lAstCidade,lAstDataNasc,lAstEndereco,lAstEstadoCivil,lAstUf,
    lAstIdent,lAstMatricula,lAstNome,lAstNumero,lAstPossuiConv,lAstSexo,lAstTelefone;

    private JLabel lBairro,lBanner,lCelular,lCep,lCidade,lComplemento,lCpf,lDataNasc,lEndereco,lEstadoCivil,
    lIdent,lMatricula,lMsg,lNome,lNumero,lOperadoraConvenio,lPossuiConv,lSexo,lTelefone,lUf;

    private JPanel pBotao,pCampo,pDadosPessoais,pLogadouro,pConvenio;
   
    private JTextField tBairro,tCelular,tCep,tCidade,tComplemento,tCpf,tEndereco,tIdent,
    tMatricula,tNome,tNumero,tTelefone;
    
    private String[] sexo= {"Selecione o Sexo", "Feminino", "Masculino"  };
    private String[] estadocivil= {"Selecione o Estado Cívil", "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Separado(a)"  };
    private String[] uf=  { "Selecione o Estado", "ACRE", "ALAGOAS", "AMAPÁ", "AMAZÔNIA", "BAHIA", "CEARÁ", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAIBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS" };
    private String[] convenio={ "Selecione uma opção","Sim", "Não" };
    private String[] operaconvenio={ "Selecione o Convênio" };
    
    public TelaPacienteAdulto() {
  
    	telaPacienteAdulto=new JFrame();
        
        pCampo = new JPanel();
        pDadosPessoais = new JPanel();
        pBotao = new JPanel();
        pLogadouro = new JPanel();
        
        lBanner = new JLabel();
        lNome = new JLabel();
        lDataNasc = new JLabel();
        lTelefone = new JLabel();
        lCelular = new JLabel();
        lSexo = new JLabel();
        lEstadoCivil = new JLabel();
        lMatricula = new JLabel();
        lCpf = new JLabel();       
        lIdent = new JLabel();
        lOperadoraConvenio = new JLabel();
        lEndereco = new JLabel();
        lNumero = new JLabel();
        lComplemento = new JLabel();
        lBairro = new JLabel();
        lCep = new JLabel();
        lCidade = new JLabel();
        lUf = new JLabel();
        
        lMsg = new JLabel();
        lAstNome = new JLabel();
        lAstDataNasc = new JLabel();
        lAstTelefone = new JLabel();
        lAstEstadoCivil = new JLabel();
        lAstSexo = new JLabel();
        lAsCpf = new JLabel();
        lAstIdent = new JLabel();
        lAstPossuiConv = new JLabel();
        lAstMatricula = new JLabel();
        lAstEndereco = new JLabel(); 
        lAstNumero = new JLabel();
        lAstCidade = new JLabel();
        lAstCep = new JLabel();
        lAstBairro = new JLabel();
        lAstUf = new JLabel();
               
        tNome = new JTextField();       
        Calendario tDataNasc = new Calendario(true);
        tCpf = new JTextField();
        tIdent = new JTextField();      
        tTelefone = new JTextField();
        tCelular = new JTextField();
        tMatricula = new JTextField();
        tEndereco = new JTextField();
        tNumero = new JTextField();
        tBairro = new JTextField();
        tCidade = new JTextField();
        tCep = new JTextField();
        tComplemento = new JTextField();
        
        cbSexo = new JComboBox(sexo);       
        cbEstadoCivil = new JComboBox(estadocivil);
        cbOperadoraPlano = new JComboBox(operaconvenio);
        cbUf = new JComboBox(uf);
        cbConvenio= new JComboBox(convenio);
              
        pConvenio = new JPanel();
        lPossuiConv = new JLabel();
              
        btnConsultar = new JButton();
        btnVoltar = new JButton();
        btnAlterar = new JButton();
        btnSalvar = new JButton();
        btnLimpar = new JButton();
             
        telaPacienteAdulto.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaPacienteAdulto.setTitle("Paciente - Adulto");
        telaPacienteAdulto.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaPacienteAdulto.setResizable(false);

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerPacienteAdulto.PNG")); // NOI18N

        //máscara cpf
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("###.###.###-##");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCpf=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

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

        
        //máscara cep
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##.### - ###");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCep=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        
        //máscara matricula
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("######");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            //tMatricula=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pDadosPessoais.setBackground(new java.awt.Color(213, 244, 226));
        pDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lNome.setFont(new java.awt.Font("Calibri", 0, 12));
        lNome.setText("Nome:");

        tNome.setDocument(new MaximodeCampos(50));
        tNome.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        lDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataNasc.setText("Data de Nascimento:");

        tDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDataNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataNasc.setText("*");

        tCpf.setFont(new java.awt.Font("Calibri", 0, 12));

        tIdent.setFont(new java.awt.Font("Calibri", 0, 12));

        lTelefone.setFont(new java.awt.Font("Calibri", 0, 12));
        lTelefone.setText("Telefone:");

        tTelefone.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstTelefone.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstTelefone.setForeground(new java.awt.Color(255, 51, 51));
        lAstTelefone.setText("*");

        lCelular.setFont(new java.awt.Font("Calibri", 0, 12));
        lCelular.setText("Celular:");

        tCelular.setFont(new java.awt.Font("Calibri", 0, 12));

        lSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        lSexo.setText("Sexo:");

        cbSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        

        lEstadoCivil.setFont(new java.awt.Font("Calibri", 0, 12));
        lEstadoCivil.setText("Estado Cívil:");

        cbEstadoCivil.setFont(new java.awt.Font("Calibri", 0, 12));
       
        lAstEstadoCivil.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEstadoCivil.setForeground(new java.awt.Color(255, 51, 51));
        lAstEstadoCivil.setText("*");

        lCpf.setFont(new java.awt.Font("Calibri", 0, 12));
        lCpf.setText("CPF:");

        lAstSexo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSexo.setForeground(new java.awt.Color(255, 51, 51));
        lAstSexo.setText("*");

        lAsCpf.setFont(new java.awt.Font("Calibri", 0, 14));
        lAsCpf.setForeground(new java.awt.Color(255, 51, 51));
        lAsCpf.setText("*");

        lIdent.setFont(new java.awt.Font("Calibri", 0, 12));
        lIdent.setText("Identidade:");

        lAstIdent.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstIdent.setForeground(new java.awt.Color(255, 51, 51));
        lAstIdent.setText("*");

        javax.swing.GroupLayout pDadosPessoaisLayout = new javax.swing.GroupLayout(pDadosPessoais);
        pDadosPessoais.setLayout(pDadosPessoaisLayout);
        pDadosPessoaisLayout.setHorizontalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome)
                    .addComponent(lSexo)
                    .addComponent(lCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNome)
                        .addGap(51, 51, 51)
                        .addComponent(lDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstDataNasc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAsCpf)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(lAstSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(lTelefone))
                            .addComponent(lIdent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstTelefone))
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(tIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstIdent)))
                        .addGap(35, 35, 35)
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCelular)
                            .addComponent(lEstadoCivil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstEstadoCivil)))
                        .addGap(159, 159, 159)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDadosPessoaisLayout.setVerticalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNome)
                    .addComponent(lAstDataNasc)
                    .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDataNasc))
                .addGap(18, 18, 18)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstSexo)
                    .addComponent(lTelefone)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstTelefone)
                    .addComponent(lCelular)
                    .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAsCpf)
                    .addComponent(lEstadoCivil)
                    .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstEstadoCivil)
                    .addComponent(tIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstIdent)
                    .addComponent(lIdent))
                .addGap(22, 22, 22))
        );

        pConvenio.setBackground(new java.awt.Color(213, 244, 226));
        pConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Convênio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lPossuiConv.setFont(new java.awt.Font("Calibri", 0, 12));
        lPossuiConv.setText("Possui Convênio:");
        
        cbConvenio.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
              
        lAstPossuiConv.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstPossuiConv.setForeground(new java.awt.Color(255, 51, 51));
        lAstPossuiConv.setText("*");

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matrícula:");

        tMatricula.setDocument(new MaximodeCampos(6));
        tMatricula.setFont(new java.awt.Font("Calibri", 0, 12));

        lOperadoraConvenio.setFont(new java.awt.Font("Calibri", 0, 12));
        lOperadoraConvenio.setText("Operadora do Convênio:");

        cbOperadoraPlano.setFont(new java.awt.Font("Calibri", 0, 12));
        
      
        lAstMatricula.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMatricula.setForeground(new java.awt.Color(255, 51, 51));
        lAstMatricula.setText("*");

        javax.swing.GroupLayout pConvenioLayout = new javax.swing.GroupLayout(pConvenio);
        pConvenio.setLayout(pConvenioLayout);
        pConvenioLayout.setHorizontalGroup(
        		pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pConvenioLayout.createSequentialGroup()
                		 .addContainerGap()
                         .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(pConvenioLayout.createSequentialGroup()
                                 .addComponent(lPossuiConv)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGap(18, 18, 18)
                                 .addComponent(lAstPossuiConv)
                                 .addGap(88, 88, 88)
                                 .addComponent(lMatricula)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(lAstMatricula))
                             .addGroup(pConvenioLayout.createSequentialGroup()
                                 .addComponent(lOperadoraConvenio)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(cbOperadoraPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                         .addContainerGap(140, Short.MAX_VALUE))
                 );
        pConvenioLayout.setVerticalGroup(
        		pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pConvenioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lPossuiConv)
                        .addComponent(lMatricula)
                        .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lAstMatricula)
                        .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lAstPossuiConv))
                    .addGap(18, 18, 18)
                    .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lOperadoraConvenio)
                        .addComponent(cbOperadoraPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       )
                    .addContainerGap(15, Short.MAX_VALUE))
            );

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
                .addGap(45, 45, 45)
                .addComponent(btnSalvar)
                .addGap(40, 40, 40)
                .addComponent(btnAlterar)
                .addGap(40, 40, 40)
                .addComponent(btnConsultar)
                .addGap(40, 40, 40)
                .addComponent(btnLimpar)
                .addGap(40, 40, 40)
                .addComponent(btnVoltar)
                .addContainerGap(45, Short.MAX_VALUE))
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

        pLogadouro.setBackground(new java.awt.Color(213, 244, 226));
        pLogadouro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Logadouro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lEndereco.setFont(new java.awt.Font("Calibri", 0, 12));
        lEndereco.setText("Endereço:");

        tEndereco.setDocument(new MaximodeCampos(60));
        tEndereco.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstEndereco.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEndereco.setForeground(new java.awt.Color(255, 51, 51));
        lAstEndereco.setText("*");

        lNumero.setFont(new java.awt.Font("Calibri", 0, 12));
        lNumero.setText("Número:");

        tNumero.setDocument(new MaximodeCampos(7));
        tNumero.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNumero.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNumero.setForeground(new java.awt.Color(255, 51, 51));
        lAstNumero.setText("*");

        lComplemento.setFont(new java.awt.Font("Calibri", 0, 12));
        lComplemento.setText("Complemento:");

        lBairro.setFont(new java.awt.Font("Calibri", 0, 12));
        lBairro.setText("Bairro:");

        lAstBairro.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstBairro.setForeground(new java.awt.Color(255, 51, 51));
        lAstBairro.setText("*");

        tBairro.setDocument(new MaximodeCampos(30));
        tBairro.setFont(new java.awt.Font("Calibri", 0, 12));

        lCep.setFont(new java.awt.Font("Calibri", 0, 12));
        lCep.setText("CEP:");

        tCep.setFont(new java.awt.Font("Calibri", 0, 12));

        lCidade.setFont(new java.awt.Font("Calibri", 0, 12));
        lCidade.setText("Cidade:");

        tCidade.setDocument(new MaximodeCampos(30));
        tCidade.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCidade.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCidade.setForeground(new java.awt.Color(255, 51, 51));
        lAstCidade.setText("*");

        tComplemento.setDocument(new MaximodeCampos(35));
        tComplemento.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCep.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCep.setForeground(new java.awt.Color(255, 51, 51));
        lAstCep.setText("*");

        lUf.setFont(new java.awt.Font("Calibri", 0, 12));
        lUf.setText("UF:");

        cbUf.setFont(new java.awt.Font("Calibri", 0, 12));
      
        lAstUf.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstUf.setForeground(new java.awt.Color(255, 51, 51));
        lAstUf.setText("*");

        javax.swing.GroupLayout pLogadouroLayout = new javax.swing.GroupLayout(pLogadouro);
        pLogadouro.setLayout(pLogadouroLayout);
        pLogadouroLayout.setHorizontalGroup(
            pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogadouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEndereco)
                    .addComponent(lBairro)
                    .addComponent(lCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pLogadouroLayout.createSequentialGroup()
                        .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstEndereco)
                        .addGap(60, 60, 60)
                        .addComponent(lNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNumero))
                    .addGroup(pLogadouroLayout.createSequentialGroup()
                        .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tCidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAstBairro)
                            .addComponent(lAstCidade))
                        .addGap(39, 39, 39)
                        .addComponent(lCep)
                        .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pLogadouroLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                            .addGroup(pLogadouroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstCep)
                                .addGap(79, 79, 79)
                                .addComponent(lUf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstUf)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pLogadouroLayout.setVerticalGroup(
            pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogadouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEndereco)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstEndereco)
                    .addComponent(lNumero)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNumero))
                .addGap(18, 18, 18)
                .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBairro)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstBairro)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lComplemento))
                .addGap(18, 18, 18)
                .addGroup(pLogadouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCidade)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCidade)
                    .addComponent(lCep)
                    .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCep)
                    .addComponent(lUf)
                    .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstUf))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCampoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCampoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pLogadouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pDadosPessoais, 0, 697, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCampoLayout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addComponent(lMsg)
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addGap(10, 10, 10)
                .addComponent(pDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pLogadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaPacienteAdulto.getContentPane());
        telaPacienteAdulto.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lBanner)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lBanner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        ControlePacienteAdulto pacienteAdulto= new ControlePacienteAdulto(telaPacienteAdulto);
        btnSalvar.addActionListener(pacienteAdulto);
        btnConsultar.addActionListener(pacienteAdulto);
        btnAlterar.addActionListener(pacienteAdulto);
        btnVoltar.addActionListener(pacienteAdulto);    
        btnLimpar.addActionListener(pacienteAdulto); 
       tMatricula.addMouseListener(pacienteAdulto);
       //tDataNasc.addActionListener(pacienteAdulto);

        telaPacienteAdulto.pack();
        telaPacienteAdulto.setVisible(true);
        //telaPacienteAdulto.setLocation(240,0);
    
        //centraliza a tela   
        telaPacienteAdulto.setLocationRelativeTo(null);
    
    }// </editor-fold>                        

    public JFrame getTelaPacienteAdulto()
    {
 	 return telaPacienteAdulto;
    }
}
