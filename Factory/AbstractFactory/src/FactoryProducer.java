public class FactoryProducer {

    public static AbstractFactory createFactory(String factory){
        System.out.print("Inside Factory producer -->");
        if (factory.equals("Home")){
            return new HomeFactory();
        }
        else if (factory.equals("Car")){
            return new CarFactory();
        }
        return null;
    }
}
