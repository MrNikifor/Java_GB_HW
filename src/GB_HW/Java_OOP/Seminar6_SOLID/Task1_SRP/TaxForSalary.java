package GB_HW.Java_OOP.Seminar6_SOLID.Task1_SRP;

public class TaxForSalary {
    public int calculateNetSalary() {
        Employee emp = new Employee("Vitya",1987,60000);
        int tax = (int) (emp.getBaseSalary() * 0.25);//calculate in otherway
        return emp.getBaseSalary() - tax;
    }
}
