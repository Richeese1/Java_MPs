import java.util.Scanner;
public class MP5{
    public static void main(String args [])
    {
        int a,b,temporary;                             
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();                                     
        System.out.println("Enter the value of b");
        b = sc.nextInt();                                 
        System.out.println("The value of a & b before swapping:");
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+b);
        temporary = a;
        a = b;
        b = temporary;
        System.out.println("The value of after swapping:");
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+b);
    }
}