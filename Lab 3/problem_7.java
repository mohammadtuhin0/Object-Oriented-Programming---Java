import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        boolean indicator = false;

        for(int i = 2; i<n; i++){
            if(n % i == 0) {
                indicator = true;
            }
        }

        if(!indicator){
            System.out.println("The number " + n + " is a prime number");
        }else {
            System.out.println("The number " + n + " is not a prime number");
        }
    
    }
}
