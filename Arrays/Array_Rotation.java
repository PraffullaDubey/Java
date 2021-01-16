import java.io.*;
import java.util.*;
public class Array_Rotation
{
    public static void main(String [] args)throws IOException
    {
        int i,j,d,n,temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        d = sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<d;i++)
        {
            temp = arr[0];
            for(j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nTime Complexity : O(d*n) ");
    }
}