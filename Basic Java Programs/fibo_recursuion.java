import java.io.*;
import java.util.*;
public class fibo_recursuion {
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(fib(n)+" ");
    }
}