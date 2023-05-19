package festival_문제순서대로;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus_4번_별출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int num = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(i + "번째 별의 수 : ");
			num = sc.nextInt();
			arr[i] = num;

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
