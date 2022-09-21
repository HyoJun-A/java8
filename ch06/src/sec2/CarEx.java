package sec2;

public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car("롤스로이스", "가솔린", 4000);
		car1.bootUp();
		for(int i=0; i<7; i++){
			car1.speedUp();
		}
		System.out.println("현재 속도 : " + car1.speedInfo());
		car1.speedPrint();
		for(int i=0; i<100; i++){
			car1.speedDown();
		}
		System.out.println("현재 속도 : " + car1.speedInfo());
		System.out.println("최고 속도 : " + Car.MAX_SPEED);
		System.out.println("최저 속도 : " + Car.MIN_SPEED);
		car1.bootOff();
		
		
	}

}
