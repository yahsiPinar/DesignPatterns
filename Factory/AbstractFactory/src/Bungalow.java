public class Bungalow implements Home {
    public Bungalow() {
        System.out.println("Bungalow object has been created");
    }
    @Override
    public String getType() {
        return "Bungalow";
    }
}
