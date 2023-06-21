package GB_HW.Java_OOP.Seminar6_SOLID.Task5_DIP;

public class PetrolEngine extends Engine {

    public PetrolEngine(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        this.getEngine().start();
    }
}
