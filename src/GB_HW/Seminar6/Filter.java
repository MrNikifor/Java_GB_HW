package GB_HW.Seminar6;

import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Linux", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "macOS", "Черный");
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(l1, l2, l3, l4));

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        System.out.println("4 - сортировать по цвету");
        try(Scanner sc = new Scanner(System.in);) {
            Integer choice = sc.nextInt();
            if (choice == 1) {
                System.out.printf("Введите значение ОЗУ: ");
                int ram = sc.nextInt();
                int count = 0;
                for (Laptop lap : laptops) {
                    if (lap.getRam() >= ram) {
                        count++;
                        System.out.println(lap);
                    }
                }
                if (count == 0) {
                    System.out.println("Таких ноутбуков нет!");
                }
            } else if (choice == 2) {
                System.out.printf("Введите значение SSD: ");
                int ssd = sc.nextInt();
                int count = 0;
                for (Laptop lap : laptops) {
                    if (lap.getSsd() >= ssd) {
                        count++;
                        System.out.println(lap);
                    }
                }
                 if (count == 0) {
                    System.out.println("Таких ноутбуков нет!");
                }
            } else if (choice == 3) {
                System.out.printf("Введите значение OS: ");
                String os = sc.next();
                int count = 0;
                for (Laptop lap : laptops) {
                    if (lap.getOs().equals(os)) {
                        count++;
                        System.out.println(lap);
                    }
                }if (count == 0) {
                    System.out.println("Таких ноутбуков нет!");
                }
            } else if (choice == 4) {
                System.out.printf("Введите цвет ноутбука: ");
                String color = sc.next();
                int count = 0;
                for (Laptop lap : laptops) {
                    if (lap.getColor().equals(color)) {
                        count++;
                        System.out.println(lap);
                    }
                }if (count == 0) {
                    System.out.println("Таких ноутбуков нет!");
                }
            }
        }
    }
}
