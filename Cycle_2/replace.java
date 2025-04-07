import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        
        System.out.print("Enter the word to search: ");
        String search = sc.nextLine();

        
        System.out.print("Enter the replacement word: ");
        String replace = sc.nextLine();

        sc.close();

        
        String result = text.replace(search, replace);

        
        System.out.println("Updated String: " + result);
    }
}
