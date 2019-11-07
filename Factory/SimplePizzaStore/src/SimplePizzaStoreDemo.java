public class SimplePizzaStoreDemo {

    public static void main(String[] args){

        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Cheese");
        System.out.println("Ready "+pizza.getName()+"!");
        pizza = store.orderPizza("Pepperoni");
        System.out.println("Ready "+pizza.getName()+"!");
        pizza = store.orderPizza("Veggie");
        System.out.println("Ready "+pizza.getName()+"!");
    }
}
