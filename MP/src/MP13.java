import java.util.Scanner;
 	public class MP13{
   public static void main(String args[]){ 
    
       	 int m;
	   	 Scanner sc = new Scanner(System.in);

         System.out.println("Input the value of m :");
         m = sc.nextInt();
         
         if(m > 0) {
        	 System.out.println("n is = 1");
         } 
         if(m == 0 ) {
        	 System.out.println("n is + 0");
         }
         if(m < 0 ) {
        	 System.out.println("n is + -1");
         }	
 
        
   }
}