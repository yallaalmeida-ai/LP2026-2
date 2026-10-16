import java.util.Scanner;
public class Eu {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String seuNome = leitor.nextLine();
        System.out.print("Digite a cidade que você nasceu: ");
        String cidade = leitor.nextLine();
        System.out.println("Oi " + seuNome + "! Que legal saber que você é da cidade de " + cidade + ".");
        leitor.close();
    }
}
