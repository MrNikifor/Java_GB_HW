package GB_HW.Java_Junior.Seminar2_ReflectionAPI;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void makeSound();

}
