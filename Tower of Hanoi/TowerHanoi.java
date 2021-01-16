import java.io.*;
import java.util.*;
public class TowerHanoi {
    public static void TOH(int n, int a, int b, int c) {
        if (n>0) {
            TOH(n-1, a, c, b);
            System.out.println("Move from "+a+" to "+ c);
            TOH(n-1, b, a, c);
        }
    }
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        TOH(n,a,b,c);
        System.out.println("O(2^n)");
    }
}