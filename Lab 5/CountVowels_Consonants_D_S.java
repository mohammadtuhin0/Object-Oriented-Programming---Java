import java.util.Scanner;

public class CountVowels_Consonants_D_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String words = sc.nextLine();

        int vowels = 0;
        int consonants = 0; 
        int Digits = 0;
        int Special = 0;
        for(int i = 0; i < words.length(); i++){
            char ch = words.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            else if(Character.isLetter(ch)){
                consonants++;
            }
            else if(Character.isDigit(ch)) {
                Digits++;
            }
            else{
                Special++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + Digits);
        System.out.println("Specials : " + Special);
    }
}
