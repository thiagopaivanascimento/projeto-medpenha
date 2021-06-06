
package paciente;
import java.awt.Toolkit;

import menuprincipal.*;
import javax.swing.*;
 
public class TelaPacienteCrianca {

   
	private JFrame telaPacienteCrianca;         
    private JButton btnAlterar,btnConsultar,btnSalvar,btnVoltar,btnLimpar;
    private JComboBox cbOperadoraPlano,cbSexo,cbUf,cbConvenio;
    private JLabel lAscTelefoneResp,lAstBairro,lAstCep,lAstCidade,lAstCpfResp,lAstDataNasc,
    lAstEndereco,lAstIdentResp,lAstMatricula,lAstNascResp,lAstNome,lAstNomeResp,lAstNumero,
    lAstPossuiConv,lAstSexo,lAstUf;
    private JLabel lBairro,lBanner,lCelular,lCep,lCidade,lComplemento,lCpf,lDataNasc,lEndereco,
    lIdent,lMatricula,lMsg,lNasc,lNome,lNomeResp,lNumero,lOperadoraConvenio,lPossuiConv,lSexo,
    lTelefone,lUf;
    private JPanel pBanner,pBotao,pCampo,pDadosPessoais,pDadosResponsavel,pLogadouro,pConvenio;
    private JTextField tBairro,tCelular,tCep,tCidade,tComplemento,tCpf,tEndereco,
    tIdent,tMatricula,tNome,tNomeResp,tNumero,tTelefone;

    private String[] sexo= {"Selecione o Sexo", "Feminino", "Masculino"  };
    private String[] convenio={ "Selecione uma opção","Sim", "Não" };
    private String[] operaconvenio={ "Selecione o Convênio" };
    private String[] uf=  { "Selecione o Estado", "ACRE", "ALAGOAS", "AMAPÁ", "AMAZÔNIA", "BAHIA", "CEARÁ", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAIBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS" };
	
    public TelaPacienteCrianca() {

    	telaPacienteCrianca=new JFrame();
        pCampo = new JPanel();
        pDadosPessoais = new JPanel();
        pConvenio = new JPanel();
        pBotao = new JPanel();
        pDadosResponsavel = new JPanel();
        pBanner = new JPanel();
        pLogadouro = new JPanel();
        
        lMsg = new JLabel();
        lAstNome = new JLabel();
        lAstSexo = new JLabel();
        lAstPossuiConv = new JLabel();
        lAstMatricula = new JLabel();
        lAstNomeResp = new JLabel();
        lAstNascResp = new JLabel();
        lAstIdentResp = new JLabel();
        lAscTelefoneResp = new JLabel();
        lAstCpfResp = new JLabel();
        lAstEndereco = new JLabel();
        lAstUf = new JLabel();
        lAstNumero = new JLabel();
        lAstBairro = new JLabel();
        lAstDataNasc = new JLabel();
        lAstCidade = new JLabel();
        lAstCep = new JLabel();
        lCpf = new JLabel();
        lIdent = new JLabel();
        
        lNome = new JLabel();
        lDataNasc = new JLabel();
        lSexo = new JLabel();
        lPossuiConv = new JLabel();
        lMatricula = new JLabel();
        lOperadoraConvenio = new JLabel();
        lNomeResp = new JLabel();
        lNasc = new JLabel();
        lCelular = new JLabel();
        lTelefone = new JLabel();
        lEndereco = new JLabel();
        lNumero = new JLabel();
        lComplemento = new JLabel();
        lBairro = new JLabel();
        lUf = new JLabel();
        lBanner = new JLabel();
        
        tNome = new JTextField();
        Calendario tDataNasc = new Calendario(true);
        tMatricula = new JTextField();
        tNomeResp = new JTextField();
        Calendario tDataNascResp = new Calendario(true);
        tCelular = new JTextField();
        tCpf = new JTextField();
        tIdent = new JTextField();                
        tTelefone = new JTextField();                       
        tEndereco = new JTextField();        
        tNumero = new JTextField();               
        tBairro = new JTextField();
        lCep = new JLabel();
        tCep = new JTextField();
        lCidade = new JLabel();
        tCidade = new JTextField();       
        tComplemento = new JTextField(); 
       
        cbSexo = new JComboBox(sexo);
        cbOperadoraPlano = new JComboBox(operaconvenio);
        cbUf = new JComboBox(uf);
        cbConvenio= new JComboBox(convenio);
                   
        btnConsultar = new JButton();
        btnVoltar = new JButton();
        btnAlterar = new JButton();
        btnSalvar = new JButton();
        btnLimpar = new JButton();
                                                                                        
        telaPacienteCrianca.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaPacienteCrianca.setTitle("Paciente - Criança");
        telaPacienteCrianca.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaPacienteCrianca.setResizable(false);

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
        tNome.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        lDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataNasc.setText("Data de Nascimento:");

        tDataNasc.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDataNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstDataNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataNasc.setText("*");

        lSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        lSexo.setText("Sexo:");

        cbSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        
        lAstSexo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSexo.setForeground(new java.awt.Color(255, 51, 51));
        lAstSexo.setText("*");

        javax.swing.GroupLayout pDadosPessoaisLayout = new javax.swing.GroupLayout(pDadosPessoais);
        pDadosPessoais.setLayout(pDadosPessoaisLayout);
        pDadosPessoaisLayout.setHorizontalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome)
                    .addComponent(lSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNome)
                        .addGap(66, 66, 66)
                        .addComponent(lDataNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstDataNasc))
                    .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstSexo)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pDadosPessoaisLayout.setVerticalGroup(
            pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNome)
                    .addComponent(lDataNasc)
                    .addComponent(tDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDataNasc))
                .addGap(18, 18, 18)
                .addGroup(pDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSexo)
                    .addComponent(lAstSexo))
                .addContainerGap())
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

        lOperadoraConvenio.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
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
                                .addGap(90, 90, 90)
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
                        .addComponent(cbOperadoraPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(55, 55, 55)
                .addComponent(btnSalvar)
                .addGap(50, 50, 50)
                .addComponent(btnAlterar)
                .addGap(50, 50, 50)
                .addComponent(btnConsultar)
                .addGap(50, 50, 50)
                 .addComponent(btnLimpar)
                .addGap(50, 50, 50)
                .addComponent(btnVoltar)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnVoltar)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpar)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        pDadosResponsavel.setBackground(new java.awt.Color(213, 244, 226));
        pDadosResponsavel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Responsável", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lNomeResp.setFont(new java.awt.Font("Calibri", 0, 12));
        lNomeResp.setText("Nome:");

        tNomeResp.setDocument(new MaximodeCampos(50));
        tNomeResp.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNomeResp.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNomeResp.setForeground(new java.awt.Color(255, 51, 51));
        lAstNomeResp.setText("*");

        lNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lNasc.setText("Data de Nascimento:");

        tDataNascResp.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNascResp.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNascResp.setForeground(new java.awt.Color(255, 51, 51));
        lAstNascResp.setText("*");

        tCelular.setFont(new java.awt.Font("Calibri", 0, 12));

        tCpf.setFont(new java.awt.Font("Calibri", 0, 12));

        lCpf.setFont(new java.awt.Font("Calibri", 0, 12));
        lCpf.setText("CPF:");

        lIdent.setFont(new java.awt.Font("Calibri", 0, 12));
        lIdent.setText("Identidade:");

        tIdent.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstIdentResp.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstIdentResp.setForeground(new java.awt.Color(255, 51, 51));
        lAstIdentResp.setText("*");

        lCelular.setFont(new java.awt.Font("Calibri", 0, 12));
        lCelular.setText("Celular:");

        lTelefone.setFont(new java.awt.Font("Calibri", 0, 12));
        lTelefone.setText("Telefone:");

        tTelefone.setFont(new java.awt.Font("Calibri", 0, 12));

        lAscTelefoneResp.setFont(new java.awt.Font("Calibri", 0, 14));
        lAscTelefoneResp.setForeground(new java.awt.Color(255, 51, 51));
        lAscTelefoneResp.setText("*");

        lAstCpfResp.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCpfResp.setForeground(new java.awt.Color(255, 51, 51));
        lAstCpfResp.setText("*");

        javax.swing.GroupLayout pDadosResponsavelLayout = new javax.swing.GroupLayout(pDadosResponsavel);
        pDadosResponsavel.setLayout(pDadosResponsavelLayout);
        pDadosResponsavelLayout.setHorizontalGroup(
            pDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosResponsavelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosResponsavelLayout.createSequentialGroup()
                        .addComponent(lNomeResp)
                        .addGap(6, 6, 6)
                        .addComponent(tNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNomeResp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(lNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pDadosResponsavelLayout.createSequentialGroup()
                        .addComponent(lCpf)
                        .addGap(18, 18, 18)
                        .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstCpfResp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(lIdent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstIdentResp, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAscTelefoneResp)
                        .addGap(47, 47, 47)))
                .addGroup(pDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pDadosResponsavelLayout.createSequentialGroup()
                        .addComponent(tDataNascResp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstNascResp)
                        .addGap(48, 48, 48))
                    .addGroup(pDadosResponsavelLayout.createSequentialGroup()
                        .addComponent(lCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pDadosResponsavelLayout.setVerticalGroup(
            pDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosResponsavelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeResp)
                    .addComponent(tNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNomeResp)
                    .addComponent(lNasc)
                    .addComponent(tDataNascResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNascResp))
                .addGap(18, 18, 18)
                .addGroup(pDadosResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(tCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCpfResp)
                    .addComponent(tCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCelular)
                    .addComponent(lIdent)
                    .addComponent(tIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstIdentResp)
                    .addComponent(lTelefone)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAscTelefoneResp))
                .addGap(15, 15, 15))
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
                .addContainerGap(54, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMsg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pConvenio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pLogadouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pDadosResponsavel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addGap(3, 3, 3)
                .addComponent(pDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pDadosResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pLogadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerPacienteCrianca.PNG")); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaPacienteCrianca.getContentPane());
        telaPacienteCrianca.getContentPane().setLayout(layout);
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

        ControlePacienteCrianca pacienteCrianca= new ControlePacienteCrianca(telaPacienteCrianca);
        btnSalvar.addActionListener(pacienteCrianca);
        btnConsultar.addActionListener(pacienteCrianca);
        btnAlterar.addActionListener(pacienteCrianca);
        btnVoltar.addActionListener(pacienteCrianca);  
        btnLimpar.addActionListener(pacienteCrianca);  
        tMatricula.addMouseListener(pacienteCrianca); 
        
        telaPacienteCrianca.pack();
        telaPacienteCrianca.setVisible(true);
        //telaPacienteCrianca.setLocation(220,0);
    
        //centraliza a tela
        telaPacienteCrianca.setLocationRelativeTo(null);
        
    }// </editor-fold>                  
    
    public JFrame getTelaPacienteCrianca()
    {
 	 return telaPacienteCrianca;
    }

                

}
