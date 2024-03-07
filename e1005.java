import java.io.IOException;
import java.util.Scanner;

public class e1005 {
    public static void main(String[] args) throws IOException  {
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();

        double result = n1*3.5 + n2*7.5;
        result = result/11;
        System.out.printf("MEDIA = %.5f\n", result);
        s.close();
    }

}