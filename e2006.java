
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class e2006 {

    public static void main(String[] args) throws IOException {

        int[] values = new int[5];
        Scanner scan = new Scanner(System.in);
        int correto = scan.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            values[i] = scan.nextInt();
        }
        for (int i = 0; i < values.length; i++) {

            if (values[i] == correto) {
                count++;
            }
        }
        System.out.println(count);
        scan.close();

    }

}
