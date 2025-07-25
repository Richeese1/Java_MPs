import java.util.Scanner;
public class MP4{
	public static void main(String[] args){
	
	Scanner add = new Scanner(System.in);

		int x, y;		
	//input
		System.out.println("Enter Sum ");
		x = add.nextInt();

		System.out.println("Enter Sum ");
		y = add.nextInt();
	//formula
		int ans = (x + y);
	//output
		System.out.println("The answer is: " + ans);
		}
	}