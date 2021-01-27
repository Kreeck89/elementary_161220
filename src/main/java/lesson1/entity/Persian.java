package lesson1.entity;

public class Persian extends Cat {

    public Persian() {
    }

    public Persian(String name) {
        super(name);
    }

    public Persian(String name, String type) {
        super(name, type);
    }

    @Override
    public void voice() {
        System.out.println("Persian child voice");
    }
}
