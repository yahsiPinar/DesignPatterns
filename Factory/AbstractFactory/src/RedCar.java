public class RedCar implements Car{
    public RedCar() {
        System.out.println("RedCar object has been created");
    }

    @Override
    public String getColor() {
        System.out.println("Inside RedCar class");
        return "Red";
    }
}
