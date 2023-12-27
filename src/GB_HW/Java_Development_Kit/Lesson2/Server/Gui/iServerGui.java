package GB_HW.Java_Development_Kit.Lesson2.Server.Gui;

/**
 * Интерфейс графического отображения.
 */

public interface iServerGui {
    /**
     * Вывод сообщения в окно сервера
     *
     * @param text текст сообщения.
     */
    void appendLog(String text);
}