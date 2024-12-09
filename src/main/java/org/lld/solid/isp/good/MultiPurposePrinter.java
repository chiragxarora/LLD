package org.lld.solid.isp.good;

public class MultiPurposePrinter implements Printer, Copier, Scanner{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document!");
    }
    @Override
    public void copy(Document doc) {
        System.out.println("Copying document!");
    }
    @Override
    public void scan(Document doc) {
        System.out.println("Scanning document!");
    }
}
