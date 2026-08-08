import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element size: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for(int i = 0; i < n; i++){
            if(num[i] > largest){
                secondLargest = largest;
                largest = num[i];
            }
            else if(num[i] > secondLargest && num[i] != largest){
                secondLargest = num[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element exists.");
        }
        else{
            System.out.println("Second largest : " + secondLargest);
        }
    }
}
