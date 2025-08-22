import models.IObserver;
import models.IWeatherStation;

public class InternetDisplay implements IObserver {
    private IWeatherStation weatherStation;

    public InternetDisplay(IWeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        System.out.println("Updating internet display to " + this.weatherStation.getCurrentTemperature() + "C");
    }
}
