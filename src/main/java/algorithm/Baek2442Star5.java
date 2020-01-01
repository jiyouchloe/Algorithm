package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2442Star5.java
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 * 별은 가운데를 기준으로 대칭이어야 한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 3.
 */
public class Baek2442Star5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int prevStar = 1;
		int prevSpace = n - 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			for(int j = 0; j <prevSpace; j++){
				sb.append(' ');
			}
			prevSpace -= 1;
			for(int s = 0; s < prevStar; s++){
				sb.append('*');
			}
			prevStar += 2;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
