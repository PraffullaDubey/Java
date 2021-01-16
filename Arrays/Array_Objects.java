import java.io.*;
import java.util.*;
class Student
{
    public int roll;
    public String name;
    Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
}
public class Array_Objects
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        Student arr[] = new Student[5];
        arr[0] = new Student(1,"Raj");
        arr[1] = new Student(2,"Rahul");
        arr[2] = new Student(3,"Ram");
        arr[3] = new Student(4,"Raju");
        arr[4] = new Student(5,"Raja");
        int i;
        for(i=0;i<arr.length;i++)
        {
            System.out.println("Element at index "+i+":"+arr[i].roll+" "+arr[i].name);
        }
    }
}
            