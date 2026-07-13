import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int sum = 0;

        for(int i = 1; i<n; i++){
            if(n % i == 0) {
                System.err.println(i);
                sum+=i;
            }
        }
        System.out.println("Sum of divisors :" + sum);
        if(sum == n){
            System.out.println(n + " is a perfect number");
        }else {
            System.out.println(n + " is NOT a perfect number");
        }
    }
}
