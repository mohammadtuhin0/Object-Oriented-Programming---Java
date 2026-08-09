import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter Array 1 elements: ");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of Array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter Array 2 elements: ");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Common Elements: ");
        for(int i = 0; i < n1; i++){
            boolean found = false;
            for(int j = 0; j < n2; j++){
                if ( arr1[i] == arr2[j]) found = true;
            }

            boolean duplicate = false;
            for(int k = 0; k < i ; k++){
                if(arr1[k] == arr1[i]) duplicate = true;
            }

            if(found && !duplicate){
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
