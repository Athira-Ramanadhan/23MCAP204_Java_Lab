import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();

        sc.close();

        // Calculate total marks
        int total = math + phy + chem;
        int totalmarks = math + phy;
        if ((math >= 60 && phy >= 50 && chem>= 40 && total >= 200) || (totalmarks >= 150)) {
            System.out.println("The student is eligible.");
        } else {
            System.out.println("The student is not eligible.");
        }
    }
}
