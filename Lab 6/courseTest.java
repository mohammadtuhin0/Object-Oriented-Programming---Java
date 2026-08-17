public class courseTest {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course();

        System.out.println("============ 1 ==========");
        c1.updateCode("Structure Programming", "797651684", 3);
        c1.displayCourse();

        System.out.println("======= 2 ==========");
        c2.updateCode("Object Oriented Programming", "65546162", 3);
        c2.displayCourse();

        System.out.println("======== 3 ========");
        c2.updateCode("Java Programming", "6789864561", 3);
        c2.displayCourse();
    }
}
