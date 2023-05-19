package 산술연산자;

import java.util.Scanner;

public class ex02_산술연산자예제 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("글자를 입력하세요.");
//		String str = sc.next();
//		
//		
//		System.out.println("입력받은 글자는 = " + str);
//		
//		
//		//time.sleep --> 자바버전
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			
//		}
//		
//		//정수형 숫자 입력받기
//		
//		System.out.println("숫자를 입력하세요.");
//
//		int num = sc.nextInt();
//
//		System.out.println(num);

		//한줄복사 단축키 ctrl alt 화살표
		System.out.print("첫번째 정수입력 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수입력 : ");
		int y = sc.nextInt();
		System.out.println("더한 결과 값 : " + (x+y) );
		System.out.println("뺀 결과 값 : " + (x-y) );
		System.out.println("곱한 결과 값 : " + (x*y) );
		System.out.println("나눈 결과 값 : " + ((double)x/y) );
	}

}
