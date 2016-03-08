package Exception;

/**
 * GetMethodException thrown when index of element to be got is out of range
 */
public class GetMethodException extends IndexOutOfBoundOfList {

    public GetMethodException(int index) {
        this.index = index;
    }

    /**
     * Prints get exception
     */
    @Override
    public void printErrorMessage() {
        System.out.println("You cannot get element with this index " + index);

    }
}
