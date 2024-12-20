package org.lld.behavioural.observer.good;

public class Mobile implements TemperatureObserver{

    @Override
    public void update(double temperature) {
        System.out.println("Temperature in mobile is " + temperature);
    }
}
