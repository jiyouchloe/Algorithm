package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek10992Star17.java
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 6.
 */
public class Baek10992Star17 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		String sb2 = "";
		for(int i = 0; i < n; i++){
			for(int sp = 1; sp < n - i; sp++){
				sb.append(" ");
			}
			
			for(int st = 0; st < i*2 +1 ; st ++){
				if(i == n-1){
					sb.append("*");
				} else {
					sb2 = (st == 0) || (st == i*2) ? "*" : " ";
					sb.append(sb2);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
