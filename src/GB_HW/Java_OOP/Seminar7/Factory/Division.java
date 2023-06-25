package GB_HW.Java_OOP.Seminar7.Factory;

import GB_HW.Java_OOP.Seminar7.Entity.ComplexNumber;

public class Division implements Calculate{
    @Override
    public void calculation(ComplexNumber num1, ComplexNumber num2) {
        double real1 = num1.getReal();
        double real2 = num2.getReal();
        double image1 = num1.getImaginary();
        double image2 = num2.getImaginary();
        double newReal = (real1*real2 + image1*image2)/(real2*real2 + image2*image2);
        double newImage = (image1*real2 - real1*image2)/(real2*real2 + image2*image2);
        System.out.println(new ComplexNumber(newReal,newImage));
    }
}
//    Complex div (Комплекс а) {// Делим комплексные числа
//        double real2 = a.getReal();
//        double image2 = a.getImage();
//        double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
//        double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
//        Complex result = new Complex(newReal,newImage);
//        return result;
