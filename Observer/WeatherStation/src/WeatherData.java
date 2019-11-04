import java.util.ArrayList;

public class WeatherData implements ISubject{
    private ArrayList observers;
    private float temprature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++){
            IObserver observer = (IObserver)observers.get(i);
            observer.update(temprature,humidity,pressure);
        }
    }
    public void measurementChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temprature,float humidity,float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemprature() {
        return temprature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
