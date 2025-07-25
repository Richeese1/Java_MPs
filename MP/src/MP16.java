import java.util.*;
public class MP16 {
	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = rl.nextInt();
		
		int rev = 0;
		int rem= 0;
		
		while(n >=1) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n /10;
		}
		
		System.out.println("The Reverse number is: " + rev);
	}			
}
