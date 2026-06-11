public class Type_Casting {

    public static void main(String[] argv){
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.err.println(myDouble);

        // Narrowing Casting
        double x = 9.78d;
        int y = (int) x;
        System.err.println(x);
        System.err.println(y);

        // Real-Life Example
        int maxScore = 500;
        int userScore = 423;

        double percentage = (double) userScore / maxScore * 100.0d;
        System.err.println(percentage);
    }
}