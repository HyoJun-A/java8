package sec5;

public class Child extends Parent{
//	private int studentNo;
	private String name;
	
//	public Child(String name, int studentNo) {
//		this.name = name;
//		this.studentNo = studentNo;
//	}
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Chuld(String name) call");
	}
	
}
