package org.lld.solid.lsp.good;

public class WritableFile extends ReadableFile implements Writable{
    @Override
    public void write() {
        System.out.println("Writing to the file!");
    }
}
