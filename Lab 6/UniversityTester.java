public class UniversityTester {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = u1;

        System.out.println(u1);

        System.out.println("============");
        
        System.out.println(u2);

        u1.name = "Imperial College London";
        u1.country = "England";

        u2.name = "Eastern University";
        u2.country = "Bangladesh";

        System.out.println(u2.name);
        System.out.println(u2.country);
    }
}
