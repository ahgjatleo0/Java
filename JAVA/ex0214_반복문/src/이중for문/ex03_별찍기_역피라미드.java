package 이중for문;

public class ex03_별찍기_역피라미드 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {

			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 7; j>=i*2-1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}

