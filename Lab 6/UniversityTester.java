public class UniversityTester {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();


        System.out.println(u1);

        System.out.println("============");
        System.out.println(u2);

        if(u1 == u2){
            System.out.println("Location is same");
        } else{
            System.out.println("Location is not same");
        }

        u1.name = "Imperial College London";
        u1.country = "England";

        u2.name = "Eastern University";
        u2.country = "Bangladesh";

        System.out.println(u2.name);
        System.out.println(u2.country);

        if(u1.name == u2.name && u1.country == u2.country){
            System.out.println("Same");
        }else{
            System.out.println("not same");
        }
    }
}
