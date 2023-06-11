package GB_HW.Java_OOP.Seminar3_StudentStudentServiceApp.StudentDomen;
// создадим класс студентов унаследовавшихся от User и имплементируем интерфейс Comparable для сортировки студентов
public class Student extends User implements Comparable<Student> {
    protected long studentId;

    public Student(String firstName, String secondName, int age, long studentId) {
        super(firstName, secondName, age);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                "studentId=" + studentId +
                '}';
    }
          // переопределим метод compareTo интерфейса Comparable для сортировки по studentId
    @Override
    public int compareTo(Student o) {
        return (int) (this.studentId - o.studentId);
    }
}
