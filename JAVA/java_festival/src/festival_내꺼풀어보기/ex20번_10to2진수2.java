package festival_내꺼풀어보기;

import java.util.Scanner;

public class ex20번_10to2진수2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();

		String ans = "";

		while (true) {

			if (num == 1) {

				ans = "1 " + ans;
				break;
			}

			ans = num % 2 +" " + ans;
			num /= 2;

		}
		System.out.print(ans);

	}
}
