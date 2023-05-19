package 배열;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int wm = 0;

		char[] data = { '수', '박' };
		System.out.println("====수박 게임 start~!====");
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0) {
				wm = data[0];

			} else {
				wm = data[1];
			}
			System.out.print((char)wm);
		}

	}

}
