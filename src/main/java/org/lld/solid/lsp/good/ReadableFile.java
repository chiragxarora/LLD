package org.lld.solid.lsp.good;

public class ReadableFile implements Readable{

    @Override
    public void read() {
        System.out.println("Reading from the file!");
    }
}