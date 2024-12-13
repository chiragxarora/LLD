MEMENTO PATTERN

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

1. The object whose state we capture is called the "Originator".

2. The originator's snapshot which we store is called "Memento".

3. What manages and stores mementos without modifying them is called "Caretaker".

To save/restore the state we need to have history containing all the states of the originator. But in an ideal scenario, external classes can't read all the data
which might be kept as private in the originator to preserve encapsulation. So external classes cannot and should not create mementos because to create memento,
they will have to read every data member of originator.
Next thing to ensure is, originator should have complete access to memento since it's going to need it while restoring old state using a memento. But outside classes
including the caretaker should not be able to manipulate the state inside the memento.

This can be done by nested classes

In this implementation, the memento class is nested inside the originator. This lets the originator access the fields and methods of the memento, even though they’re declared private.
On the other hand, the caretaker has very limited access to the memento’s fields and methods, which lets it store mementos in a stack but not tamper with their state.
Memento class should be immutable
Common problems it can solve:

1. Where state management is required along with the facilitation of undo/redo functionality
2. State Restoration: games (checkpoints in games), data recovery.

Important:

Note that using the pattern, the originator is relieved of the responsibility to save its state for the client. Instead, the onus is on the client to request a memento from the originator and manage it. The client can at a later point request the originator to restore itself to the state represented by the memento it holds.