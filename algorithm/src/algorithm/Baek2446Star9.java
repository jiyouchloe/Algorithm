package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2446Star9.java
 * 모래시계 별찍기
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 6.
 */
public class Baek2446Star9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			for(int sp = 0; sp < i; sp++){
				sb.append(" ");
			}
			for(int st = 0; st < 2*(n -i)-1; st++){
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i = 2; i <= n; i++){
			for(int sp = 0; sp < n-i; sp++){
				sb.append(" ");
			}
			for(int st = 0; st < i*2 -1; st++){
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
