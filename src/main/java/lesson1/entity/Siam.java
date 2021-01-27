package lesson1.entity;

public class Siam extends Cat {

    @Override
    public void voice() {
        System.out.println("Siam child voice");
    }

    public void eat() {
        System.out.println("Siam eat");
    }
}
