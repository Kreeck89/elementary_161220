package lesson20.interfaceExample;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    void test();

    static void print() {
        //can be in FunctionalInterface
    }

    default void test2() {
        //can be in FunctionalInterface
    }
//
//    void print(); //CANT'T be in FunctionalInterface!!!!!
//
//    String cast(Integer integer); //CANT'T be in FunctionalInterface!!!!!
}
