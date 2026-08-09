import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        System.out.println("Enter the " + (n - 1) + "elements: ");
        for(int i = 0; i < n - 1; i++){
            actualSum += sc.nextInt();
        }
        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}
