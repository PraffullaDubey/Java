/*Fibonacii*/
import java.util.*;
import java.io.*;
public class I13{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int n = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i = 2; i < n; i++){
            int s = a+b;
            a = b;
            b = s;
            System.out.print(s+" ");
        }
    }
}
            