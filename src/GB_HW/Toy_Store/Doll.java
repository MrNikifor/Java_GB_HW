package GB_HW.Toy_Store;
// Реализация интерфейса Toy для конкретной игрушки
public class Doll implements FunctionToy{
    private String name;
    private double price;

    public Doll(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
