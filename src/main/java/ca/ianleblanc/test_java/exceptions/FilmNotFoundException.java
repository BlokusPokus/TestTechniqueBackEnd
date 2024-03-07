package ca.ianleblanc.test_java.exceptions;

public class FilmNotFoundException extends Throwable {
    public FilmNotFoundException(String message) {
        super(message);
    }

}
