public class ObserverDemo {

    public static void main(String[] args){

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setObserverValue(5);
        subject.setObserverValue(10);

    }
}
