package org.lld.solid.lsp.bad;

public class Client {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();
        file.write();  // throws an exception
    }
}
