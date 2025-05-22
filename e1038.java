
import java.util.Scanner;

public class e1038 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double value = 0.0;
        int opc = scan.nextInt();
        int quant = scan.nextInt();
        if (opc == 1) {
            value = +4 * quant;
        } else if (opc == 2) {
            value = +4.5 * quant;
        } else if (opc == 3) {
            value = +5 * quant;
        } else if (opc == 4) {
            value = +2 * quant;
        } else if (opc == 5) {
            value = +1.5 * quant;
        } else {
            System.out.println("Opção inválida");
        }
        System.out.printf("Total: R$ %.2f%n", value);
    }
}
