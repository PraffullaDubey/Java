/*Pattern *****
 *        ****
 *        ***
 *        **
 *        *
 */
import java.io.*;
import java.util.*;
public class I37{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = n; j >=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}