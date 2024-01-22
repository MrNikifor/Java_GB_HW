package GB_HW.Java_Development_Kit.Lesson5;

import java.util.concurrent.Semaphore;

public class PhilosopherDining {
    // Количество философов
    private final int philosophersCount;
    // Количество приемов пищи
    private final int countOfMeals;

    public PhilosopherDining(int philosophersCount, int countOfMeals) {
        this.philosophersCount = philosophersCount;
        this.countOfMeals = countOfMeals;
    }

    public void startDinner() throws InterruptedException {
        // Создаем массив философов
        Philosopher[] philosophers = new Philosopher[philosophersCount];
        // Создаем массив объектов семафора, для выдачи разрешений (эмулируем вилки)
        Semaphore[] forks = new Semaphore[philosophersCount];

        // Инициализация вилок
        for (int i = 0; i < philosophersCount; i++) {
            forks[i] = new Semaphore(1); // Задаем одно разрешение (вилка свободна, при нуле - занята)
        }

        // Создаем философов, как потоки и запускаем их выполнение
        for (int i = 0; i < philosophersCount; i++) {
            philosophers[i] = new Philosopher(i, forks, countOfMeals);
            philosophers[i].start();
        }
    }
}
