package sec2;

import java.util.Scanner;
public class StudentEx {
	public static void main(String[] args) {
		String name;
		int kor;
		int eng;
		int mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		
		Student st = new Student(name, kor, eng, mat);
		System.out.println("이름 : "+ st.name);
		System.out.println("총점 : " + st.calcTot());
		System.out.println("평균 : " + st.calcAvg());
		System.out.println("학점 : " + st.calcHak());
		System.out.println("판정 : " + st.calcRes());
		
		System.out.println("---------------------------------------");
		
		Student st1 = new Student("김기태", 90, 80, 90);
		System.out.println("이름 \t 총점 \t 평균 \t 학점 \t 판정");
		System.out.println(st1.name + "\t" + st1.calcTot() + "\t" +st1.calcAvg() + "\t" + st1.calcHak() + "\t" + st1.calcRes());

	}

}