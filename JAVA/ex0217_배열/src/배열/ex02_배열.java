package 배열;

import java.util.Random;

public class ex02_배열 {

	public static void main(String[] args) {

		Random ran = new Random();

		// 1. 정수형 데이터 5개를 보관할 수 있는 array 배열 생성
		int[] array = new int[5];

		// 2. 배열의 모든 인덱스 안에 있는 데이터를
		// 랜덤한 값으로 변경(1~10)
		
		// 배열의 크기를 가져오는 방법 ---> 배열이름.length

		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(10) + 1;

			// 3. 배열 안에 있는 모든 값을 출력하기
			System.out.print(array[i] + " ");

		}

	}

}
