/*Two strings are anagrams or not*/
import java.io.*;
import java.util.*;
public class I20 {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        boolean isAnagram = true;
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(l1 != l2)
            isAnagram = false;
        for(int i = 0; i < l1; i++){
            if(c1[i] != c2[i]){
                isAnagram = false;
            }
        }
        if(isAnagram){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
        