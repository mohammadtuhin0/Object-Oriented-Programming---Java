import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number: ");
        int num = sc.nextInt();
        String binary = "";

        while(num > 0){
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        System.out.println(binary);

        // String binaryString = Integer.toBinaryString(num);
        // System.out.println(binaryString);
    }
}
