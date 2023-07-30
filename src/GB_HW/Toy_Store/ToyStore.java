package GB_HW.Toy_Store;
// Интерфейс для определения функциональности магазина игрушек
public interface ToyStore  {
    void addToy(Toy toy);
    void sellToy(String name);
    double getTotalRevenue();

}
