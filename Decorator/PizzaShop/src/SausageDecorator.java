public class SausageDecorator extends IngredientsDecorator {

    Pizza pizza;
    public SausageDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getOrder() {
        return pizza.getOrder() + " ,Sausage";
    }
    @Override
    public double price() {
        return 0.35 + pizza.price();
    }
}
