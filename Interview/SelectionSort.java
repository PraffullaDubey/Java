/*Selection sort*/
import java.io.*;
import java.util.*;
public class I25{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,-6,22,33,5,-100};
        int largest,temp;
        for(int i = 0; i < arr.length-1; i++){
            largest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[largest]){
                    largest = j;
                }
            }
            temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
        