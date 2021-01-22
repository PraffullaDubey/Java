/*largest of 3 numbers*/
import java.io.*;
import java.util.*;
public class I23{
    public static int Greatest(int a,int b,int c){
        if(a > b && a > c)
            return a;
        else if( b > a && b > c)
            return b;
        else
            return c;
        }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > b){
            if(a > c) 
            System.out.println(a);
            else
            System.out.println(c);
        }
        else if(b > c) {
            if(b > a)
            System.out.println(b);
            else
            System.out.println(c);
        }
        else
            System.out.println(c);
        System.out.println("From method "+Greatest(a,b,c));
    }
}