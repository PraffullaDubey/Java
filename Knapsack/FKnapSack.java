import java.io.*;
import java.util.*;
public class FKnapSack{
    public static void main(String []args)throws IOException {
     int i,j=0,max_qty,n,m;
     float sum=0,max;
     Scanner sc = new Scanner(System.in);
     int arr[][] = new int[2][20];
     System.out.println("Enter no. of elements");
     n = sc.nextInt();
     System.out.println("Enter Weights");
     for(i = 0; i<n; i++) 
        arr[0][i] = sc.nextInt();
    System.out.println("Enter Price");
    for(i = 0; i<n; i++)
        arr[1][i] = sc.nextInt();
    System.out.println("Enter Max Size of bag");
    max_qty = sc.nextInt();
    m = max_qty;
    while(m >= 0) {
        max = 0;
        for(i = 0; i<n; i++) {
            if((((float)arr[1][i])/((float)arr[0][i]))>max) {
                max = ((float)arr[1][i]/(float)arr[0][i]);
                j = i;
            }
        }
        if(arr[0][j]>m) {
            System.out.println("Quantity of Item no. "+(j+1)+" added is "+arr[0][j]);
           sum += m*max;
           m = -1;
        }
        else {
            System.out.println("Quantity of Item no. "+(j+1)+" added is "+arr[0][j]);
            m -= arr[0][j];
            sum += (float)arr[1][j];
            arr[1][j] = 0;
        }
    }
     System.out.println("Profit is: "+sum);   
    }
}