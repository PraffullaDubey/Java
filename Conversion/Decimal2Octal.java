/*Decimal to octal*/
import java.io.*;
import java.util.*;
public class I6 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r, x = 0, dec = 0;
        while(n != 0) {
            r = n % 8;
            x = (int)(x + (r * Math.pow(10,dec)));
            dec++;
            n = n / 8;
        }
        System.out.println(x);
    }
}