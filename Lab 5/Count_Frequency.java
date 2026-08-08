import java.util.Scanner;

public class Count_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element size");
        int n = sc.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the "+ n + "size elements: ");
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i< n ; i++){
            boolean count = false;

            for(int k = 0; k < i; k++){
                if(num[k] == num[i]){
                    count = true;
                    break;
                }
            }
            if(count) {
                continue;
            }
            int frequency = 0;
            for(int j = 0; j< n; j++){
                if(num[j] == num[i]){
                    frequency++;
                }
            }
            System.out.println(num[i] + " ->" + frequency);
        }
    }    
}
