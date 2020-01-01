package algorithm;

import java.util.Scanner;

public class BinarySearch2 {
	public int doSearch (int[] numbers, int searchNum) {

		int searchCnt = 0;
		int mid = 0;
		int low = 0;
		int high = numbers.length - 1;

		while(low <= high) {
			searchCnt++;
			mid = (low + high) / 2;

			if(numbers[mid] == searchNum){
				System.out.println("searchIdx::"+ mid + "   구하는데 걸린 횟수: "+ searchCnt);
				return mid;
			} else if(numbers[mid] < searchNum) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}

		System.out.println("구하는 수 없음, 횟수: " + searchCnt);
		return -1;
	}

}

