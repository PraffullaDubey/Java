/*String to upper case*/
import java.io.*;
import java.util.*;
public class I9 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = "Hello";
        String s2 = "helloo";
        System.out.println(s2);
        String s3 = "";
        char ch;
        for(int i = 0; i < s2.length(); i++){
        if(s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z'){
        ch = (char)(s2.charAt(i) - 32);
        }
        else
        ch = (char)(s2.charAt(i));
        s3 = s3 + ch;
        }
        System.out.println(s3);
        System.out.println(s1.toUpperCase());
    }
}