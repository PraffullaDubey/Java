/*Decimal to Hexa*/
import java.io.*;
import java.util.*;
public class I7 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        String s2 = "";
        char c[] = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while( n > 0){
        r = n % 16;
        s2 = c[r]+s2;
        n = n / 16;
        }
        System.out.println(s2);
    }
}