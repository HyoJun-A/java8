package sec3;

public class CarEx {

	public static void main(String[] args) {
		//Car객체 생성
		Car car1 = new Car();
		
		for(int i = 1; i <= 10; i++){
			int errorLocation = car1.run();	//run을 돌릴 경우 return 값으로는 숫자로 받는다.
			
			switch(errorLocation){
				case 1:
					System.out.println("앞쪽 왼쪽 바퀴 Michelin Tire로 교체");
					car1.frontLeftTire = new MichelinTire(12, "앞왼쪽");
					break;
				case 2:
					System.out.println("앞쪽 오른쪽 바퀴 Michelin Tire로 교체");
					car1.frontRightTire = new HankookTire(4, "앞오른쪽");
					break;
				case 3:
					System.out.println("뒤쪽 왼쪽 바퀴 Michelin Tire로 교체");
					car1.backLeftTire = new kumhoTire(5, "뒤왼쪽");
					break;
				case 4:
					System.out.println("뒤쪽 오른쪽 바퀴 Michelin Tire로 교체");
					car1.backRightTire = new HankookTire(6, "뒤오른쪽");
					break;
			}
			System.out.println();
		}

	}

}