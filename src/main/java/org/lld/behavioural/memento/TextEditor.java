package org.lld.behavioural.memento;

public class TextEditor {
    private String content = ""; // state

    public void write(String text) {
        this.content += text + "\n";
    }

    public void print() {
        System.out.println(this.content);
    }

    public Memento saveState() {
        return new Memento(content);
    }

    public void restoreState(Memento memento) {
        this.content = memento.content;
    }

    public static class Memento {
        private final String content;

        public Memento(String content) {
            this.content = content;
        }
    }
}