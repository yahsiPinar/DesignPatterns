public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) return new ChicagoStyleCheesePizza();
        if (type.equals("Veggie")) return new ChicagoStyleVeggiePizza();
        if (type.equals("Pepperoni")) return new ChicagoStylePepperoniPizza();
        return null;
    }
}
