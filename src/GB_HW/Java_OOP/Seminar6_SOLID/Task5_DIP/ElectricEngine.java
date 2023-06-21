package GB_HW.Java_OOP.Seminar6_SOLID.Task5_DIP;

public class ElectricEngine extends Engine {

    public ElectricEngine(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        this.getEngine().start();
    }
}
