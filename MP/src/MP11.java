import java.util.Scanner;
		public class MP11{
		    public static void main(String[] args){

		        Scanner abc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = abc.nextInt();

		        if(num % 2 == 0) {
		            System.out.println(num + " is even number");
		        }
		        else {
		            System.out.println(num + " is odd number");
		        }
	}
}	