package GB_HW.Java_Core.Lesson3;

abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    /** Абстрактный метод расчёта среднемесячной заработной платы
     *
     */
    public abstract double calculateAverageSalary();

    public String getName() {
        return name;
    }
}
