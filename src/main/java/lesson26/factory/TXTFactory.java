package lesson26.factory;

import lesson26.factory.entity.Document;
import lesson26.factory.entity.TXTDocument;

public class TXTFactory implements Factory {
    @Override
    public Document getDocument() {
        return new TXTDocument();
    }
}
