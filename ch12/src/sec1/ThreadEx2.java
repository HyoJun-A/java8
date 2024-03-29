package sec1;
//비선점형 : 쓰레드객체.run()
//선점형 : 쓰레드객체.start()
//쓰레드 주기설정 : Thread.sleep()
//쓰레드 우선순위 설정 : 쓰레드객체.setPriority()
//쓰레드 우선순위 값 가져오기 : 쓰레드객체.getPriority()
//쓰레드의 상태 : 생성(New Thread) : Create -> 실행 대기(new Runnable) : wait -> 실행(Start(), Run())
//-> 선점(blocking=preemption) -> 대기(sleep()) : wait -> 재실행(run()) :  Wake Up
//-> 정상 종료(Interrupt) : Terminated
public class ThreadEx2 {
	public static void main(String[] args) {
		Thread th0 = new Thread(new ThreadWithRunnable());
		Thread th1 = new Thread(new ThreadWithRunnable());
		
		//쓰레드의 우선순위 변경 : 먼저 처리 되기 위해서
		th1.setPriority(10);
		
		th0.start();
		th1.start();
		
		System.out.println("th1의 우선순위 : "+th0.getPriority());
		System.out.println("th1의 우선순위 : "+th1.getPriority());
	}
}

class ThreadWithClass2 extends Thread{
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(this.getName());
			try {
				Thread.sleep(10);		//1000밀리초(ms)단위
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//Runnable은 인터페이스이므로 반드시 오버라이딩하여 해당 메소드를 구현체로 기술해야한다
class ThreadWithRunnable2 implements Runnable{	
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			//현재 실행 중인 쓰레드의 이름 출력
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}