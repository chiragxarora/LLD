package org.lld.behavioural.observer.good;

import java.util.HashSet;
import java.util.Set;

public class TemperatureManager {
    private final Set<TemperatureObserver> temperatureObserver;

    public TemperatureManager() {
        temperatureObserver = new HashSet<>();
    }
    public void addObserver(TemperatureObserver t) {
        temperatureObserver.add(t);
    }

    public void removeObserver(TemperatureObserver t) {
        temperatureObserver.remove(t);
    }

    public void notifyObservers(double temperature) {
        for(TemperatureObserver t : temperatureObserver) {
            t.update(temperature);
        }
    }
}
