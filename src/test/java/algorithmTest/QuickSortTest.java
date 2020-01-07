package algorithmTest;

import algorithm.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    @Test
    public void testDoRecursiveSort(){
        QuickSort quickSort = new QuickSort();
        //int[] expectedArr = {-1,4,5,6,7,8,18,38,97,100,101,108};
        //int[] arr = {108,4,5,101,7,8,100,38,97,18,6,-1};
        //int[] arr = {108,4,5,101,7};
        //int[] expectedArr = {4,5,7,101,108};
        List<Integer> list = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
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

        assertThat(expectedList,is(quickSort.doRecursiveSort(list)));
    }

    @Test
    public void testDoWhileSort(){
        QuickSort quickSort = new QuickSort();
        List<Integer> list = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(1);
        list.add(-3);
        list.add(4);
        list.add(393);
        list.add(13);
        list.add(33);
        list.add(-3);
        list.add(3);
        list.add(12);
        list.add(9);
        expectedList.add(-3);
        expectedList.add(-3);
        expectedList.add(1);
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(9);
        expectedList.add(10);
        expectedList.add(12);
        expectedList.add(13);
        expectedList.add(14);
        expectedList.add(33);
        expectedList.add(393);

        assertThat(expectedList,is(quickSort.doWhileSort(list)));
    }
}
