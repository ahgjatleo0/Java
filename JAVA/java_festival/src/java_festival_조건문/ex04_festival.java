package java_festival_조건문;

import java.util.Scanner;

public class ex04_festival {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int first = num1 * (num2%10);
		int second = num1 * (num2%100/10);
		int third = num1 * (num2/100);
		
		int result = num1*num2;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(result);
		
	}

}
