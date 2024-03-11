import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class e1019 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int sec = s.nextInt();
        int h = sec%3600;
        System.out.print(sec/3600+":");
        System.out.print(h/60+":");
        int sec_sobra = h % 60;
        System.out.print(sec_sobra+"\n");
        
    }
}
