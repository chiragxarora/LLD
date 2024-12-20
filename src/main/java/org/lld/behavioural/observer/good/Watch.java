package org.lld.behavioural.observer.good;

public class Watch implements TemperatureObserver{

    @Override
    public void update(double temperature) {
        System.out.println("Temperature in watch is " + temperature);
    }
}
