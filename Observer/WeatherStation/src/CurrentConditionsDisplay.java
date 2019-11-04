public class CurrentConditionsDisplay implements IDisplayElements, IObserver {

    private float temprature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+temprature+"F degrees and"
        +humidity+"% humidity");
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
