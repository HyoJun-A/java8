package sec1;

public class Child extends Parent{
	int field3;
	String field4;
	
	public Child(){}
	public Child(int field1){
		super(field1);
	}
	public Child(int field1, String field2){
		this(field1, field2, 100);
	}
	
	public Child(int field1, String field2, int field3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	//메소드 오버라이딩 : 부모로 부터 물려 받은 메소드를 다른 형태로 변형할 수 있도록 한 것
	@Override
	public int method2() {	//Parent의 method2를 오버라이딩하여 다른 형태로 변환
		return 1004;
	}

	public String method3(){
		return "문자열";
	}
	
	public void method4(){System.out.println("메소드4");}
}
