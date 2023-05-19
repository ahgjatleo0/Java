package java_festival_2차원배열;

public class ex02_90도회전_숫자표 {

	public static void main(String[] args) {

		System.out.println("<원본>");

		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = num++;
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("<90도 회전>");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][4-i] + "\t");

			}
			System.out.println();
		}

	}

}
