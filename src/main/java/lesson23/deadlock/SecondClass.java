package lesson23.deadlock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecondClass {
    private FirstClass firstClass;

    public synchronized String getString() {
        return "String from Second Class";
    }

    public synchronized String getStringFromFirstClass() {
        return firstClass.getString();
    }
}
