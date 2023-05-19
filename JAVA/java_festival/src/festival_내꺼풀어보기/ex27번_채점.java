package festival_내꺼풀어보기;

import java.util.Scanner;

public class ex27번_채점 {

	public static void main(String[] args) {

		System.out.println("===채점하기====");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = new String[str.length()];
		arr = str.split("");
		int score = 0, num = 1;

		for (int i = 0; i < arr.length; i++) {

			switch (arr[i]) {

			case "o":
				score += num;
				num++;
				break;

			case "x":
				num = 1;
				break;

			}

		}
		System.out.println(score);

	}

}
