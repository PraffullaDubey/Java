/*binary search*/
import java.io.*;
import java.util.*;
public class I22 {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int l = 0;
        int h = n-1;
        int mid, p = 0, f = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        while(l <= h){
            mid = (l+h)/2;
            if(key == arr[mid]){
                f = 1;
                p = mid;
                break;
            }
            else if(key < arr[mid]){
                h = mid - 1;
            }
            else
            l = mid + 1;
        }
        if(f == 1)
        System.out.println("Found at"+(p+1));
        else
        System.out.println("NF");
    }
}
            