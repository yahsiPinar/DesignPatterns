public class DecoratorPatternDemo {

    public static void main(String[] args){

        IComponent decoratedComponent1 = new ConcreteDecoratorA(new ConcreteComponent());
        IComponent decoratedComponent2 = new ConcreteDecoratorB(new ConcreteComponent());
        IComponent decoratedComponent3 = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
        decoratedComponent1.decorate();
        System.out.println();
        decoratedComponent2.decorate();
        System.out.println();
        decoratedComponent3.decorate();
    }
}
