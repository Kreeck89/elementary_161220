package lesson26.factory.service;

import lesson26.factory.PDFFactory;
import lesson26.factory.TXTFactory;
import lesson26.factory.entity.Document;

public class FileFactoryServiceImpl implements FileFactoryService {
    @Override
    public Document getDocumentByKey(String documentKey) {
        switch (documentKey) {
            case "TXT":
                return new TXTFactory().getDocument();
            case "PDF":
                return new PDFFactory().getDocument();
            default:
                return null;
        }
    }
}
