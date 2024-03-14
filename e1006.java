import java.io.IOException;
import java.util.Scanner;

public class e1006 {
    public static void main(String[] args) throws IOException {
Scanner s = new Scanner(System.in);
double n1 = s.nextDouble();
double n2 = s.nextDouble();
double n3 = s.nextDouble();

double result = ((n1*0.2)+(n2*0.3)+(n3*0.5));
System.out.printf("MEDIA = %.1f\n",result);
s.close();
    }
}
