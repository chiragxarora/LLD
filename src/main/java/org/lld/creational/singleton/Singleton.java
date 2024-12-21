package org.lld.creational.singleton;

public class Singleton {
    private Singleton() {
    }

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;  // first time LazyHolder was referenced, thus this is the first time LazyHolder will be loaded by JVM
    }
}
