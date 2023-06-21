package GB_HW.Java_OOP.Seminar6_SOLID.Task3_ISP;

public class Circle implements CalculatingArea {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
