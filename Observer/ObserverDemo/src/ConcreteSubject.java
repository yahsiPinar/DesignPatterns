import java.util.ArrayList;

public class ConcreteSubject implements ISubject{

    private ArrayList observers;
    private int value = 0;

    public ConcreteSubject() {
        observers = new ArrayList();
        System.out.println("ConcreteSubject constructor is running...Observers list being initialized");
    }
    @Override
    public void registerObservers(IObserver o) {
        observers.add(o);
        System.out.println("Registered an Observer with id "+observers.indexOf(o));
    }
    @Override
    public void removeObservers(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
            System.out.println("Removed an Observer with id " + i);
        }
    }
    @Override
    public void notifyObservers() {
        for(int i = 0; i <observers.size();i++){
            System.out.println("Inside the notifyObservers(). Observer"+i+" value is updating.");
            IObserver o = (IObserver) observers.get(i);
            o.update(value);
        }
    }
    public int getObserverValue() {
        return value;
    }
    public void setObserverValue(int observerValue) {
        System.out.println("Inside the setObserverValue(). Value is changed "+value+" to "+observerValue+".Observer is notifying.");
        this.value = observerValue;
        notifyObservers();

    }
}
