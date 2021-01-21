/*Linear Search*/
import java.io.*;
import java.util.*;
public class I21 {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int flag = 0;
        int pos = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                flag = 1;
                pos = i;
                break;
            }
        }
        if(flag == 1) 
            System.out.println("Found at "+(pos+1)+" position");
        else 
        System.out.println("not found");
        
    }
}