import java.util.Scanner;
public class Symetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { 
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("The matrix is not symmetric.");
                    return;  
                }
            }
        }

       
        System.out.println("The matrix is symmetric.");
    }
}


