package ex0221_메소드;

import java.util.Scanner;

public class ex05_완전수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		System.out.println(getSum(44));

	}

	private static boolean isDivisor(int num1, int num2) {

		// 완전수
		// : 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 수
		// ex = 1 + 2 + 3 = 6
		// 나누었을때 나머지 0
		boolean bool = false;

		if (num1 % num2 == 0) {

			bool = true;
		}

		return bool;

	}

	// 2. 자신을 제외한 약수의 총합을 구하는 메소드 만들기
	private static int getSum(int num) {

		int sum = 0;

		for (int i = 1; i < num; i++) {
			

			// 메소드 안에 다른 메소드 사용 가능
			// 메소드를 호출한 로직
			//메소드 구조 안에서 새롭게 메소드를 구현할 수는 없으나
			//메소드 자체를 호출해서 사용하는 것은 가능하다
			if (isDivisor(num, i) == true) {
				sum += i;
			}
//
//			if (num % i == 0) {
//				sum += i;
//
//			}

		}
		return sum;
	}

}
