import java.io.IOException;
import java.util.Scanner;

public class e1036 {
    public static void main(String[] args) throws IOException{

    Scanner s = new Scanner(System.in);
    double a =s.nextDouble();
    double b =s.nextDouble();
    double c =s.nextDouble();
        double delta = Math.pow(b, 2)-(4*a*c);
        if (delta == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (b*-1)+delta; 
            double r2 = (b*-1)-delta;
            r1 = r1/(2*a); 
            r2 = r2/(2*a);
            System.out.printf("R1 = %.5f\n",r1); 
            System.out.printf("R2 = %.5f\n",r2); 
        }
    }
}
