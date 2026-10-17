import java.util.Scanner;
public class Salario {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        String Nome = leitor.nextLine();
        double SalarioFixo = Double.parseDouble(leitor.nextLine());
        double TotalVendas = Double.parseDouble(leitor.nextLine());
        double SalarioFinal = SalarioFixo + (TotalVendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", SalarioFinal);
        leitor.close();
    }
}
