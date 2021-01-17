import java.io.*;
import java.util.*;
public class fibo {
    public static void main(String args[]) throws IOException {
        int i, t0 = 0,t1 = 1,s=0, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print(t0+" "+t1+" ");
        for(i = 2; i<=n; i++) {
            s = t0+t1;
            t0 = t1;
            t1 = s;
            System.out.print(s+" ");
        }
    }
}