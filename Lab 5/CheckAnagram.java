import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.println("Enter second string: ");
        String s2 = sc.nextLine().replace(" ", "").toLowerCase();

        boolean isAnagram = true;

        if(s1.length() != s2.length()){
            isAnagram = false;
        }

        for ( int i = 0; i < s1.length() && isAnagram; i++){
            char ch = s1.charAt(i);

            int count1 = 0, count2 = 0;

            for(int j = 0; j < s1.length(); j++){
                if(s1.charAt(j) == ch) count1++;
                if(s2.charAt(j) == ch) count2++;
            }

            if(count1 != count2){
                isAnagram = false;
            }
        }
        if(isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
