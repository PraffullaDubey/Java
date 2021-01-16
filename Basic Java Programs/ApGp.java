import java.io.*;
import java.util.*;
public class ApGp{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,d,r,t,x;
        double s;
        if(n%2==0){
            a = 1;
            r = 3;
            t = n/2;
            s = Math.pow(3,t-1);
            x = (int)s;
            System.out.println(x);
        }
        else{
            a = 1;
            r = 2;
            t = (n+1)/2;
            s = Math.pow(2,t-1);
            x = (int)s;
            System.out.println(x);
        }
    }
}