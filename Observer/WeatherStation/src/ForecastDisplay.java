public class ForecastDisplay implements IObserver,IDisplayElements{

    private float currentPressure;
    private float lastPressure;
    private ISubject weatherData;
    public ForecastDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        if (currentPressure > lastPressure)
            System.out.println("Forecast: Improving weather on the way!");
        else if (currentPressure == lastPressure)
            System.out.println("Forecast: More of the same");
        else
            System.out.println("Forecast: Watch out for cooler, rainy weather!");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
