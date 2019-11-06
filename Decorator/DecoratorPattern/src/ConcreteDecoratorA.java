public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(IComponent component) {
        super(component);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.print("DecoratorA ");
    }
}
