package webcam;

public class TestaCarteirinha {

	public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarteirinha();
            }
        });
    }
}
