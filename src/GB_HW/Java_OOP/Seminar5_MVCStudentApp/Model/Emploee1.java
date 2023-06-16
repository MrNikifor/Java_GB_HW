package GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model;

// класс работников

public class Emploee1 extends Person1 implements Comparable<Emploee1> {
    private int emploeeId1;
    private String special;

    public Emploee1(String firstName, String secondName, int age, int emploeeId1, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }

    public int getEmploeeId1() {
        return emploeeId1;
    }

    public void setEmploeeId1(int emploeeId1) {
        this.emploeeId1 = emploeeId1;
    }

    public String getSpecial1() {
        return special;
    }

    public void setSpecial1(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", emploeeId=" + emploeeId1 +
                "special=" + special +
                '}';
    }

    @Override
    public int compareTo(Emploee1 o) {
        return (int) (this.emploeeId1 - o.emploeeId1);
    }
}