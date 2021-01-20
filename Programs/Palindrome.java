/*Palindrome number*/
import java.io.*;
import java.util.*;
public class I15 {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int x,rev = 0;
        while(t > 0){
            x = t % 10;
            rev = rev * 10 +x;
            t = t / 10;
        }
        if(rev == n)
        System.out.println("Palin");
        else
        System.out.println("not Palin");
        System.out.println(rev);
    }
}