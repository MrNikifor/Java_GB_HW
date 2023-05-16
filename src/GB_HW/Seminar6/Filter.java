package GB_HW.Seminar6;
import java.util.*;

public class Filter {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");
        System.out.println(l1.toString());

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if(ram >=32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(ram < 32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ram < 16){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ram < 4){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 2){

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if(ssd >=512){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(ssd < 512){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ssd < 256){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ssd < 128){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 3){

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if(os.equals("Windows")){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(os.equals("Windows 10")){
                System.out.printf(l1.toString() + "\n" + l3.toString());
            }else if(os.equals("Windows 11")){
                System.out.printf(l2.toString() + "\n" + l4.toString());
            }else System.out.println("Таких ноутбуков нет!");
            sc1.close();
        }

        sc.close();
    }

}

// Laptop l1 = new Laptop();
// l1.id = 1;
// l1.ram = 2;
// l1.ssd = 128;
// l1.os = "Windows 10 Home Edition";
// l1.color = "Сирененвый";

// Laptop l2 = new Laptop();
// l2.id = 2;
// l2.ram = 4;
// l2.ssd = 256;
// l2.os = "Windows 11 Home Edition";
// l2.color = "Красный";

// Laptop l3 = new Laptop();
// l3.id = 3;
// l3.ram = 32;
// l3.ssd = 512;
// l3.os = "Windows 11 Pro";
// l3.color = "Черный";

// Laptop l4 = new Laptop();
// l4.id = 4;
// l4.ram = 16;
// l4.ssd = 512;
// l4.os = "Windows 10 Home Edition";
// l4.color = "Пурпурный";