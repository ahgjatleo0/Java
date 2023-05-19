package 배열;

public class ex01_배열 {

	public static void main(String[] args) {

		// ▶ 배열 : 같은 타입의 여러변수를 하나의 묶음으로 다루는 자료구조
		// ▶ 배열의 특징
		// 1. 같은 자료형만 하나로 묶을 수 이싿.
		// 2. 인덱스 번호를 가지고 이싿.
		//    ---> 인덱스는 0부터 시작해서 차례로 1씩 증가한다.
		// 3. 크기가 고정적이다.
				

		// ▶ 정수형 데이터를 5개 보관할 수 있는 array 배열 생성
		

		int[] array = new int[5];
		array[2] = 7;
		
		
	 
		System.out.println("주소값 : " + array);
		System.out.println(array[2]);

		
		String[] names = {"Kim", "Lee", "Park"};
		System.out.println(names[1]);
		String[] people = new String[5];
		System.out.println(people[0]);
		
		
	}

}
