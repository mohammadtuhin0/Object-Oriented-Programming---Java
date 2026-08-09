import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int placeValue = 1;

        while(binary>0){
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * placeValue);

            binary = binary / 10;
            placeValue = placeValue * 2;
        }
        System.out.println(decimal);
    }
}
