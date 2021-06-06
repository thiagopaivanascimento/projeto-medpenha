package menumedico;

import java.awt.*;

import javax.swing.*;

public class TelaMenuMedico  {

	private JFrame telamenumedico;
	private JMenuItem ItemAgenda,ItemEfetuarLogoff,ItemAjuda;
    private JMenu MenuAgenda,MenuHelp,MenuSair;
    private JMenuBar menuBar;
    private JLabel lBanner;
    private JPanel pBanner;
  	
    public TelaMenuMedico() {
     
    	telamenumedico=new JFrame();
        menuBar = new JMenuBar();
        
        pBanner = new JPanel();
        lBanner = new JLabel();
                    
        ItemAgenda = new JMenuItem();
        ItemEfetuarLogoff = new JMenuItem();
        ItemAjuda = new JMenuItem();
        
        MenuAgenda = new JMenu();     
        MenuHelp = new JMenu();
        MenuSair = new JMenu();

        telamenumedico.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telamenumedico.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telamenumedico.setTitle("Portal do Médico");
        telamenumedico.getContentPane().setBackground(new java.awt.Color(37, 135, 76));
        
        //pBanner.setBackground(new java.awt.Color(213, 244, 226));
        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\portal_medico.PNG")); // NOI18N

        javax.swing.GroupLayout pBannerLayout = new javax.swing.GroupLayout(pBanner);
        pBanner.setLayout(pBannerLayout);
        pBannerLayout.setHorizontalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(lBanner)
        );
        pBannerLayout.setVerticalGroup(
            pBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(lBanner)
        );
        
        menuBar.setBackground(new java.awt.Color(37, 135, 76));
        menuBar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        MenuAgenda.setBackground(new java.awt.Color(37, 135, 76));
        MenuAgenda.setForeground(new java.awt.Color(255, 255, 255));
        MenuAgenda.setText("       Agenda       ");
        MenuAgenda.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        ItemAgenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ItemAgenda.setBackground(new java.awt.Color(213, 244, 226));
        ItemAgenda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemAgenda.setIcon(new javax.swing.ImageIcon("imagens\\agenda.png")); // NOI18N
        ItemAgenda.setText("Visualisar Agenda");
        MenuAgenda.add(ItemAgenda);

        menuBar.add(MenuAgenda);

        
        MenuHelp.setBackground(new java.awt.Color(37, 135, 76));
        MenuHelp.setForeground(new java.awt.Color(255, 255, 255));
        MenuHelp.setText("       Ajuda       ");
        MenuHelp.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
      
        ItemAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        ItemAjuda.setBackground(new java.awt.Color(213, 244, 226));
        ItemAjuda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemAjuda.setIcon(new javax.swing.ImageIcon("imagens\\ajuda.png")); // NOI18N
        ItemAjuda.setText("Abrir a Ajuda");
        MenuHelp.add(ItemAjuda);
        
        menuBar.add(MenuHelp);

        MenuSair.setBackground(new java.awt.Color(37, 135, 76));
        MenuSair.setForeground(new java.awt.Color(255, 255, 255));
        MenuSair.setText("       Sair       ");
        MenuSair.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        menuBar.add(MenuSair);

        ItemEfetuarLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        ItemEfetuarLogoff.setBackground(new java.awt.Color(213, 244, 226));
        ItemEfetuarLogoff.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemEfetuarLogoff.setIcon(new javax.swing.ImageIcon("imagens\\logoff.png")); // NOI18N
        ItemEfetuarLogoff.setText("Efetuar Logoff");
        MenuSair.add(ItemEfetuarLogoff);
        
        telamenumedico.setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telamenumedico.getContentPane());
        telamenumedico.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(lBanner)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(lBanner)
        );
        
        ControleMenuMedico menuMedio= new ControleMenuMedico(telamenumedico);
        ItemAgenda.addActionListener(menuMedio);
        ItemEfetuarLogoff.addActionListener(menuMedio);
        ItemAjuda.addActionListener(menuMedio);
		
      //Abri a tela em FullScreen
        telamenumedico.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());  
        telamenumedico.pack();
        telamenumedico.setResizable(false);
        telamenumedico.show();
              
/*
        telamenumedico.pack();
        telamenumedico.setVisible(true);
        telamenumedico.setSize(1275, 760);
        telamenumedico.setLocation(2, 2);
        
  */  
    }// </editor-fold>

    public JFrame getTelaMenuMedico()
    {
 	 return telamenumedico;
    }
    
  
    
}
