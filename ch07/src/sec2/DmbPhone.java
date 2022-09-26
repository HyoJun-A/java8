package sec2;

public class DmbPhone extends CellPhone{
	int ch;
	final static String CCOMPANY = "애플";	//final static으로 선언한 필드는 재 선언 가능하다.(메소드는 불가능)
	
	//부모 클래스인 CellPhone에서 final static으로 정의하였으므로 오버라이딩 할 수 없음
	/*
	@Override
	final static public void powerOn(){
		System.out.println("폰의 전원을 켭니다.");
	}
	final static public void powerOff(){
		System.out.println("폰의 전원을 끔니다.");
	}*/
	
	public int channelDisplay(){
		return ch;
	}
	public void channelDown(){
		ch--;
	}
	public void channelUp(){
		ch++;
	}
}
