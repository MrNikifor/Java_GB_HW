package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen;

public class Teacher extends Person implements Comparable<Teacher> {
    //private int teacherId;
    private int teacherId;
    private String acadDegree;


    public Teacher(String firstName, String secondName, int age, int teacherId, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = this.acadDegree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", teacherId=" + teacherId +
                "acadDegree=" + acadDegree +
                '}';
    }

    // переопределим метод compareTo интерфейса Comparable для сортировки по teacherId
    @Override
    public int compareTo(Teacher o) {
        return (int) (this.teacherId - o.teacherId);
    }

}
