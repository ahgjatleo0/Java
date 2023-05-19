package festival_문제순서대로;

import java.util.Scanner;

public class ex25번_대시문자 {

	public static void main(String[] args) {

		/*
		  2개 -> 1
		  3개 -> 7 
		  4개 -> 4 
		  5개 -> 2,3,5 
		  6개 -> 0,6,9 
		  7개 -> 8
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String str = sc.next();
		int cnt = 0;
		int result = Integer.parseInt(str);
		for (int i = 0; i < str.length(); i++) {
			int num = result % 10;
			result /= 10;
			if (num == 1) {
				cnt += 2;
			} else if (num == 7) {
				cnt += 3;
			} else if (num == 4) {
				cnt += 4;
			} else if (num == 2 || num == 3 || num == 5) {
				cnt += 5;
			} else if (num == 0 || num == 6 || num == 9) {
				cnt += 6;
			} else if (num == 8) {
				cnt += 7;
			}
		}System.out.println("대시('-')의 총 합 >>" + cnt);

	}

}
