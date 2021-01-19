/*SUm of Fibonacii*/
import java.util.*;
import java.io.*;
public class I14{
    public static int fib(int n){
        if(n <= 1)
        return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fib(n));
    }
}
            