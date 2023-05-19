package java_festival_배열;

import java.util.Scanner;

public class 삼의배수 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.print(i + 1 + "번 째 정수 입력>>");
			array[i] = sc.nextInt();

		}
		System.out.print("3의 배수는 : ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 3 == 0) {
				num[i] = array[i];

			}
			if(num[i] != 0) {	
				System.out.print(num[i] + " ");
			}
		}

	}

}
