/*swap two strings*/
import java.io.*;
import java.util.*;
public class I4 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "hi";
        String s3 = "";
        System.out.println(s1+" "+s2);
        s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1+" "+s2);
    }
}