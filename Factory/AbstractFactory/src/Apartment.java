public class Apartment implements Home {
    public Apartment() {
        System.out.println("Apartment object has been created");
    }
    @Override
    public String getType() {
        return "Apartment";
    }
}
