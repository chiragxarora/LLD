package org.lld.behavioural.observer.good;

public class WallClock implements TemperatureObserver{

    @Override
    public void update(double temperature) {
        System.out.println("Temperature in wall clock is " + temperature);
    }
}
