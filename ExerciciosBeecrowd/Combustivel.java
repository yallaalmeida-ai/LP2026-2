import java.util.Scanner;
public class Combustivel {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo = leitor.nextInt();
        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            } else if (codigo ==2) {
                gasolina++;
            } else if (codigo ==3) {
                diesel++;
            }
            codigo = leitor.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        leitor.close();
    }
}
