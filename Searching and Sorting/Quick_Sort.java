import java.io.*;
import java.util.*;
public class Quick_Sort {
    public static int partition(int arr[],int l,int h) {
        int pivot = arr[h];
        int i=l-1;
        for(int j = l;j<h;j++) {
            if(arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int tm = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = tm;
        return i+1;
    }
    public static void Qsort(int arr[],int l,int h) {
        if(l<h) {
            int j = partition(arr,l,h);
            Qsort(arr,l,j-1);
            Qsort(arr,j+1,h);
        }
    }
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("After Quick Sort \n");
        int l = 0;
        int r = n-1;
        Qsort(arr,l,r);
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}