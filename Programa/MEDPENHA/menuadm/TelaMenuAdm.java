package menuadm;

import java.awt.*;

import javax.swing.*;


public class TelaMenuAdm  {

	private JFrame telamenuadm;

    private JMenuItem ItemConvenio,ItemEmpresaConveniada,ItemMedico,ItemPagamentoParticular,ItemEfetuarLogoff,
    ItemRelConsultaCancelada,ItemRelConsultaRemarcada,ItemRelPagamentoConvenio,ItemUsuario,ItemLista,
    ItemRealBackup,ItemRestBackup,ItemAjuda,ItemPreco;

    private  JMenu MenuBackup,MenuCadastro,MenuHelp,MenuRelatorio,MenuSair,MenuPreco,Menulista;
    private JMenuBar menuBar;
    private JLabel lBanner;
    private JPanel pBanner;
	
    public TelaMenuAdm() {
   
    	telamenuadm=new JFrame();
        menuBar = new JMenuBar();
       
        ItemUsuario = new JMenuItem();
        ItemMedico = new JMenuItem();
        ItemConvenio = new JMenuItem();
        ItemRelPagamentoConvenio = new JMenuItem();
        ItemPagamentoParticular = new JMenuItem();
        ItemEmpresaConveniada = new JMenuItem();
        ItemRelConsultaCancelada = new JMenuItem();
        ItemRelConsultaRemarcada = new JMenuItem();
        ItemRealBackup= new JMenuItem();
        ItemRestBackup= new JMenuItem();
        ItemEfetuarLogoff = new JMenuItem();
        ItemAjuda = new JMenuItem();
        ItemPreco = new JMenuItem();
        ItemLista = new JMenuItem();
        
        MenuCadastro = new JMenu();
        MenuHelp = new JMenu();
        MenuSair = new JMenu();
        MenuRelatorio = new JMenu();
        MenuBackup = new JMenu();
        MenuPreco= new JMenu();
        Menulista = new JMenu();
        
        pBanner = new JPanel();
        lBanner = new JLabel();
        
        telamenuadm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telamenuadm.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\medpenha.png"));
        telamenuadm.setTitle("Portal da Administração");
        telamenuadm.getContentPane().setBackground(new java.awt.Color(37, 135, 76));

        
        //pBanner.setBackground(new java.awt.Color(213, 244, 226));
        lBanner.setIcon(new javax.swing.ImageIcon("imagens\\portal_administrador.png")); // NOI18N

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
        menuBar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        MenuCadastro.setBackground(new java.awt.Color(37, 135, 76));
        MenuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        MenuCadastro.setText("       Cadastros       ");
        MenuCadastro.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        ItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        ItemUsuario.setBackground(new java.awt.Color(213, 244, 226));
        ItemUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemUsuario.setIcon(new javax.swing.ImageIcon("imagens\\usuario.png")); // NOI18N
        ItemUsuario.setText("   Usuário   ");
        MenuCadastro.add(ItemUsuario);

        menuBar.add(MenuCadastro);

        ItemMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        ItemMedico.setBackground(new java.awt.Color(213, 244, 226));
        ItemMedico.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemMedico.setIcon(new javax.swing.ImageIcon("imagens\\medico.png")); // NOI18N
        ItemMedico.setText("   Médico   ");
        MenuCadastro.add(ItemMedico);

        ItemConvenio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ItemConvenio.setBackground(new java.awt.Color(213, 244, 226));
        ItemConvenio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemConvenio.setIcon(new javax.swing.ImageIcon("imagens\\convenio.png")); // NOI18N
        ItemConvenio.setText("   Convênio   ");
        MenuCadastro.add(ItemConvenio);

        Menulista.setBackground(new java.awt.Color(37, 135, 76));
        Menulista.setForeground(new java.awt.Color(255, 255, 255));
        Menulista.setText("       Lista de Pacientes       ");
        Menulista.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemLista.setBackground(new java.awt.Color(213, 244, 226));
        ItemLista.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemLista.setIcon(new javax.swing.ImageIcon("imagens\\pagamento.png")); // NOI18N
        ItemLista.setText("Lista de Pacientes por Convênio");
        Menulista.add(ItemLista);
        menuBar.add(Menulista);
        
        MenuPreco.setBackground(new java.awt.Color(37, 135, 76));
        MenuPreco.setForeground(new java.awt.Color(255, 255, 255));
        MenuPreco.setText("       Preço       ");
        MenuPreco.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemPreco.setBackground(new java.awt.Color(213, 244, 226));
        ItemPreco.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemPreco.setIcon(new javax.swing.ImageIcon("imagens\\preco.png")); // NOI18N
        ItemPreco.setText("Preço da Consulta");
        MenuPreco.add(ItemPreco);
        menuBar.add(MenuPreco);
                
        MenuRelatorio.setBackground(new java.awt.Color(37, 135, 76));
        MenuRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        MenuRelatorio.setText("       Relatórios       ");
        MenuRelatorio.setFont(new java.awt.Font("Calibri", 0, 16));

        ItemRelPagamentoConvenio.setBackground(new java.awt.Color(213, 244, 226));
        ItemRelPagamentoConvenio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemRelPagamentoConvenio.setIcon(new javax.swing.ImageIcon("imagens\\relatorio.png")); // NOI18N
        ItemRelPagamentoConvenio.setText("Estatístico por pagamento convênio");
        MenuRelatorio.add(ItemRelPagamentoConvenio);

        ItemPagamentoParticular.setBackground(new java.awt.Color(213, 244, 226));
        ItemPagamentoParticular.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemPagamentoParticular.setIcon(new javax.swing.ImageIcon("imagens\\relatorio.png")); // NOI18N
        ItemPagamentoParticular.setText("Estatístico por pagamento particular");
        MenuRelatorio.add(ItemPagamentoParticular);

        ItemEmpresaConveniada.setBackground(new java.awt.Color(213, 244, 226));
        ItemEmpresaConveniada.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemEmpresaConveniada.setIcon(new javax.swing.ImageIcon("imagens\\relatorio.png")); // NOI18N
        ItemEmpresaConveniada.setText("Arrecadação por empresa conveniada");
        MenuRelatorio.add(ItemEmpresaConveniada);

        ItemRelConsultaCancelada.setBackground(new java.awt.Color(213, 244, 226));
        ItemRelConsultaCancelada.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemRelConsultaCancelada.setIcon(new javax.swing.ImageIcon("imagens\\relatorio.png")); // NOI18N
        ItemRelConsultaCancelada.setText("Estatístico por consulta cancelada");
        MenuRelatorio.add(ItemRelConsultaCancelada);

        //ItemRelConsultaRemarcada.setBackground(new java.awt.Color(213, 244, 226));
     //   ItemRelConsultaRemarcada.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
     //   ItemRelConsultaRemarcada.setIcon(new javax.swing.ImageIcon("imagens\\relatorio.png")); // NOI18N
      //  ItemRelConsultaRemarcada.setText("Estatístico por consulta remarcada");
      //  MenuRelatorio.add(ItemRelConsultaRemarcada);

        menuBar.add(MenuRelatorio);
        
        MenuBackup.setBackground(new java.awt.Color(37, 135, 76));
        MenuBackup.setForeground(new java.awt.Color(255, 255, 255));
        MenuBackup.setText("       Backup       ");
        MenuBackup.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

       // menuBar.add(MenuBackup);
        
        ItemRealBackup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        ItemRealBackup.setBackground(new java.awt.Color(213, 244, 226));
        ItemRealBackup.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemRealBackup.setIcon(new javax.swing.ImageIcon("imagens\\e_backup.png")); // NOI18N
        ItemRealBackup.setText("   Realizar Backup   ");
        MenuBackup.add(ItemRealBackup);
        
        ItemRestBackup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        ItemRestBackup.setBackground(new java.awt.Color(213, 244, 226));
        ItemRestBackup.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemRestBackup.setIcon(new javax.swing.ImageIcon("imagens\\r_backup.png")); // NOI18N
        ItemRestBackup.setText("   Restaurar Backup   ");
        MenuBackup.add(ItemRestBackup);
                
        MenuHelp.setBackground(new java.awt.Color(37, 135, 76));
        MenuHelp.setForeground(new java.awt.Color(255, 255, 255));
        MenuHelp.setText("     Ajuda     ");
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
        MenuSair.setText("     Sair     ");
        MenuSair.setFont(new java.awt.Font("Calibri", 0, 16));
        menuBar.add(MenuSair);
        
        ItemEfetuarLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        ItemEfetuarLogoff.setBackground(new java.awt.Color(213, 244, 226));
        ItemEfetuarLogoff.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ItemEfetuarLogoff.setIcon(new javax.swing.ImageIcon("imagens\\logoff.png")); // NOI18N
        ItemEfetuarLogoff.setText("Efetuar Logoff");
        MenuSair.add(ItemEfetuarLogoff);

        telamenuadm.setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(telamenuadm.getContentPane());
        telamenuadm.getContentPane().setLayout(layout);
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

        ControleMenuAdm menuAdm= new ControleMenuAdm(telamenuadm);
        ItemUsuario.addActionListener(menuAdm);
        ItemMedico.addActionListener(menuAdm);
        ItemConvenio.addActionListener(menuAdm);
        ItemRelPagamentoConvenio.addActionListener(menuAdm);
        ItemPagamentoParticular.addActionListener(menuAdm);
        ItemEmpresaConveniada.addActionListener(menuAdm);
        ItemRelConsultaRemarcada.addActionListener(menuAdm);
        ItemRelConsultaCancelada.addActionListener(menuAdm);
        ItemRealBackup.addActionListener(menuAdm);
        ItemRestBackup.addActionListener(menuAdm);
        MenuHelp.addActionListener(menuAdm);
        ItemEfetuarLogoff.addActionListener(menuAdm);
        ItemAjuda.addActionListener(menuAdm);
        ItemPreco.addActionListener(menuAdm);
        ItemLista.addActionListener(menuAdm);
		
        //Abri a tela em FullScreen
        telamenuadm.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());  
        telamenuadm.pack();
        telamenuadm.setResizable(false);
        telamenuadm.show();
        
        //telamenuadm.pack();
        //telamenuadm.setVisible(true);
        //telamenuadm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //telamenuadm.setSize(1275, 760);
        //telamenuadm.setLocation(2, 2);
        
    }// </editor-fold>

    public JFrame getTelaMenuAdm()
    {
 	 return telamenuadm;
    }

    

}
