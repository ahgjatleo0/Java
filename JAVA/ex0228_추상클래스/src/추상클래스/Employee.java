package 추상클래스;

public abstract class Employee {

	// 접근제한자 (public >> protected >> default >> private)
	// : 클래스 변수와 메소드를 외부(다른클래스)에서 접근할 수 있는 범위를 지정
	// 1) public - 모든 클래스에서 접근 가능
	// 2) protected - 상속 관계에 있거나, 같은 패키지에 있는 클래스만 접근 가능
	// 3) default(package) - 같은 package에 있는 클래스만 접근 가능
	// 4) private - 외부 클래스 접근 불가(자신의 클래스에서만 가능)

	// 사번
	protected String empno;
	// 이름
	protected String name;
	// 연봉
	protected int pay;

	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

	public String print() {

		return empno + " / " + name + " / " + pay;

	}

}
