package sec3;

public class Tire {
	//멤버 필드
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;
	
	//생성자
	public Tire(){}
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//멤버 메소드
	public boolean roll(){	//누적회전수가 최대 회전수를 초과하지 않는 다면 Tire수명과 함께 Ture를 리턴 시킨다.
		++accumulatedRotation;	//int로 변수를 선언할 경우 초기값은 0, 그러므로 roll()을 한번 사용할 때 마다 1증가
		if(accumulatedRotation < maxRotation){
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {			//누적회전수가 쵀대회전수를 초과하는 경우 false를 리턴 시킨다.
			System.out.println("**** "+location+" Tire 펑크 ****");
			return false;
		}
	}
	
	public void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
}
