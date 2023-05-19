package exo220_2차원배열;

import java.util.Arrays;

public class ex01_2차원배열생성 {

	public static void main(String[] args) {

		// 1. 이차원배열 생성하기(정수형 데이터
		// [행][열]
		int[][] arr = new int[5][5];

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);

		// 2. 이차원배열 값을 넣으면서 생성
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		
		// 3. 이차원배열 안에 값 넣기

		int num = 1;
		int i = 0, j = 0;

		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}
		



	}

}
