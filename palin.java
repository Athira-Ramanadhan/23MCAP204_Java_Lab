

import java.util.Scanner;

public class palin {

	public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int original = num, reverse = 0;
        
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

	}

}
