import java.util.Scanner;

public class ReverseTheWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String words = sc.nextLine();
        String[] wordArray = words.split(" ");
        int n = wordArray.length;

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(wordArray[i] + " ");
        }
    }
}
