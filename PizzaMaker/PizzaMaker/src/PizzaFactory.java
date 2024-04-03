public class PizzaFactory {

    public static Pizza getPizza(String type){
        return switch (type) {
            case "Chicken" -> new ChickenFiesta();
            case "Farm" -> new FarmHouse();
            case "Margarita" -> new Margharita();
            case "Peppy" -> new PeppyPaneer();
            default -> new SimplePizza();
        };
    }
}
