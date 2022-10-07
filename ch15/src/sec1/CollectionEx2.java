package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx2 {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst = new Vector();
		lst = new LinkedList();
		
		ArrayList lst2 = new ArrayList();
//		lst2 = new Vector<E>(); -> 형제관계 이기 때문에 객체 생성 X
		
		method1(lst);
		method1(lst); 
//		method2(lst); -> lst는 List로 선언, method2는 ArrayList로 선언
		method2(lst2);
	}
	
	static void method1(List ls){
		
	}
	static void method2(ArrayList ls){
		
	}
	
}
