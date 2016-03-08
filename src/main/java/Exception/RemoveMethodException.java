package Exception;

/**
 * RemoveMethodException thrown when index of element to be removed is out of range
 */
public class RemoveMethodException extends IndexOutOfBoundOfList {
    /**
     * @param index of list's element
     */
    public RemoveMethodException(int index) {
        this.index = index;
    }

    /**
     * Prints remove exception
     */
    @Override
    public void printErrorMessage() {
        System.out.println("You cannot remove element with this index " + index);

    }
}
