package lesson1;

import lesson1.entity.Cat;
import lesson1.entity.Persian;
import lesson1.entity.Siam;

public class Main {
    public static final String SOME_FIELD = "someField";

    public static void main(String[] args) {
//        Cat cat = new Persian("Alex");
//        System.out.println(cat.getName());
//
//        Cat cat1 = new Persian("Alexa", "Persian");
////        new Cat()
//
//
//        PrintHelper.print("Hello world");
//
//        final Cat cat2 = new Siam();
////        cat2 = new Cat();
//        System.out.println(cat2.getAge());
//        cat2.setAge(12);
//        System.out.println(cat2.getAge());
//
//        System.out.println(Constant.SOME_FIELD_3);

        Persian persian = new Persian();
        Siam siam = new Siam();
        voice(siam);
        voice(persian);
    }

//    private static void voicePersian(Persian persian) {
//        persian.voice();
//    }
//
//    private static void voiceSiam(Siam siam) {
//        siam.voice();
//    }

    private static void voice(Cat cat) {
        cat.voice();
        if (cat instanceof Siam) {
            ((Siam) cat).eat();
        }

    }
}
