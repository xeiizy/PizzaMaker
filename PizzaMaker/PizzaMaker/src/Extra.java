public enum Extra {
    FRESH_TOMATO("Fresh Tomato", 0.40),
    BARBEQUE("Barbeque", 0.90),
    PANEER("Paneer", 0.70);

    private final String name;
    private final double price;

     Extra(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
