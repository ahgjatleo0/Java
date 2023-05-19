package ex0221_메소드;

import java.util.Scanner;

public class ex05_완전수구하기2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt();
		System.out.println(isPerfect(i));

	}

	private static boolean isPerfect(int i) {

		boolean result = false;
		int sum = 0 , j = 0;

		for (j = 1; j < i; j++) {

			if (i % j == 0) {

				sum += j;

			}

		}

		if (sum == j) {

			result = true;
		}

		return result;
	}

}
