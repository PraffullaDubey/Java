import java.io.*;
import java.util.*;
public class armstrong {
    public static int count_n(int n) {
        int count = 0;
        int t = n;
        while(t>0) {
            t = t/10;
            count++;
        }
        //for(i=t;i>0;i/=10)
        //count++;
        return count;
    }
    public static int power(int a,int b){
        if(b == 0)
        return 1;
        else
        return a*power(a,b-1);
    }
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 153;
        int c = count_n(n);
        int t = n;
        int r = 0;
        int x;
        for(int i = t;i>0; i/=10){
            x = i%10;
            r = r+power(x,c);
    }
    System.out.println(r);
    if(r == n)
    System.out.println("Yes");
    else
    System.out.println("no");
}
}