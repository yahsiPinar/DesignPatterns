public class CheeseDecorator extends IngredientsDecorator{

    Pizza pizza;
    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getOrder() {
        return pizza.getOrder() + " ,Cheese";
    }
    @Override
    public double price() {
        return .2 + pizza.price();
    }
}
