OBSERVER PATTERN

It lets us define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

1. Publisher: It has an interesting state, and it is going to notify other objects about changes in its state.

2. Subscriber: Other objects that want to track changes to publisher's state

A publisher may not know the subscribers so to effectively notify all the subscribers, all subscribers implement an interface via which publisher communicates.

Publisher contains a list of subscribers to whom it notifies. And each subscriber can subscribe/unsubscribe at will and likewise it will be added/removed to/from the list of subscribers its having.

Publisher can also delegate the subscription/un-subscription/notification behavior to a helper class using composition. That helper class can also be upgraded to serve as centralized event dispatcher letting any object act as a publisher.

Usually publisher sends some data/context via arguments in update method which all subscribers have implemented.
But we can also allow subscribers to fetch whatever info they need themselves, for this, publisher needs to pass instance of itself in the update method argument.