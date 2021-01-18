/*Swap 2 nos.*/
import java.io.*;
import java.util.*;
public class I1 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 4;
        System.out.println("a = "+a+" b ="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping\na = "+a+" b = "+b);        
    }
}