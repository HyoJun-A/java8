package sec1;

public class Type2 {
	public static void main(String[] args) {
		// refernece(참조형) type : 여러 개 (다수)의 데이터를 저장하기 위한 기억장소로서 null값이 허용됨
		// 참조형의 종류 : array(배열), enum(열거형), class(클래스), interface(인터페이스), map(맵), list(리스트), set(셋)
		int arr1[] = {10, 20, 30};
		int arr2[] = {10, 20, 30};
//		int arr3[] = null;	// refernce type은 null값을 허용하나 pointer(Heap 주소)가 null이 되어 참조할 수 없는 예외가 발생한다.
		int arr3[] = {20, 40, 60};
//		int a = null; - primirice type은 null값일 수 없다.
//		arr3[0] = 20;
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr1[1]);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println();
		System.out.println(arr1 == arr2);
		System.out.println(arr1 != arr2);
		// 참조형은 간접비교를 해야 하므로 직접비교하게 되면,
		// 직접 비교하게 되면 포인터주소를 비교하게 되므로 서로 다르게 인식된다.
	}

}
