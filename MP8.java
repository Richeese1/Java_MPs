import java.util.Scanner;
public class MP8{

    	public static void main(String[] args){

	double radius;

		Scanner sc = new Scanner(System.in);

	System.out.println("Enter radius ");
	radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);	
    }
}