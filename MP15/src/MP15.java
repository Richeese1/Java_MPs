import java.util.Scanner;
	public class MP15 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int x, y;
			
			System.out.println("Enter x value:");
			x = sc.nextInt();
			System.out.println("Enter y value:");
			y = sc.nextInt();
			
			if(x >= 1 && y >= 1) {
				System.out.println("1st Quadrant");
			}
			else if (x >= 1 && y <= -1) {
				System.out.println("4th Quadrant");
			}
			else if (x <= -1 && y <= -1) {
				System.out.println("3rd Quadrant");
			}
			else if (x <= -1 && y >= 1) {
				System.out.println("2nd Quadrant");
			}
			else if (x == 0 || y >= 0 || x <= 0 || y == 0) {
				System.out.println("origin");
			}	
			else {
				System.out.println("Invalid Input");
			}
		}
}
