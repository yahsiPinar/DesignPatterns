public class PepperoniDecorator extends IngredientsDecorator{

    Pizza pizza;
    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getOrder() {
        return pizza.getOrder()+" ,Pepperoni";
    }
    @Override
    public double price() {
        return .15 + pizza.price();
    }
}
