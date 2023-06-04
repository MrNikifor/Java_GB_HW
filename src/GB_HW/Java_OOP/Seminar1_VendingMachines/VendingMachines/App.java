package GB_HW.Java_OOP.Seminar1_VendingMachines.VendingMachines;

import GB_HW.Java_OOP.Seminar1_VendingMachines.Domen.Bottle;
import GB_HW.Java_OOP.Seminar1_VendingMachines.Domen.HotDrink;
import GB_HW.Java_OOP.Seminar1_VendingMachines.Domen.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product chips = new Product(1, "Lays", "Чипсы", 59);
        chips.setPrice(98);
        Product drinkCl = new Bottle(2, "Cola", "Water", 70, 500);
        Product drinkWt = new HotDrink(5,"GreenTea","HotDrink",65,90);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(chips);
        iMachine.addProduct(drinkCl);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59));
        iMachine.addProduct(new Bottle(4, "Water", "Water", 170, 1500));
        iMachine.addProduct(new HotDrink(6,"Espresso","Coffee",50,95));

        for(Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }


    }
}
