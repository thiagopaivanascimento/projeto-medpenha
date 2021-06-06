package consulta;

import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Vector;

import medico.Medico;
import menuprincipal.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


import paciente.Paciente;
import prontuario.ControleDiagnostico;
import prontuario.Diagnostico;

public class TelaAgenda {

	    private static JFrame telaAgenda;
	    private JButton btnBuscarpac,buscarpront;
	    private JScrollPane jScrollPane1;
	    private JTable jTable1;
	    private JLabel lAstCrm,lAstData,lAstEspecialidade,lAstNome,lCrm,lData,lEspecialidade,lMsg,lNome,lBanner;
	    private JPanel pBanner,pCampo,pagenda;
	    private JTextField tCrm,tData,tEspecialidade,tNomeMedico;   
        public static DefaultTableModel tc;
	
    public TelaAgenda() {
       
    	telaAgenda=new JFrame();
    	pCampo = new javax.swing.JPanel();
        pagenda = new javax.swing.JPanel();
        lData = new javax.swing.JLabel();
        lAstData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lNome = new javax.swing.JLabel();
        tNomeMedico = new javax.swing.JTextField();
        //tData = new javax.swing.JTextField();
        Calendario tData = new Calendario(true);
        lAstNome = new javax.swing.JLabel();
        lCrm = new javax.swing.JLabel();
        tCrm = new javax.swing.JTextField();
        lAstCrm = new javax.swing.JLabel();
        lEspecialidade = new javax.swing.JLabel();
        tEspecialidade = new javax.swing.JTextField();
        lAstEspecialidade = new javax.swing.JLabel();
        buscarpront = new javax.swing.JButton();
        btnBuscarpac = new javax.swing.JButton();
        lMsg = new javax.swing.JLabel();
        pBanner = new javax.swing.JPanel();
        lBanner=new JLabel();

        telaAgenda.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaAgenda.setTitle("Agenda");
        telaAgenda.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaAgenda.setResizable(false);
       
//      máscara crm
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

        pagenda.setBackground(new java.awt.Color(213, 244, 226));
        pagenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agenda Médica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(0, 115, 46))); // NOI18N

        lData.setFont(new java.awt.Font("Calibri", 0, 12));
        lData.setText("Data:");

        lAstData.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lAstData.setForeground(new java.awt.Color(255, 51, 51));
        lAstData.setText("*");

        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        Vector v= ControleAgenda.obtemTodosPacientesLiberados();
        Object [][]T= new Object [v.size()][4];
        Object [] col={"Data","Hora","Paciente","Matricula"};
                        
        for (int i=0; i< v.size();i++)
        {
        	
        	  Object obj = v.get(i);
              if(obj instanceof Consulta)
              {
            	T[i][0]=((Consulta)v.get(i)).getData();
            	T[i][1]=((Consulta)v.get(i)).getHora();          
              }             
              else  if(obj instanceof Paciente)
              {   
            	 int j=i-1;
          		 T[j][2]=((Paciente)v.get(i)).getNome();
          		 T[j][3]=((Paciente)v.get(i)).getMatricula();	
              }
        
        }
        tc = new DefaultTableModel(T,col);
                       
        jTable1= new JTable(tc);
        jScrollPane1.setViewportView(jTable1);

        lNome.setFont(new java.awt.Font("Calibri", 0, 12));
        lNome.setText("Nome:");

        tNomeMedico.setDocument(new MaximodeCampos(50));
        tNomeMedico.setFont(new java.awt.Font("Calibri", 0, 12));
        tNomeMedico.setMaximumSize(new java.awt.Dimension(2, 2));

        tData.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstNome.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstNome.setForeground(new java.awt.Color(255, 51, 51));
        lAstNome.setText("*");

        lCrm.setFont(new java.awt.Font("Calibri", 0, 12));
        lCrm.setText("CRM:");

        tCrm.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstCrm.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstCrm.setForeground(new java.awt.Color(255, 51, 51));
        lAstCrm.setText("*");

        lEspecialidade.setFont(new java.awt.Font("Calibri", 0, 12));
        lEspecialidade.setText("Especialidade:");

        tEspecialidade.setDocument(new MaximodeCampos(40));
        tEspecialidade.setFont(new java.awt.Font("Calibri", 0, 12));

        lAstEspecialidade.setFont(new java.awt.Font("Calibri", 0, 14));
        lAstEspecialidade.setForeground(new java.awt.Color(255, 51, 51));
        lAstEspecialidade.setText("*");

        buscarpront.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        buscarpront.setIcon(new javax.swing.ImageIcon("imagens\\busarProntuario.png")); // NOI18N
        buscarpront.setText("Buscar Prontuário");

        btnBuscarpac.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnBuscarpac.setIcon(new javax.swing.ImageIcon("imagens\\buscar.png")); // NOI18N
        btnBuscarpac.setText("Buscar Pacientes");

        javax.swing.GroupLayout pagendaLayout = new javax.swing.GroupLayout(pagenda);
        pagenda.setLayout(pagendaLayout);
        pagendaLayout.setHorizontalGroup(
            pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagendaLayout.createSequentialGroup()
                        .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lData)
                            .addComponent(lNome)
                            .addComponent(lEspecialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pagendaLayout.createSequentialGroup()
                                .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstEspecialidade)
                                .addGap(77, 77, 77)
                                .addComponent(buscarpront))
                            .addGroup(pagendaLayout.createSequentialGroup()
                                .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lAstData)
                                .addGap(87, 87, 87)
                                .addComponent(lCrm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstCrm)
                                .addGap(37, 37, 37)
                                .addComponent(btnBuscarpac))
                            .addGroup(pagendaLayout.createSequentialGroup()
                                .addComponent(tNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAstNome))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pagendaLayout.setVerticalGroup(
            pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lData)
                    .addComponent(lCrm)
                    .addComponent(tCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstCrm)
                    .addComponent(lAstData)
                    .addComponent(btnBuscarpac))
                .addGap(18, 18, 18)
                .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAstNome)
                    .addComponent(lNome))
                .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagendaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(buscarpront))
                    .addGroup(pagendaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEspecialidade)
                            .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAstEspecialidade))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lMsg.setFont(new java.awt.Font("Calibri", 0, 11));
        lMsg.setForeground(new java.awt.Color(255, 51, 51));
        lMsg.setText("*  Campos de preenchimento  obrigatório");

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCampoLayout.createSequentialGroup()
                .addContainerGap(597, Short.MAX_VALUE)
                .addComponent(lMsg)
                .addContainerGap())
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pagenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addComponent(lMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pBanner.setBackground(new java.awt.Color(213, 244, 226));
        pBanner.setAutoscrolls(true);

        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\bannerAgenda.png")); // NOI18N

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
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaAgenda.getContentPane());
        telaAgenda.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaAgenda.pack();
        telaAgenda.setVisible(true);
        //telaAgenda.setLocation(230,70);
        
        //centraliza tela
        telaAgenda.setLocationRelativeTo(null);
        
        ControleAgenda controleagenda = new ControleAgenda(telaAgenda);
        buscarpront.addActionListener(controleagenda);
        btnBuscarpac.addActionListener(controleagenda);
        
    }// </editor-fold>
public JFrame getTelaAgenda(){
		
		return telaAgenda;
}
    
}

