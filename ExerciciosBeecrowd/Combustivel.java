import java.util.Scanner;
public class Combustivel {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        int codigo;
        do {
            codigo = Integer.parseInt(leitor.nextLine());
            if (codigo == 1) {
                contAlcool++;
            } else if (codigo == 2) {
                contGasolina++;
            } else if (codigo == 3) {
                contDiesel ++;
            }
        } while (codigo != 4);
        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Álcool: %d\n", contAlcool);
        System.out.printf("Gasolina: %d\n", contGasolina);
        System.out.printf("Diesel: %d\n", contDiesel);
        leitor.close();
        }
    }