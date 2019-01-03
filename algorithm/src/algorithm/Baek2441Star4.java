package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * <pre>
 * algorithm
 * Baek2441Star4.java
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 3.
 */
public class Baek2441Star4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for(int i = n; i > 0; i--){
			for(int j = i; j < n; j++){
				sb.append(' ');
			}
			for(int t = i; t > 0; t--){
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
