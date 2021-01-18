/*Decimal to binary*/
import java.io.*;
import java.util.*;
public class I5 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = 0,dec = 0,r,n;
        n = sc.nextInt();
        while(n != 0){
        r = n % 2;
        x = (int)(x + (r * Math.pow(10,dec)));
        dec++;
        n = n /2;
       }
       System.out.println(x);
    }
}