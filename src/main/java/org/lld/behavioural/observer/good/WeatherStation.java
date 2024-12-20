package org.lld.behavioural.observer.good;

public class WeatherStation {
    private double temperature;
    private final TemperatureManager temperatureManager;

    WeatherStation(double temperature) {
        this.temperatureManager = new TemperatureManager();
        this.temperature = temperature;
    }

    TemperatureManager getTemperatureManager() {
        return temperatureManager;
    }

    public void applyWinters() {
        temperature -= 20;
        System.out.println("Temperature on earth is: " + temperature);
        temperatureManager.notifyObservers(temperature);
    }

    public void applySummers() {
        temperature += 30;
        System.out.println("Temperature on earth is: " + temperature);
        temperatureManager.notifyObservers(temperature);
    }

    public void increaseTemperature() {
        temperature += 5;
        System.out.println("Temperature on earth is: " + temperature);
        temperatureManager.notifyObservers(temperature);
    }

    public void decreaseTemperature() {
        temperature -= 5;
        System.out.println("Temperature on earth is: " + temperature);
        temperatureManager.notifyObservers(temperature);
    }
}
