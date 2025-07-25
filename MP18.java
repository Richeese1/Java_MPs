import java.util.Scanner;
public class MP18 {
	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int a = rl.nextInt();
		
		int last = a%10;
		int first= a;
		
		while(first>=10) {
			first=first/10;
		}
		
		System.out.println("The Sum of first and Last = "+(first+last));
	}			
}
