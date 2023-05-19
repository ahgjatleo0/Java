package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex04_로또 {

	public static void main(String[] args) {

		int[] array = new int[5];

		Random ran = new Random();

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!!");

		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(10) + 1;

			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					i--; // 중복된 숫자 발생시 인덱스 번호를 다시 앞으로
					break; //불필요한 검사를 안함
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//배열 안의 값을 한번에 출력하는 명령어
		//System.out.println(Arrays.toString(배열이름));
		
		

	}
}
