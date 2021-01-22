/*insertion sort*/
import java.io.*;
import java.util.*;
public class I26{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{5,-11,0,55,57,2,6};
        int key;
        for(int i = 1; i < arr.length; i++){
            key = arr[i];
            int j = i -1;
            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
        