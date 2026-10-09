import javax.swing.JOptionPane;
public class IMC {
    public static void main(String [] args) {
        String pesoString = JOptionPane.showInputDialog("Qual é o seu peso?");
        double peso = Double.parseDouble(pesoString);
        String alturaString = JOptionPane.showInputDialog("Qual é a sua altura?");
        double altura = Double.parseDouble(alturaString);
        double imc = peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: "+imc);
    }
}