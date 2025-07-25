import java.util.Scanner;
public class MP10{
	public static void main(String[] args){

	Scanner dt = new Scanner(System.in);

	double distance, time;

	System.out.println("The Distance is ");
	distance = dt.nextDouble();

	System.out.println("The Time is ");
	time = dt.nextDouble();

	double speedkm = (distance * 3600) / (time * 1000);
	double speedmls = (distance * 3600 * 1) / (time * 1000 * 1.609);

	System.out.println("The answer in Kilometer " + speedkm);
	System.out.println("The answer in Miles " + speedmls);
	}
}