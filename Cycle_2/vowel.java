import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine(); 
        sc.close(); 
        int vowels = 0, cons = 0; 

        
        text = text.toLowerCase();

        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); 

            
            if (ch >= 'a' && ch <= 'z') {
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // Increase vowel count
                } else {
                    cons++; // Increase consonant count
                }
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
    }
}
