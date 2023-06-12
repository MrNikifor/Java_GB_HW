package GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.Controllers;

import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.StudentDomen.Emploee;
import GB_HW.Java_OOP.Seminar3_4_StudentStudentServiceApp.SyudentServise.EmploeeService;
// создадим контроллер выполнения логики работ работников
public class EmploeeController implements iPersonController<Emploee>{
    private final EmploeeService empService = new EmploeeService();
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }
    static public <T extends Emploee> void paySalary(T person){
        System.out.println(person.getFirstName() + " выплачена зарплата 50000р");
    }

}
