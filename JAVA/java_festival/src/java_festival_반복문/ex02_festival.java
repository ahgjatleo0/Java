package java_festival_반복문;

import java.util.Random;
import java.util.Scanner;

public class ex02_festival {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();
		int temp = 0;

		while (true) {

			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;
			int result = a + b;

			System.out.print(a + "+" + b + "=");

			int answer = sc.nextInt();

			if (answer == result) {

				System.out.println("SUCCESS!");

			} else if (answer != result) {

				temp++;
				System.out.println("Fail...");

			}

			if (temp == 5) {
				System.out.println("GAME OVER!");
				break;
			}

		}

	}

}
