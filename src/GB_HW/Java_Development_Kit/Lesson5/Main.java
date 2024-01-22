package GB_HW.Java_Development_Kit.Lesson5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhilosopherDining fivePhilosopher = new PhilosopherDining(5, 3);
        fivePhilosopher.startDinner();
    }
}
