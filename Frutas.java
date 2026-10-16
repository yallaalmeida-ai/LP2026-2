import javax.swing.JOptionPane;
public class Frutas {
    public static void main(String [] args) {
        String macaStr = JOptionPane.showInputDialog("Qual a quantidade de maça que você vai comprar?");
        String mamaoStr = JOptionPane.showInputDialog("Qual a quantidade de mamão que você vai comprar?");
        int maca = Integer.parseInt(macaStr);
        int mamao = Integer.parseInt(mamaoStr);
        double ValorTotal = (1.00*maca + 3.50*mamao);
        JOptionPane.showMessageDialog(null, "Voce irá pagar: "+ ValorTotal);
    }
}
