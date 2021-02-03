package lesson3.generics;

public class Calculate<T,U extends Number,W extends Number> {
    private U first;
    private W second;
    private T third;
    private String string;

    public double getSumResult(U u, W w) {
        try {
            return u.doubleValue() + w.doubleValue();
        } catch (Exception e) {
            System.out.println("Wrong arguments");
        }

        return 0;
    }

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public W getSecond() {
        return second;
    }

    public void setSecond(W second) {
        this.second = second;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }
}
