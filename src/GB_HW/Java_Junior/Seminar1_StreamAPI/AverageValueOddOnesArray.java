package GB_HW.Java_Junior.Seminar1_StreamAPI;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageValueOddOnesArray {
    public static void main(String[] args) {
        double[] arrd = {1,2,3,4,5};
        System.out.println(AverOddArr(arrd));
    }
    public static OptionalDouble AverOddArr(double[] arr){
        return Arrays.stream(arr).filter(n -> n % 2 == 0)
                .average();
    }
}
