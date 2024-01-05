package GB_HW.Java_Development_Kit.Lesson4;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * - Табельный номер
 * - Номер телефона
 * - Имя
 * - Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {
        WorkerCatalog catalog = new WorkerCatalog();
        catalog.addWorker(
                new Worker(
                        101,
                        "89009009090",
                        "Иванов Иван Иванович",
                        10));
        catalog.addWorker(
                new Worker(
                        102,
                        "89019019191",
                        "Петров Петр Петрович",
                        11));
        catalog.addWorker(
                new Worker(
                        103,
                        "89029029292",
                        "Сидоров Сидр Сидорович",
                        12));
        catalog.addWorker(
                new Worker(
                        104,
                        "89039039393",
                        "Волков Сергей Сергеевич",
                        13));
        catalog.addWorker(
                new Worker(
                        105,
                        "89049049494",
                        "Алексеев Алексей Алексеевич",
                        14));
        catalog.addWorker(
                new Worker(
                        106,
                        "89059059595",
                        "Козлов Иван Петрович",
                        15));

        System.out.println("============ Сотрудники добавленные с каталог ============");
        System.out.println(catalog.printCatalog());

        System.out.println("\n============ Получение сотрудника по стажу ============");
        System.out.println("Сотрудники со стажем менее 12 лет: " +
                catalog.findByFromMinExperience(12).toString() + "\n");
        System.out.println("Сотрудники со стажем более 12 лет: " +
                catalog.findByFromMaxExperience(12).toString() + "\n");
        System.out.println("Сотрудники со стажем равным 12 годам: " +
                catalog.findByExperience(12).toString() + "\n");

        System.out.println("\n============ Получение сотрудника по номеру телефона ============");
        System.out.println("Получение сотрудника с номером 89019019191: " + catalog.findByPhoneNumber("89019019191"));

        System.out.println("\n============ Получение сотрудника по табельному номеру ============");
        System.out.println("Получение сотрудника с номером 103: " + catalog.findByPersonnelNumber(103));
    }
}