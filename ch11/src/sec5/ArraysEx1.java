package sec5;

import java.util.Arrays;

public class ArraysEx1 {
	public static void main(String[] args) {
		char arr[] = {'j', 'a', 'v', 'a', ' ', 'o', 'b', 'j', 'e', 'c', 't'};
		System.out.println(arr);
		char arr2[] = Arrays.copyOf(arr, arr.length);	//문자 배열 전체 복사
		System.out.println(arr2);
		char arr3[] = Arrays.copyOfRange(arr, 0, 4);
		System.out.println(arr3);
		
		System.out.println("같은지 비교1 "+(arr==arr2));
		System.out.println("같은지 비교2 "+Arrays.equals(arr, arr2));
		//같은 기억장소를 의미하는 주소가 다를 경우 서로 비교될 수 없다. 
//		System.out.println("같은지 비교3 "+Arrays.deepEquals(arr, arr2));
		
		int jum[] = {95, 100, 85, 90, 80};
		Arrays.sort(jum);	//오른차순 정렬
		for(int pt : jum){
			System.out.println("점수 : "+pt);
		}
		
		String names[] = {"박정우", "한태헌", "조민재", "김연정"};
		System.out.println("정렬 전");
		for(String name : names){
			System.out.println("이름 : " + name);
		}
		System.out.println("정렬 후");
		Arrays.sort(names);
		for(String name : names){
			System.out.println("이름 : " + name);
		}
		
		int idx = Arrays.binarySearch(names, "박정우");
		System.out.println(idx);
	}
}
