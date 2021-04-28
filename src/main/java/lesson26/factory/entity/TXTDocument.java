package lesson26.factory.entity;

public class TXTDocument implements Document {
    @Override
    public void print() {
        System.out.println("txt document");
    }
}
