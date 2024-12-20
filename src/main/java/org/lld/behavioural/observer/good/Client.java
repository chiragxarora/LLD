package org.lld.behavioural.observer.good;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(50.0);
        WallClock wallClock = new WallClock();
        Mobile mobile = new Mobile();
        Watch watch = new Watch();
        System.out.println("Increasing temperature!");
        weatherStation.increaseTemperature();
        weatherStation.applySummers();
        System.out.println("wall clock started observing!");
        weatherStation.getTemperatureManager().addObserver(wallClock);
        weatherStation.decreaseTemperature();
        System.out.println("mobile started observing!");
        weatherStation.getTemperatureManager().addObserver(mobile);
        weatherStation.decreaseTemperature();
        System.out.println("watch started observing!");
        weatherStation.getTemperatureManager().addObserver(watch);
        weatherStation.applySummers();
        System.out.println("wall clock stopped observing");
        weatherStation.getTemperatureManager().removeObserver(wallClock);
        weatherStation.decreaseTemperature();
    }
}
