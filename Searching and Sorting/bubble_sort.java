import java.io.*;
import java.util.*;
public class bubble_sort {
    public static void swap(int arr[], int i, int j) {
        int temp ;
        if (i == j) {
            return;
        }
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[])throws IOException {
        int arr[] = {20,35,15,7,55,1,22};
        int i,j;
        for(i=0;i<arr.length-1;i++) {
            for(j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("O(n^2)");
    }
}