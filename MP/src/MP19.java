import java.util.Scanner;
public class MP19{
	public static void main(String[] args) {
		
		Scanner rl = new Scanner (System.in);
		
		int n,multi=1;
		
		System.out.println("Enter Any number: ");
		n = rl.nextInt();
    
		while(n!=0){
			multi=multi*(n%10);
			n=n/10;
		}
			System.out.println(multi);
	}
}