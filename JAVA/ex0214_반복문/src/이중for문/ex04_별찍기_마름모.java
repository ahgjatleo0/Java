package 이중for문;

public class ex04_별찍기_마름모 {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {

			for (int j = 1; j < 4 - i; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {

				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 1; i < 3; i++) {

			for (int j = 1; j < i + 1; j++) {

				System.out.print(" ");
			}
			for (int k = 5; k > 2* i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
//  *
// ***  
//*****
// ***
//  *
