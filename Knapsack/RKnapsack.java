import java.io.*;
import java.util.*;
class RKnapsack {
    static int max(int a,int b) {
        return (a>b) ? a : b;
    }
    static int knapsack(int wt[],int val[],int W,int n) {
        if(n==0||W==0)
            return 0;
        if(wt[n-1]>W)
            return knapsack(wt,val,W,n-1);
        else
            return max(val[n-1]+knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1));
    }
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wt[] = new int[n];
        int val[] = new int[n];
        for(int i = 0;i<n;i++) {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        System.out.println("Enter Knapsack value");
        int W = sc.nextInt();
        System.out.println(knapsack(wt,val,W,n));
    }
}