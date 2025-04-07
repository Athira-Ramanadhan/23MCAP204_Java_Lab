import java.util.Scanner;
public class circle {
 public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the Radius of the circle:");
    double  radius =sc.nextDouble();
    double area =Math.PI*radius*radius;
    double perimeter = Math.PI * 2*radius;
    System.out.println("The area of the circle is :"+ area);
    System.out.println("The perimeter of the circle is:"+ perimeter);
    sc.close();
 }
}

    

