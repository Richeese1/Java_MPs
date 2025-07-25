import java.util.Scanner;
public class MP25 {
	public static void main(String[] args) {
		
		Scanner rl = new Scanner (System.in);
		
		System.out.println("INPUT A DAY 1-7 : ");
		int day = rl.nextInt();
		
		switch (day){
		    
		   case 6:
			   System.out.println("Today is Sunday!");
			   break;
		   case 7:
		       System.out.println("Today is Saturday!");
		       break;
		  default:
		      System.out.println("Looking Forward To Weekends!");		      
		}
		
	}
}