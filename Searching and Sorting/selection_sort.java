import java.io.*;
import java.util.*;
public class selection_sort {
    public static void main(String args[]) throws IOException {
        int arr[] = {20,35,-15,7,55,1,-22};
        int i,j,temp,largest;
        for(i=0;i<arr.length-1;i++) {
            largest = i;
            for(j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[largest]){
                    largest = j;
                }
            }
            temp = arr[largest];
            arr[largest]  = arr[i];
            arr[i] = temp;
        }
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}

