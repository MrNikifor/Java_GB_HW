package GB_HW.Java_OOP.Seminar1_VendingMachines.VendingMachines;

import GB_HW.Java_OOP.Seminar1_VendingMachines.Domen.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private List<Product> products;

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }



}
