import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class e1011 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int raio = s.nextInt();
        double pi = 3.14159;
        double volume = ((4/3.0)*pi*Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n",volume);
        s.close();
    }
}
