package java_festival_2차원배열;

public class ex01_숫자표 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[j][i] = num++;

			}

		}
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
