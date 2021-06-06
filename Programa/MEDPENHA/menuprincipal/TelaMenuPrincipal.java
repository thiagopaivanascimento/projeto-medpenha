package menuprincipal;

import java.awt.*;
import javax.swing.*;

public class TelaMenuPrincipal  {

	private JFrame telaMenuPrin;
    private JMenuItem ItemEfetuarLogin,ItemAjuda,ItemSair; 
    private JMenu MenuHelp,MenuLogin,MenuSair;
    private JLabel lBanner;
    private JMenuBar menuBar;
    private JPanel pBanner;
    
    public TelaMenuPrincipal() {
    	
    	telaMenuPrin=new JFrame();
    	
        pBanner = new JPanel();
    	
        lBanner = new JLabel();
        
        menuBar = new JMenuBar();
        
        MenuLogin = new JMenu();
        MenuHelp = new JMenu();
        MenuSair = new JMenu();
        
        ItemEfetuarLogin = new JMenuItem();
        ItemAjuda = new JMenuItem();
        ItemSair = new JMenuItem();
        
        
        telaMenuPrin.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        telaMenuPrin.setTitle("Menu Principal");
        telaMenuPrin.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telaMenuPrin.getContentPane().setBackground(new java.awt.Color(37, 135, 76));
        
        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\banner_principal.png")); // NOI18N

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
        menuBar.setFont(new java.awt.Font("Calibri", 0, 16));

        MenuLogin.setBackground(new java.awt.Color(37, 135, 76));
        MenuLogin.setForeground(new java.awt.Color(255, 255, 255));
        MenuLogin.setText("       Login       ");
        MenuLogin.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemEfetuarLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ItemEfetuarLogin.setBackground(new java.awt.Color(213, 244, 226));
        ItemEfetuarLogin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemEfetuarLogin.setIcon(new javax.swing.ImageIcon("imagens\\login.png")); // NOI18N
        ItemEfetuarLogin.setText("Efetuar Login");
        MenuLogin.add(ItemEfetuarLogin);
        
        menuBar.add(MenuLogin);

        MenuHelp.setBackground(new java.awt.Color(37, 135, 76));
        MenuHelp.setForeground(new java.awt.Color(255, 255, 255));
        MenuHelp.setText("       Ajuda       ");
        MenuHelp.setFont(new java.awt.Font("Calibri", 0, 16));
       
        ItemAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ItemAjuda.setBackground(new java.awt.Color(213, 244, 226));
        ItemAjuda.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemAjuda.setIcon(new javax.swing.ImageIcon("imagens\\ajuda.png")); // NOI18N
        ItemAjuda.setText("Abrir a Ajuda");
        MenuHelp.add(ItemAjuda);
        
        menuBar.add(MenuHelp);

        MenuSair.setBackground(new java.awt.Color(37, 135, 76));
        MenuSair.setForeground(new java.awt.Color(255, 255, 255));
        MenuSair.setText("       Sair       ");
        MenuSair.setFont(new java.awt.Font("Calibri", 0, 16));
        menuBar.add(MenuSair);

        ItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        ItemSair.setBackground(new java.awt.Color(213, 244, 226));
        ItemSair.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        //ItemSair.setIcon(new javax.swing.ImageIcon("imagens\\logoff.png")); // NOI18N
        ItemSair.setText("Sair do MEDPENHA");
        MenuSair.add(ItemSair);
        
        telaMenuPrin.setJMenuBar(menuBar);

              
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telaMenuPrin.getContentPane());
        telaMenuPrin.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(pBanner)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(pBanner)
        );
        
                

        ControleMenuPrincipal menu= new ControleMenuPrincipal(telaMenuPrin);
        ItemEfetuarLogin.addActionListener(menu);
        ItemAjuda.addActionListener(menu);
        ItemSair.addActionListener(menu);
		    
     
        
        //Abri a tela em FullScreen
        telaMenuPrin.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());  
        telaMenuPrin.pack();
        telaMenuPrin.setResizable(false);
        telaMenuPrin.show();
        
        //telaMenuPrin.setVisible(true);
        //telaMenuPrin.setSize(1275, 760);
        //telaMenuPrin.setLocation(2, 2);
        
        
        
        
    }// </editor-fold>

 
    
   
	public JFrame getTelaMenuPrincipal()
    {
 	 return telaMenuPrin;
    }

	
    
   
}

