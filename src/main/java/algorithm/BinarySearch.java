package algorithm;
/**
 * <pre>
 * algorithm
 * BinarySearch.java
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2018. 7. 22.
 */
public class BinarySearch {

	public int doSearch(int[] arr, int item){
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			int guess = arr[mid];
			if(guess == item) {
				return mid;
			} else if(guess > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
}
