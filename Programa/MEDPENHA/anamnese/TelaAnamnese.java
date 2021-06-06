
package anamnese;
import java.awt.*;
import javax.swing.*;

import menuprincipal.*;


public class TelaAnamnese  extends JDialog{

	private JFrame telaAnamnese;
    private JButton btnAlterar,btnCalular,btnConsultar,btnSalvar,btnVoltar,btnBusarPAciente,btnLimpar;
    private JComboBox cbEtilista,cbSexo,cbTabagista;
    private JLabel lAlergia,lAltura,lAstAlergiaAnamnese,lAstAlturaAnamnese,lAstDataAnamnese,lAstDoencaAnamnese,
    lAstDoencaFamAnamnese,lAstEtilistaAnamnese,lAstFreqCarAnamnese,lAstMatricula,lAstMedicAnamnese,lAstNasc,
    lAstNome,lAstPesoAnamnese,lAstPratEsportAnamnese,lAstPressaoAnamnese,lAstProfAnamnese,lAstRacaAnamnese,
    lAstReligiaoAnamnese,lAstSexo,lAstTabagistaAnamnese,lAstTpSangAnamnese,lAstImcAnamnese;

    private JLabel lBanner,lCm,lDataAnamnese,lDoenca,lDoencaFamilia,lEtilista,lFreqCardiaca,lImc,lKg,lKgm2,lMatricula,
    lMedicamentos,lMsg,lNasc,lNome,lPeso,lPratiEsport,lPressao,lProfissao,lQtdEtilista,lQtdTabagista,lRaca,lReligiao,
    lSexo,lTabagista,lTipoSang,lmmHg;
     
    private JPanel pBanner,pBotao,pIdentPaciente,pVicios,psangue,pcampo,pdados,pdoenca,pimc;
    private JTextField tAlergia,tAltura,tDataAnamnese,tDoenca,tDoencaFamilia,tFreqCardiaca,tImc,tMatricula,tMedicamento,
    tNasc,tNome,tPeso,tPraticaEsporte,tPressao,tProfissao,tQtdEtilista,tQtdTabagista,tRaca,tReligiao,tTipoSang;
    
    public TelaAnamnese() {
    	
    	 telaAnamnese=new JFrame();
     	
         pcampo = new JPanel();
         pdados = new JPanel();
         pdoenca = new JPanel();
         pdoenca = new JPanel();
         pimc = new JPanel();
         pIdentPaciente = new JPanel();
         pBotao = new JPanel();
         pVicios = new JPanel();
         psangue = new JPanel();
         pBanner = new JPanel();
         
         lProfissao = new JLabel();
         lReligiao = new JLabel();
         lPratiEsport = new JLabel();
         lRaca = new JLabel();
         lNasc = new JLabel();
         lSexo = new JLabel();
         lDoenca = new JLabel();
         lMedicamentos = new JLabel();
         lAlergia = new JLabel();
         lDoencaFamilia = new JLabel();
         lPeso = new JLabel();
         lKg = new JLabel();
         lAltura = new JLabel();
         lCm = new JLabel();
         lImc = new JLabel();
         lKgm2 = new JLabel();
         lNome = new JLabel();
         lMatricula = new JLabel();
         lDataAnamnese = new JLabel();
         lMsg = new JLabel();
         lEtilista = new JLabel();
         lQtdEtilista = new JLabel();
         lTabagista = new JLabel();
         lQtdTabagista = new JLabel();
         lTipoSang = new JLabel();
         lPressao = new JLabel();
         lmmHg = new JLabel();
         lFreqCardiaca = new JLabel();
         
         tProfissao = new JTextField();
         tReligiao = new JTextField();
         tPraticaEsporte = new JTextField();
         tRaca = new JTextField();
         tDoenca = new JTextField();
         tNasc = new JTextField();
         tMedicamento = new JTextField();
         tDoencaFamilia = new JTextField();
         tAlergia = new JTextField();
         tPeso = new JTextField();
         tAltura = new JTextField();
         tImc = new JTextField();
         tNome = new JTextField();
         tMatricula = new JTextField();
         tDataAnamnese = new JTextField();
         tQtdEtilista = new JTextField();
         tQtdTabagista = new JTextField();
         tTipoSang = new JTextField();
         tPressao = new JTextField();
         tFreqCardiaca = new JTextField();
         
         lAstProfAnamnese = new JLabel();
         lAstReligiaoAnamnese = new JLabel();
         lAstPratEsportAnamnese = new JLabel();
         lAstRacaAnamnese = new JLabel();
         lAstSexo = new JLabel();
         lAstNasc = new JLabel();
         lAstDoencaAnamnese = new JLabel();
         lAstMedicAnamnese = new JLabel();
         lAstDoencaFamAnamnese = new JLabel();
         lAstAlergiaAnamnese = new JLabel();
         lAstPesoAnamnese = new JLabel();
         lAstAlturaAnamnese = new JLabel();
         lAstImcAnamnese = new JLabel();
         lAstNome = new JLabel();
         lAstMatricula = new JLabel();
         lAstDataAnamnese = new JLabel();
         lAstEtilistaAnamnese = new JLabel();
         lAstTabagistaAnamnese = new JLabel();
         lAstTpSangAnamnese = new JLabel();
         lAstPressaoAnamnese = new JLabel();
         lAstFreqCarAnamnese = new JLabel();
         
         cbSexo = new JComboBox();
         cbEtilista = new JComboBox();
         cbTabagista = new JComboBox();
             
         btnCalular = new JButton();
         btnConsultar = new JButton();
         btnVoltar = new JButton();
         btnAlterar = new JButton();
         btnSalvar = new JButton();
         btnLimpar=new JButton();
         btnBusarPAciente=new JButton();
         
         lBanner = new JLabel();

         
         telaAnamnese.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
         telaAnamnese.setTitle("Anamnese");
         telaAnamnese.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
         telaAnamnese.setResizable(false);

        pBanner.setBackground(new java.awt.Color(213, 244, 226));

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerAnamnese.png")); // NOI18N

      
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

        //máscara datanasc
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tNasc=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara data
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##/####");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            //tDataAnamnese=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara tiposanguineo
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("UUU");
            masktel.setValidCharacters("A,B,AB,O,+,-");
            masktel.setPlaceholderCharacter('_');
           // tTipoSang=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}

        //máscara peso
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("###.###");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            //tPeso=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        //máscara altura
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("#.##");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tAltura=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        //máscara pressão
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("##/##");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            tPressao=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        //máscara frequencia
        try
        { javax.swing.text.MaskFormatter masktel=new javax.swing.text.MaskFormatter("###");
            masktel.setValidCharacters("0,1,2,3,4,5,6,7,8,9");
            masktel.setPlaceholderCharacter('_');
            //tFreqCardiaca=new JFormattedTextField(masktel);

        }
        catch (Exception ex)
        {}
        pcampo.setBackground(new java.awt.Color(213, 244, 226));
        pcampo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pcampo.setFont(new java.awt.Font("Calibri", 0, 12));

        pdados.setBackground(new java.awt.Color(213, 244, 226));
        pdados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        lProfissao.setFont(new java.awt.Font("Calibri", 0, 12));
        lProfissao.setText("Profissão:");

        tProfissao.setDocument(new MaximodeCampos(30));
        tProfissao.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstProfAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstProfAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstProfAnamnese.setText("*");

        lReligiao.setFont(new java.awt.Font("Calibri", 0, 12));
        lReligiao.setText("Religião:");

        tReligiao.setDocument(new MaximodeCampos(30));
        tReligiao.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstReligiaoAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstReligiaoAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstReligiaoAnamnese.setText("*");

        lPratiEsport.setFont(new java.awt.Font("Calibri", 0, 12));
        lPratiEsport.setText("Pratica Esporte:");

        tPraticaEsporte.setDocument(new MaximodeCampos(120));
        tPraticaEsporte.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstPratEsportAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstPratEsportAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstPratEsportAnamnese.setText("*");

        lRaca.setFont(new java.awt.Font("Calibri", 0, 12));
        lRaca.setText("Raça:");

        tRaca.setDocument(new MaximodeCampos(20));
        tRaca.setFont(new java.awt.Font("Calibri", 0, 12));

        lNasc.setFont(new java.awt.Font("Calibri", 0, 12));
        lNasc.setText("Data de Nascimento:");

        lAstRacaAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstRacaAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstRacaAnamnese.setText("*");

        lSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        lSexo.setText("Sexo:");

        cbSexo.setFont(new java.awt.Font("Calibri", 0, 12));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Sexo", "Feminino", "Masculino" }));

        lAstSexo.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstSexo.setForeground(new java.awt.Color(255, 51, 51));
        lAstSexo.setText("*");

        tNasc.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNasc.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNasc.setForeground(new java.awt.Color(255, 51, 51));
        lAstNasc.setText("*");

        javax.swing.GroupLayout pdadosLayout = new javax.swing.GroupLayout(pdados);
        pdados.setLayout(pdadosLayout);
        pdadosLayout.setHorizontalGroup(
            pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdadosLayout.createSequentialGroup()
                .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lPratiEsport))
                    .addGroup(pdadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lProfissao))
                    .addGroup(pdadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lReligiao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pdadosLayout.createSequentialGroup()
                        .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tReligiao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tProfissao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pdadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstProfAnamnese))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pdadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstReligiaoAnamnese)))
                        .addGap(51, 51, 51)
                        .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pdadosLayout.createSequentialGroup()
                                .addComponent(lSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstSexo)
                                .addGap(44, 44, 44)
                                .addComponent(lRaca)
                                .addGap(10, 10, 10)
                                .addComponent(tRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstRacaAnamnese))
                            .addGroup(pdadosLayout.createSequentialGroup()
                                .addComponent(lNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstNasc))))
                    .addComponent(tPraticaEsporte, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstPratEsportAnamnese)
                .addGap(61, 61, 61))
        );
        pdadosLayout.setVerticalGroup(
            pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProfissao)
                    .addComponent(tProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstProfAnamnese)
                    .addComponent(lSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstSexo)
                    .addComponent(lRaca)
                    .addComponent(lAstRacaAnamnese)
                    .addComponent(tRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lAstReligiaoAnamnese)
                        .addComponent(tReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lNasc)
                        .addComponent(tNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lAstNasc))
                    .addComponent(lReligiao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPratiEsport)
                    .addComponent(lAstPratEsportAnamnese)
                    .addComponent(tPraticaEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pdoenca.setBackground(new java.awt.Color(213, 244, 226));
        pdoenca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lDoenca.setFont(new java.awt.Font("Calibri", 0, 12));
        lDoenca.setText("Doença(s):");

        tDoenca.setDocument(new MaximodeCampos(120));
        tDoenca.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDoencaAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstDoencaAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstDoencaAnamnese.setText("*");

        lMedicamentos.setFont(new java.awt.Font("Calibri", 0, 12));
        lMedicamentos.setText("Medicamento(s):");

        tMedicamento.setDocument(new MaximodeCampos(120));
        tMedicamento.setFont(new java.awt.Font("Calibri", 0, 12));

        lDoencaFamilia.setFont(new java.awt.Font("Calibri", 0, 12));
        lDoencaFamilia.setText("Doença(s) na Família:");

        tDoencaFamilia.setDocument(new MaximodeCampos(120));
        tDoencaFamilia.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstMedicAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstMedicAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstMedicAnamnese.setText("*");

        lAstDoencaFamAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstDoencaFamAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstDoencaFamAnamnese.setText("*");

        lAlergia.setFont(new java.awt.Font("Calibri", 0, 12));
        lAlergia.setText("Alergia(s):");

        tAlergia.setDocument(new MaximodeCampos(120));
        tAlergia.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstAlergiaAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstAlergiaAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstAlergiaAnamnese.setText("*");

        javax.swing.GroupLayout pdoencaLayout = new javax.swing.GroupLayout(pdoenca);
        pdoenca.setLayout(pdoencaLayout);
        pdoencaLayout.setHorizontalGroup(
            pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdoencaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDoencaFamilia)
                    .addComponent(lDoenca)
                    .addComponent(lMedicamentos)
                    .addComponent(lAlergia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tAlergia, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(tDoenca, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(tMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(tDoencaFamilia, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAstDoencaAnamnese)
                    .addComponent(lAstMedicAnamnese)
                    .addComponent(lAstDoencaFamAnamnese)
                    .addComponent(lAstAlergiaAnamnese))
                .addGap(84, 84, 84))
        );
        pdoencaLayout.setVerticalGroup(
            pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdoencaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDoenca)
                    .addComponent(tDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDoencaAnamnese))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lAstMedicAnamnese))
                    .addComponent(lMedicamentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDoencaFamilia)
                    .addComponent(tDoencaFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDoencaFamAnamnese))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pdoencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lAstAlergiaAnamnese))
                    .addComponent(lAlergia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pimc.setBackground(new java.awt.Color(213, 244, 226));
        pimc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        lPeso.setFont(new java.awt.Font("Calibri", 0, 12));
        lPeso.setText("Peso:");

        tPeso.setDocument(new MaximodeCampos(6));
        tPeso.setFont(new java.awt.Font("Calibri", 0, 12));

        lKg.setFont(new java.awt.Font("Calibri", 0, 10));
        lKg.setText("(Kg)");

        lAstPesoAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstPesoAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstPesoAnamnese.setText("*");

        lAltura.setFont(new java.awt.Font("Calibri", 0, 12));
        lAltura.setText("Altura:");

        tAltura.setDocument(new MaximodeCampos(4));
        tAltura.setFont(new java.awt.Font("Calibri", 0, 12));

        lCm.setFont(new java.awt.Font("Calibri", 0, 10));
        lCm.setText("(Cm)");

        lAstAlturaAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstAlturaAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstAlturaAnamnese.setText("*");

        lImc.setFont(new java.awt.Font("Calibri", 0, 12));
        lImc.setText("IMC:");

        tImc.setDocument(new MaximodeCampos(5));
        tImc.setFont(new java.awt.Font("Calibri", 0, 12));

        lKgm2.setFont(new java.awt.Font("Calibri", 0, 10));
        lKgm2.setText("(Kg/m2)");

        btnCalular.setFont(new java.awt.Font("Calibri", 0, 12));
        btnCalular.setIcon(new javax.swing.ImageIcon("imagens\\calcular.png")); // NOI18N
        btnCalular.setText("Calcular");

        lAstImcAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstImcAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstImcAnamnese.setText("*");

        javax.swing.GroupLayout pimcLayout = new javax.swing.GroupLayout(pimc);
        pimc.setLayout(pimcLayout);
        pimcLayout.setHorizontalGroup(
            pimcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pimcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pimcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pimcLayout.createSequentialGroup()
                        .addComponent(lPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lKg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstPesoAnamnese)
                        .addGap(64, 64, 64)
                        .addComponent(lAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCm))
                    .addGroup(pimcLayout.createSequentialGroup()
                        .addComponent(lImc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tImc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lKgm2)
                        .addGap(3, 3, 3)
                        .addComponent(lAstImcAnamnese)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lAstAlturaAnamnese)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pimcLayout.setVerticalGroup(
            pimcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pimcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pimcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPeso)
                    .addComponent(lAstPesoAnamnese)
                    .addComponent(lKg)
                    .addComponent(tPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstAlturaAnamnese)
                    .addComponent(lCm)
                    .addComponent(tAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAltura))
                .addGap(18, 18, 18)
                .addGroup(pimcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lImc)
                    .addComponent(tImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lKgm2)
                    .addComponent(lAstImcAnamnese)
                    .addComponent(btnCalular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pIdentPaciente.setBackground(new java.awt.Color(213, 244, 226));
        pIdentPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lNome.setFont(new java.awt.Font("Calibri", 0, 12));
        lNome.setText("Nome:");

        tNome.setDocument(new MaximodeCampos(50));
        tNome.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        lMatricula.setFont(new java.awt.Font("Calibri", 0, 12));
        lMatricula.setText("Matrícula:");

        tMatricula.setDocument(new MaximodeCampos(6));
        tMatricula.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstMatricula.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstMatricula.setForeground(new java.awt.Color(255, 51, 51));
        lAstMatricula.setText("*");

        lDataAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lDataAnamnese.setText("Data:");

        tDataAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstDataAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstDataAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstDataAnamnese.setText("*");

        javax.swing.GroupLayout pIdentPacienteLayout = new javax.swing.GroupLayout(pIdentPaciente);
        pIdentPaciente.setLayout(pIdentPacienteLayout);
        pIdentPacienteLayout.setHorizontalGroup(
            pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstNome)
                .addGap(57, 57, 57)
                .addComponent(lMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstMatricula)
                .addGap(52, 52, 52)
                .addComponent(lDataAnamnese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tDataAnamnese, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAstDataAnamnese)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pIdentPacienteLayout.setVerticalGroup(
            pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIdentPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIdentPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNome)
                    .addComponent(lMatricula)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstMatricula)
                    .addComponent(lDataAnamnese)
                    .addComponent(tDataAnamnese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstDataAnamnese))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        pVicios.setBackground(new java.awt.Color(213, 244, 226));
        pVicios.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lEtilista.setFont(new java.awt.Font("Calibri", 0, 12));
        lEtilista.setText("Etilista:");

        cbEtilista.setFont(new java.awt.Font("Calibri", 0, 12));
        cbEtilista.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Selecione uma opção", "Sim", "Não" }));

        lAstEtilistaAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstEtilistaAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstEtilistaAnamnese.setText("*");

        lQtdEtilista.setFont(new java.awt.Font("Calibri", 0, 12));
        lQtdEtilista.setText("Qtd:");

        tQtdEtilista.setDocument(new MaximodeCampos(5));
        tQtdEtilista.setFont(new java.awt.Font("Calibri", 0, 12));

        lTabagista.setFont(new java.awt.Font("Calibri", 0, 12));
        lTabagista.setText("Tabagista:");

        cbTabagista.setFont(new java.awt.Font("Calibri", 0, 12));
        cbTabagista.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Selecione uma opção", "Sim", "Não" }));
        
        lAstTabagistaAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstTabagistaAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstTabagistaAnamnese.setText("*");

        lQtdTabagista.setFont(new java.awt.Font("Calibri", 0, 12));
        lQtdTabagista.setText("Qtd:");

        tQtdTabagista.setDocument(new MaximodeCampos(5));
        tQtdTabagista.setFont(new java.awt.Font("Calibri", 0, 12));

        javax.swing.GroupLayout pViciosLayout = new javax.swing.GroupLayout(pVicios);
        pVicios.setLayout(pViciosLayout);
        pViciosLayout.setHorizontalGroup(
            pViciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pViciosLayout.createSequentialGroup()
            		.addContainerGap()
                    .addComponent(lEtilista)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbEtilista, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lAstEtilistaAnamnese)
                    .addGap(26, 26, 26)
                    .addComponent(lQtdEtilista)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tQtdEtilista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75)
                    .addComponent(lTabagista)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbTabagista, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lAstTabagistaAnamnese)
                    .addGap(44, 44, 44)
                    .addComponent(lQtdTabagista)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tQtdTabagista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24))
            );
        pViciosLayout.setVerticalGroup(
            pViciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pViciosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pViciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEtilista)
                    .addComponent(cbEtilista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstEtilistaAnamnese)
                    .addComponent(lQtdEtilista)
                    .addComponent(tQtdEtilista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tQtdTabagista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lQtdTabagista)
                    .addComponent(lAstTabagistaAnamnese)
                    .addComponent(cbTabagista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTabagista))
                .addContainerGap())
        );

        psangue.setBackground(new java.awt.Color(213, 244, 226));
        psangue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        
        lTipoSang.setFont(new java.awt.Font("Calibri", 0, 12));
        lTipoSang.setText("Tp. Sanguíneo:");

        tTipoSang.setDocument(new MaximodeCampos(3));
        tTipoSang.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstTpSangAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstTpSangAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstTpSangAnamnese.setText("*");

        lPressao.setFont(new java.awt.Font("Calibri", 0, 12));
        lPressao.setText("Pressão:");

        tPressao.setFont(new java.awt.Font("Calibri", 0, 12));

        lmmHg.setFont(new java.awt.Font("Calibri", 0, 10));
        lmmHg.setText("(mmHg)");

        lAstPressaoAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstPressaoAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstPressaoAnamnese.setText("*");

        lFreqCardiaca.setFont(new java.awt.Font("Calibri", 0, 12));
        lFreqCardiaca.setText("Freqüência Cardíaca:");

        tFreqCardiaca.setDocument(new MaximodeCampos(3));
        tFreqCardiaca.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstFreqCarAnamnese.setFont(new java.awt.Font("Calibri", 0, 12));
        lAstFreqCarAnamnese.setForeground(new java.awt.Color(255, 51, 51));
        lAstFreqCarAnamnese.setText("*");

        javax.swing.GroupLayout pVicios1Layout = new javax.swing.GroupLayout(psangue);
        psangue.setLayout(pVicios1Layout);
        pVicios1Layout.setHorizontalGroup(
            pVicios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVicios1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVicios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVicios1Layout.createSequentialGroup()
                        .addComponent(lTipoSang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTipoSang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstTpSangAnamnese)
                        .addGap(55, 55, 55)
                        .addComponent(lPressao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lmmHg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstPressaoAnamnese))
                    .addGroup(pVicios1Layout.createSequentialGroup()
                        .addComponent(lFreqCardiaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFreqCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAstFreqCarAnamnese)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pVicios1Layout.setVerticalGroup(
            pVicios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVicios1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pVicios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTipoSang)
                    .addComponent(tTipoSang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstTpSangAnamnese)
                    .addComponent(lPressao)
                    .addComponent(tPressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lmmHg)
                    .addComponent(lAstPressaoAnamnese))
                .addGap(18, 18, 18)
                .addGroup(pVicios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFreqCardiaca)
                    .addComponent(tFreqCardiaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstFreqCarAnamnese))
                .addContainerGap(22, Short.MAX_VALUE))
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

        btnBusarPAciente.setFont(new java.awt.Font("Calibri", 0, 12));
        btnBusarPAciente.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBusarPAciente.setText("Buscar Paciente");

        javax.swing.GroupLayout pBotaoLayout = new javax.swing.GroupLayout(pBotao);
        pBotao.setLayout(pBotaoLayout);
        pBotaoLayout.setHorizontalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnSalvar)
                .addGap(30, 30, 30)
                .addComponent(btnAlterar)
                .addGap(30, 30, 30)
                .addComponent(btnConsultar)
                .addGap(30, 30, 30)
                .addComponent(btnLimpar)
                .addGap(30, 30, 30)
                .addComponent(btnBusarPAciente)
                .addGap(30, 30, 30)
                .addComponent(btnVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pBotaoLayout.setVerticalGroup(
            pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpar)
                    .addComponent(btnBusarPAciente)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout pcampoLayout = new javax.swing.GroupLayout(pcampo);
        pcampo.setLayout(pcampoLayout);
        pcampoLayout.setHorizontalGroup(
            pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcampoLayout.createSequentialGroup()
                        .addComponent(pimc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(psangue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lMsg)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pVicios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pdoenca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pdados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                            .addComponent(pIdentPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pcampoLayout.setVerticalGroup(
            pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pIdentPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pdoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pVicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pcampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(psangue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pimc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaAnamnese.getContentPane());
        telaAnamnese.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pcampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ControleAnamnese anamnese= new ControleAnamnese(telaAnamnese);
        btnSalvar.addActionListener(anamnese);
        btnConsultar.addActionListener(anamnese);
        btnAlterar.addActionListener(anamnese);
        btnVoltar.addActionListener(anamnese);  
        btnLimpar.addActionListener(anamnese);  
        btnBusarPAciente.addActionListener(anamnese); 
        btnCalular.addActionListener(anamnese); 
        tDataAnamnese.addMouseListener(anamnese);

        telaAnamnese.pack();
        telaAnamnese.setVisible(true);
        //telaAnamnese.setLocation(100,0);
        
        //Centraliza a tela
        telaAnamnese.setLocationRelativeTo(null);
    }// </editor-fold>
    public JFrame getTelaAnamnese(){
		
		return telaAnamnese;
}

    
}

