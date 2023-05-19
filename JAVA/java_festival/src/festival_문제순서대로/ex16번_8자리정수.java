package festival_문제순서대로;

import java.util.Scanner;

public class ex16번_8자리정수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= 8; i++) {

			sum += num % 10;
			num /= 10;

		}
		System.out.println("합은 " + sum + "입니다.");

	}

}
