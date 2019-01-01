package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2439Star2.java
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 1.
 */
public class Baek2439Star2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			for(int t = 0; t < n - i ; t++){
				sb.append(' ');
			}
			for(int s = 0; s < i; s++){
				sb.append('*');
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
