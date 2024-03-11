import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class e2202 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int vertices = s.nextInt();
        int x1[] = new int[vertices];
        int y1[] = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            x1[i] = s.nextInt();
            y1[i] = s.nextInt();
        }
        if (vertices == 3) {
            /*
             * x1[0] = 0 y1[0] = 0
             * /*x1[1] = 3 y1[1] = 0
             * /*x1[2] = 0 y1[2] = 4
             * 
             */
            double solutionX = (x1[1] - x1[0]);
            double solutionY = (y1[1] - y1[0]);
            double dab = Math.sqrt(Math.pow(solutionY, 2) + Math.pow(solutionX, 2));
            System.out.println(dab);

            double solutionX2 = (x1[2] - x1[1]);
            double solutionY2 = (y1[2] - y1[1]);
            double dbc = Math.sqrt(Math.pow(solutionY2, 2) + Math.pow(solutionX2, 2));
            System.out.println(dbc);

            double solutionX3 = (x1[0] - x1[2]);
            double solutionY3 = (y1[0] - y1[2]);
            double dca = Math.sqrt(Math.pow(solutionY3, 2) + Math.pow(solutionX3, 2));
            System.out.println(dca);

            double quasemaior = Math.max(dab, dbc);
            double maior = Math.max(quasemaior, dca);

            double quasemenor = Math.min(dab, dbc);
            double menor = Math.min(quasemenor, dca);
            double meio;
            if ((dab >= dbc && dab <= dca) || (dab <= dbc && dab >= dca)) {
                meio = dab;
            } else if ((dbc >= dab && dbc <= dca) || (dbc <= dab && dbc >= dca)) {
                meio = dbc;
            } else {
                meio = dca;
            }

            double alturarelativa = (menor * meio) / maior;

            // System.out.println("A hipotenusa vale "+ maior);
            System.out.printf("Case 1: %.2f\n", alturarelativa);
        }

        // conta aqui

        int vertices2 = s.nextInt();
        int x2[] = new int[vertices2];
        int y2[] = new int[vertices2];
        for (int i = 0; i < vertices2; i++) {
            x2[i] = s.nextInt();
            y2[i] = s.nextInt();

            // conta aqui
        }
        for (int i = 0; i < vertices2; i++) {
            System.out.println(x2[i] + "," + y2[i]);
        }

        s.close();
    }
}
