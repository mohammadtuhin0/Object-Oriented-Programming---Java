public class operator {

    public static void main(String[]args) {
        int a = 15;
        int b = 10;
        int c = ++a - b;
        int d = b++ + a;
        System.out.printf("a = %d b = %d c = %d d = %d", a, b, c, d);
    }
}