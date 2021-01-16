/*Program to cyclically rotate an array by one
input: 1 2 3 4 5 
output: 5 1 2 3 4
*/
import java.io.*;
import java.util.*;
public class Array_Cyclic_Rotation {
    public static void main(String args [] )throws IOException {
        Scanner sc = new Scanner(System.in);
        int i,j,temp,n;
        n = sc.nextInt();
        int arr [] = new int [n];
        for(i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt(); 
        }
        temp = arr[n-1];
        for(j=arr.length-1;j>0;j--) {
            arr[j]=arr[j-1];
        }
        arr[0]=temp;
        for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nTime Complexity : O(n)");
    }
}
            