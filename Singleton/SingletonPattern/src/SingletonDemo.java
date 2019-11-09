public class SingletonDemo {
    public static void main(String[] args){

        Singleton singleton1 = Singleton.getUniqueInstance();
        Singleton singleton2 = Singleton.getUniqueInstance();

    }
}
