import java.util.Scanner;
public class Lab3_Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        while(num > 0){
            // count++;
            System.err.println(num%10);
            num = num / 10;
        }
        // System.err.println("Reminder: " + num);
    }
}
