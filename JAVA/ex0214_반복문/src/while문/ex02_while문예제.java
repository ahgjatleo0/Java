package while문;

import java.util.Scanner;

public class ex02_while문예제 {

	public static void main(String[] args) {
		
		//ctrl shift f --> 정렬 단축키

		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (num < 10) {

			System.out.print("정수 입력 : ");
			num = sc.nextInt();

		}

		System.out.println("종료되었습니다.");

	}

}
