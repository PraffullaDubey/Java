/*Prime*/import java.io.*;
import java.util.*;
public class I8 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Prime");
        else
            System.out.println("NP");
    }
}