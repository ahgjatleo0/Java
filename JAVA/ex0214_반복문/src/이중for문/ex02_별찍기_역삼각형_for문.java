package 이중for문;

public class ex02_별찍기_역삼각형_for문 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			System.out.println();

		}

	}

}
