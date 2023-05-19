package 산술연산자;

import java.util.Scanner;

public class ex03_산술연산자예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int x = sc.nextInt();
		int result = x-(x%100);
		System.out.println("결과값 : " + result);

		System.out.print("정수입력 : ");
		int y = sc.nextInt();
		int result2 = y-(y%100);
		System.out.print("결과값 : " + result2 );

	
	}


}
