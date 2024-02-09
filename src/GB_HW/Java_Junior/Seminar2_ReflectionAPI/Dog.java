package GB_HW.Java_Junior.Seminar2_ReflectionAPI;

public class Dog extends Animals implements iEat{
    private String breed;
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    protected void makeSound() {
        System.out.println("Gav! Gav!");
    }

    public void guard() {
        System.out.println("Собака сторожит...");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест...");
    }
}
