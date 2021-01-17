import java.io.*;
import java.util.*;
public class Sparse_Array
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n,q,i,j,count=0;
        System.out.println("Enter value of n");
        n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Strings of n");        
        String s[] = new String[n+1];
        for(i=0;i<n;i++)
        {
            s[i] = sc.nextLine();
        }
        System.out.println("Enter value of q");
        q = sc.nextInt();
        String Q[] = new String[q+1];
        System.out.println("Enter Queries of q");        
        for(j=0;j<q;j++)
        {
            Q[j] = sc.nextLine();
        }
        /*for(i=0;i<n;i++)
        {
            System.out.println(s[i]+" "+Q[i]);
        }*/
        for(i=0;i<n;i++)
        { count=0;
            for(j=0;j<n;j++)
            {
                if(Q[j].equals(s[i]))
                count++;
            }
            for(i=0;i<n;i++){
                arr[i]=count;}
        for(i=0;i<n;i++){
            System.out.println(count);}
        }
    }
}