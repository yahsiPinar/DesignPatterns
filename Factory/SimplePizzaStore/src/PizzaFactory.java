import java.sql.SQLOutput;

public class PizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        System.out.println("Creating a "+type+" Pizza");
        if (type.equals("Cheese")) pizza = new CheesePizza();
        if (type.equals("Veggie")) pizza = new VeggiePizza();
        if (type.equals("Clam")) pizza = new ClamPizza();
        if (type.equals("Pepperoni")) pizza = new PepperoniPizza();

        return pizza;
    }

}
