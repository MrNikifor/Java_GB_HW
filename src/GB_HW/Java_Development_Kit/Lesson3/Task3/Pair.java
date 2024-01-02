package GB_HW.Java_Development_Kit.Lesson3.Task3;

/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Pair<T, S> {
    private T value1;
    private S value2;

    public Pair(T value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }

    public S getSecond() {
        return value2;
    }

    @Override
    public String toString() {
        return String.format("Значение 1: %s, Значение 2: %s", value1.toString(), value2.toString());
    }
}
