public class SimplePizza  implements Pizza{
    private double price;


    public SimplePizza() {
        this.price = 5.0;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void addExtra(Extra extra) {
        setPrice(getPrice() + extra.getPrice());
    }
}
