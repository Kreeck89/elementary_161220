package lesson26.factory.service;

import lesson26.factory.entity.Document;

public interface FileFactoryService {
    public Document getDocumentByKey(String documentKey);
}
