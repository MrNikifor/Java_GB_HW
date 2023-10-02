package GB_HW.Exceptions.Seminar3HW;


import GB_HW.Exceptions.Seminar3HW.Presenter.Presenter;
import GB_HW.Exceptions.Seminar3HW.View.ConsoleView;
import GB_HW.Exceptions.Seminar3HW.View.View;

public class Homework3 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
