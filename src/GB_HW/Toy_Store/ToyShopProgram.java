package GB_HW.Toy_Store;
//В этой программе используются принципы SOLID (Single Responsibility, Open-Closed, Liskov Substitution,
//        Interface Segregation,Dependency Inversion). Каждый класс отвечает только за свою функциональность,
//        а взаимодействие с игрушками и магазином происходит через интерфейсы. Такой подход позволяет легко
//        добавлять новые типы игрушек или расширять функциональность магазина, не изменяя существующий код.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Класс, отвечающий за взаимодействие с пользователем
public class ToyShopProgram {
    public static void main(String[] args) {
        ToyStore toyStore = new SimpleToyStore();

        // Добавление игрушек в магазин
        toyStore.addToy(new Doll("Кукла", 15.0));
        toyStore.addToy(new Car("Автомобиль", 20.0));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Магазин игрушек");
            System.out.println("1. Посмотреть список игрушек");
            System.out.println("2. Купить игрушку");
            System.out.println("3. Показать общую выручку");
            System.out.println("0. Выйти");
            System.out.print("Введите ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Список игрушек в магазине:");
                    for (Toy toy : getToys(toyStore)) {
                        System.out.println(toy.getName() + " - " + toy.getPrice());
                    }
                    System.out.println();
                    break;
                case 2:
                    scanner.nextLine(); // Чтение пустой строки после ввода числа
                    System.out.print("Введите название игрушки для покупки: ");
                    String toyName = scanner.nextLine();
                    toyStore.sellToy(toyName);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Общая выручка магазина: " + toyStore.getTotalRevenue());
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    System.out.println();
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    // Метод для получения списка игрушек из магазина
    private static List<Toy> getToys(ToyStore toyStore) {
        List<Toy> toys = new ArrayList<>();
        for (Toy toy : toys) {
            toys.add(toy);
        }
        return toys;
    }

}
