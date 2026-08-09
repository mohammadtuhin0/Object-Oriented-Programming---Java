import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] result = new int[r][c];

        System.out.println("Enter Matrix A: ");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Matrix B: ");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                int sum = 0;
                for(int k = 0; k < c; k++){
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        System.out.println("Result: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
