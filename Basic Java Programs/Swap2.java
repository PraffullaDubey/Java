/*Swap 2 nos. without temp*/
import java.io.*;
import java.util.*;
public class I2 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 4;
        System.out.println("a = "+a+" b = "+b);
        System.out.println("After Swapping");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a+" b = "+b);
    }
}