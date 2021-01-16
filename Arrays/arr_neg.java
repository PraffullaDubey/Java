import java.io.*;
import java.util.*;
public class arr_neg {
    public static void swap(int a,int b){
        int t;
        t = a;
        a = b;
        b = t;
    }
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = arr.length-1;
        while(i<j) {
            while(arr[i] < 0)
                i++;
            while(arr[j] >= 0) 
                j--;
            while(i<j)
                swap(arr[i],arr[j]);

        }
        System.out.println("Array is :");
        for(int k = 0; k<arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}