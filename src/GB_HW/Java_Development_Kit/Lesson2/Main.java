package GB_HW.Java_Development_Kit.Lesson2;


import GB_HW.Java_Development_Kit.Lesson2.Client.ClientGUI;
import GB_HW.Java_Development_Kit.Lesson2.Server.Gui.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}