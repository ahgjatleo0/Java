package festival_문제순서대로;

import java.util.Scanner;

public class ex04번_잔돈 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int cash = sc.nextInt();
		
		System.out.println("잔돈 : " + cash);
		int a = cash / 10000;
		int b = (cash % 10000)/5000;
		int c = (cash % 10000)%5000/1000;
		int d = (cash%10000)%5000%1000/500;
		int e = (cash%10000)%5000%1000%500/100;
		
		System.out.println("10000원 : " + a + "개");
		System.out.println("5000원 : " + b + "개");
		System.out.println("1000원 : " + c + "개");
		System.out.println("500원 : " + d + "개");
		System.out.println("100원 : " + e + "개");
		
	}

}
