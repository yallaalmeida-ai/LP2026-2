import javax.swing.JOptionPane;
public class Desconto {
    public static void main(String [] args) {
        String CompraStr = JOptionPane.showInputDialog("Qual o valor da sua compra?");
        String DescontoStr = JOptionPane.showInputDialog("Qual o valor do seu desconto?");
        double Compra = Double.parseDouble(CompraStr);
        double Desconto = Double.parseDouble(DescontoStr);
        double ValorDesconto = (Desconto/100)*Compra;
        double ValorTotal = Compra - ValorDesconto;
        JOptionPane.showMessageDialog(null, "O valor total de sua compra foi de: " + ValorTotal);
    }
}
