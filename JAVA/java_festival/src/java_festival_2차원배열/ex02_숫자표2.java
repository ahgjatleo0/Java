package java_festival_2차원배열;

public class ex02_숫자표2 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = num++;

			}

		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i % 2 != 0) {

					System.out.print(arr[i][4-j] + "\t");

				} else {

					System.out.print(arr[i][j] + "\t");
				}

			}

			System.out.println();
		}

	}

}
