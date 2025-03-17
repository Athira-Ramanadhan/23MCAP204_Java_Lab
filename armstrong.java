
import java.util.Scanner;
public class armstrong {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        scanner.close();
		        
		        int original = num, sum = 0, temp = num;
		        
		        while (temp > 0) {
		            int digit = temp % 10;
		            sum =sum+ digit * digit * digit;
		            temp =temp/10 ;
		        }
		        
		        if (sum == original) {
		            System.out.println("Armstrong number");
		        } else {
		            System.out.println("Not an Armstrong number");
		        }
		    }
	}


