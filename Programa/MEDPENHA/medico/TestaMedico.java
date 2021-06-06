package medico;


public class TestaMedico {
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedico();
            }
        });
    }

}