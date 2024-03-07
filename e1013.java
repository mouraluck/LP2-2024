import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class e1013 {

    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int x = Math.max(n1,n2);
        int y = Math.max(n2,n3);
        int result = Math.max(x, y);

        System.out.println(result+" eh o maior");
        s.close();
    }
}