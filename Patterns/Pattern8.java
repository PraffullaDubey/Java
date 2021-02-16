/* Pattern     1 
 *           2 3 2 
 *         3 4 5 4 3 
 *           2 3 2
 *             1
 *         1*/
 import java.io.*;
 import java.util.*;
 public class I40{
 public static void main(String args[])throws IOException{
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sp = n/2, st = 1, val = 1,cval;
     for(int i = 1; i <= n; i++){
         for(int j = 1; j<= sp; j++){
             System.out.print("  ");
            }
            cval = val;
            for(int j = 1; j <= st; j++){
                System.out.print(cval+" ");
                if(j <= st/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i <= n/2){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }
    }
}
     