import java.io.IOException;
import java.util.Scanner;

public class e1008 {
    public static void main(String[] args)  throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int valorHora = scan.nextInt();
        double n3 = scan.nextDouble();
        double salary = valorHora*n3;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f",salary);
        scan.close();
    }
}
