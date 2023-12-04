package GB_HW.Java_Core.Lessen1;

import GB_HW.Java_Core.Lessen1.CalcPac.Calculator;
import GB_HW.Java_Core.Lessen1.CalcPac.Result;

public class Start {
    public static void main(String[] args) {
        int res = Calculator.sum(5,5);
        System.out.println(Result.resul(res));
        res = Calculator.diff(15,5);
        System.out.println(Result.resul(res));
        res = Calculator.deriv(2,5);
        System.out.println(Result.resul(res));
        res = Calculator.divis(50,5);
        System.out.println(Result.resul(res));
    }
}
