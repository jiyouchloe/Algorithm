package algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort2 {

	public void sort () {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> numbers = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}


		int[] resultArr = new int[n];
		int minIdx = 0;

		for(int i = 0; i < n; i++) {

			minIdx = findSmallestIdx(numbers);

			if(minIdx == -1) {
				break;
			}
			resultArr[i] = numbers.get(minIdx);
			numbers.remove(minIdx);

		}
		for(int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

	public int findSmallestIdx (List<Integer> numbers) {
		if(numbers == null || numbers.size() <= 0) {
			return -1;
		}
		int min = numbers.get(0);
		int minIdx = 0;
		for(int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) < min) {
				min = numbers.get(i);
				minIdx = i;
			}
		}
		return minIdx;

	}

}
