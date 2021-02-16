/* Pattern 1 2 3 4 5 
 *         1 2 3 4 
 *         1 2 3 
 *         1 2 
 *         1*/
 import java.io.*;
 import java.util.*;
 public class I39{
 public static void main(String args[])throws IOException{
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int c;
     for(int i = 1; i<= n; i++){
         c = 1;
         for(int j = n; j >= i; j--){
             System.out.print(c+" ");
             c++;
            }
            System.out.println();
        }
    }
}
     