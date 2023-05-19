package exo220_2차원배열;

public class ex03_스네이크 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				arr[i][j] = num++;

			}

		}
		for (int i = 0; i < 5; i++) {

			if (i % 2 == 1) {
				for (int j = 0; j < 5; j++) {

					System.out.print(arr[i][4 - j] + "\t");

				}
			} else {

				for (int j = 0; j < 5; j++) {
					System.out.print(arr[i][j] + "\t");
				}
			}

			System.out.println();
		}

	}

}

//arr[1][0] = arr[1][4]
//arr[1][1] = arr[1][3]
