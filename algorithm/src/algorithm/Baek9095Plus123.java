package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek9095Plus123.java
 * 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 13.
 */
public class Baek9095Plus123 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int []d= new int[12];
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			if(d[n] == 0){
				for(int i = 3; i <= n; i++){
					d[i] = d[i-1] + d[i-2] + d[i-3];
				}
			}
			System.out.println(d[n]);
		}
		br.close();
	}
}
