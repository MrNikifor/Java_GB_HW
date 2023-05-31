package GB_HW.Java_API.Seminar5.Task2;

import java.util.Arrays;
/*
      В данном примере создается класс HeapSort, который содержит методы heapSort() и heapify() для реализации
    алгоритма пирамидальной сортировки. Метод heapSort() выполняет построение max-кучи (max-heap)
    и последующую перестройку кучи с сортировкой. Метод heapify() реализует процедуру "всплытия" элемента в куче.
    В методе main() приведен пример использования HeapSort, где создается исходный массив, выводится на экран,
    производится сортировка пирамидальным методом и выводится отсортированный массив.
         */
public class HeapSort {
    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение max-кучи (max-heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Перестройка max-кучи и сортировка
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Если правый потомок больше корня
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Если наибольший элемент не является корнем
        if (largest != i) {
            // Меняем местами корень и наибольший элемент
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Рекурсивно вызываем heapify для поддерева
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 9, 1, 5, 10, 7, 3, 8, 4};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        heapSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}