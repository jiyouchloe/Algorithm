package algorithm;

import java.util.Scanner;

/**
 * <pre>
 * algorithm
 * Baek8393Sum.java
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 1부터 n까지 합을 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 1.
 */
public class Baek8393Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		while(n > 0){
			answer += n;
			--n;
		}
		System.out.println(answer);
	}
}
