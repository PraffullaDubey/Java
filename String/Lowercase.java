/*lower case*/
import java.io.*;
import java.util.*;
public class I10 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1 = "HELLO";
        char ch;
        String s2 = "";
        int n = s1.length();
        for(int i = 0; i < n; i++){
            if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
                ch = (char)(s1.charAt(i) + 32);
            }
            else
                ch = (char)(s1.charAt(i));
            s2 = s2+ch;
        }
        System.out.println(s2);
    }
}