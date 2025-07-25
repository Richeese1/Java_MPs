import java.util.*;
public class MP23 {
	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		System.out.println("Enter Gender (m/M) or (f/F)");
		char gen = rl.next().charAt(0);
		
		switch(gen) {
			case 'm':
				System.out.println("MALE");
				break;
			case 'M':
				System.out.println("MALE");
				break;
			case 'f':
				System.out.println("FEMALE");
				break;
			case 'F':
				System.out.println("FEMALE");
				break;
			default:
				System.out.println("You are alien!");
			
		}
	}
}
