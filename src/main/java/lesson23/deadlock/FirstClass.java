package lesson23.deadlock;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class FirstClass {
    private SecondClass secondClass;

    public synchronized String getString() {
        return "String from First Class";
    }

    @SneakyThrows
    public synchronized String getStringFromSecondClass() {
        Thread.sleep(10);
        return secondClass.getString();
    }
}
