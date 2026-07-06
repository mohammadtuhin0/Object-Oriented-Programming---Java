import java.util.Scanner;
public class lab3_Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number: ");
        int n = input.nextInt();
        int temp = n;
        int l = 0;

        while(temp>0) {
            l++;
            temp = temp/10;
        }
        System.err.println("Length :" + l);
        temp = n;
        while(temp>0) {
            System.out.println(temp/(int)Math.pow(10, l-1));
            temp = temp % (int)(Math.pow(10, l-1));
            l--;
        }
    }
}
