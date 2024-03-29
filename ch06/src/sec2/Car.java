package sec2;

public class Car {
	//객체(인스턴스)가 가지는 특성을 저장, 멤버 필드
	String name;
	String fuel;
	int cc;
	int speed;
	//static : 정적, 만약 사용할 경우에는 instance(객체)가 아닌 클래스 이름을 사용해야 한다 -> Car.MAX_SPEED
	final static int MAX_SPEED = 500;	//멤버 상수 : 값이 한 곳에 저장되어 더 이상 바뀌지 않음
	final static int MIN_SPEED = 0;		//멤버 상수는 반드시 초기화 되어야 하며, 그 값은 바뀌지 ㅇ낳음
	//[접근제한자] [수정자] 데이터타입 필드명;
	
	public Car(){}	//기본 생성자로서 선언 또는 기술하지 ㅇ낳아도 자바에사 자동으로 생성됨(생략 가능)
	public Car(String name) {
		this.name = name;
	}
	public Car(String name, String fuel) {
		this(name, fuel, 1000);		//현재 클래스의 생성자 함수 -> this()
	}
	public Car(String name, String fuel, int cc){
		this(name, fuel, cc, 0);
	}
	public Car(String name, String fuel, int cc, int speed){
		//this.필드명 -> 현재 객체 자신의 필드
		this.name = name;
		this.fuel = fuel;
		this.cc = cc;
		this.speed = speed;
	}
	//생성자(Constructor) : 객체를 만드는 함수로서 클래스명과 동일해야 함
	//[접근제한자] 클래스명(데이터타입 매개변수, ...) {}
	//this = 현재 객체, this() = 생성자 함수
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//메소드(Method) : 객체의 활동.	객체의 행위.	객체가 가지는 기능을 기술하는 것
	//[접근제한자] 반환타입 메소드명([데이터타입 매게변수]) { 활동 / 행위 / 기능 }
	//getter Method(게터 메소드) : 현재 객체의 속성(멤버 필드)에 저장된 데이터 값을 가져오기
	//setter Method(세터 메소드) : 현재 객체의 속성(멤버 필드)에 값을 저장
	
	//return(반환값)이 없으므로 반환타입에는 void를 지정해얗,ㅁ
	public void bootUp(){	//시동on
		System.out.println("시동을 켭니다.");
	}
	
	public void bootOff(){	//시동off
		System.out.println("시동을 끔니다.");
	}
	
	//반환 타입이 int이므로 return 해주어야 하는 것은 정수(int)이어야 함
	public int speedUp(){	//스피드up
		System.out.println("엑셀레이터를 밟습니다.");
		if(this.speed < this.MAX_SPEED){	//속도의 증가는 최고 속도 까지이므로
			this.speed = this.speed +10;
		}
		return this.speed;
	}
	
	public int speedDown(){	//스피드down
		System.out.println("브레이크를 밟습니다.");
		if(this.speed > this.MIN_SPEED){
			this.speed = this.speed -10;
		}
		return this.speed;
	}
	
	public int speedInfo(){	//스피드정보
		return speed;
	}
	
	public void speedPrint(){	//현재 속도 출력
		System.out.println("현재 속도 : "+this.speed);
	}
	
	public String fuelInfo(){	//fuel값 return
		return fuel;
	}
}
