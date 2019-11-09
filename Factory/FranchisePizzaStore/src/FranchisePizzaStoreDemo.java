public class FranchisePizzaStoreDemo {

    public static void main(String[] args){
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicagostore = new ChicagoPizzaStore();

        nystore.orderPizza("Pepperoni");
        chicagostore.orderPizza("Pepperoni");

    }
}
