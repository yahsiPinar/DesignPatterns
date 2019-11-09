public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item){
        if (item.equals("Cheese")) return new NYStyleCheesePizza();
        if (item.equals("Veggie")) return new NYStyleVeggiePizza();
        if (item.equals("Pepperoni")) return new NYStylePepperoniPizza();
        else return null;
    }
}
