/*Two Matrix Diagonal Addition*/
import java.io.*;
import java.util.*;
public class I31{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int brr[][] = new int[n][n];
        int crr[][] = new int[n][n];
        int temp;
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
        System.out.println("Addition");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==j){
                crr[i][j] = arr[i][j] + brr[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}