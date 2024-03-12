import java.util.ArrayList;

class ItemOrder {
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public double calculateTotal() {
        return item.getPrice() * quantity;
    }
}
