import java.util.Scanner;

public class check_array_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element size: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the "+ n + "size elements");
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int j = 0; j < n-1; j++){
            if(num[j] > num[j+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("Array is Sorted.");
        }
        else {
            System.out.println("Array is not sorted.");
        }
    }
}
