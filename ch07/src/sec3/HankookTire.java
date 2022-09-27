package sec3;
//Tire의 모든 내용을 상속받되, roll() 메소드에서 타이어 이름을 부여
public class HankookTire extends Tire{
	public HankookTire(int maxRotation, String location){
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;	//int로 변수를 선언할 경우 초기값은 0, 그러므로 roll()을 한번 사용할 때 마다 1증가
		if(accumulatedRotation < maxRotation){
			System.out.println(location + " HankookTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {			//누적회전수가 쵀대회전수를 초과하는 경우 false를 리턴 시킨다.
			System.out.println("**** "+location+" HankookTire 펑크 ****");
			return false;
		}
	}

	
}
