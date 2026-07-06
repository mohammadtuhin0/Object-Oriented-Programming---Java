
import java.util.Scanner;
public class Lab3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many number:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number");

        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i=0; i<n; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        double avg = (double)sum / n;
        System.err.println("Maximum number: " + max);
        System.err.println("Minimum number: " + min);
        System.err.println("Average number: " + avg);
    }
}