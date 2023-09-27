package GB_HW.Exceptions.Seminar2;

public class TheBestException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage() + " сообщение прошло через TheBestException";
    }

    public TheBestException(String message) {
        super(message);
    }
}
