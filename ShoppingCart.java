import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<ItemOrder> itemOrders;

    public ShoppingCart() {
        this.itemOrders = new ArrayList<>();
    }

    public void addItemOrder(ItemOrder itemOrder) {
        itemOrders.add(itemOrder);
    }

    public boolean removeItemOrder(String itemName) {
        for (ItemOrder itemOrder : itemOrders) {
            if (itemOrder.getItem().getName().equals(itemName)) {
                itemOrders.remove(itemOrder);
                return true;
            }
        }
        return false;
    }

    public ItemOrder searchItemOrder(String itemName) {
        for (ItemOrder itemOrder : itemOrders) {
            if (itemOrder.getItem().getName().equals(itemName)) {
                return itemOrder;
            }
        }
        return null;
    }

    public double totalPrice() {
        double total = 0;
        for (ItemOrder itemOrder : itemOrders) {
            total += itemOrder.calculateTotal();
        }
        return total;
    }
}
