package festival_문제순서대로;

import java.util.Scanner;

public class ex28번_2to10진수 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str + "(2) = ");
		System.out.println(Integer.parseInt(str,2) + "(10)");
		
		
		
	}

}
