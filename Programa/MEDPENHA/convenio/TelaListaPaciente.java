package convenio;
import java.awt.Toolkit;

import javax.swing.*;

public class TelaListaPaciente {
	
	private JFrame telalista;
    private JComboBox cbConvenio;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel lAstConvenio;
    private JLabel lBanner;
    private JLabel lConvênio;
    private JLabel lMsg;
    private JPanel pBanner;
    private JPanel pCampo,plista;
    private JButton btnlistar,btnemitir,btnvoltar;
    private String[] lista={ "Selecione o Convênio" };

	    public TelaListaPaciente() {
	      
	    	telalista= new JFrame();
	        pBanner = new JPanel();
	        lBanner = new JLabel();
	        pCampo = new JPanel();
	        plista = new JPanel();
	        lConvênio = new JLabel();
	        cbConvenio = new JComboBox(lista);
	        jScrollPane1 = new JScrollPane();
	        jTable1 = new JTable();
	        lAstConvenio = new JLabel();
	        lMsg = new JLabel();
	        btnlistar = new JButton();
	        btnemitir = new JButton();
	        btnvoltar = new JButton();

	        telalista.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        telalista.setTitle("Lista de Pacientes");
	        telalista.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
	        telalista.setResizable(false);
	        
	        pBanner.setBackground(new java.awt.Color(213, 244, 226));
	        pBanner.setAutoscrolls(true);

	        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerListagem.png")); // NOI18N

	        javax.swing.GroupLayout pBannerLayout = new javax.swing.GroupLayout(pBanner);
	        pBanner.setLayout(pBannerLayout);
	        pBannerLayout.setHorizontalGroup(
	            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 858, Short.MAX_VALUE)
	            .addComponent(lBanner)
	        );
	        pBannerLayout.setVerticalGroup(
	            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 100, Short.MAX_VALUE)
	            .addComponent(lBanner)
	        );

	        pCampo.setBackground(new java.awt.Color(213, 244, 226));
	        pCampo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

	        plista.setBackground(new java.awt.Color(213, 244, 226));
	        plista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listagem de Pacientes por Convênio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

	        lConvênio.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
	        lConvênio.setText("Convênio:");

	        cbConvenio.setFont(new java.awt.Font("Calibri", 0, 12));

	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                
	            },
	            new String [] {
	                "Paciente", "Data de Nacimento", "Matrícula", "Convênio"
	            }
	        ) {
	            Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, true, true, true
	            };

	            public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        });
	        jScrollPane1.setViewportView(jTable1);

	        lAstConvenio.setFont(new java.awt.Font("Calibri", 0, 14));
	        lAstConvenio.setForeground(new java.awt.Color(255, 51, 51));
	        lAstConvenio.setText("*");

	        btnlistar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
	        btnlistar.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
	        btnlistar.setText("Listar Pacientes");
	        
	        btnemitir.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
	        btnemitir.setIcon(new javax.swing.ImageIcon("imagens\\emitir.png")); // NOI18N
	        btnemitir.setText("Emitir");

	        btnvoltar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
	        btnvoltar.setIcon(new javax.swing.ImageIcon("imagens\\voltar.png")); // NOI18N
	        btnvoltar.setText("Voltar");

	        javax.swing.GroupLayout plistaLayout = new javax.swing.GroupLayout(plista);
	        plista.setLayout(plistaLayout);
	        plistaLayout.setHorizontalGroup(
	            plistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(plistaLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(plistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(plistaLayout.createSequentialGroup()
	                        .addComponent(lConvênio)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(lAstConvenio)
	                        .addGap(39, 39, 39)
	                        .addComponent(btnlistar)
	                        .addGap(39, 39, 39)
	                        .addComponent(btnemitir)
	                        .addGap(39, 39, 39)
	                        .addComponent(btnvoltar)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        plistaLayout.setVerticalGroup(
	            plistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(plistaLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(plistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lConvênio)
	                    .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lAstConvenio)
	                    .addComponent(btnemitir)
	                     .addComponent(btnvoltar)
	                    .addComponent(btnlistar))
	                .addGap(18, 18, 18)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
	        lMsg.setForeground(new java.awt.Color(255, 51, 51));
	        lMsg.setText("*  Campos de preenchimento  obrigatório");

	        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
	        pCampo.setLayout(pCampoLayout);
	        pCampoLayout.setHorizontalGroup(
	            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(pCampoLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(plista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lMsg))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        pCampoLayout.setVerticalGroup(
	            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(pCampoLayout.createSequentialGroup()
	                .addComponent(lMsg)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(plista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telalista.getContentPane());
	        telalista.getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addComponent(pBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	        );

	       
	        ControleListaPaciente lista= new ControleListaPaciente(telalista);
	        btnlistar.addActionListener(lista);
	        btnemitir.addActionListener(lista);
	        btnvoltar.addActionListener(lista);

	        telalista.pack();
	        telalista.setVisible(true);
	        //telalista.setLocation(190, 90);
	        
	        //centraliza a tela
	        telalista.setLocationRelativeTo(null);
	    
	    }// </editor-fold>

	    public JFrame getTelaListaPaciente(){
			
			return telalista;
   }



}
