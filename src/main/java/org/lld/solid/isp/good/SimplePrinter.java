package org.lld.solid.isp.good;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document!");
    }
}
