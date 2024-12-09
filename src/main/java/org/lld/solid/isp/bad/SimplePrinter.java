package org.lld.solid.isp.bad;

public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document!");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("This printer does not support scanning!");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("This printer does not support copying!");
    }
}
