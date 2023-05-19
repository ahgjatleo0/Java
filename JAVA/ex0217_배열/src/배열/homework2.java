package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int i = 0, sum = 0;
		double avg = 0;
		for (i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			array[i] = sc.nextInt();
			sum += array[i];

		}
		int max = 0, min = array[0];

		for (i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		avg = sum / 5.0;
		System.out.println("입력된 점수 : " + Arrays.toString(array));
		System.out.println("최고 점수 :" + max);
		System.out.println("최저 점수 :" + min);
		System.out.println("총합 :" + sum);
		System.out.println("평균 :" + avg);

	}

}
