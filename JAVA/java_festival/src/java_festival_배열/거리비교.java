package java_festival_배열;

public class 거리비교 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int min = (point[0] - point[1]) * (point[0] - point[1]);

		int a = 0;
		int b = 0;

		for (int i = 0; i < point.length; i++) {

			for (int j = i + 1; j < point.length; j++) {

				int min2 = (point[i] - point[j]) * (point[i] - point[j]);

				if (min > min2) {
					min = min2;
					a = i;
					b = j;

				}

			}

		}
		System.out.println("result = [" + a + ", " + b + "]");

	}

}
