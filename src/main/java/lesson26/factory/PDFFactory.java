package lesson26.factory;

import lesson26.factory.entity.Document;
import lesson26.factory.entity.PDFDocument;

public class PDFFactory implements Factory {
    @Override
    public Document getDocument() {
        return new PDFDocument();
    }

    //other factory method..
}
