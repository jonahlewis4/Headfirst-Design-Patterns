import java.util.concurrent.SubmissionPublisher;

public class WeatherData extends SubmissionPublisher<WeatherMeasureMent> {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {
        this.submit(new WeatherMeasureMent(
                this.temperature,
                this.humidity,
                this.pressure
        ));
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}