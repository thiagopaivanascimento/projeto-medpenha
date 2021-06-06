

package pagamento;
import java.awt.*;

import javax.swing.*;
import menuprincipal.*;
import javax.swing.*;


public class TelaPagamento{

    
	private JFrame telaPagamento; 
    private JButton btnCalcular,btnLimpar;
    private JButton btnEfetPagament;
    private JButton btnEmitir;
    private JButton btnVoltar;
    private JComboBox cbPagamento;
    private JComboBox cbTipoPagament;
    private JComboBox cbhora;
    private JScrollPane scrollObs;
    private JLabel lAstCartao;
    private JLabel lAstCnpj;
    private JLabel lAstData;
    private JLabel lAstData1;
    private JLabel lAstHora;
    private JLabel lAstPaga;
    private JLabel lAstPront;
    private JLabel lAstformPag;
    private JLabel lAsttotal;
    private JLabel lAstvlConsult;
    private JLabel lBanco;
    private JLabel lBanco1;
    private JLabel lBanco2;
    private JLabel lBanco3;
    private JLabel lBanco4;
    private JLabel lBanner;
    private JLabel lCnpj;
    private JLabel lConvenio;
    private JLabel lData;
    private JLabel lDataCons;
    private JLabel lMatricula;
    private JLabel lMsg;
    private JLabel lObs;
    private JLabel lTotal;
    private JLabel lhora;
    private JLabel lnumCatao;
    private JLabel lpagamento;
    private JLabel ltipo;
    private JLabel lvalorConsulta;
    private JPanel pBanner;
    private JPanel pBotao;
    private JPanel pCampo;
    private JPanel pCartao;
    private JPanel pCheque;
    private JPanel pConsulta;
    private JPanel pConvenio;
    private JPanel pDadosPagament;
    private JPanel pParticular;
    private JPanel ptotal;
    private JTextField tCartao;
    private JTextField tCnpj;
    private JTextField tData;
    private JTextField tDataCons;
    private JTextField tMatricula;
    private JTextField tValorConsulta;
    private JTextField tTotal;
    private JTextArea taObs;
    private JTextField tagencia;
    private JTextField tbanco;
    private JTextField tnumcheque;
    private JTextField tnumconta,tConvenio;
    private JTextField tnumserie;
   
    public TelaPagamento() {

    	telaPagamento=new JFrame();
    	
    	 lData = new JLabel();
         ltipo = new JLabel();
         lAstData = new JLabel();
         lAstPaga = new JLabel();
         lObs = new JLabel();
         lMsg = new JLabel();
         lDataCons = new JLabel();
         lAstData1 = new JLabel();
         lhora = new JLabel();
         lAstHora = new JLabel();
         lMatricula = new JLabel();
         lAstPront = new JLabel();
         lAstCnpj = new JLabel();
         lAsttotal = new JLabel();
         lConvenio = new JLabel();
         lCnpj = new JLabel();
         lpagamento = new JLabel();
         lnumCatao = new JLabel();
         lAstCartao = new JLabel();
         lBanco1 = new JLabel();
         lBanco2 = new JLabel();
         lBanco3 = new JLabel();
         lBanco4 = new JLabel();
         lBanco = new JLabel();
         lvalorConsulta = new JLabel();
         lAstvlConsult = new JLabel();
         lTotal = new JLabel();
         lAstformPag = new JLabel();
         lBanner = new JLabel();
         
         
         pCampo = new JPanel();
         pDadosPagament = new JPanel();
         pBotao = new JPanel();
         pParticular = new JPanel();
         pConvenio = new JPanel();
         pCartao = new JPanel();
         pCheque = new JPanel();
         ptotal = new JPanel();
         pBanner = new JPanel();
         pConsulta = new JPanel();
         
         
         tData = new JTextField();
         tDataCons = new JTextField();
         tMatricula = new JTextField();
         tConvenio = new JTextField();
         tCnpj = new JTextField();
         tnumcheque = new JTextField();
         tbanco = new JTextField();
         tagencia = new JTextField();
         tnumconta = new JTextField();
         tnumserie = new JTextField();
         tValorConsulta = new JTextField();
         tTotal = new JTextField();
         tCartao = new JTextField();
         
         
         cbTipoPagament = new JComboBox();
         cbhora = new JComboBox();
         cbPagamento = new JComboBox();
                  
         
         taObs = new JTextArea();
         
         scrollObs = new JScrollPane();
         
         
         btnVoltar = new JButton();
         btnEfetPagament = new JButton();
         btnEmitir = new JButton();
         btnCalcular = new JButton();
         btnLimpar=new JButton();
         
         
         
        telaPagamento.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaPagamento.setTitle("Pagamento");
        telaPagamento.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaPagamento.setResizable(false);

       
        pCampo.setBackground(new java.awt.Color(213, 244, 226));
        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        pDadosPagament.setBackground(new java.awt.Color(213, 244, 226));
        pDadosPagament.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados do Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lData.setFont(new java.awt.Font("Calibri", 0, 12));
        lData.setText("Data:");

        tData.setFont(new java.awt.Font("Calibri", 0, 12));

        ltipo.setFont(new java.awt.Font("Calibri", 0, 12));
        ltipo.setText("Tipo:");

        cbTipoPagament.setFont(new java.awt.Font("Calibri", 0, 12));
        cbTipoPagament.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo de pagamento", "Convênio", "Particular" }));

        lObs.setFont(new java.awt.Font("Calibri", 0, 12));
        lObs.setText("Observações:");

        taObs.setColumns(20);
        taObs.setDocument(new MaximodeCampos(500));
        taObs.setFont(new java.awt.Font("Calibri", 0, 12));
        taObs.setRows(5);
        scrollObs.setViewportView(taObs);

        lAstData.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstData.setForeground(new java.awt.Color(255, 51, 51));
        lAstData.setText("*");

        lAstPaga.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstPaga.setForeground(new java.awt.Color(255, 51, 51));
        lAstPaga.setText("*");

        javax.swing.GroupLayout pDadosPagamentLayout = new javax.swing.GroupLayout(pDadosPagament);
        pDadosPagament.setLayout(pDadosPagamentLayout);
        pDadosPagamentLayout.setHorizontalGroup(
            pDadosPagamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPagamentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPagamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDadosPagamentLayout.createSequentialGroup()
                        .addComponent(lData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstData)
                        .addGap(83, 83, 83)
                        .addComponent(ltipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTipoPagament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstPaga))
                    .addComponent(lObs)
                    .addComponent(scrollObs, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDadosPagamentLayout.setVerticalGroup(
            pDadosPagamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDadosPagamentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDadosPagamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lData)
                    .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstData)
                    .addComponent(ltipo)
                    .addComponent(cbTipoPagament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstPaga))
                .addGap(18, 18, 18)
                .addComponent(lObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pBotao.setBackground(new java.awt.Color(213, 244, 226));
        pBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        btnVoltar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
        btnVoltar.setText("Voltar");

        btnEfetPagament.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEfetPagament.setIcon(new javax.swing.ImageIcon("imagens\\efetuarpagamento.png")); // NOI18N
        btnEfetPagament.setText("Efetuar Pagamento");

        btnEmitir.setFont(new java.awt.Font("Calibri", 0, 12));
        btnEmitir.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
        btnEmitir.setText("Emitir Recibo");
        
        btnLimpar.setFont(new java.awt.Font("Calibri", 0, 12));
        btnLimpar.setIcon(new javax.swing.ImageIcon("imagens\\limpar.png")); // NOI18N
        btnLimpar.setText("Limpar");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnEfetPagament)
                .addGap(48, 48, 48)
                .addComponent(btnEmitir)
                .addGap(48, 48, 48)
                 .addComponent(btnLimpar)
                .addGap(48, 48, 48)
                .addComponent(btnVoltar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnEmitir)
                               .addComponent(btnLimpar)
                    .addComponent(btnEfetPagament))
                .addContainerGap())
        );

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pConsulta.setBackground(new java.awt.Color(213, 244, 226));
        pConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados da Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lDataCons.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataCons.setText("Data:");

        tDataCons.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstData1.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstData1.setForeground(new java.awt.Color(255, 51, 51));
        lAstData1.setText("*");

        lhora.setFont(new java.awt.Font("Calibri", 0, 12));
        lhora.setText("Hora:");

        cbhora.setFont(new java.awt.Font("Calibri", 0, 12));
        cbhora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o hora", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        lAstHora.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstHora.setForeground(new java.awt.Color(255, 51, 51));
        lAstHora.setText("*");

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matricula");

        tMatricula.setDocument(new MaximodeCampos(6));
        tMatricula.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstPront.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstPront.setForeground(new java.awt.Color(255, 51, 51));
        lAstPront.setText("*");

        javax.swing.GroupLayout pConsultaLayout = new javax.swing.GroupLayout(pConsulta);
        pConsulta.setLayout(pConsultaLayout);
        pConsultaLayout.setHorizontalGroup(
            pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMatricula)
                    .addComponent(lhora)
                    .addComponent(lDataCons))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pConsultaLayout.createSequentialGroup()
                        .addComponent(tDataCons, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstData1))
                    .addGroup(pConsultaLayout.createSequentialGroup()
                        .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstHora))
                    .addGroup(pConsultaLayout.createSequentialGroup()
                        .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstPront)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pConsultaLayout.setVerticalGroup(
            pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDataCons)
                    .addComponent(tDataCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstData1))
                .addGap(18, 18, 18)
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lhora)
                    .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstHora))
                .addGap(18, 18, 18)
                .addGroup(pConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMatricula)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstPront))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pConvenio.setBackground(new java.awt.Color(213, 244, 226));
        pConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pagamento Convênio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(0, 115, 46))); // NOI18N

        lConvenio.setFont(new java.awt.Font("Calibri", 0, 12));
        lConvenio.setText("Convênio:");

        tConvenio.setFont(new java.awt.Font("Calibri", 0, 12));

        lCnpj.setFont(new java.awt.Font("Calibri", 0, 12));
        lCnpj.setText("CNPJ:");

        tCnpj.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCnpj.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCnpj.setForeground(new java.awt.Color(255, 51, 51));
        lAstCnpj.setText("*");

        lAsttotal.setFont(new java.awt.Font("Calibri", 0, 14));
        lAsttotal.setForeground(new java.awt.Color(255, 51, 51));
        lAsttotal.setText("*");

        javax.swing.GroupLayout pConvenioLayout = new javax.swing.GroupLayout(pConvenio);
        pConvenio.setLayout(pConvenioLayout);
        pConvenioLayout.setHorizontalGroup(
            pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lConvenio)
                    .addComponent(lCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pConvenioLayout.createSequentialGroup()
                        .addComponent(tCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAsttotal))
                    .addGroup(pConvenioLayout.createSequentialGroup()
                        .addComponent(tConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstCnpj)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pConvenioLayout.setVerticalGroup(
            pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConvenio)
                    .addComponent(tConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCnpj))
                .addGap(18, 18, 18)
                .addGroup(pConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCnpj)
                    .addComponent(tCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAsttotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pParticular.setBackground(new java.awt.Color(213, 244, 226));
        pParticular.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pagamento Particular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(0, 115, 46))); // NOI18N

        lpagamento.setFont(new java.awt.Font("Calibri", 0, 12));
        lpagamento.setText("Pagamento:");

        cbPagamento.setFont(new java.awt.Font("Calibri", 0, 12));
        cbPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a forma de pagamento", "Dinheiro", "Cheque", "Cartão" }));

        pCartao.setBackground(new java.awt.Color(213, 244, 226));
        pCartao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cartão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(0, 115, 46))); // NOI18N

        lnumCatao.setFont(new java.awt.Font("Calibri", 0, 12));
        lnumCatao.setText("Número do Cartão:");

        tCartao.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCartao.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCartao.setForeground(new java.awt.Color(255, 51, 51));
        lAstCartao.setText("*");

        javax.swing.GroupLayout pCartaoLayout = new javax.swing.GroupLayout(pCartao);
        pCartao.setLayout(pCartaoLayout);
        pCartaoLayout.setHorizontalGroup(
            pCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnumCatao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstCartao)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        pCartaoLayout.setVerticalGroup(
            pCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCartaoLayout.createSequentialGroup()
                .addGroup(pCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnumCatao)
                    .addComponent(tCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCartao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pCheque.setBackground(new java.awt.Color(213, 244, 226));
        pCheque.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cheque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(0, 115, 46))); // NOI18N

        lBanco1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lBanco1.setText("Numero do Cheque:");

        lBanco2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lBanco2.setText("Numero de serie:");

        lBanco3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lBanco3.setText("Numero da Conta:");

        lBanco4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lBanco4.setText("Agencia:");

        tnumcheque.setFont(new java.awt.Font("Calibri", 0, 12));

        tbanco.setFont(new java.awt.Font("Calibri", 0, 12));

        tagencia.setFont(new java.awt.Font("Calibri", 0, 12));

        tnumconta.setFont(new java.awt.Font("Calibri", 0, 12));

        tnumserie.setFont(new java.awt.Font("Calibri", 0, 12));

        lBanco.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lBanco.setText("Banco:");

        javax.swing.GroupLayout pChequeLayout = new javax.swing.GroupLayout(pCheque);
        pCheque.setLayout(pChequeLayout);
        pChequeLayout.setHorizontalGroup(
            pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pChequeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pChequeLayout.createSequentialGroup()
                        .addComponent(lBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(tbanco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pChequeLayout.createSequentialGroup()
                        .addComponent(lBanco1)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addComponent(tnumcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pChequeLayout.createSequentialGroup()
                        .addComponent(lBanco4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(tagencia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pChequeLayout.createSequentialGroup()
                        .addComponent(lBanco3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(tnumconta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pChequeLayout.createSequentialGroup()
                        .addComponent(lBanco2)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(tnumserie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pChequeLayout.setVerticalGroup(
            pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pChequeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBanco4)
                    .addComponent(tagencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnumconta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBanco3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBanco2)
                    .addComponent(tnumserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pChequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBanco1)
                    .addComponent(tnumcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pParticularLayout = new javax.swing.GroupLayout(pParticular);
        pParticular.setLayout(pParticularLayout);
        pParticularLayout.setHorizontalGroup(
            pParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pParticularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pParticularLayout.createSequentialGroup()
                        .addComponent(lpagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pParticularLayout.setVerticalGroup(
            pParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pParticularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pParticularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lpagamento)
                    .addComponent(cbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ptotal.setBackground(new java.awt.Color(213, 244, 226));
        ptotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lvalorConsulta.setFont(new java.awt.Font("Calibri", 0, 12));
        lvalorConsulta.setText("Valor da Consulta:");

        tValorConsulta.setDocument(new MaximodeCampos(3));
        tValorConsulta.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstvlConsult.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstvlConsult.setForeground(new java.awt.Color(255, 51, 51));
        lAstvlConsult.setText("*");

        lTotal.setFont(new java.awt.Font("Calibri", 0, 12));
        lTotal.setText("Total:");

        tTotal.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstformPag.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstformPag.setForeground(new java.awt.Color(255, 51, 51));
        lAstformPag.setText("*");

        btnCalcular.setFont(new java.awt.Font("Calibri", 0, 12));
        btnCalcular.setIcon(new javax.swing.ImageIcon("imagens\\calcular.png")); // NOI18N
        btnCalcular.setText("Calcular");

      
        
        javax.swing.GroupLayout ptotalLayout = new javax.swing.GroupLayout(ptotal);
        ptotal.setLayout(ptotalLayout);
        ptotalLayout.setHorizontalGroup(
            ptotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ptotalLayout.createSequentialGroup()
                        .addComponent(lvalorConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstvlConsult))
                    .addGroup(ptotalLayout.createSequentialGroup()
                        .addComponent(lTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstformPag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ptotalLayout.setVerticalGroup(
            ptotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvalorConsulta)
                    .addComponent(tValorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstvlConsult))
                .addGap(18, 18, 18)
                .addGroup(ptotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTotal)
                    .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstformPag)
                    .addComponent(btnCalcular))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pParticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pCampoLayout.createSequentialGroup()
                            .addComponent(pDadosPagament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ptotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lMsg))
                    .addComponent(pBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,10, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDadosPagament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pParticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCampoLayout.createSequentialGroup()
                        .addComponent(pConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ptotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );


        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerPagamento.PNG")); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaPagamento.getContentPane());
        telaPagamento.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ControlePagamento pagamento= new ControlePagamento(telaPagamento);
        btnEfetPagament.addActionListener(pagamento);
        btnEmitir.addActionListener(pagamento);
        btnVoltar.addActionListener(pagamento);
        btnLimpar.addActionListener(pagamento);
        cbTipoPagament.addActionListener(pagamento);
        cbPagamento.addActionListener(pagamento);
        btnCalcular.addActionListener(pagamento);
        
        
        telaPagamento.pack();
        telaPagamento.setVisible(true);
        telaPagamento.setLocation(120, 0);
                    
        //centraliza a tela
        //telaPagamento.setLocationRelativeTo(null);
        
    }// </editor-fold>                        

    public JFrame getTelaPagamento()
    {
 	 return telaPagamento;
    }         

}
