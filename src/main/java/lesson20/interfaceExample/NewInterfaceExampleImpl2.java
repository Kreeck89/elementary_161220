package lesson20.interfaceExample;

public class NewInterfaceExampleImpl2 implements NewInterfaceExample, NewInterfaceExample2 {

    @Override
    public void print() {
        System.out.println("Some logic here....");
    }

    @Override
    public void defaultPrint(String string) {
        System.out.println("DON'T SUPPORT");
    }
}
