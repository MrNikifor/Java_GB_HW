package GB_HW.Java_Development_Kit.Lesson4;


import java.util.ArrayList;
import java.util.List;

/**
 * Каталог сотрудников.
 */
public class WorkerCatalog {

    private final List<Worker> workers;

    // Инициализация списка сотрудников.
    {
        workers = new ArrayList<>();
    }

    /**
     * Добавление работника в справочник.
     *
     * @param worker объект работника.
     */
    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    /**
     * Поиск работника по табельному номеру.
     *
     * @param number табельный номер.
     * @return объект работника при нахождении, null - при отсутствии работника.
     */
    public Worker findByPersonnelNumber(int number) {
        return workers.stream().filter(worker ->
                worker.getPersonnelNumber() == number).findFirst().orElse(null);
    }

    /**
     * Поиск работника по номеру телефона.
     *
     * @param phoneNumber номер телефона.
     * @return список найденных сотрудников.
     */
    public List<Worker> findByPhoneNumber(String phoneNumber) {
        return workers.stream().filter(worker -> phoneNumber.equals(worker.getPhoneNumber())).toList();
    }

    /**
     * Поиск сотрудников со стажем больше переданного значения.
     *
     * @param experience минимальный стаж.
     * @return список сотрудников.
     */
    public List<Worker> findByFromMinExperience(int experience) {
        return workers.stream().filter(worker -> worker.getExperience() < experience).toList();
    }

    /**
     * Поиск сотрудников со стажем меньше переданного значения.
     *
     * @param experience максимальный стаж.
     * @return список сотрудников.
     */
    public List<Worker> findByFromMaxExperience(int experience) {
        return workers.stream().filter(worker -> worker.getExperience() > experience).toList();
    }

    /**
     * Поиск сотрудников со стажем равным переданному значению.
     *
     * @param experience стаж работника.
     * @return список сотрудников.
     */
    public List<Worker> findByExperience(int experience) {
        return workers.stream().filter(worker -> worker.getExperience() == experience).toList();
    }

    public String printCatalog() {
        StringBuilder builder = new StringBuilder();
        workers.forEach(worker -> builder.append(worker.toString()).append("\n"));
        return builder.toString();
    }
}
