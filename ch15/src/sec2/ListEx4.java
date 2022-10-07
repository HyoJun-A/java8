package sec2;

import java.util.LinkedList;
import java.util.List;

import sec1.Student;

public class ListEx4 {
	public static void main(String[] args) {
		List<Student> lst1 = new LinkedList<Student>();
		Student s1 = new Student();
		s1.setNum(1);
		s1.setName("AHJ");
		s1.setJum(90);
		lst1.add(s1);
		for(int i = 0; i < lst1.size(); i++){
			Student s2 = new Student();
			s2 = lst1.get(i);
			System.out.println(s2.getNum() + s2.getName() + s2.getJum());
		}
		
		
	}
}
