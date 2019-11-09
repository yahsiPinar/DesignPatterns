public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
        System.out.println("Creating the instance");
    }
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        else{
            System.out.println("Instance already created");
        }
        return uniqueInstance;
    }
}
