package models;

public interface IWeatherStation extends IObservable{
    public int getCurrentTemperature();

    public void setCurrentTemperature(int temperature);
}
