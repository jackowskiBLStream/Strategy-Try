package Exception;

/**
 * Abstract base class for all index exceptions.
 */
public abstract class IndexOutOfBoundOfList extends Exception {
    protected int index;

    /**
     * Prints error message for each exception thrown
     */
    public abstract void printErrorMessage();
}
