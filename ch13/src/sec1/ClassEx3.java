package sec1;
// 메소드의 매개변수나 리턴 타입을 일반화 (범용화) 하는 제네릭 메소드 클래스
// <T, R> R method(T t)
public class ClassEx3 {
	public static void main(String[] args) {
		// 첫 번째 방법
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intVlaue = box1.get();
		
		Box<String> box2 = Util.<String>boxing("안효준");
		String strVlaue = box2.get();
		
		//두 번째 방법 
		Box<String> box3 = Util.boxing("안효준2");
		String strVlaue2 = box3.get();
		
		System.out.println(intVlaue + " , " +strVlaue+ " , " + strVlaue2);	
	}
}

class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}

class Box<T>{
	private T t;
	public T get(){ return t; }
	public void set(T t) { this.t = t; }
}