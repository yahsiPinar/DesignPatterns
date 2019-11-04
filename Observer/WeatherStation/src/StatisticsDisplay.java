public class StatisticsDisplay implements IObserver,IDisplayElements{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float sum= 0.0f;
    private int numReadings;
    private ISubject weatherData;

    public StatisticsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temprature = "+sum/numReadings+"/"
                +maxTemp+"/"+minTemp);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        sum += temp;
        numReadings++;
        if (temp>maxTemp){
            maxTemp = temp;
        }
        if(temp<minTemp){
            minTemp = temp;
        }
        display();
    }
}
