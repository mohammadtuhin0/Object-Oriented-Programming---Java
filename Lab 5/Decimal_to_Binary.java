import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number: ");
        int num = sc.nextInt();

        String binaryString = Integer.toBinaryString(num);
        System.out.println(binaryString);
    }
}
