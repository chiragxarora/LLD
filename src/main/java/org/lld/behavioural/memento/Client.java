package org.lld.behavioural.memento;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker(textEditor);
        textEditor.write("My name is Chirag");
        careTaker.save();
        textEditor.write("My last name is Arora");
        careTaker.save();
        textEditor.write("I love coding!");
        careTaker.save();
        textEditor.print();
        System.out.println("doing undo once");
        careTaker.undo();
        textEditor.print();
    }
}
