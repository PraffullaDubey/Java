import java.io.*;
import java.util.*;
public class arr_lrotate {
    public static void rotate(int arr[],int n) {
        int i,temp = arr[0];
        for(i = 0; i<arr.length-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
        for( i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr,n);
    }
}