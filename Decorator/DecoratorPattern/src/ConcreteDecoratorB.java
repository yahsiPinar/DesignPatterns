public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(IComponent component) {
        super(component);
    }
    @Override
    public void decorate() {
        super.decorate();
        System.out.print("DecoratorB");
    }
}
