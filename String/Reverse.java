/*String Reverse*/
import java.io.*;
import java.util.*;
public class I18{
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = "Praffulla";
        int l = s.length();
        char ch;
        String s1 = "";
        for(int i = l-1; i >= 0; i--){
            ch = s.charAt(i);
            s1 = s1 + ch;
        }
        System.out.println(s1);
    }
}