package org.lld.solid.isp.good;

public class Client {
    public static void main(String[] args) {
        Document doc = new Document();
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(doc); // only has print method because of following ISP
        MultiPurposePrinter multiPurposePrinter = new MultiPurposePrinter();
        multiPurposePrinter.copy(doc);
        multiPurposePrinter.scan(doc);
        multiPurposePrinter.print(doc);  // has all three methods
    }
}
