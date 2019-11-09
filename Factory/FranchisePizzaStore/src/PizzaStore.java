public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        System.out.println(type+" Pizza is on the road...");
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(" READY YOUR "+pizza.getName());
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
