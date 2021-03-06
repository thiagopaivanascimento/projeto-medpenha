package webcam;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.media.Buffer;
import javax.media.CaptureDeviceInfo;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.cdm.CaptureDeviceManager;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dao.DaoFactory;
//import prontuario.DaoDiagnostico;
//import prontuario.DaoProntuario;
//import prontuario.Prontuario;


public class CapturaFoto extends JPanel {
	
	//private JFrame telaCarteirinha;
	public static Player player = null;
	public CaptureDeviceInfo di = null;  //  @jve:decl-index=0:
	public MediaLocator ml = null;  //  @jve:decl-index=0:
	//public JButton capture = null;
	public Buffer buf = null;
	public Image img = null;
	public VideoFormat vf = null;
	public BufferToImage btoi = null;
	public ImagePanel imgpanel = null;

	private static final long serialVersionUID = 1L;
	public static JButton captura = null;


	public CapturaFoto() {
		super();
		initialize();
	}


	private void initialize() {
		this.setLayout(new BorderLayout());
		this.setSize(185, 230);
		this.add(getCaptura(), BorderLayout.SOUTH);
		this.setVisible(true);
		

		String str2 = "vfw//0";
		di = CaptureDeviceManager.getDevice(str2);
		ml =  new MediaLocator("vfw://0");
		try {
			player = Manager.createRealizedPlayer(ml);
			player.start();
			Component comp;
			if ((comp = player.getVisualComponent()) != null) {
				add(comp, BorderLayout.CENTER);
			}
			add(captura, BorderLayout.BEFORE_FIRST_LINE);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

	//o bot?o era private
	public JButton getCaptura() {
		if (captura == null) {
			captura = new JButton("Captura");
			//captura.setBounds(20, 20, 20, 20);
			captura.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					FrameGrabbingControl fgc = (FrameGrabbingControl) player
							.getControl("javax.media.control.FrameGrabbingControl");
					buf = fgc.grabFrame();
					btoi = new BufferToImage((VideoFormat) buf.getFormat());
					img = btoi.createImage(buf);
					gravaImg(img);
															
				}
			});
		}
		return captura;
	
	}
	
		
	public void gravaImg (Image imagem)
	 {
	  //String caminho = "C:\\Users\\Michelly\\Projeto Final" +
		//		"\\webcam\\fotos\\"+"00"+".jpg";
		
		String caminho = "F:\\PROJETOS\\MEDPENHA\\Programa\\MEDPENHA\\webcam\\foto\\" +
		"00"+".jpg";
		
		try {
			ImageIO.write((RenderedImage) imagem, "jpg", new File(caminho));
			JOptionPane.showMessageDialog(this, "Imagem Capturada!");
			
			
					
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "n?o foi possivel encontrar " +
					"o dispositivo para a captura da imagem.");
			e.printStackTrace();
		}
	  
	}
	
	class ImagePanel extends Panel {

		private static final long serialVersionUID = 1L;
		public Image myimg = null;

		public ImagePanel() {
			JOptionPane.showMessageDialog(null, "setando a classe");
			setLayout(null);
			setSize(150, 200);
		}

		public void setImage(Image img) {
			this.myimg = img;
			repaint();
		}

		public void paint(Graphics g) {
			if (myimg != null) {
				g.drawImage(myimg, 0, 0, this);
			}
		}
	}
}