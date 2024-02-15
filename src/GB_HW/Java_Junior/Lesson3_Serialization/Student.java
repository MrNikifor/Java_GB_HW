package GB_HW.Java_Junior.Lesson3_Serialization;

public class Student {
    private String name;
    private int age;
    transient double GTA;

    public Student(String name, int age, double GTA) {
        this.name = name;
        this.age = age;
        this.GTA = GTA;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGTA() {
        return GTA;
    }
}
