import java.util.Scanner;
public class CalculadoraSoma {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        int A = Integer.parseInt(leitor.nextLine());
        int B = Integer.parseInt(leitor.nextLine());
        int X = A + B;
        System.out.println("X= " + X);
        leitor.close();
    }
}
