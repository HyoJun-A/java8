package sec1;
public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "현대자동차";
		car1.model = "그랜저";
		System.out.println("제조사 : "+car1.company);
		System.out.println("자동차 : "+ car1.model);
		car1.setColor("silver");
		car1.setMaxSpeed(500);
		System.out.println("자동차색 : "+car1.getColor());
		System.out.println("최고속도 : "+car1.getMaxSpeed());
	}

}
