import java.util.*;
public class MP24 {
	public static void main (String[] args) {
		
		int num1, num2;
		Scanner rl = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");		
		num1 = Integer.parseInt(rl.nextLine());
		num2 = Integer.parseInt(rl.nextLine());
		
		switch ((num1 > num2 ) ? 0 : (num2 > num1) ? 1 : 2) {
			case 0:
				if (num1 > num2) {
					System.out.println(num1 + " Is The Maximum Number");
				}
				break;
			case 1:
				if (num2 > num1) {
					System.out.println(num2 + " Is The Maximum Number");
				}
				break;
			case 2:
				if (num2 > num1) {
					System.out.println(num2 + " Is The Maximum Number");
				}
				break;
		}
		
		
	}
}
