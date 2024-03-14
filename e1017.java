import java.util.Scanner;

public class e1017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hora = s.nextInt();
        int vel = s.nextInt();

        double result = (vel*hora);
        double a = result/12;
        System.out.printf("%.3f\n", a);
        s.close();

    }
}
