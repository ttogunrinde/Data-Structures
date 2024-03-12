import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Item tissues = new Item("Tissues", 3);
        Item bulkDiscountTissues = new Item("Bulk Discount Tissues", 4);

        ItemOrder tissuesOrder = new ItemOrder(tissues, 5);

        ShoppingCart cart = new ShoppingCart();
        cart.addItemOrder(tissuesOrder);
        cart.addItemOrder(new ItemOrder(bulkDiscountTissues, 2));
        cart.addItemOrder(new ItemOrder(bulkDiscountTissues, 2));
        cart.addItemOrder(new ItemOrder(tissues, 1));

        System.out.println("Total price: $" + cart.totalPrice());
    }
}
