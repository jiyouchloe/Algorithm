package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2438Star1.java
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 1.
 */
public class Baek2438Star1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String STAR = "*";
		for(int i = 1; i <= n; i++){
			for(int t = 0; t < i; t++){
				System.out.print(STAR);
			}
			System.out.println();
		}
	}
}
