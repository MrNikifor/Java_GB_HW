package GB_HW.Java_Development_Kit.Lesson5;

import java.util.Random;
import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    // Id философа
    private final int id;
    // Массив объектов семафора (вилки)
    private final Semaphore[] forks;
    // Количество приемов пищи для успешного завершения
    private final int count_of_meals;
    // Счетчик "подходов к тарелке"
    private int countEating = 0;

    public Philosopher(int id, Semaphore[] forks, int count_of_meals) {
        this.id = id;
        this.forks = forks;
        this.count_of_meals = count_of_meals;
    }

    // Логика работы потока
    @Override
    public void run() {
        for (int i = 0; i < count_of_meals; i++) {
            try {
                // Думаем
                think();
                // Захватываем вилки
                acquireForks();
                // едим
                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Обязательно освобождаем вилки
                releaseForks();
            }
        }
        System.out.println("======== Философ № " + id + " поел " + countEating + " раз(а) ========");
    }

    private void think() throws InterruptedException {
        System.out.println("Филосов " + id + " думает");
        Thread.sleep(getRandomInt());
    }

    private void acquireForks() throws InterruptedException {

        // Пытаемся взять левую и правую вилку
        forks[id].acquire();
        System.out.println("Филосов " + id + " взял левую вилку");
        forks[(id + 1) % forks.length].acquire();
        System.out.println("Философ " + id + " взял правую вилку");
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " ест");
        countEating++;
        Thread.sleep(getRandomInt());
    }

    private void releaseForks() {
        // Освобождаем левую и правую вилку
        forks[id].release();
        System.out.println("Философ " + id + " положил левую вилку");
        forks[(id + 1) % forks.length].release();
        System.out.println("Философ " + id + " положил правую вилку");
    }

    private int getRandomInt(){
        return new Random().nextInt(1000, 2000);
    }
}
