package lesson5;

import java.util.Objects;

public class Parrot {
    private String name;
    private String type;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age &&
                name.equals(parrot.name) &&
                type.equals(parrot.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
