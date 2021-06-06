package convenio;
import java.awt.*;
import javax.swing.*;
import menuprincipal.*;

public class TelaConvenio {

 private JFrame telaConvenio;
 
 private JButton btnAlterar,btnConsultar,btnDeletar,btnSalvar,btnVoltar,btnLimpar;
 
 private JComboBox cbUf;
 private JLabel lAstBairro,lAstCep,lAstCidade,lAstCnpj,lAstEmail,lAstEndereco,lAstFax,lAstInstituicao,
 lAstNumero,lAstPercentual,lAstRazao,lAstTelefone,lAstUf;

 private JLabel lBairro,lBanner,lCep,lCidade,lCnpj,lComplemento,lEmail,lEndereco,lFax,lInstit,lMsg,
 lNumero,lTelefone,lUf,lpercent,lpercentual,lrazao;

 private JPanel pBanner,pBotao,pCampo,pDadosConvenio,pLogadouro;

 private JTextField tBairro,tCep,tCidade,tCnpj,tComplemento,tEmail,tEndereco,tFax,tInstit,
 tNumero,tTelefone,tpercentual,trazao;

 private String[] uf= {"Selecione o Estado","ACRE","ALAGOAS","AMAPÁ","AMAZÔNIA","BAHIA","CEARÁ","ESPÍRITO SANTO","GOIÁS","MARANHÃO","MATO GROSSO","MATO GROSSO DO SUL","MINAS GERAIS","PARÁ","PARAIBA","PARANÁ","PERNAMBUCO","PIAUÍ","RIO DE JANEIRO","RIO GRANDE DO NORTE","RIO GRANDE DO SUL","RONDÔNIA","RORAIMA","SANTA CATARINA","SÃO PAULO","SERGIPE","TOCANTINS"};
   
    public TelaConvenio() {

    	telaConvenio=new JFrame();
    	
        pCampo = new JPanel();
        pBotao = new JPanel();
        pDadosConvenio = new JPanel();
        pLogadouro = new JPanel();
        pBanner = new JPanel();
                       
        btnConsultar = new JButton();
        btnVoltar = new JButton();
        btnAlterar = new JButton();
        btnSalvar = new JButton();
        btnDeletar = new JButton();
        btnLimpar = new JButton();
        
        lCnpj = new JLabel();
        lrazao = new JLabel();
        lpercentual = new JLabel();
        lInstit = new JLabel();
        lpercent = new JLabel();
        lEmail = new JLabel();
        lTelefone = new JLabel();
        lFax = new JLabel();
        lEndereco = new JLabel();
        lNumero = new JLabel();
        lComplemento = new JLabel();
        lBairro = new JLabel();
        lCep = new JLabel();
        lMsg = new JLabel();
        lCidade = new JLabel();
        lUf = new JLabel();
        lBanner = new JLabel();
        
        tCnpj = new JTextField();
        trazao = new JTextField();
        tpercentual = new JTextField();
        tInstit = new JTextField();
        tEmail = new JTextField();
        tTelefone = new JTextField();
        tFax = new JTextField();
        tEndereco = new JTextField();
        tNumero = new JTextField();
        tBairro = new JTextField();
        tCep = new JTextField();
        tCidade = new JTextField();
        tComplemento = new JTextField();
        
        lAstCnpj = new JLabel();
        lAstRazao = new JLabel();
        lAstPercentual = new JLabel();
        lAstInstituicao = new JLabel();
        lAstEmail = new JLabel();
        lAstTelefone = new JLabel();
        lAstFax = new JLabel();
        lAstEndereco = new JLabel();
        lAstNumero = new JLabel();
        lAstBairro = new JLabel();
        lAstCidade = new JLabel();
        lAstCep = new JLabel();
        lAstUf = new JLabel();
             
        cbUf = new JComboBox(uf);       
        
        telaConvenio.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaConvenio.setTitle("Convênio");
        telaConvenio.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaConvenio.setResizable(false);

        //máscara cnpj
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##.###.###/####-##");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tCnpj=new JFormattedTextField(masktel);

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

        //máscara fax
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("(##) #### - ####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tFax=new JFormattedTextField(masktel);

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
        
        
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnConsultar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon("imagens\\consultar.png")); // NOI18N
        btnConsultar.setText("Consultar");

        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        btnAlterar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon("imagens\\alterar.png")); // NOI18N
        btnAlterar.setText("Alterar");

        btnSalvar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon("imagens\\salvar.png")); // NOI18N
        btnSalvar.setText("Salvar");

        btnDeletar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon("imagens\\deletar.png")); // NOI18N
        btnDeletar.setText("Deletar");
        
        btnLimpar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSalvar)
                .addGap(20, 20, 20)
                .addComponent(btnAlterar)
                .addGap(20, 20, 20)
                .addComponent(btnConsultar)
                .addGap(20, 20, 20)
                .addComponent(btnDeletar)
                .addGap(20, 20, 20)
                .addComponent(btnLimpar)
                .addGap(20, 20, 20)
                .addComponent(btnVoltar)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnDeletar)
                    .addComponent(btnAlterar)
                    .addComponent(btnVoltar)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        pDadosConvenio.setBackground(new java.awt.Color(213, 244, 226));
        pDadosConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Convênio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lCnpj.setFont(new java.awt.Font("Calibri", 0, 12));
        lCnpj.setText("CNPJ:");

        tCnpj.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCnpj.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCnpj.setForeground(new java.awt.Color(255, 51, 51));
        lAstCnpj.setText("*");

        lrazao.setFont(new java.awt.Font("Calibri", 0, 12));
        lrazao.setText("Razão Social:");

        trazao.setDocument(new MaximodeCampos(50));
        trazao.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstRazao.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstRazao.setForeground(new java.awt.Color(255, 51, 51));
        lAstRazao.setText("*");

        lpercentual.setFont(new java.awt.Font("Calibri", 0, 12));
        lpercentual.setText("Percentual:");

        tpercentual.setDocument(new MaximodeCampos(3));
        tpercentual.setFont(new java.awt.Font("Calibri", 0, 12));

        lpercent.setFont(new java.awt.Font("Calibri", 0, 12));
        lpercent.setText("%");

        lAstPercentual.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstPercentual.setForeground(new java.awt.Color(255, 51, 51));
        lAstPercentual.setText("*");

        lInstit.setFont(new java.awt.Font("Calibri", 0, 12));
        lInstit.setText("Instituição:");

        tInstit.setDocument(new MaximodeCampos(50));
        tInstit.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstInstituicao.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstInstituicao.setForeground(new java.awt.Color(255, 51, 51));
        lAstInstituicao.setText("*");

        lEmail.setFont(new java.awt.Font("Calibri", 0, 12));
        lEmail.setText("E-mail:");

        tEmail.setDocument(new MaximodeCampos(30));
        tEmail.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstEmail.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEmail.setForeground(new java.awt.Color(255, 51, 51));
        lAstEmail.setText("*");

        lTelefone.setFont(new java.awt.Font("Calibri", 0, 12));
        lTelefone.setText("Telefone:");

        tTelefone.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstTelefone.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstTelefone.setForeground(new java.awt.Color(255, 51, 51));
        lAstTelefone.setText("*");

        lFax.setFont(new java.awt.Font("Calibri", 0, 12));
        lFax.setText("Fax:");

        tFax.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstFax.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstFax.setForeground(new java.awt.Color(255, 51, 51));
        lAstFax.setText("*");

        javax.swing.GroupLayout pDadosConvenioLayout = new javax.swing.GroupLayout(pDadosConvenio);
        pDadosConvenio.setLayout(pDadosConvenioLayout);
        pDadosConvenioLayout.setHorizontalGroup(
            pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lrazao)
                    .addComponent(lInstit)
                    .addComponent(lEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDadosConvenioLayout.createSequentialGroup()
                        .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tInstit)
                            .addComponent(trazao, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAstRazao)
                            .addComponent(lAstInstituicao))
                        .addGap(56, 56, 56))
                    .addGroup(pDadosConvenioLayout.createSequentialGroup()
                        .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstTelefone)
                        .addGap(20, 20, 20)))
                .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosConvenioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lFax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFax, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstFax))
                    .addGroup(pDadosConvenioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDadosConvenioLayout.createSequentialGroup()
                                .addComponent(lpercentual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tpercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lpercent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstPercentual))
                            .addGroup(pDadosConvenioLayout.createSequentialGroup()
                                .addComponent(lCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstCnpj)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDadosConvenioLayout.setVerticalGroup(
            pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAstRazao)
                    .addComponent(lrazao)
                    .addComponent(trazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCnpj)
                    .addComponent(tCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCnpj))
                .addGap(18, 18, 18)
                .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAstInstituicao)
                    .addComponent(lInstit)
                    .addComponent(tInstit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lpercentual)
                    .addComponent(tpercentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lpercent)
                    .addComponent(lAstPercentual))
                .addGap(18, 18, 18)
                .addGroup(pDadosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmail)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstEmail)
                    .addComponent(lTelefone)
                    .addComponent(tTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstTelefone)
                    .addComponent(lFax)
                    .addComponent(tFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstFax))
                .addGap(20, 20, 20))
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
        cbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Estado", "ACRE", "ALAGOAS", "AMAPÁ", "AMAZÔNIA", "BAHIA", "CEARÁ", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAIBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS" }));

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
                                .addGap(7, 7, 7)
                                .addComponent(lComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(pLogadouroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstCep)
                                .addGap(79, 79, 79)
                                .addComponent(lUf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstUf)
                .addContainerGap(22, Short.MAX_VALUE))
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
                    .addComponent(lComplemento)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lMsg)
                    .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pLogadouro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pDadosConvenio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDadosConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pLogadouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerConvenio.png")); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaConvenio.getContentPane());
        telaConvenio.getContentPane().setLayout(layout);
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
                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        //Listener dos botões
        ControleConvenio convenio= new ControleConvenio(telaConvenio);
        btnSalvar.addActionListener(convenio);
        btnAlterar.addActionListener(convenio);
        btnConsultar.addActionListener(convenio);
        btnDeletar.addActionListener(convenio);
        btnLimpar.addActionListener(convenio);
        btnVoltar.addActionListener(convenio);

        telaConvenio.pack();
        telaConvenio.setVisible(true);
        //telaConvenio.setLocation(260,50);
    
        //centraliza a tela
        telaConvenio.setLocationRelativeTo(null);
    
    }// </editor-fold>

  
   public JFrame getTelaConvenio(){
		
			return telaConvenio;
   }

}

