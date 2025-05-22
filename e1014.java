
import java.util.Scanner;

public class e1014 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        float b = s.nextFloat();
        float res = a / b;
        System.out.printf("%.3f km/l", res);
    }
}
