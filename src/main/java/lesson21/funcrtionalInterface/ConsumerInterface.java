package lesson21.funcrtionalInterface;

@FunctionalInterface
public interface ConsumerInterface<T> {

    void accept(T t);
}
