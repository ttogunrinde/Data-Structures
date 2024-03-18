import java.util.Scanner;

class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, String deliveryAddress, int numToppings) {
        super(toppings, numToppings);
        this.deliveryAddress = deliveryAddress;
        if (super.getPrice() > 18) {
            this.deliveryFee = 3;
        } else {
            this.deliveryFee = 5;
        }
    }

    public String toString() {
        return super.toString() + "\nDelivery Address: " + deliveryAddress + "\nDelivery Fee: $" + deliveryFee;
    }
}

