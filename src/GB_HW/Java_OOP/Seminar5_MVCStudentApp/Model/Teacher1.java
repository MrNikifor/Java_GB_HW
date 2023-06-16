package GB_HW.Java_OOP.Seminar5_MVCStudentApp.Model;



public class Teacher1 extends Person1 implements Comparable<Teacher1> {

    private int teacherId1;
    private String acadDegree;


    public Teacher1(String firstName, String secondName, int age, int teacherId1, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = this.acadDegree;
    }

    public int getTeacherId1() {
        return teacherId1;
    }

    public void setTeacherId1(int teacherId) {
        this.teacherId1 = teacherId1;
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
                ", teacherId=" + teacherId1 +
                "acadDegree=" + acadDegree +
                '}';
    }

    // переопределим метод compareTo интерфейса Comparable для сортировки по teacherId
    @Override
    public int compareTo(Teacher1 o) {
        return (int) (this.teacherId1 - o.teacherId1);
    }

}
