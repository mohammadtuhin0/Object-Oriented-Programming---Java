import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the " + n + " elements: ");
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Enter K: ");
        int k = sc.nextInt();
        k = k % n;

        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            result[(i + k) % n] = num[i];
        }

        System.out.println("Rotated Array : ");
        for(int x : result){
            System.out.println(x + " ");
        }
    }
}
