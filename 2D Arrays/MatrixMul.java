/*Matrix Multi*/
import java.io.*;
import java.util.*;
public class I28{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int brr[][] = new int[n][n];
        int crr[][] = new int[n][n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("ARR");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("BRR");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                for(int k = 0; k < n; k++){
                    sum += arr[r][k]*brr[k][c];
                }
                crr[r][c] = sum;
                sum = 0;
            }
        }
        System.out.println("CRR");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}