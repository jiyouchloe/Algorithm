package algorithmTest;

import algorithm.BinarySearch;
import algorithm.BinarySearch2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testDoSearch(){
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {-1,4,5,6,7,8,18,38,97,100,101,108};
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9,10};
        int item = 101;

        assertEquals(1,binarySearch.doSearch(arr1,1),0);
        assertEquals(-1,binarySearch.doSearch(arr1,11),0);
        assertEquals(-1,binarySearch.doSearch(arr1,-1),0);
        assertEquals(8,binarySearch.doSearch(arr1,8),0);
    }

    @Test
    public void testDoSearch2(){
        BinarySearch2 binarySearch2 = new BinarySearch2();
        int[] numbers = {-1,4,5,6,7,8,18,38,97,100,101,108};
        int item = 101;

        assertEquals(-1,binarySearch2.doSearch(numbers,1),0);
        assertEquals(-1,binarySearch2.doSearch(numbers,109),0);
        assertEquals(11,binarySearch2.doSearch(numbers,108),0);
        assertEquals(0,binarySearch2.doSearch(numbers,-1),0);
        assertEquals(7,binarySearch2.doSearch(numbers,38),0);
    }
}
