package pl.edu.agh.tkk17.sample;

public class OutputableException extends RuntimeException
{
    public OutputableException(String message)
    {
        super(message);
    }

    public OutputableException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
