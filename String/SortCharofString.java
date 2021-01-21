
/*Sort char of strings*/
import java.io.*;
import java.util.*;
public class I19 {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        //System.out.println(String.valueOf(c));
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]);
        }
    }
}