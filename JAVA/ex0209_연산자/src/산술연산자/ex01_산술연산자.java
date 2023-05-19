package 산술연산자;

public class ex01_산술연산자 {
	
	public static void main(String[] args) {
		
        //산술연산자
        /// --> 몫, % --> 나머지
		int num1 = 10;
		float num2 = 7f;
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		// 정수형과 실수형을 연산하게 되면 자동으로 실수로 변환
		
		//+ : 연결 연산
		int num3 = 10;
		String num4 = "7";
		System.out.println(num3+num4+num2);
		//문자 + 숫자 = 문자 자료형
		
		//문자 숫자로 변환
		int x = Integer.parseInt(num4);
		System.out.println(num3+x);
		
		
		
		
		
		
	}

}
