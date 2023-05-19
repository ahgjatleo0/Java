package festival_문제순서대로;

import java.util.Arrays;
import java.util.Scanner;

public class ex27번_채점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		
		String str = sc.next();
		String[] arr = new String[str.length()];
		arr = str.split("");

		int score = 0, num2 = 1;

		for (int i = 0; i < arr.length; i++) {

			switch (arr[i]) {

			case "o":
				score += (num2++);
				break;
				
			case "x":
				score += 0;
				num2 = 1;
				break;

			}
		}
		System.out.println(score);

	}

}
