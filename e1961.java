import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class e1961 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int alcance = s.nextInt();
        int canos = s.nextInt();
        int pulos[] = new int[canos];
        for (int i = 0; i < canos; i++) {
            pulos[i]= s.nextInt();
            
        }
        boolean acabou = false;
        for (int i = 0; i < canos-1;i++) {
            if (Math.abs(pulos[i+1] -pulos[i])> alcance) {
                acabou = true;
                break;
                
            } else {
                acabou = false;
                
            }
            
        }

        if (acabou) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("YOU WIN");
        }
        s.close();
    }
}
