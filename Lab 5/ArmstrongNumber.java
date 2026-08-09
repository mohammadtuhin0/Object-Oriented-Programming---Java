import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int digits = String.valueOf(n).length();

        int sum = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if(sum == n) {
            System.out.println("Armstron Number");
        }
        else{
            System.out.println("Not an Armstron Number");
        }
    }
}
