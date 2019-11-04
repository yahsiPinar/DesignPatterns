public class ConcreteObserver implements IObserver {

    private ConcreteSubject subject;
    private int observerValue;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.registerObservers(this);
    }

    @Override
    public void update(int value) {
        this.observerValue = value;
        System.out.println("The update () method of the ConcreteObserver class is running...The observer value has been updated to "+observerValue);
    }
}
