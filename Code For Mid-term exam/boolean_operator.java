public class boolean_operator {
    public static void main(String[] args) {
        int a = 12, b = 7, c = 14, d = 15, e = 10;
        c = b++;
        d = a - b;
        e = c-- + a--;

        System.out.println(a > b);
        System.out.println(b++ == e);
        System.out.println(++c + d >= a);
        System.out.println((a + c) == b);
    }
}
