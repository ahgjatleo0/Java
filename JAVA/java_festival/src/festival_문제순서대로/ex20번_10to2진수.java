package festival_문제순서대로;

import java.util.Scanner;

public class ex20번_10to2진수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력>>");
		int array[] = new int[10];
		int num = sc.nextInt();
		int i = 0;

		while (num != 0) {

			array[i] = num % 2;
			num = num / 2;
			i++;

		}
		
		for(int j = array.length -1; j>=0; j--) {
			
			System.out.print(array[j] + " ");
			
		}

	}

}
