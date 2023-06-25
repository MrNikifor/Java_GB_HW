package GB_HW.Java_OOP.Seminar7;

import GB_HW.Java_OOP.Seminar7.Entity.ComplexNumber;
import GB_HW.Java_OOP.Seminar7.Factory.Calculate;
import GB_HW.Java_OOP.Seminar7.Factory.CalculatorFactory;

//Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
//        Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
//        Соблюдать принципы SOLID, паттерны проектирования.
public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2,4);
        ComplexNumber number2 = new ComplexNumber(4,2);
        Calculate add = CalculatorFactory.getInstance("ADD");
        add.calculation(number1, number2);
        Calculate sub = CalculatorFactory.getInstance("SUB");
        sub.calculation(number1, number2);
        Calculate div = CalculatorFactory.getInstance("DIV");
        div.calculation(number1, number2);
        Calculate mult = CalculatorFactory.getInstance("MULT");
        mult.calculation(number1, number2);
    }
}
