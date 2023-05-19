package festival_내꺼풀어보기;

public class Bonus_2번_가운데글자2 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));
	}

	private static String getMiddle(String word) {

		String[] arr = word.split("");
		int len = arr.length;

		if (len % 2 == 0) {
			return arr[len / 2 - 1] + arr[len / 2];
		} else {

			return arr[len / 2];
		}

	}

}