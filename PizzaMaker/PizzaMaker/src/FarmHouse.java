public class FarmHouse implements Pizza{
    private double price;


    public FarmHouse() {
        this.price = 20.0;
    }

    @Override
    public String getDescription() {
        return "farm house";
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
