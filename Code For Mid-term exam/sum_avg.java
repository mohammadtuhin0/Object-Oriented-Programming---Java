
import java.util.Scanner;

public class sum_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] number = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " integers: ");
        for(int i = 0; i<size; i++) {
            // System.out.println("Elements " + (i + 1) + ": ");
            number[i] = sc.nextInt();
            sum +=number[i];
        }
        double average = (double) sum / size;

        System.out.println("Result ");
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
