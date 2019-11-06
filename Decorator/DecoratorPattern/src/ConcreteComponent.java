public class ConcreteComponent implements IComponent{

    @Override
    public void decorate() {
        System.out.print("Core object is decorated with ");
    }
}
