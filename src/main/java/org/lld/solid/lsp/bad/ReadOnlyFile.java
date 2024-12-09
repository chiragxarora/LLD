package org.lld.solid.lsp.bad;

public class ReadOnlyFile extends File{
    @Override
    public void write() {
        throw new UnsupportedOperationException("Can't write to a read only file!");
    }
}
