package GB_HW.Java_OOP.Seminar6_SOLID.Task4_LSP;
/*4) Переписать код в соответствии с Liskov Substitution Principle:
public class Rectangle {
    private int width;
    private int height;
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }
    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
}*/ // Решение: Не понимаю принципа поставки задачи!!! Как может наследоваться площадь от прямоугольника?
// Это совсем разные сущьности!Естественно на основании этого наследоваться глупо площади от прямоугольника.
// На основании этого недопонимания не могу решить задачу.
public class Tast {
}
