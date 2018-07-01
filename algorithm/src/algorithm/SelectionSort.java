package algorithm;

import java.util.Arrays;

/**
 * toDo : linkedList ¸¸µéÂ÷·Ê
 * @author jiyou.park
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
	
		int[] arr = {4,56,45,4,3,2,7,89,654,4364};
		int[] result = selectionSort(arr);
		
		System.out.println(Arrays.toString(result));
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
			if(i != result.length - 1){
				System.out.print(",");
			}
		}
		
	}
	
	public static int[] selectionSort (int[] arr){
		int[] retArr = new int[arr.length];
		
		for(int i = 0 ; i < arr.length; i++){
			
			int minIdx = findSmallest(arr);
			retArr[i] = arr[minIdx];
			arr[minIdx] = -1;
			
		}
		
		return retArr;
	}
	
	public static int findSmallest (int[] arr){
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > -1 && min > arr[i]){
				min = arr[i];
				minIdx = i;
			}
		}
		return minIdx;
		
	}
	
}
