package exo220_2차원배열;

public class ex02_2차원배열실습 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				arr[j][i] = num++;

			}

		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();

		}

	}

}
