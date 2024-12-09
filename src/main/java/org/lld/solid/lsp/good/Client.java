package org.lld.solid.lsp.good;

public class Client {

    public static void readFile(ReadableFile file) {
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readOnlyFile = new ReadOnlyFile();
        ReadableFile genericFile = new WritableFile();
        readOnlyFile.read();
        // genericFile.write(); // error: because reference is of ReadableFile even though
        // the object that ref points to is of type Writable.
        // So to use methods present with the actual object its pointing to,
        // we should use reference of the Writable class OR type cast the reference to
        // WritableFile.
        ((WritableFile) genericFile).write();  // make sure the object is actually of the type we are casting to.
        // or we can use WritableFile w = new WritableFile();

        readFile(readOnlyFile);
        readFile(genericFile);
        // Method accepts parent class object, but passing it with child object will also be fine => LSP followed
    }
}
