package java_festival_메소드;

import java.util.Scanner;

public class ex01_나누기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();

//		int num1 = 10;
//		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 : " + result);

	}

	private static boolean isDivide(int num1, int num2) {

		boolean result = false;

		result = num1 % num2 == 0 ? true : false;

		return result;
	}

}
