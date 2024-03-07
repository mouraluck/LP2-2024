import java.io.IOException;
import java.util.Scanner;

public class e1010 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int cod = s.nextInt();
        int quant = s.nextInt();
        double valor = s.nextDouble();
        double preco = quant*valor;
        int cod2 = s.nextInt();
        int quant2 = s.nextInt();
        double valor2 = s.nextDouble();
        double preco2 = quant2*valor2;

        double result = preco+preco2;


        System.out.printf("VALOR A PAGAR: R$ %.2f\n",result);
        result = cod+cod2;
        s.close();

    }
    
}
