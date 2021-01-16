import java.io.*;
import java.util.*;
public class arr_rev {
    public static void rev(int arr[],int n) {
        int i,j,t;
        for(i = 0,j = arr.length-1; i<j; i++,j--) {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        System.out.println("Reversed Array is ");
        for( i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rev(arr,n);
    }
}