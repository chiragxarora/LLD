SINGLETON PATTERN

It's a creational design pattern that lets us ensure that a class has only one instance, while providing a global access point to this instance.

It has 2 main responsibilities:

1. Ensure that a class has just a single instance.
2. Providing a global access point to that instance, and providing actual functionality/behaviour of the class.

Thus it violates Single Responsibility Principle.

There are multiple implementations of singleton pattern:

1. Simple one:
Make private constructor, add a static instance of class and a get instance method which creates instance only when its not created already.

Above implementation needs to be made thread safe so that no two instances are created when two threads concurrently call the getInstance method.

```java
class App { 

    private static App instance;
    
    private App() {}

    public static synchronized App getInstance() {
        if (instance == null) {
            instance = new MySinglton();
        }
        return instance;
    }
}
```

Here we have made the complete method thread safe and thread will keep the lock acquired even after the instance is created.
We can improve its performance by synchronizing only the instance creation logic. // double-checked locking

```java
class App {

    private static App instance;

    private App() {}

    public static App getInstance() {
        if (instance == null) {
            synchronized (App.class) {
                if(instance == null) instance = new MySinglton();
            }
        }
        return instance;
    }
}
```

We can further improve this code by using Bill Pugh Singleton pattern

```java
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
```

Class loading is thread safe, JVM takes care of it:

Because the first time getInstance() is called, the JVM will load the holder class. If another thread calls getInstance() concurrently, the JVM won't load the holder class a second time: it will wait for the first thread to have completed the class loading, and at the end of the loading and initialization of the holder class, both thread will see the holder class properly initialized and thus containing the unique singleton instance.

The above implementations are still prone to various concepts like Reflections, Serialization/Deserialization using which we can still create different instances of the singleton class.

