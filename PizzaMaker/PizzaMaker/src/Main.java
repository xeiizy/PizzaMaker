public class Main {
    public static void main(String[] args) {
        Pizza simple = PizzaFactory.getPizza("simple");
        simple.addExtra(Extra.BARBEQUE);
        System.out.println(simple.getPrice());

        Pizza peppy = PizzaFactory.getPizza("Peppy");
        peppy.addExtra(Extra.PANEER);
        System.out.println(peppy.getPrice());
    }
}