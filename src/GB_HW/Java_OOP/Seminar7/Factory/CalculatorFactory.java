package GB_HW.Java_OOP.Seminar7.Factory;

public class CalculatorFactory {
    public static Calculate getInstance(String method) {

        if (method.equals("ADD")) {
            return new Sum();
        } else if (method.equals("SUB")) {
            return new Subtraction();
        } else if (method.equals("MULT")) {
            return new Multiplication();
        } else if (method.equals("DIV")) {
            return new Division();
        }

        throw new NullPointerException("Method not found");
    }
}
