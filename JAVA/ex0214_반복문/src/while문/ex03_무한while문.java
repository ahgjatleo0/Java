package while문;

import java.util.Scanner;

public class ex03_무한while문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 무한반복문
		while (true) {

			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if (num > 10) {
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}

}
