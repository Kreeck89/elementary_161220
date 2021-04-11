package lesson21.funcrtionalInterface;

@FunctionalInterface
public interface PredicateInterface<T> {

    boolean test(T t);
}
