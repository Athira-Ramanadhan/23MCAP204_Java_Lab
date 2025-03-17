import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the range");
      int n=sc.nextInt();
      int first=0,second =1;

      System.out.println("Fibonacci Series till " + n + " terms:");
  
      for (int i = 1; i <= n; ++i) {
        System.out.print(first+ ", ");
        int next = first+ second;
        first = second;
        second = next;
      }
      sc.close();
    }
  } 
    

