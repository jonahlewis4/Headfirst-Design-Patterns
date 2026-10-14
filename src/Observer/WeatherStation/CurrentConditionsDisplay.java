import java.util.concurrent.Flow;

public class CurrentConditionsDisplay implements DisplayElement, Flow.Subscriber<WeatherMeasureMent> {
    private float humidity;
    private float temperature;
    private Flow.Subscription subscription;
    public CurrentConditionsDisplay(WeatherData data) {
        data.subscribe(this);
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    public void onNext(WeatherMeasureMent weatherData) {
        this.temperature = weatherData.temperature;
        this.humidity = weatherData.humidity;
        display();
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " +
                humidity + "% humidity");
    }

}
