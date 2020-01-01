package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek11726NX2Tiling.java
 * </pre>
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * @author : jiyou.chloe
 * @date   : 2019. 1. 13.
 */
public class Baek11726NX2Tiling {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		long d[] = new long[1001];
		d[0] = 1;
		d[1] = 1;
		for(int i = 2; i <= n; i++){
			d[i] = d[i-1]+d[i-2];
		}
		System.out.println(d[n]%10007);
	}
}
