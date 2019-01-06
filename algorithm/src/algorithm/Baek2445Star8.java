package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2445Star8.java
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 6.
 */
public class Baek2445Star8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = 1; i <= n; i++){
			for(int st = 0; st < i; st++){
				sb.append("*");
			}
			for(int sp = 0; sp < n*2 - i*2; sp++){
				sb.append(" ");
			}
			for(int st = 0; st < i; st++){
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i = n; i > 0; i--){
			cnt++;
			for(int st = 0; st < i-1; st++){
				sb.append("*");
			}
			for(int sp = 0; sp < cnt*2; sp++){
				sb.append(" ");
			}
			for(int st = 0; st < i-1; st++){
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
