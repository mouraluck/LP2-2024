import java.io.IOException;
import java.util.Scanner;

public class e1009 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        double salario = s.nextDouble();
        double vendas =  s.nextDouble();

        salario = (salario+vendas*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",salario);
        s.close();
    }
}
