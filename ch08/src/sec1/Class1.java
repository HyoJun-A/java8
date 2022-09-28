package sec1;
//인터페이스로 부터 상속 받는 클래스는 implements
public class Class1 implements Interface1 {
	//인터페이스로 부터 상속 받는 클래스는 일반 메소드가 추상화되어 있으므로 반드시 오버라이딩하여 실제 구현 내용을 기술해야하며,
	//반드시 메소드명, 반환타입, 매개변수 등이 같아야 함
	@Override
	public void method1() {
		System.out.println("메소드1 ghcnf");
	}

	@Override
	public int method2(int pa1, String pa2) {
		System.out.println("pa1 = " + pa1 + ", pa2 = "+ pa2);
		return pa1;
	}
	
}
