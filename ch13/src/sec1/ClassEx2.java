package sec1;

public class ClassEx2 {
// 키와 값을 공통으로 갖거나 두 개의 클래스로 일반화 클래스를 만드는 경우
//Map 구조를 상속 받아서 가능 
	public static void main(String[] args) {
		Moving<String, Integer> m1 = new Moving();
		m1.key = "name";
		m1.value = 40;
		System.out.println(m1.key);
		Moving<Car, Tire> m2 = new Moving<>();
	}
}

//key, value 를 타입에서 활용 가능함(=Dictionary)
class Moving<K, V>{
	K key;
	V value;
}

class Car{
	
}

class Tire{
	
}