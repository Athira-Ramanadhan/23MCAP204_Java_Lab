import java.util.Scanner;
import java.util.Arrays;

public class Arrayofstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many strings do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] words = new String[n];

        // Take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        // Sort the array
        Arrays.sort(words);

        // Print sorted strings
        System.out.println("\nSorted strings:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
