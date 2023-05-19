package while문;

import java.util.Scanner;

public class ex04_while문예제3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;

		while (true) {

			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				even++;
			} else if (num % 2 == 1) {
				odd++;
			} else if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + odd);
		}

	}

}
