package lesson1.entity;

public abstract class Cat {
    private String name;
    private String type;
    private int age;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

//    public Cat(String type, String name) {
//        this.type = type;
//        this.name = name;
//    }

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

    public abstract void voice();
}
