import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

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

        System.out.println("Sum : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
