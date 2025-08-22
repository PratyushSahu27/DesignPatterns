import models.IObservable;
import models.IObserver;
import models.IWeatherStation;

public class TvDisplay implements IObserver {
    IWeatherStation weatherStation;

    public TvDisplay(IWeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Updating TV display to " + this.weatherStation.getCurrentTemperature() + "C");
    }
}
