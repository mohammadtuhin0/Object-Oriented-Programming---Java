

public class Student {
    public static void main(String[] args) {
        studentMethod s1 = new studentMethod();

        System.out.println("Name of the student: " + s1.name);
        System.out.println("ID of the student: " + s1.id);

        s1.name = "Bob";
        s1.id = 123;

        System.out.println("Name of the student: " + s1.name);
        System.out.println("ID of the student: " + s1.id);
    }
}
