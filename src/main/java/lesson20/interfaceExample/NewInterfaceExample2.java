package lesson20.interfaceExample;

public interface NewInterfaceExample2 {
    void print();

    static void print(String string) {
        System.out.println(string + " " + string);
    }

    default void defaultPrint(String string) {
        System.out.println("NewInterfaceExample2.defaultPrint method: " + string);
    }
}
