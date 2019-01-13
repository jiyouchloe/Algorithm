package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek1463Make1.java
 * </pre>
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다. 
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 * @author : jiyou.chloe
 * @date   : 2019. 1. 12.
 */
public class Baek1463Make1 {
	static int d[] = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new int[n+1];
		System.out.println(makeOne(n));
	}
	public static int makeOne(int n){
		if(n == 1) return 0;
		if(d[n] > 0) return d[n];
		d[n] = makeOne(n-1) + 1;
		if(n % 2 == 0){
			int temp = makeOne(n/2)+1;
			if(d[n] > temp) d[n] = temp;
		}
		if(n % 3 == 0){
			int temp = makeOne(n/3)+1;
			if(d[n] > temp) d[n] = temp;
		}
		return d[n];
	}
}
