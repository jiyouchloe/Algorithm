package algorithm;

import java.util.Scanner;
import java.util.Stack;

/**
 * <pre>
 * algorithm
 * Baek9012Bracket.java
 * </pre>
 * 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 
 * 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
 * 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
 * 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 
 * 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
 * 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
 * @author : jiyou.chloe
 * @date   : 2019. 1. 12.
 */
public class Baek9012Bracket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String[] answer = new String[t];
		String left = "(";
		String right = ")";
		for(int i = 0; i < t; i++) {
			String ps = sc.nextLine();
			String[] psArr = ps.split("");
			Stack<String> psStack = new Stack<>();
			if(psArr.length % 2 == 1 || right.equals(psArr[0])|| left.equals(psArr[psArr.length-1])) {
				answer[i] = "NO";
				continue;
			} else {
				for(int j = 0; j < psArr.length; j++) {
					psStack.push(psArr[j]);
				}
				String pre = psStack.pop();
				String cur = "";
				int cnt = 1;
				while(!psStack.isEmpty()) {
					cur = psStack.pop();
					if(cnt == 0) {
						pre = cur;
						cnt++;
						continue;
					}
					if(pre.equals(cur)) {
						cnt++;
					} else if(right.equals(pre) && left.equals(cur)){
						cnt--;
					}
				}
				if(cnt == 0) {
					answer[i] = "YES";
				}else {
					answer[i] = "NO";
				}					
			}
		}
		for(int a = 0; a < answer.length; a++) {
			System.out.println(answer[a]);
		}
	}
}