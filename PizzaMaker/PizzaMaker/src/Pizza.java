public interface Pizza {
    default String getDescription() {
        return "Unknown Pizza";
    }
    double getPrice();

    void addExtra(Extra extra);

    void setPrice(double Price);
}
