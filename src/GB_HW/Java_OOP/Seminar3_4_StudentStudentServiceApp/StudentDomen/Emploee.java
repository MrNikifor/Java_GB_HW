package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen;

public class Emploee extends Person implements Comparable<Emploee> {
    private int emploeeId;
    private String special;

    public Emploee(String firstName, String secondName, int age, int emploeeId, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }

    public int getEmploeeId() {
        return emploeeId;
    }

    public void setEmploeeId(int emploeeId) {
        this.emploeeId = emploeeId;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", emploeeId=" + emploeeId +
                "special=" + special +
                '}';
    }

    @Override
    public int compareTo(Emploee o) {
        return (int) (this.emploeeId - o.emploeeId);
    }
}
