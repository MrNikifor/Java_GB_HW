package GB_HW.Java_Junior.Seminar2_ReflectionAPI;

public class Cat extends Animals implements iEat{
    private String breed;

    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    protected void makeSound(){
        System.out.println("Myau...");
    }
    public void playing() {
        System.out.println("Кот играется");
    }
    @Override
    public void eat() {
        System.out.println("Кот ест...");
    }

}
