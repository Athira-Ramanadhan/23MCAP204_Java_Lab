import java.util.Scanner;
public class rect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        double length =sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double breadth =sc.nextDouble();
        double area= length *breadth;
        double perimeter=2*(length+ breadth);
        System.out.println("The area of the rectangle is :"+ area);
        System.out.println("The perimeter of the rectangle is :"+ perimeter);
        sc.close();
    }
}
