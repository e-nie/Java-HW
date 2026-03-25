package practice_8.library.exceptions;

//непроверяемый -> RuntimeException - ошибка в процессе выполнения программы
public class InvalidBookException extends RuntimeException{
    public InvalidBookException(String message) {
        super(message);
    }
}
