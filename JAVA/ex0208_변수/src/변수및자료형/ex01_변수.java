package 변수및자료형;

public class ex01_변수 {

	public static void main(String[] args) {

		//변수 선언
		//정수 데이터 4라는 값을 담을 수 있는 num 변수 선언
		int num = 4;
		System.out.println(num);
		
		// num이라는 공간에 있는 데이터를 7로 변경
	    // 자료형을 정해주는건 단 한번만 하면 된다
		num = 7;
		System.out.println(num);
		
		// 상수 선언 방법 --> final 키워드 사용
		// 정수형 3이라는 숫자를 담을 수 있는 상수 num2를 선언
		final int num2 = 3;
		System.out.println(num2);
		
		//num2 = 10; --> 상수는 값 변경 불가능
		
		// 변수명 규칙
		// 1) 키워드 사용 불가
		// 2) 대소문자가 구분되며 길이에 제한이 없다
		// 3) 숫자로 시작할 수 없다.
		// 4) 특수문자는 '_'와 '$'만 허용한다.
		// 추가
		// 1) 변수 이름의 첫글자는 항상 소문자로 시작한다.
		// 2) 변수 이름이 여러 단어로 이루어진 경우 이어지는 단어의 첫 글자를 대문자로 한다. 
		//    ex) wishList, stringBuffer --> 카멜식기법
		
		
		
		
		
	}

}
