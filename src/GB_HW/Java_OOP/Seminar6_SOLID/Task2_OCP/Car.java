package GB_HW.Java_OOP.Seminar6_SOLID.Task2_OCP;

public class Car {
    public double calculateAllowedSpeed(Vehicle vehicle) {
       return vehicle.getMaxSpeed() * 0.8;
    }
}
