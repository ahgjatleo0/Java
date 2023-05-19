package java_festival_반복문2;

public class ex01_3번_플러스마이너스 {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;

		for (int i = 1; i < 101; i++) {

			if (i % 2 == 0) {

				num = i * (-1);

			} else {

				num = i;

			}
			sum += num;

			System.out.print(num + " ");

		}
		System.out.println("\n결과 : " + sum);

	}

}
