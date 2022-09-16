package sec1;

public class Type3 {
	public static void main(String[] args) {
		String name = "ahn";
		char[] irum = {'a', 'h', 'n'};
		String nick = "ahn";				//문자열 변수
		String lans = new String("ahn");	//문자열 객체
		
		System.out.println(name);
		System.out.println(irum);
//		System.out.println(name == irum);	->	문자 배열이 문자열인 것은 맞지만 서로 비교할 수 는 없다.
		System.out.println();
		
		System.out.println(name == nick);
		System.out.println(name != nick);
		System.out.println();
		
//		System.out.println(name == lnas);	// 서로 같지 않음
//		System.out.println(name != lnas);
		System.out.println();
		
		System.out.println(name.equals(lans));	// 객체가 달라도 값만 비교해야 할 경우 equals()를 사용해야 함
		System.out.println(!name.equals(lans));
		System.out.println();
		
		String a = new String();
		System.out.println(a == "");
//		System.out.println(a.isEmpty());	//isEmpty() : 값이 비워있는지 확인
	}

}
