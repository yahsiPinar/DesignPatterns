public class HomeFactory implements AbstractFactory<Home> {
    @Override
    public Home create(String type) {
        System.out.print("Inside Home Factory --> ");
        if (type.equals("Apartment")){
            return new Apartment();
        }
        else if (type.equals("Bungalow")){
            return new Bungalow();
        }
        return null;
    }
}
