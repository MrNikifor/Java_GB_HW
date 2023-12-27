package GB_HW.Java_Development_Kit.Lesson2.Server.Service;


import GB_HW.Java_Development_Kit.Lesson2.Client.Client;

/**
 * Интерфейс сервиса взаимодействий с моделью сервера и репозиторием БД.
 */
public interface iServerService {
    /**
     * Подключение клиента к серверу;
     *
     * @param client объект клиента.
     * @return true - при успешном подключении, иначе false.
     */
    boolean connectUser(Client client);

    /**
     * Отключение клиента от сервера.
     *
     * @param client объект клиента.
     */
    void disconnectUser(Client client);

    /**
     * Новое сообщение от клиента.
     *
     * @param text текст сообщения.
     */
    void sendMessage(String text);

    /**
     * Рассылка сообщений клиентам.
     *
     * @param text текст сообщения.
     */
    void answerAll(String text);

    /**
     * Запуск работы сервера.
     */
    void startServer();

    /**
     * Остановка работы сервера.
     */
    void stopServer();

    /**
     * Получение состояния работы сервера.
     *
     * @return true - сервер запущен, иначе false.
     */
    boolean isServerWork();

}