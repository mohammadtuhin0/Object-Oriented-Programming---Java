public class Data_typeExp {
    public static void main(String[] argv) {
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.err.println("Number of items: " + items);
        System.err.println("Cost per item: " + costPerItem);
        System.err.println("Total Cost: " + totalCost + currency);
    }
}
