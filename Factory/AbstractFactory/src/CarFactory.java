public class CarFactory implements AbstractFactory<Car> {
    @Override
    public Car create(String color) {
        System.out.print("Inside Car Factory --> ");
        if (color.equals("Red")){
            return new RedCar();
        }
        else if (color.equals("Black")){
            return new BlackCar();
        }
        return null;
    }
}
