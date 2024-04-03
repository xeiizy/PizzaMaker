public class PeppyPaneer implements Pizza{
    private double price;


    public PeppyPaneer() {
        this.price = 10.0;
    }

    @Override
    public String getDescription() {
        return "peppy paneer";
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
