class Pizza {
    private String[] toppings;
    private double price;

    public Pizza(String[] toppings, int numToppings) {
        this.toppings = new String[numToppings];
        System.arraycopy(toppings, 0, this.toppings, 0, numToppings);

        StringBuilder description = new StringBuilder();
        for (int i = 0; i < numToppings; i++) {
            description.append(toppings[i]);
            if (i < numToppings - 1) {
                description.append(", ");
            }
        }
        price = 14 + (2 * numToppings);
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Pizza toppings: " + String.join(", ", toppings) + "\nPrice: $" + price;
    }
}
