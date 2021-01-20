/*ARMSTRONG NUMBER*/
import java.io.*;
import java.util.*;
public class I17{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n,x,y = 0;
        int count = 0;
        for(int i = t; i > 0; i /= 10){
            count++;
        }
        for(int i = t; i > 0; i /= 10){
            x = i % 10;
            y = (int)(y + Math.pow(x,count));
        }
        if(y == n)
        System.out.println("Armstrong");
        else
        System.out.println("NA");
    }
}