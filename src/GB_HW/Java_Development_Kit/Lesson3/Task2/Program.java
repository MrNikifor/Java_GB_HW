package GB_HW.Java_Development_Kit.Lesson3.Task2;

/**
 * Напишите обобщенный метод compareArrays(),
 * который принимает два массива и возвращает true, если они одинаковые,
 * и false в противном случае.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа
 */
public class Program {

    public static <T, S> boolean compareArrays(T[] arr1, S[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false;
            }
        }
        return true;
    }

}