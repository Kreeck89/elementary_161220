package lesson26.factory.entity;

public class PDFDocument implements Document {
    @Override
    public void print() {
        System.out.println("pdf document");
    }
}
