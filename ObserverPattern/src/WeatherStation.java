import models.IObserver;
import models.IWeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeatherStation {
    int currentTemperature;

    List<IObserver> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
        setCurrentTemperature(10);
    }

    @Override
    public int getCurrentTemperature() {
        return currentTemperature;
    }

    @Override
    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;

        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
        System.out.println("Added new observer");
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
        System.out.println("Removed observer");
    }

    @Override
    public void notifyObservers() {
        if(!observers.isEmpty()) {
            System.out.println("Notifying observers");
            observers.forEach(IObserver::update);
        }
    }
}
