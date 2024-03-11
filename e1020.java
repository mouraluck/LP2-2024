import java.io.IOException;
import java.util.Scanner;

public class e1020 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int dias = s.nextInt();

        int dias_sobra = dias % 365;
        System.out.println(dias/365+" ano(s)");
        int dias_final = dias_sobra % 30;
        System.out.println(dias_sobra/30+" mes(es)");
        System.out.println(dias_final+" dia(s)");


        s.close();
    }
}
