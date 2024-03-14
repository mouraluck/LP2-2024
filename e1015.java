import java.util.Scanner;

public class e1015 {
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

       
        double x1[] = new double[2];
        double y1[] = new double[2];
        x1[0] = s.nextDouble();
        y1[0] = s.nextDouble();
        x1[1] = s.nextDouble();
        y1[1] = s.nextDouble();
        double solutionX = (x1[1] - x1[0]);
        double solutionY = (y1[1] - y1[0]);
        double dab = Math.sqrt(Math.pow(solutionY, 2) + Math.pow(solutionX, 2));
        System.out.printf("%.4f\n",dab);
        s.close();
    }
}
