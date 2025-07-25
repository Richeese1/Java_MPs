import java.util.*;
public class MP17 {
	public static void main (String[] args) {
		
		Scanner rl = new Scanner(System.in);
		
		int i = 0, l;
		System.out.println("Enter any Word: ");
		String name = rl.nextLine();
		
		while( i < name.length()) {
			i++;
		}
		System.out.println("The Length of the "+ name +" is "+i);
	}
}
	