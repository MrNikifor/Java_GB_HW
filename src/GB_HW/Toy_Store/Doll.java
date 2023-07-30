package GB_HW.Toy_Store;
// Реализация интерфейса Toy для конкретной игрушки
public class Doll implements Toy {
    private String name;
    private double price;

    public Doll(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
