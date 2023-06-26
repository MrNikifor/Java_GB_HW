package GB_HW.Toy_Store;

import java.util.ArrayList;
import java.util.List;

public class SimpleToyStore implements ToyStore {
    private List<FunctionToy> toys;
    private double totalRevenue;

    public SimpleToyStore() {
        toys = new ArrayList<>();
        totalRevenue = 0.0;
    }

    private FunctionToy findToy(String name) {
        for (FunctionToy toy : toys) {
            if (toy.getName().equalsIgnoreCase(name)) {
                return toy;
            }
        }
        return null;
    }

    @Override
    public void addToy(FunctionToy toy) {
        toys.add(toy);
    }

    @Override
    public void sellToy(String name) {
        FunctionToy toy = findToy(name);
        if (toy != null) {
            toys.remove(toy);
            totalRevenue += toy.getPrice();
            System.out.println("Продана игрушка: " + toy.getName());
        } else {
            System.out.println("Такой игрушки нет в наличии.");
        }
    }

    @Override
    public double getTotalRevenue() {
        return totalRevenue;
    }
}
