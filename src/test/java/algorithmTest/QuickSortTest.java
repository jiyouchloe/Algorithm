package algorithmTest;

import algorithm.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    @Test
    public void testGetResult(){
        QuickSort quickSort = new QuickSort();
        //int[] expectedArr = {-1,4,5,6,7,8,18,38,97,100,101,108};
        //int[] arr = {108,4,5,101,7,8,100,38,97,18,6,-1};
        //int[] arr = {108,4,5,101,7};
        //int[] expectedArr = {4,5,7,101,108};
        List<Integer> list = new LinkedList<>();
        List<Integer> expectedList = new LinkedList<>();
        list.add(108);
        list.add(4);
        list.add(5);
        list.add(101);
        list.add(7);
        expectedList.add(4);
        expectedList.add(5);
        expectedList.add(7);
        expectedList.add(101);
        expectedList.add(108);

        assertThat(expectedList,is(quickSort.getResult(list)));
    }
}
