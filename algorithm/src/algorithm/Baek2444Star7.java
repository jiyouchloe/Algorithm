package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2444Star7.java
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 6.
 */
public class Baek2444Star7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		int line = 2 * n - 1;
		int prevSpace = n - 1;
		int prevStar = 1;
		boolean reverseFlag = false;
		for(int i = 0; i < line; i++){
			for(int sp = 0; sp < prevSpace; sp ++){
				sb.append(" ");
			}
			for(int st = 0; st < prevStar; st++){
				sb.append("*");
			}
			if(prevSpace == 0 || reverseFlag){
				reverseFlag = true;
				prevSpace += 1;
				prevStar -= 2;   
			} else {
				prevSpace -= 1;
				prevStar += 2;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
