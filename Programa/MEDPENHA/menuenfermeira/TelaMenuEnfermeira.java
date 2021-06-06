package menuenfermeira;

import java.awt.*;

import javax.swing.*;

public class TelaMenuEnfermeira  {

    private JFrame telamenuenf;
    private JMenuItem ItemAnamnese,ItemEfetuarLogoff,ItemAjuda;
    private JMenu MenuCadastro,MenuHelp,MenuSair;
    private JMenuBar menuBar;
    private JLabel lBanner;
    private JPanel pBanner;
	
    public TelaMenuEnfermeira() {
    
    	telamenuenf=new JFrame();
        menuBar = new JMenuBar();
        
        MenuCadastro = new JMenu();
        MenuHelp = new JMenu();
        MenuSair = new JMenu();
        
        ItemAnamnese = new JMenuItem();
        ItemEfetuarLogoff = new JMenuItem();
        ItemAjuda = new JMenuItem();
        
        pBanner = new JPanel();
        lBanner = new JLabel();
        
        telamenuenf.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        telamenuenf.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telamenuenf.setTitle("Portal da Enfermagem");
        telamenuenf.getContentPane().setBackground(new java.awt.Color(37, 135, 76));
        
        //pBanner.setBackground(new java.awt.Color(5, 114, 60));
        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\portal_enfermagem.png")); // NOI18N

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

        MenuCadastro.setBackground(new java.awt.Color(37, 135, 76));
        MenuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        MenuCadastro.setText("       Cadastro       ");
        MenuCadastro.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        ItemAnamnese.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ItemAnamnese.setBackground(new java.awt.Color(213, 244, 226));
        ItemAnamnese.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemAnamnese.setIcon(new javax.swing.ImageIcon("imagens\\anamnese.png")); // NOI18N
        ItemAnamnese.setText("  Anamnese  ");
        MenuCadastro.add(ItemAnamnese);

        menuBar.add(MenuCadastro);

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

        telamenuenf.setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telamenuenf.getContentPane());
        telamenuenf.getContentPane().setLayout(layout);
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
        
        ControleMenuEnfermeira menuEnf= new ControleMenuEnfermeira(telamenuenf);
        ItemAnamnese.addActionListener(menuEnf);
        ItemAjuda.addActionListener(menuEnf);
        ItemEfetuarLogoff.addActionListener(menuEnf);
		
      //Abri a tela em FullScreen
        telamenuenf.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());  
        telamenuenf.pack();
        telamenuenf.setResizable(false);
        telamenuenf.show();
        
        
        //telamenuenf.pack();
        //telamenuenf.setVisible(true);
        //telamenuenf.setExtendedState(JFrame.MAXIMIZED_BOTH)
        //telamenuenf.setSize(1275, 760);
        //telamenuenf.setLocation(2, 2);
       
    }// </editor-fold>
    public JFrame getTelaMenuEnfermeira()
    {
 	 return telamenuenf;
    }
   


}
