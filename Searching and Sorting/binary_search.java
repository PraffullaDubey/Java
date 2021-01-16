import java.io.*;
import java.util.*;
public class binary_search {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,l,h,key,mid,i,f=0,p=0;
        n = sc.nextInt();
        int arr[] = new int[n];
        for( i = 0; i<n; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter the key");
        key = sc.nextInt();
        l = 0;
        h = n-1;
        while(l <= h) {
            mid = (l+h)/2;
            if(key == arr[mid]) {
                f=1;
                p = mid;
                break;
            }
            else 
                if (key < arr[mid]) 
                    h = mid-1;
            else
                l = mid+1;
            }
        if(f == 1)
        System.out.println("Found at "+p);
        else
        System.out.println("Not found");
        }
    }