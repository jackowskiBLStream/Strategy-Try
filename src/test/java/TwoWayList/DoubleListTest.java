package TwoWayList;

import Exception.GetMethodException;
import Exception.RemoveMethodException;
import org.junit.Test;


/**
 * Created by blstream on 3/8/2016.
 */
public class DoubleListTest {
    private List<Integer> list;

    @Test(expected = GetMethodException.class)
    public void shouldCatchGetMethodExceptionWhenIndexGreaterThanSize() throws GetMethodException {
        //given
        List<Integer> tryList = new List<Integer>();

        //when
        int index = 10;

        //then
        tryList.get(index);
    }

    @Test(expected = GetMethodException.class)
    public void shouldCatchGetMethodExceptionWhenNegativeIndex() throws GetMethodException {
        //given
        List<Integer> tryList = new List<Integer>();

        //when
        int index = -10;

        //then
        tryList.get(index);
    }

    @Test(expected = RemoveMethodException.class)
    public void shouldCatchRemoveMethodExceptionWhenIndexGraterThanSize() throws RemoveMethodException {
        //given
        List<Integer> tryList = new List<Integer>();

        //when
        int index = 10;

        //then
        tryList.removeElement(index);
    }

    @Test(expected = RemoveMethodException.class)
    public void shouldCatchRemoveMethodExceptionWhenNegativeIndex() throws RemoveMethodException {
        //given
        List<Integer> tryList = new List<Integer>();

        //when
        int index = -10;


        //then
        tryList.removeElement(index);
    }

}