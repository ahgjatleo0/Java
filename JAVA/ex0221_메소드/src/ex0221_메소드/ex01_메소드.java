//		public(접근제한자) int(리턴타입) addNumber-->메소드이름(int num1, int num2(매개변수)) {
//			int result = num1+num2;(매개변수 연산, result에 저장)
//			★★★★★★return(결과값 반환 =은 사용 x) result;}

package ex0221_메소드;

public class ex01_메소드 {

	public static void main(String[] args) {
		// 메소드 사용하기(main 영역 안쪽에서 사용하기)
		double result = addDouble(4.2, 3.14);
		System.out.println(result);
		System.out.println(subNum(9,3));
		printHello();

	}
	// 메소드 생성(main 영역을 벗어나서 작성하기)
	// 1.더하기
	// 매개변서 double 2개/ 리턴타입 double / 메소드명 addDouble

	public static double addDouble(double n1, double n2) {
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에만 코드를 작성할 것 !
		double result = n1 + n2;
		return result;

	}

	// 메소드 생성(main 영역을 벗어나서 작성하기)
	// 2. 빼기를 수행하는 메소드
	// 리턴타입 : int / 매개변서 : int 2개 / 메소드명 : subNum
	// 매개변수로 받아온 데이터 두개를 뺸 결과값을 돌려주는 메소드
	// 단, 큰 수에서 작은 수를 뺀 결과;
	public static int subNum(int n1, int n2) {
		int result2 = 0;
		
		result2 = n1>n2 ? n1-n2 : n2-n2;


		return result2;
	}
	
	// 메소드 생성(main 영역을 벗어나서 작성하기)
	// 3. Hello World를 출력하는 메소드
	public static void printHello() {
		// void : 리턴타입이 없음을 의미
		System.out.println("Hello World!");
		
		
	}
		
	
	
	
	
	
	
	
	

}
