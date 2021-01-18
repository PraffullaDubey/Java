/*Swap 2 arrays*/
import java.io.*;
import java.util.*;
public class I3 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4};
        int arr1[] = new int[]{5,6,7,8};
        int tem[] = new int[4];
        System.out.println("before Swap");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i = 0; i < arr.length; i++){
            tem[i] = arr[i];
            arr[i] = arr1[i];
            arr1[i] = tem[i];
        }
        System.out.println("After Swap");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}