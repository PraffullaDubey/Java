import java.io.*;
import java.util.*;
public class arr_sorted_in {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+10];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value to be inserted");
        int val = sc.nextInt();
        int i = n-1;
        while(i>=0 && arr[i]>val) {
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = val;
        n++;
        for(int j = 0; j<n; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}