
import java.util.Scanner;
public class floyd {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter number of rows: ");
		        int rows = scanner.nextInt();
		        scanner.close();
		        
		        int num = 1;
		        
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(num + " ");
		                num++;
		            }
		            System.out.println(); 
		        }
	      }	


	}


