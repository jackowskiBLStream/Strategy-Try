package Exception;

/**
 * Abstract base class for all index exceptions.
 */
public abstract class ListException extends RuntimeException {
    protected int index;

    /**
     * Prints error message for each exception thrown
     */
    public abstract void printErrorMessage();
}
