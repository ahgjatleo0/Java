/*
   class - 실제 Object를 제작하기 전 설계하는 도면
   object - 클래스를 기반으로 실제로 메모리에 할당하는 것
   data - field(속성) → 장난감
   logic - method(행동) → 설명서
   
   <객체지향 프로그래밍 특징>
   1.추상화(Abstraction) 2.캡슐화(Encapsulation) 3.상속(Inheritance) 4.다형성(polymorphism) + 정보은닉
     
     1)추상화(Abstraction)
        ○ 객체에서 공통된 속송(data(field))과 행위(logic(method))를 추출하는 기법
        ○ 상세한 정보는 무시하고 필요한 정보들만 간추려서 구성
        ○ 코드 상에서 구현(로직)부분을 제외한 오직 선언 부분만을 설계
        
     2)캡슐화(Encapsulation)
        ○ 장난감 + 설명서 = data + logic
        ○ 관련된 필드(속성)와 메소드(기능)을 하나로 묶고, 실제 구현 내용을 외부로부터 감추는 기법(정보은닉)
        ○ 만일의 상황(타인이 외부에서 조작)을 대비해서 특정 속성이나 메소드를 사용자가 조작할 수 없도록 숨겨 놓은 것
        ○ 외부에서는 공개된 메소드(기능)의 인터페이스를 통해 접근할 수 있다.
        
     3)상속(Inheritance)
        ○ 이미 작성된 클래스(상위클래스)의 특성을 그대로 이어받아 새로운 클래스(하위클래스)를 생성하는 기법
        ○ 기존 코드를 그대로 재사용하거나 재정의 --> 재사용 + 확장
        
     4)다형성(polymorphism)
        ○ 사전적 의미 '다양한 형태로 나타날 수 있는 능력'
        ○ 같은 기능(메소드)를 호출하더라도 객체에 따라 다르게 동작하는 것
        ○ 상위클래스의 동작을 하위클래스에서 다시 정의하여 사용하는 것 또한 다형성으로 볼 수 있다
        
  
   <객체지향 프로그래밍 장점> 
   1. 신뢰성 있는 소프트웨어를 쉽게 작성할 수 있다.
   2. 코드를 재사용하기 쉽다.
   3. 유지보수가 용이하다.
   4. 직관적인 코드 분석이 가능하다.
   5. 소프트웨어 생산성이 향상된다.  
   
   

   ex) Pokemon[] bag = new Pokemon[3];
   	   bag[0] = new Pokemon(객채별 변수)
   	   출력문(bag[0].getName())
   	   
   	   
   	   for-each문
   	   for(Pokemon p : bag){
   	   출력문(p.getName() + )
   	   
   	   **ArrayList**
   	   --> 클래스(자료형)
   	   ArrayList<String> list = new ArrayList<String(생략가능)>();
   	   Student 자료형을 저장할 수 있는 list 생성
   	   --> ArrayList<Student> list = new ArrayList<>();
   	   --> <> : 제네릭 기법(클래스 내부에서 사용할 자료형을 외부에서 지정하는 기법)
   	   
   	   1) 데이터 추가하기
   	   --> list.add(new Student());
   	   2) 원하는 위치에 데이터 추가
   	   --> list.add(인덱스번호,new Student());
   	   3) 데이터 삭제하기
   	   --> list.remove(인덱스번호);
   	   4) 전체 크기 가져오기
   	   --> list.size();
   	   5) 데이터 가져오기
   	   --> list.get(인덱스번호);
   	   6) 데이터 전부 삭제하기
   	   --> list.clear();
   	   
   	   Collection
   	   Map ---> HashMap
   	   Enumeration
   	   
   	   list.add("");
   	   출력문(list.get(2))
   	   
   	   list.add(2, "라면");
   	   list.remove(1)
   	   list.size()
   	   list.clear()
   	   
   	   
   	   **배열의 특징
   	   1) 같은 자료형만 하나로 묶어서 저장할 수 있다.
   	   2) 배열의 크기는 고정적이다.
   	   3) 자바에서 배열의 크기는 무한대가 아니다.
   
   
   
 		접근제한자 public 상태를 나타냄(초록색 동그라미)
 
 
 
 
 
 
 
 
 
 
 */


















