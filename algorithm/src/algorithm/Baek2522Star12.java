package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek2522Star12.java
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 6.
 */
public class Baek2522Star12 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			for(int sp = 0; sp < n - i; sp++){
				sb.append(" ");
			}
			for(int st = 0; st < i; st++){
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i = 1; i < n; i++){
			for(int sp = 0; sp < i; sp++){
				sb.append(" ");
			}
			for(int st = 0; st < n - i; st++){
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
