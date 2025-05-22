
import java.util.Scanner;

public class e1018 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int var = 0;
        double res = 0;
        System.out.println(num);
        if (num != 0 && num % num != 1) {
            var = num / 100;
            System.out.println(var + " nota(s) de R$ 100,00");
            num = num - (100 * var);
        } else {
            System.out.println("0 nota(s) de R$ 100,00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 50;
            System.out.println(var + " nota(s) de R$ 50,00");
            num = num - (50 * var);
        } else {
            System.out.println("0 nota(s) de R$ 50,00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 20;
            System.out.println(var + " nota(s) de R$ 20,00");
            num = num - (20 * var);
        } else {
            System.out.println("0 nota(s) de R$ 20,00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 10;
            System.out.println(var + " nota(s) de R$ 10,00");
            num = num - (10 * var);
        } else {
            System.out.println("0 nota(s) de R$ 10,00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 5;
            System.out.println(var + " nota(s) de R$ 5,00");
            num = num - (5 * var);
        } else {
            System.out.println("0 nota(s) de R$ 5,00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 2;
            System.out.println(var + " nota(s) de R$ 2,00");
            num = num - (2 * var);
        } else {
            System.out.println("0 nota(s) de R$ 2,00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 1;
            System.out.println(var + " nota(s) de R$ 1,00");
        } else {
            System.out.println("0 nota(s) de R$ 1,00");
        }

    }
}
