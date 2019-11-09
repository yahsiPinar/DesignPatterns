public class BlackCar implements Car {
    public BlackCar() {
        System.out.println("BlackCar object has been created");
    }

    @Override
    public String getColor() {
        System.out.println("Inside BlackCar class");
        return "Black";
    }
}
