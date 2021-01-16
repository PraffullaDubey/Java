//Program to insert an element in the sorted array at any position
import java.io.*;
import java.util.*;
public class arr_insert2 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int i,n,j,num,pos;
        n = sc.nextInt();
        int arr[] = new int[n+10];
        for(i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number ");
        num = sc.nextInt();
        for(i= 0 ; i<n; i++) {
            if(arr[i]>num) {
                for(j = n-1; j>=i;j--) 
                   arr[j+1] = arr[j];
                }
                arr[i] = num;
                break;
            }
        
        n=n+1;
        for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
        