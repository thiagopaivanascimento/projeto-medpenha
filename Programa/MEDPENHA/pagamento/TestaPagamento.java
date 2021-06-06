
package pagamento;


public class TestaPagamento {

       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamento();
            }
        });
    }
}
