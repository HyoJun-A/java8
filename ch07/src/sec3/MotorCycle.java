package sec3;

public class MotorCycle extends Tire{
	Tire frontTire = new Tire(8, "앞");
	Tire backTire = new Tire(9, "뒤");
	
	public MotorCycle(){}
	
	public int run() {
		System.out.println("오토바이가 달립니다.");
		if(frontTire.roll()==false){
			super.stop();
			return 1;
		}
		if(backTire.roll()==false){
			super.stop();
			return 2;
		}
		return 0;
	}
}
