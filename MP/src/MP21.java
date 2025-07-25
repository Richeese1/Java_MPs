import java.util.Scanner;
public class MP21{
		public static void main(String args[]){
			
			Scanner rl = new Scanner(System.in);
			
			System.out.print("Enter the number: ");
			int num=rl.nextInt();
			
			switch(num%2){
			
			case 0:
				System.out.println(num+" is a Even number");
				break;
			case 1:
				System.out.println(num+" is a Odd number");
			}
		}
}