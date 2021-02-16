/*Pattern      *
 *            **
 *           ***
 *          ****
 */
import java.io.*;
import java.util.*;
public class I38{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1, st = 1;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}