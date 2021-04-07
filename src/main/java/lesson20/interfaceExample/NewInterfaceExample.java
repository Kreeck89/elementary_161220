package lesson20.interfaceExample;

public interface NewInterfaceExample extends NewInterfaceExample2 {
    void print();

    static void print(String string) {
        System.out.println(string);
    }

    default void defaultPrint(String string) {
        System.out.println("NewInterfaceExample.defaultPrint method: " + string);
    }
}
