import java.util.Scanner;
public class problem_5 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int count = 0;

        for(int i = 1; i<=n; i++){
            if(n % i == 0) {
                System.err.println(i);
                count++;
            }
        }
        System.out.println("Total count: " + count + " divisors");
    }
}
