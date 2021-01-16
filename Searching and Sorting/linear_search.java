import java.io.*;
import java.util.*;
public class linear_search {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,i,key,temp,pos=0,f=1;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        key = sc.nextInt();
        for(i = 0; i<n; i++) {
            if(key == arr[i]) {
                temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                pos = i;
                f = 1;
                break;
            }
        }
        if(f == 1) {
            pos++;
            System.out.println("Element found at "+pos+"th postion");
        }
        else 
        System.out.println("Not Found");
        for(i = 0; i<n; i ++) {
            System.out.print(arr[i]+" ");
        }
    }
}