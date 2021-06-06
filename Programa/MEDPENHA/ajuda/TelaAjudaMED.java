	package ajuda;

	import java.awt.Dimension;
	import java.awt.Toolkit;
	import java.net.URL;
	import javax.help.*;
	import javax.swing.*;

	public class TelaAjudaMED
	{
		static JFrame helpMED;
		public String helpHS="ajudaMED.hs";
		private HelpSet hs;
		private HelpBroker hb;
		
		public TelaAjudaMED()
		{
			helpMED=new JFrame();
			ClassLoader cl = this.getClass().getClassLoader();
			
			try 
			{
				URL hsURL = HelpSet.findHelpSet(cl, helpHS);
				hs = new HelpSet(null, hsURL);
			}
			
			catch (Exception e)
			{
				System.out.println("HelpSet " + e.getMessage());
				System.out.println("HelpSet " + helpHS + " não localizado");
				return;
			}
			
			hb = hs.createHelpBroker();
			hb.setDisplayed(true);
			Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
			hb.setSize(ds);
			helpMED.setLocation(250,300);
			
		}
	}