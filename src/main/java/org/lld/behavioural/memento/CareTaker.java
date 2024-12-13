package org.lld.behavioural.memento;

import java.util.Stack;

public class CareTaker {
    private final TextEditor textEditor;
    private final Stack<TextEditor.Memento> history = new Stack<>();

    public CareTaker(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void save() {
        TextEditor.Memento memento = textEditor.saveState();
        history.push(memento);
    }

    public void undo() {
        if(!history.empty()) {
            history.pop();
            textEditor.restoreState(history.peek());
        }
    }

}
