package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek11727NX2Tiling2.java
 * 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 13.
 */
public class Baek11727NX2Tiling2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double d[] = new double[n+1];
		d[0] = 1;
		d[1] = 1;
		for(int i = 2; i <= n; i++){
			d[i] = d[i-1] + 2*d[i-2];
		}
		System.out.println((int)d[n]%10007);
	}
}
