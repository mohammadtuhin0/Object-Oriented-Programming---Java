public class AssignmentTester {
    public static void main(String[] args) {
        Assignment as1 = new Assignment();
        as1.printDetails(0, null, false);
        System.out.println("--------- 1 ----------");

        as1.printDetails(11, "Moderate", true);
        as1.printDisplay();

        System.out.println("========= 2 ===========");
        as1.printDetails(0, null, false);
    }
}
