STRATEGY PATTERN

It's a behavioral design pattern that lets us define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. Promotes runtime polymorphism!

1. Context: Original class which needs to perform a common task which can be done in multiple ways.

2. Strategy: Individual class which implements an algorithm to complete the common task for context class.

Context must have a reference to one of the strategies, and it delegates the work to a linked strategy instead of doing it on its own.

Context is not responsible for selecting an appropriate algorithm, instead the client passes the desired strategy to the context at runtime.

Context becomes independent of concrete strategies and we can add new strategies without changing context or other existing strategies.

The Strategy interface is common to all concrete strategies. It declares a method the context uses to execute a strategy.