package algorithm;

import java.util.Scanner;

/**
 * <pre>
 * algorithm
 * Baek1924YearOf2007.java
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 * </pre>
 * @author : jiyou.chloe
 * @date   : 2019. 1. 1.
 */
public class Baek1924YearOf2007 {

	public static void main(String[] args) {
		String DayAns = "";

		int THIRTYONE = 31;
		int TWENTYEIGHT = 28;
		int THIRTY = 30;
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int date = sc.nextInt();
		int calDate = 0;
		
		switch(month)
		{
		case 1: calDate = date;
				break;
		case 2: calDate = THIRTYONE + date;
				break;
		case 3: calDate = THIRTYONE + TWENTYEIGHT + date;
				break;
		case 4: calDate = THIRTYONE*2 + TWENTYEIGHT + date;
				break;
		case 5: calDate = THIRTYONE*2 + TWENTYEIGHT + THIRTY + date;
				break;
		case 6: calDate = THIRTYONE*3 + TWENTYEIGHT + THIRTY + date;
				break;
		case 7: calDate = THIRTYONE*3 + TWENTYEIGHT + THIRTY*2 + date;
				break;
		case 8: calDate = THIRTYONE*4 + TWENTYEIGHT + THIRTY*2 + date;
				break;
		case 9: calDate = THIRTYONE*5 + TWENTYEIGHT + THIRTY*2 + date;
				break;
		case 10: calDate = THIRTYONE*5 + TWENTYEIGHT + THIRTY*3 + date;
				break;
		case 11: calDate = THIRTYONE*6 + TWENTYEIGHT + THIRTY*3 + date;
				break;
		case 12: calDate = THIRTYONE*6 + TWENTYEIGHT + THIRTY*4 + date;
				break;
		}

		calDate = calDate%7;
		switch(calDate){
		case 0: DayAns = "SUN";
		break;
		case 1: DayAns = "MON";
		break;
		case 2: DayAns = "TUE";
		break;
		case 3: DayAns = "WED";
		break;
		case 4: DayAns = "THU";
		break;
		case 5: DayAns = "FRI";
		break;
		case 6: DayAns = "SAT";
		break;
		}
		System.out.println(DayAns);
	}
	
}
