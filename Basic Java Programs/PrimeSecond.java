/*Prime non optimal*/
import java.io.*;
import java.util.*;
public class I32{
    public static boolean isP(int n){
        if(n < 2)
        return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n = 7;
        if(isP(n))
        System.out.println("Y");
        else
        System.out.println("N");
        int flag = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = 1;
                break;}
            }
        if(flag == 0)
            System.out.println("YAY");
        else
            System.out.println("NAY");
        }
}