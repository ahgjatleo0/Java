package 산술연산자;

import java.util.Scanner;

public class ex07_삼항예제 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공 개수를 입력하세요 : ");
		int a = sc.nextInt();

		int result = a%5 >=1 ? 1 : 0 ;
		System.out.println(  "필요한 상자의 수 : "+(a/5 + result));
		
		

	}

}

