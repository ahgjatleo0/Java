package 변수및자료형;

public class ex02_자료형 {
	
	// snippet--> main ctrl space --> main 자동완성
	public static void main(String[] args) {
		
		// 기본 자료형
		//     1byte   2byte   4byte   8byte
		// 논리 *boolean
		// 문자         *char
		// 정수 byte    short   *int     long
		// 실수                 float    *double
		
		// 참이라는 데이터를 저장하는 bool 변수 선언
		// 값은 소문자로 적어야됨
		boolean bool = true;
		System.out.println(bool);
		
		
		// 문자
		// char '' String ""
		char name = '록';
		String name2 = "김성록";
		System.out.println(name);
		System.out.println(name2);
		
		// 정수
		byte num = (byte) 128;
		// 명시적 형변환(강제 형변환)
		// --> 큰 크기를 가진 데이터 자료형을 작은 크기의 자료형으로 옮길때(데이터 손실o)
		System.out.println(num);
		
		// 묵시적 형변환(자동 형변환)
		// --> 작은 크기를 가진 데이터 자료형을 큰 크기의 자료형으로 옮길때(자동으로 가능)
		long num2 = 12345;
		
		
		//실수 --> double이 기본
		float num3 = (float)3.14;
		float num4 = 3.14f;
		System.out.println(num4);
		
		
	}

}