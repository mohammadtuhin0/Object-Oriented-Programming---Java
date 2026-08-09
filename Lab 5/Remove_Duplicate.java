import java.util.Scanner;

public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the " + n + " size elements");
        for(int i = 0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            boolean alreadySeen = false;

            for(int j = 0; j < i; j++) {
                if(num[j] == num[i]) {
                    alreadySeen = true;
                    break;
                }
            }
            if(!alreadySeen){
                System.out.print(num[i] + " ");
            }
        }
    }
}
