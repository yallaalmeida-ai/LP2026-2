import javax.swing.JOptionPane;
public class MédiaAritmética {
    public static void main(String [] args) {
        String nota1Str = JOptionPane.showInputDialog("Qual é a sua primeira nota?");
        String nota2Str = JOptionPane.showInputDialog("Qual a sua segunda nota?");
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double media = (nota1 + nota2)/2;
        JOptionPane.showMessageDialog(null,"Sua média é:"+media);
    }
}
