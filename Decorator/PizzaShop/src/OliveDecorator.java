public class OliveDecorator extends IngredientsDecorator {

    Pizza pizza;
    public OliveDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getOrder() {
        return pizza.getOrder() + " ,Olive";
    }
    @Override
    public double price() {
        return .19 + pizza.price();
    }
}
