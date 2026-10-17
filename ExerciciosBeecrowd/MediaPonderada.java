import java.util.Scanner;
public class MediaPonderada {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1 = Double.parseDouble(leitor.nextLine());
        double nota2 = Double.parseDouble(leitor.nextLine());
        double nota3 = Double.parseDouble(leitor.nextLine());
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10.0;
        System.out.printf("MÉDIA = %.1f\n", media);
        leitor.close();
    }
}
