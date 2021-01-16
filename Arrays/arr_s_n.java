import java.io.*;
import java.util.*;
public class arr_s_n {
    public static void issorted(int arr[],int n) {
        int i,flag = 0;
        for( i = 0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                flag=1;
            } 
        }
        if(flag == 1)
            System.out.println("Not Sorted");
        else
            System.out.println("Sorted");
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        issorted(arr,n);
    }
}