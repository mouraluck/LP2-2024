
import java.util.Scanner;

public class e1021 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double valorDouble = s.nextDouble();
        int num = (int) valorDouble;
        double num2 = (valorDouble - num) * 100;
        int var = 0;
        double res = 0;
        System.out.println("NOTAS:");
        if (num != 0 && num % num != 1) {
            var = num / 100;
            System.out.println(var + " nota(s) de R$ 100.00");
            num = num - (100 * var);
        } else {
            System.out.println("0 nota(s) de R$ 100.00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 50;
            System.out.println(var + " nota(s) de R$ 50.00");
            num = num - (50 * var);
        } else {
            System.out.println("0 nota(s) de R$ 50.00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 20;
            System.out.println(var + " nota(s) de R$ 20.00");
            num = num - (20 * var);
        } else {
            System.out.println("0 nota(s) de R$ 20.00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 10;
            System.out.println(var + " nota(s) de R$ 10.00");
            num = num - (10 * var);
        } else {
            System.out.println("0 nota(s) de R$ 10.00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 5;
            System.out.println(var + " nota(s) de R$ 5.00");
            num = num - (5 * var);
        } else {
            System.out.println("0 nota(s) de R$ 5.00");
        }
        if (num != 0 && num % num != 1) {
            var = num / 2;
            System.out.println(var + " nota(s) de R$ 2.00");
            num = num - (2 * var);
        } else {
            System.out.println("0 nota(s) de R$ 2.00");
        }
        System.out.println("MOEDAS:");
        if (num != 0 && num % num != 1) {
            var = num / 1;
            System.out.println(var + " moeda(s) de R$ 1.00");
        } else {
            System.out.println("0 moeda(s) de R$ 1.00");
        }

        num2 = ((int) num2);

        if (num2 != 0 && num2 % num2 != 1) {
            var = (int) (num2 / 50);
            System.out.println(var + " moeda(s) de R$ 0.50");
            num2 = num2 - (50 * var);
        } else {
            System.out.println("0 moeda(s) de R$ 0.50");
        }
        if (num2 != 0 && num2 % num2 != 1) {
            var = (int) (num2 / 25);
            System.out.println(var + " moeda(s) de R$ 0.25");
            num2 = num2 - (25 * var);
        } else {
            System.out.println("0 moeda(s) de R$ 0.25");
        }
        if (num2 != 0 && num2 % num2 != 1) {
            var = (int) (num2 / 10);
            System.out.println(var + " moeda(s) de R$ 0.10");
            num2 = num2 - (10 * var);
        } else {
            System.out.println("0 moeda(s) de R$ 0.10");
        }
        if (num2 != 0 && num2 % num2 != 1) {
            var = (int) (num2 / 5);
            System.out.println(var + " moeda(s) de R$ 0.05");
            num2 = num2 - (5 * var);
        } else {
            System.out.println("0 moeda(s) de R$ 0.05");
        }
        if (num2 != 0 && num2 % num2 != 1) {
            var = (int) (num2 / 1);
            System.out.println(var + " moeda(s) de R$ 0.01");
        } else {
            System.out.println("0 moeda(s) de R$ 0.01");
        }

    }
}
