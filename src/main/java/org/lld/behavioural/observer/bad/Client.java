package org.lld.behavioural.observer.bad;

class DisplayDevice {
    private String name;

    DisplayDevice(String name) {
        this.name = name;
    }
    public void showTemperature(double temp) {
        System.out.println("current temperature for " + name + " is " + temp);
    }
}
class WeatherStation {
    private double temperature;
    private DisplayDevice displayDevice;

    WeatherStation() {
        this.temperature = 50.0;
    }

    public void setDisplayDevice(DisplayDevice device) {
        this.displayDevice = device;
    }

    public void applyWinters() {
        temperature -= 20;
        notifyDevice();
    }

    public void applySummers() {
        temperature += 30;
        notifyDevice();
    }

    public void notifyDevice() {
        displayDevice.showTemperature(temperature);
    }
}
public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayDevice device = new DisplayDevice("wallClock");
        weatherStation.setDisplayDevice(device);
        weatherStation.applySummers();
        weatherStation.applySummers();
        weatherStation.applyWinters();
    }

}
