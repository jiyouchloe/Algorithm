package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * algorithm
 * Baek10828Stack.java
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 다섯 가지이다.
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * </pre>
 * 
 * @author : jiyou.chloe
 * @date : 2019. 1. 6.
 */
public class Baek10828Stack {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack stk = new Stack();
		while (--n >= 0) {
			String order = br.readLine();
			String[] orderArr = order.split(" ");
			switch (orderArr[0]) {
			case "push":
				stk.push(Integer.parseInt(orderArr[1]));
				break;
			case "pop":
				System.out.println(stk.pop());
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				System.out.println(stk.empty());
				break;
			case "top":
				System.out.println(stk.top());
				break;
			default:
				break;
			}
		}
		br.close();
	}
}

class Stack {
	public int[] stack = new int[10];
	private int size = 0;

	public void push(int x) {
		if (isFull()) {
			int[] newStack = new int[size + 10];
			newStack = stack.clone();
			newStack[size] = x;
			stack = newStack;
		} else {
			stack[size] = x;
		}
		size++;
	}

	public int pop() {
		int returnVal = -1;
		if (empty() == 0) {
			returnVal = stack[size - 1];
			stack[size - 1] = 0;
			size--;
		}
		return returnVal;
	}

	public int top() {
		return empty() == 0 ? stack[size - 1] : -1;
	};

	public boolean isFull() {
		return size() >= stack.length;
	}

	public int empty() {
		return size() > 0 ? 0 : 1;
	}

	public int size() {
		return size;
	}
}
