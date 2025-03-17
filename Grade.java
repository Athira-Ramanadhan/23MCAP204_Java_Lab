import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your percentage: ");
        int percentage = sc.nextInt();
        sc.close();

       
        String grade;
        String msg;

        if (percentage >= 90) {
            grade = "A";
            msg = "Excellent work!";
        } else if (percentage >= 80) {
            grade = "B";
            msg = "Good job!";
        } else if (percentage >= 70) {
            grade = "C";
            msg = "You can do better";
        } else if (percentage >= 60) {
            grade = "D";
            msg = "Work harder";
        } else {
            grade = "F";
            msg= "Failed. Try again";
        }

        // Display result
        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + msg);
    }
}

