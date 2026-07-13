import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println(vowel);
        System.out.println(consonant);
    }
}