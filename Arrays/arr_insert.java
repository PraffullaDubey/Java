//Program to insert an element in the given array at any position
import java.io.*;
import java.util.*;
public class arr_insert {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int i,n,num,pos;
        n = sc.nextInt();
        int arr[] = new int[n+10];
        for(i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number and position");
        num = sc.nextInt();
        pos = sc.nextInt();
        i = n;
        while(i>=pos) {
            arr[i+1] = arr[i];
            i--;
        }
        n=n+1;
        arr[pos]=num;
        for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
        