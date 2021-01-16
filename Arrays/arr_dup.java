import java.io.*;
import java.util.*;
public class arr_dup {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i,flag = 0,count;
        for( i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int last = 0;
        for(i = 0; i <arr.length-1; i++) {
            if(arr[i] == arr[i+1] && arr[i] != last) {
                count = i+1;
                System.out.print("Duplicate element is "+arr[i]+" ");
                while(arr[count] == arr[i]){
                count++; }
                flag = count-i;
                i = count-1;
                last = arr[i];
                System.out.println("Duplicate found "+flag+" times");
            }
        }       
    }
}