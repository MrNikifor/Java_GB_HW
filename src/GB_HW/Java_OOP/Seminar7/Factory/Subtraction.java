package GB_HW.Java_OOP.Seminar7.Factory;

import GB_HW.Java_OOP.Seminar7.Entity.ComplexNumber;

public class Subtraction implements Calculate {
    @Override
    public void calculation(ComplexNumber num1, ComplexNumber num2) {
        double real1 = num1.getReal();
        double real2 = num2.getReal();
        double imaginary1 = num1.getImaginary();
        double imaginary2 = num2.getImaginary();
        double newReal = real1 - real2;
        double newImaginary = imaginary1 - imaginary2;
        System.out.println(new ComplexNumber(newReal,newImaginary));
    }
}
