package 산술연산자;

import java.util.Scanner;

public class ex05_삼항연산자 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("b의 값을 입력하세요 : ");
		int b = sc.nextInt();

		String result = a>b ? "a가 더 큽니다" : "b가 더 큽니다" ;
		System.out.println("더 큰 값은 :  " + result);
		
		
		
		
		
		
		
	}

}
