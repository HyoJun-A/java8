package sec3;

public class Bus extends Car{

	@Override
	public int run() {
		System.out.println("택시가 출발합니다.");
		return super.run();
	}

	@Override
	public void stop() {
		System.out.println("택시가 멈춥니다.");
		super.stop();
	}
	
}
