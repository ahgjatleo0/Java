package 배열;

import java.util.Random;

public class ex03_홀수찾기 {

	public static void main(String[] args) {

		int[] array = new int[5];

		Random ran = new Random();
		int count = 0;
		System.out.print("array에 들어있는 홀수는 ");
		

		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(100) + 1;

			if (array[i] % 2 != 0) {
				count++;
				System.out.print(array[i] + " ");
			}

		}
		System.out.println("이며,");
		System.out.println("총" + count + "개 입니다.");

	}

}
