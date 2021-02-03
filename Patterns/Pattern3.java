/*Pattern 1
 *        23
 *        456
 *        78910
 */
import java.io.*;
import java.util.*;
public class I35{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}