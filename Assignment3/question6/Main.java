public class Main {
    public static void main(String[] args) {
        GroceryList cart = new GroceryList();
        GroceryItemOrder One =  new GroceryItemOrder("Cheese", 9, 10.5);
        GroceryItemOrder Two = new GroceryItemOrder("Yogurt", 2, 3);
        GroceryItemOrder Three = new GroceryItemOrder("Meat", 6, 6);

        try {
            cart.add(One);
            cart.add(Two);
            cart.add(Three);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Cost: " + cart.getTotalCost());
    }
}

