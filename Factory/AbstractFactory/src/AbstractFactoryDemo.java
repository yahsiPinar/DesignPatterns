public class AbstractFactoryDemo {

    public static void main(String[] args){

        AbstractFactory factory1 = FactoryProducer.createFactory("Home");
        factory1.create("Bungalow");
        factory1.create("Apartment");

        AbstractFactory factory2 = FactoryProducer.createFactory("Car");
        factory2.create("Red");
        factory2.create("Black");
    }

}
