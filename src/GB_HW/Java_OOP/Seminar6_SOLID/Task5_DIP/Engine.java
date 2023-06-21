package GB_HW.Java_OOP.Seminar6_SOLID.Task5_DIP;

public class Engine extends Car {
    public Engine(Engine engine) {
        super(engine);
    }

    public void start(){
        this.getEngine().start();
    };
}
