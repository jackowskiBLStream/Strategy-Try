package Exception;

/**
 * SetMethodException thrown when index of element to be set is out of range
 */
public class SetMethodException extends IndexOutOfBoundOfList {

    public SetMethodException(int index) {
        this.index = index;
    }

    /**
     * Prints set exception
     */
    @Override
    public void printErrorMessage() {
        System.out.println("You cannot set element with this index " + index);
    }
}
