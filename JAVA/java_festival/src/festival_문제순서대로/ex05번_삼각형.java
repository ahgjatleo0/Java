package festival_문제순서대로;

import java.util.Scanner;

public class ex05번_삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
