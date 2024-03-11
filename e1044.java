import java.util.Scanner;

public class e1044 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int x;
        int y;
        
        x = b%a;
        y = a%b;

        if (x==0|| y==0) {
             System.out.println("Sao Multiplos");
        } else {
             System.out.println("Nao sao Multiplos");
        }
               
            
                
            
        s.close();
    }
}
