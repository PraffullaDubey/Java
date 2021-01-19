/*remove constonats*/
import java.io.*;
import java.util.*;
public class I11 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch;
        String s1 = "";
        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                s1 = s1 + ch;
            }
        }
        System.out.println(s1);
    }
}