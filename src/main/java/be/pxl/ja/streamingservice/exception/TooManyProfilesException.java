package be.pxl.ja.streamingservice.exception;

public class TooManyProfilesException extends Exception{
    public TooManyProfilesException(String message) {
        super("You have reached your maximum number of screens");
    }
}
