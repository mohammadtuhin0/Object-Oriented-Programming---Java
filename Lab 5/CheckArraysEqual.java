import java.util.Scanner;

public class CheckArraysEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter array 1 elements: ");
        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of Array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter array 2 elements: ");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        boolean isEqual = (n1 == n2);
        for(int i = 0; i<n1 && isEqual; i++){
            if(arr1[i] != arr2[i]) isEqual = false;
        }
        System.out.println(isEqual ? "The arrays are equal." : "The arrays are not equal.");
    }
}
