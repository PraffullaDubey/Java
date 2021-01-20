/*Factorial*/
import java.io.*;
import java.util.*;
public class I16{
    public static int fact(int n){
        if(n == 0)
        return 1;
        else
        return n * fact(n-1);
    }
    public static int fa(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        System.out.println(fa(n));
    }
}