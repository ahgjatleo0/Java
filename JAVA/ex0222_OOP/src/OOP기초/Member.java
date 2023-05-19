package OOP기초;

public class Member {
	// OOP(Object Oriented Programming)
	// 나만의 자료형 설계도면
	// ---> main method 포함시키지 않음
	// ---> 자체적으로 실행되지는 않음(단지 설계도면)
	
	// 1. Field(Data, 속성)
	String name; // 이름
	int age; // 나이
	String id; // 아이디
	String pw; // 패스워드
	
	
	
	
	
	
	
	
	// 2. Method(Logic, 행위, 기능)
	// 카카오톡 메시지 보내기
	public void kakaoTalk(String msg) {
		System.out.println(name + "님이 " + msg + " 를 전송합니다.");
	}
	
	// 기프티콘 보내기
	public void gift(String gift) {
		System.out.println(name + "님이 " + gift + " 를 선물합니다.");
	}
		

}
