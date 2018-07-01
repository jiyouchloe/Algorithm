package algorithm;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {-1,4,5,6,7,8,18,38,97,100,101,108};
		int item = 8;
		
		System.out.println(doSearch(arr,item));
		
	}
	
	static int doSearch(int[] arr, int item){
		int low = 0;
		int high = arr.length - 1;
		while(low <= high){
			int mid = (low+high)/2;
			int guess = arr[mid];
			if(guess == item){
				return mid;
			}else if(guess < item){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		
		return -1;
		
	}
}
