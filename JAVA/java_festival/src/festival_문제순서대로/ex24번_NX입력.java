package festival_문제순서대로;

import java.util.Scanner;

public class ex24번_NX입력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		int[] arr = new int[n];
		int i = 0;

		for (i = 0; i < n; i++) {

			System.out.print(i + 1 + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();

		}
		System.out.println("결과 >> ");

		for (i = 0; i < n; i++) {

			if (arr[i] < x) {

				System.out.print(arr[i] + " ");

			}

		}

	}

}
