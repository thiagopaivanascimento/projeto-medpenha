package consulta;


public class TestaConsulta {
	public static void main(String[] args) {
	    try{
	      javax.swing.UIManager um = new javax.swing.UIManager();
	      //um.setLookAndFeel(um.getSystemLookAndFeelClassName());
	    }
	    catch(Exception e){
	      e.printStackTrace();
	    }
	    finally {
	      new TelaConsulta();
	    }
	  }

}
