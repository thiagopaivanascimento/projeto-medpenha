package menusecretaria;
import java.awt.*;

import javax.swing.*;

public class TelaMenuSecretaria  {

	private JFrame telamenusec;
    private JMenuItem ItemCarteirinha,ItemConsuta,ItemPacAdult,ItemPacCrianca,Itemlistagem,ItemEfetuarLogoff,ItemAjuda;
    private JMenu MenuCadastro,MenuCarteirinha,MenuConsulta,MenuHelp,Menulistagem,MenuSair;
    private JMenuBar menuBar;
    private JPanel pBanner;
    private JLabel lBanner;
       
    public TelaMenuSecretaria() {
    
    	telamenusec=new JFrame();
    	
        pBanner = new JPanel();
        
        lBanner = new JLabel();
        
        menuBar = new JMenuBar();
        
        MenuCadastro = new JMenu();
        MenuCarteirinha = new JMenu();
        MenuConsulta = new JMenu();
        Menulistagem = new JMenu();
        MenuHelp = new JMenu();
        MenuSair = new JMenu();
        
        ItemPacCrianca = new JMenuItem();
        ItemPacAdult = new JMenuItem();      
        ItemCarteirinha = new JMenuItem();      
        ItemConsuta = new JMenuItem();     
        Itemlistagem = new JMenuItem();
        ItemEfetuarLogoff = new JMenuItem();
        ItemAjuda = new JMenuItem();
        
        telamenusec.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telamenusec.setTitle("Portal de Atendimento");
        telamenusec.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telamenusec.getContentPane().setBackground(new java.awt.Color(37, 135, 76));

        //pBanner.setBackground(new java.awt.Color(213, 244, 226));
        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\portal_atendimento.png")); // NOI18N

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

        MenuCadastro.setBackground(new java.awt.Color(37, 135, 76));
        MenuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        MenuCadastro.setText("       Cadastros       ");
        MenuCadastro.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemPacCrianca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ItemPacCrianca.setBackground(new java.awt.Color(213, 244, 226));
        ItemPacCrianca.setFont(new java.awt.Font("Calibri", 0, 14));
        ItemPacCrianca.setIcon(new javax.swing.ImageIcon("imagens\\crianca.png")); // NOI18N
        ItemPacCrianca.setText("Crianças (0 à 17 anos)");
        MenuCadastro.add(ItemPacCrianca);

        ItemPacAdult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ItemPacAdult.setBackground(new java.awt.Color(213, 244, 226));
        ItemPacAdult.setFont(new java.awt.Font("Calibri", 0, 14));
        ItemPacAdult.setIcon(new javax.swing.ImageIcon("imagens\\adulto.png"));
        ItemPacAdult.setText("Adultos (acima de 17 anos)");
        MenuCadastro.add(ItemPacAdult);

        menuBar.add(MenuCadastro);

        MenuCarteirinha.setBackground(new java.awt.Color(37, 135, 76));
        MenuCarteirinha.setForeground(new java.awt.Color(255, 255, 255));
        MenuCarteirinha.setText("       Carteirinha       ");
        MenuCarteirinha.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemCarteirinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        ItemCarteirinha.setBackground(new java.awt.Color(213, 244, 226));
        ItemCarteirinha.setFont(new java.awt.Font("Calibri", 0, 14));
        ItemCarteirinha.setIcon(new javax.swing.ImageIcon("imagens\\carteirinha.png"));
        ItemCarteirinha.setText("Emitir Cartirinha");
        MenuCarteirinha.add(ItemCarteirinha);

        menuBar.add(MenuCarteirinha);

        MenuConsulta.setBackground(new java.awt.Color(37, 135, 76));
        MenuConsulta.setForeground(new java.awt.Color(255, 255, 255));
        MenuConsulta.setText("       Consulta       ");
        MenuConsulta.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemConsuta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ItemConsuta.setBackground(new java.awt.Color(213, 244, 226));
        ItemConsuta.setFont(new java.awt.Font("Calibri", 0, 14));
        ItemConsuta.setIcon(new javax.swing.ImageIcon("imagens\\consulta.png"));
        ItemConsuta.setText("Gerenciar Consultas");
        MenuConsulta.add(ItemConsuta);

        Itemlistagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Itemlistagem.setBackground(new java.awt.Color(213, 244, 226));
        Itemlistagem.setFont(new java.awt.Font("Calibri", 0, 14));
        Itemlistagem.setIcon(new javax.swing.ImageIcon("imagens\\pagamento.png"));
        Itemlistagem.setText("Listar Consultas");
        MenuConsulta.add(Itemlistagem);

        menuBar.add(MenuConsulta);

        MenuHelp.setBackground(new java.awt.Color(37, 135, 76));
        MenuHelp.setForeground(new java.awt.Color(255, 255, 255));
        MenuHelp.setText("       Ajuda       ");
        MenuHelp.setFont(new java.awt.Font("Calibri", 0, 16));
       
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
        MenuSair.setFont(new java.awt.Font("Calibri", 0, 16));
        menuBar.add(MenuSair);
        
        ItemEfetuarLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        ItemEfetuarLogoff.setBackground(new java.awt.Color(213, 244, 226));
        ItemEfetuarLogoff.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemEfetuarLogoff.setIcon(new javax.swing.ImageIcon("imagens\\logoff.png")); // NOI18N
        ItemEfetuarLogoff.setText("Efetuar Logoff");
        MenuSair.add(ItemEfetuarLogoff);

        telamenusec.setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telamenusec.getContentPane());
        telamenusec.getContentPane().setLayout(layout);
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

        ControleMenuSecretaria menusec= new ControleMenuSecretaria(telamenusec);

        ItemPacCrianca.addActionListener(menusec);
        ItemPacAdult.addActionListener(menusec);
        ItemCarteirinha.addActionListener(menusec);
        ItemConsuta.addActionListener(menusec);
        Itemlistagem.addActionListener(menusec);
        MenuHelp.addActionListener(menusec);
        ItemEfetuarLogoff.addActionListener(menusec);
        ItemAjuda.addActionListener(menusec);
        
      //Abri a tela em FullScreen
        telamenusec.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());  
        telamenusec.pack();
        telamenusec.setResizable(false);
        telamenusec.show();
        
   /*     
        telamenusec.pack();
        telamenusec.setVisible(true);
        //telamenusec.setExtendedState(JFrame.MAXIMIZED_BOTH);
        telamenusec.setSize(1275, 760);
        telamenusec.setLocation(2, 2);
   
    */
    }// </editor-fold>

    public JFrame getTelaMenuSecretaria()
    {
 	 return telamenusec;
    }

}
