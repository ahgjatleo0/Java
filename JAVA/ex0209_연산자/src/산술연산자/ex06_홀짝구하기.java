package 산술연산자;

import java.util.Scanner;

public class ex06_홀짝구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();

		String result = a%2 ==0  ? "짝수입니다." : "홀수입니다." ;
		System.out.println(a + "는(은)"+ result);
		
				
	}

}
