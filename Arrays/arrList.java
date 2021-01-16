import java.io.*;
import java.util.*;
public class arrList {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            a.add(i);
        }
        for(int i = 0; i<a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}