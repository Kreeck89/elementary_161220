package lesson26;

import lesson26.builder.Setting;
import lesson26.factory.entity.Document;
import lesson26.factory.service.FileFactoryService;
import lesson26.factory.service.FileFactoryServiceImpl;
import lesson26.prototype.Human;
import lesson26.singleton.Configuration;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //FACTORY EXAMPLE:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What type of document do you want?");
//        String documentKey = scanner.next();
//
//        FileFactoryService fileFactoryService = new FileFactoryServiceImpl();
//        Document document = fileFactoryService.getDocumentByKey(documentKey);
//        if (Objects.nonNull(document)) {
//            document.print();
//        }

        //SINGLETON EXAMPLE:
//        Configuration first = Configuration.instance("FIRST");
//        Configuration second = Configuration.instance("SECOND");
////        new Configuration("Third"); // FORBIDDEN
//        System.out.println("first.getPath(): " + first.getPath());
//        System.out.println("second.getPath(): " + second.getPath());

        //PROTOTYPE EXAMPLE:
        Human human = new Human();
        human.setName("Bob");
        Human cloneHuman = (Human) human.clone();
        System.out.println("human.getName(): " + human.getName());
        System.out.println("cloneHuman.getName(): " + cloneHuman.getName());

        //BUILDER EXAMPLE:
        Setting setting = new Setting.Builder()
                .withPrefix("prefix")
                .withPath("0000")
                .build();
    }
}
