package GB_HW.Java_OOP.Seminar6_SOLID.Task5_DIP;
/*5) Переписать код в соответствии с Dependency Inversion Principle:
public class Car {
    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
public class PetrolEngine {
    public void start() {
    }
}*/
// Решение: Немного запутался....
public class Car {
   private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
