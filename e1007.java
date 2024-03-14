import java.io.IOException;
import java.util.Scanner;

public class e1007 {
    public static void main(String[] args) throws IOException {
Scanner s = new Scanner(System.in);
int n1 = s.nextInt();
int n2 = s.nextInt();
int n3 = s.nextInt();
int n4 = s.nextInt();

int result = n1*n2-n3*n4;
System.out.println("DIFERENCA = "+ result);
s.close();
}}
