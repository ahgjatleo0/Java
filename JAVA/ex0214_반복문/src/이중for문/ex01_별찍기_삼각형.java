package 이중for문;

public class ex01_별찍기_삼각형 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {

				System.out.print("*");
			}

			System.out.println("");
		}

	}

}
