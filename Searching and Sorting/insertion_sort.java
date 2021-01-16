import java.io.*;
import java.util.*;
public class insertion_sort {
    public static void main(String args[]) throws IOException {
        int arr[] = {20,35,-15,7,55,1,-22};
        int i,j,newElement;
        for(i=1;i<arr.length;i++) {
            newElement = arr[i];
            for(j=i;j>0 && arr[j-1]>newElement;j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = newElement;
        }
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}