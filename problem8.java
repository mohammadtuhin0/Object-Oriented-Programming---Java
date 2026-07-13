import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = input.nextInt();

        int primeCount = 0;
        int notPrimeCount = 0;

        String primeList = "";
        String notPrimeList = "";

        for (int j = 1; j <= t; j++) {

            System.out.print("Enter number " + j + ": ");
            int n = input.nextInt();

            boolean indicator = false;

            if (n <= 1) {
                indicator = true;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        indicator = true;
                        break;
                    }
                }
            }

            if (!indicator) {
                primeList += n + " ";
                primeCount++;
            } else {
                notPrimeList += n + " ";
                notPrimeCount++;
            }
        }

        System.out.println("\nPrime Numbers:");
        System.out.println(primeList);

        System.out.println("\nNot Prime Numbers:");
        System.out.println(notPrimeList);

        System.out.println("\nTotal Prime Numbers: " + primeCount);
        System.out.println("Total Not Prime Numbers: " + notPrimeCount);

    }
}